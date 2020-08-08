package tech.skagedal.things;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        logger.info("Returning Hello World");
        return "Hello World";
    }

    public static class Person {
        final String name;

        public Person(String name) {
            this.name = name;
        }
    }
}