package util;



import entity.CompositeType;
import entity.TextComponent;
import entity.TextComposite;
import entity.TextLeaf;
import manager.RegexManager;


import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {

    private static final Logger LOG = Logger.getLogger(String.valueOf(SentenceParser.class));

    public static TextComposite parseSentence(String sentenceText) {
        TextComposite sentence = new TextComposite();
        sentence.setType(CompositeType.WORD);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_WORD + "|" + RegexManager.REGEX_PUNCTUATION);
        Matcher matcher = pattern.matcher(sentenceText);
        while (matcher.find()) {
            String wordOrPunctuation;
            wordOrPunctuation = matcher.group();
            if (Pattern.matches(RegexManager.REGEX_PUNCTUATION, wordOrPunctuation)) {
                LOG.info("Punctuation mark found: " + wordOrPunctuation);
                TextLeaf punctuationMark = new TextLeaf(wordOrPunctuation);
                sentence.add(punctuationMark);
            } else {
                LOG.info("Word found: " + wordOrPunctuation);
                TextComposite word = WordParser.parseWord(wordOrPunctuation);
                sentence.add(word);

            }
        }
        return sentence;
    }


}
