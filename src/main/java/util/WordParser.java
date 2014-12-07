package util;

import entity.TextComposite;
import entity.TextLeaf;
import manager.RegexManager;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser {
    private static final Logger LOG = Logger.getLogger(String.valueOf(WordParser.class));

    public static TextComposite parseWord(String wordText) {
        TextComposite word = new TextComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_LETTER);
        Matcher matcher = pattern.matcher(wordText);
        while (matcher.find()) {
            String letter;
            letter = matcher.group();
            LOG.info("Letter found: " + letter);
            TextLeaf letterOfWord = new TextLeaf(letter);
            word.add(letterOfWord);

        }
        return word;
    }
}