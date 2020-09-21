package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {

    @Test
    void decode() {
        String hello = Encoder.encode("We are the world!");
        hello = Decoder.decode(hello);
        assertEquals("We are the world!", hello);
    }
}