package util;

import entity.CompositeType;
import entity.TextComposite;
import manager.RegexManager;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {

    private static final Logger LOG = Logger.getLogger(String.valueOf(TextParser.class));

    public static TextComposite parseText(String text) {

        TextComposite textElement = new TextComposite();
        textElement.setType(CompositeType.PARAGRAPH);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_PARAGRAPH);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String paragraphCandidate = matcher.group();
            LOG.info("Paragraph found: " + paragraphCandidate);
            TextComposite paragraph = ParagraphParser.parseParagraph(paragraphCandidate);
            textElement.add(paragraph);
        }
        return textElement;
    }
}


