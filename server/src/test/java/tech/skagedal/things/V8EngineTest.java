package tech.skagedal.things;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.test.annotation.MicronautTest;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class V8EngineTest {
    @Inject Engine engine;

    @Test
    void testDependencyInjection() {
        assertEquals("Starting V8", engine.start());
    }
}