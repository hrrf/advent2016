package day7;

import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nathan.lamb on 12/7/2016.
 */
public class BunnyHttpExtractorTest {
    String positive1 = "abba[mnop]qrst";
    String positive2 = "ioxxoj[asdfgh]zxcvbn";

    String negative1 = "abcd[bddb]xyyx";
    String negative2 = "aaaa[qwer]tyui";

    @Test
    public void testPositives() {
        List<List<String>> result = null;
        result = BunnyHttpExtractor.extractData(positive1);
        assertTrue(StringUtils.equals(result.get(0).get(0), "abba"));
        assertTrue(StringUtils.equals(result.get(0).get(1), "qrst"));
        assertTrue(StringUtils.equals(result.get(1).get(0), "mnop"));

        result = BunnyHttpExtractor.extractData(positive2);
        assertTrue(StringUtils.equals(result.get(0).get(0), "ioxxoj"));
        assertTrue(StringUtils.equals(result.get(0).get(1), "zxcvbn"));
        assertTrue(StringUtils.equals(result.get(1).get(0), "asdfgh"));
    }


}