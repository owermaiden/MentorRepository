

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientDemoTest {

    @Test
    void sendGetTest() throws URISyntaxException, IOException, InterruptedException {
        assertEquals(200, HttpClientDemo.sendGet());
    }
}