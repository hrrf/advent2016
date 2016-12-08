package day7;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nathan.lamb on 12/7/2016.
 */
public class BunnyHttpTest {
    @Test
    public void dancingQueen() throws Exception {
        String pos1 = "abba";
        String pos2 = "ioxxoj";
        String neg1 = "abcd";
        String neg2 = "aaaa";

        assertTrue(BunnyHttp.isABBA(pos1));
        assertTrue(BunnyHttp.isABBA(pos2));
        assertFalse(BunnyHttp.isABBA(neg1));
        assertFalse(BunnyHttp.isABBA(neg2));
    }

    @Test
    public void testSSL() throws Exception {
        String pos1 = "aba[bab]xyz";
        List<List<String>> derp = BunnyHttpExtractor.extractData(pos1);
        assertTrue(BunnyHttp.isSSL(derp.get(0), derp.get(1)));

        String neg1 = "xyx[xyx]xyx";
        derp = BunnyHttpExtractor.extractData(neg1);
        assertFalse(BunnyHttp.isSSL(derp.get(0), derp.get(1)));

        String pos2 = "aaa[kek]eke";
        derp = BunnyHttpExtractor.extractData(pos2);
        assertTrue(BunnyHttp.isSSL(derp.get(0), derp.get(1)));

        String pos3 = "zazbz[bzb]cdb";
        derp = BunnyHttpExtractor.extractData(pos3);
        assertTrue(BunnyHttp.isSSL(derp.get(0), derp.get(1)));
    }
}