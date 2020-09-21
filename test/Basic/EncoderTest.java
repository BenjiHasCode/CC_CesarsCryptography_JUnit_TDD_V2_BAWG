package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    @Test
    void encode() {
        String hello = "Hello, World!";
        hello = Encoder.encode(hello);
        assertNotEquals("Hello, World!", hello);
    }
}