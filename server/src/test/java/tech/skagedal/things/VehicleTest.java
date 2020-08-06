package tech.skagedal.things;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.context.BeanContext;
import org.junit.jupiter.api.Test;

class VehicleTest {
    @Test
    void testDependencyInjection() {
        final var context = BeanContext.run();
        final var vehicle = context.getBean(Vehicle.class);
        assertEquals("Starting V8", vehicle.start());
    }
}