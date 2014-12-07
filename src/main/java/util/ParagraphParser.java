package util;

import entity.CompositeType;
import entity.TextComposite;
import manager.RegexManager;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser {

    private static final Logger LOG = Logger.getLogger(String.valueOf(ParagraphParser.class));

    public static TextComposite parseParagraph(String paragraphText) {
        TextComposite paragraph = new TextComposite();
        paragraph.setType(CompositeType.SENTENCE);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_SENTENCE);
        Matcher matcher = pattern.matcher(paragraphText);
        while (matcher.find()) {
            String sentenceText = matcher.group();
            System.out.println(sentenceText);
            LOG.info("Sentence found: " + sentenceText);
            TextComposite sentence = SentenceParser.parseSentence(sentenceText);
            paragraph.add(sentence);
        }
        return  paragraph;

    }
}
