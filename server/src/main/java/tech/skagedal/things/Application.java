package tech.skagedal.things;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OpenAPIDefinition(
    info = @Info(
            title = "simonsthings",
            version = "0.0"
    )
)

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        final var context = Micronaut.run(Application.class, args);
        logger.info("Started with environment: {}", context.getEnvironment().getActiveNames());
    }
}
