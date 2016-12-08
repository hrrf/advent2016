package day7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by nathan.lamb on 12/7/2016.
 */
public class BunnyHttpExtractor {

    public static List<List<String>> extractData(String input) {
        List<List<String>> results = new LinkedList<List<String>>();

        List<String> sequence = Arrays.asList(input.split("\\[\\w+\\]"));
        List<String> hypernet = new LinkedList<String>();

        Pattern p = Pattern.compile("\\[\\w+\\]");
        Matcher m = p.matcher(input);
        while (m.find()) {
            String hyperNetString = m.group();
            hypernet.add(hyperNetString.substring(1, hyperNetString.length()-1));
        }

        results.add(sequence);
        results.add(hypernet);

        return results;
    }
}
