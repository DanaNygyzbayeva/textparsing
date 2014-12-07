package loader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class TextWriter {

    public static void writeText(String text, String path) {
        text = text.replaceAll("[ ][\n][\n]", "\n\n");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(path);
            printWriter.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            printWriter.close();
        }
    }
}