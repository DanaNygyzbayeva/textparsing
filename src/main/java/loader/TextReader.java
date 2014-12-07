package loader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {

    public static String readFile() {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get("text.txt"));
            return new String(encoded, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
