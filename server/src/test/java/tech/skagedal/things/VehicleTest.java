package tech.skagedal.things;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.context.BeanContext;
import io.micronaut.test.annotation.MicronautTest;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class VehicleTest {

    @Inject Vehicle vehicle;

    @Test
    void testDependencyInjection() {
        assertEquals("Starting V8", vehicle.start());
    }
}