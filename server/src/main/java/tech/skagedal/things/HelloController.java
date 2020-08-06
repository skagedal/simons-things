package tech.skagedal.things;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import io.vertx.reactivex.mysqlclient.MySQLPool;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {

    final io.vertx.reactivex.mysqlclient.MySQLPool connection;

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    public HelloController(MySQLPool connection) {
        this.connection = connection;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        logger.info("Returning Hello World");
        return "Hello World";
    }

    @Get("/foo")
    public Single<String> getFoo() {
        return connection
            .query("SELECT @@sql_mode")
            .rxExecute()
            .map(rows -> "hello, " + formatRowset(rows));
    }

    private String formatRowset(io.vertx.reactivex.sqlclient.RowSet<io.vertx.reactivex.sqlclient.Row> rows) {
        return StreamSupport.stream(rows.spliterator(), false)
            .map(row -> row.getString(0))
            .collect(Collectors.joining());
    }

    public static class Person {
        final String name;

        public Person(String name) {
            this.name = name;
        }
    }
}