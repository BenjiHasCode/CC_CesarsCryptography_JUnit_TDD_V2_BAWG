package Basic;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {

    @Test
    void decode() {
        String hello = Encoder.encode("We are the world!");
        hello = Decoder.decode(hello);
        assertEquals("We are the world!", hello);
    }

    @Test
    void decodedTest(){
        String alice = FileHandler.readFile("AliceInWonderland.txt");
        String encoded = Encoder.encode(alice);
        String decoded = Decoder.decode(encoded);

        Scanner aScanner = new Scanner(alice);
        Scanner dScanner = new Scanner(decoded);

        while(aScanner.hasNext()){
            String original = aScanner.next();
            String decodedWord = dScanner.next();
            assertEquals(original, decodedWord);
        }
    }
}