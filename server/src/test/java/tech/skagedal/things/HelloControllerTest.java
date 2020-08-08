package tech.skagedal.things;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import io.reactivex.Single;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class HelloControllerTest {

    @Client("/hello")
    public interface HelloClient {
        @Get(consumes = MediaType.TEXT_PLAIN)
        Single<String> hello();
    }

    @Inject
    HelloClient helloClient;

    @Test
    void testHelloWorldResponse() {
        assertEquals("Hello World", helloClient.hello().blockingGet());
    }
}