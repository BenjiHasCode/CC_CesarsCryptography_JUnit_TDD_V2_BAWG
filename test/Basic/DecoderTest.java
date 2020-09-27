package Basic;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {

    @Test
    void decodeTest(){
        String alice = FileHandler.readFile("AliceInWonderland.txt");
        String encoded = Encoder.encode(alice);
        String decoded = Decoder.decode(encoded);

        assert alice != null;
        Scanner aScanner = new Scanner(alice);
        Scanner dScanner = new Scanner(decoded);

        while(aScanner.hasNext()){
            String original = aScanner.next();
            String decodedWord = dScanner.next();
            assertEquals(original, decodedWord);
        }
    }
}