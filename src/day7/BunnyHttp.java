package day7;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nathan.lamb on 12/7/2016.
 */
public class BunnyHttp {

    public static void main(String[] args) {
        String path = "C:\\Users\\Nathan.Lamb\\Downloads\\spring-mvc-server-generated\\advent2016\\src\\day7\\inputs";
        List<String> lines = new LinkedList<String>();
        try {
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int validCount = 0;
        int sslCount = 0;

        for(String ip: lines) {
            List<List<String>> results = BunnyHttpExtractor.extractData(ip);

            if(dancingQueen(results)) {
                validCount += 1;
            }

            if (isSSL(results.get(0), results.get(1))) {
                sslCount += 1;
            }
        }

        System.out.println("There are " + validCount + " TLS ips in the list. There are " + sslCount + " that support SSL.");
    }

    public static boolean dancingQueen(List<List<String>> data) {
        boolean ips = false;
        boolean hypernet = false;

        for(String s : data.get(0)) {
            ips = isABBA(s);
            if (ips) break;
        }

        if (ips) {
            for (String x : data.get(1)) {
                hypernet = isABBA(x);
                if (hypernet) break;
            }

            if (!hypernet) {
                return true;
            }
        }

        return false;
    }

    static boolean isABBA(String s) {
        for (int i = 0; i < s.length()-1 ; i++) {
            String first = String.valueOf(s.charAt(i));
            String second = String.valueOf(s.charAt(i+1));

            if (StringUtils.equals(first, second)) continue;

            String pattern = first + second + "(?=" + second + first + ")" + second + first;
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(s);

            if (m.find()) {
                return true;
            }
        }

        return false;
    }

    static boolean isSSL(List<String> net, List<String> hyper) {
        for(String netString: net) {
            for (int i = 0; i <netString.length()-2 ; i++) {
                String first = String.valueOf(netString.charAt(i));
                String second = String.valueOf(netString.charAt(i+1));
                String third = String.valueOf(netString.charAt(i+2));

                if (!StringUtils.equals(first, third)) continue;

                String pattern = second + first + second;
                Pattern p = Pattern.compile(pattern);

                for (String hyperString: hyper) {

                    System.out.println("Looking for " + pattern + " in " + hyperString + " from " + netString);
                    Matcher m = p.matcher(hyperString);

                    if (m.find()) {
                        System.out.println(pattern + " matches + " + hyperString);
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
