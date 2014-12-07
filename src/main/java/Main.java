import entity.CompositeType;
import entity.TextComponent;
import entity.TextComposite;
import util.TextParser;
import loader.TextReader;
import loader.TextWriter;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {


        TextWriter writer = new TextWriter();

        String text;
        text = new TextReader().readFile();
        TextComposite textComposite = TextParser.parseText(text);



        if(textComposite.getType()==CompositeType.WORD){
           System.out.println(textComposite.getComponents());
        }

        writer.writeText(text, "parsedtext.txt");
        }
}