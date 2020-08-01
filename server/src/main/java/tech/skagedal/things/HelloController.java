package tech.skagedal.things;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.BasicMarker;

@Controller("/hello")
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        logger.info("Returning Hello World");
        return "Hello World";
    }
}