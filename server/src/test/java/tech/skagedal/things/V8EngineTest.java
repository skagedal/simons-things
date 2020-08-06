package tech.skagedal.things;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.context.BeanContext;
import org.junit.jupiter.api.Test;

class V8EngineTest {
    @Test
    void testDependencyInjection() {
        final var context = BeanContext.run();
        final var engine = context.getBean(Engine.class);
        assertEquals("Starting V8", engine.start());

        final var sameEngine = context.getBean(Engine.class);
        assertTrue(engine == sameEngine);
    }
}