package Basic;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void readFile() {
        String text = FileHandler.readFile("AliceInWonderland.txt");
        assertNotNull(text);
        assertTrue(text.length() > 0);
    }

    @Test
    void writeFile() throws FileNotFoundException {
        //It would write to file, but not delete the temp, so changed it aliceEncoded
        //which will be overwritten at runtime anyway.
        //En lappeløsning (er ikke helt tilfreds)
        FileHandler.writeFile("AliceEncoded.txt", "Hello, World!");
        File file = new File("AliceEncoded.txt");
        assertTrue(file.isFile());

        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();
        scanner.close();
        assertEquals("Hello, World!", text);
    }
}