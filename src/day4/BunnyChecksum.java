package day4;

import java.util.*;

import static java.util.Comparator.reverseOrder;
import static java.util.Comparator.comparing;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toList;


/**
 * Created by nathan.lamb on 12/5/2016.
 */
public class BunnyChecksum {

    TreeMap<Character, Integer> room = new TreeMap<Character, Integer>();
    public Integer sectorId;
    public String checksum;
    public String longName;

    public BunnyChecksum(String s) {
        // Checksum stuff is
        /*
            Each room consists of an encrypted name (lowercase letters separated by dashes) followed by a dash,
            a sector ID, and a checksum in square brackets.
        */
        this.longName = s;

        String[] blah = s.split("-");

        // Get the sectorID & checksum from the last element
        String smushedStuff = blah[blah.length-1];
        String[] unsmushed = smushedStuff.split("\\[");
        sectorId = Integer.valueOf(unsmushed[0]);
        checksum = unsmushed[1].replaceAll("]","");

        // Hashmap
        for(int i = 0; i<blah.length-1; i++) {
            char[] letters = blah[i].toCharArray();
            for (int j=0; j<letters.length; j++) {
                Integer val = room.get(new Character(letters[j]));
                if (val != null) {
                    room.put(letters[j], new Integer(val + 1));
                } else {
                    room.put(letters[j], 1);
                }
            }
        }
    }

    public boolean isLegit() {

        List<Character> sorted = room.entrySet().stream()
                .sorted(comparingByValue(reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(toList());

        for (int i = 0; i < checksum.length(); i++) {
            if (checksum.charAt(i) != sorted.get(i)) {
                return false;
            }
        }

        return true;
    }

    public String shiftName() {
        String code = longName.substring(0, longName.lastIndexOf('-')).toLowerCase();

        char[] decoded = new char[code.length()];

        for(int i = 0; i< code.length(); i++) {
            char c = code.charAt(i);
            if (Character.isLetter(c)) {
                // Rotate
                int index = (int)c;

                for(int j = 0; j < this.sectorId; j++) {
                    if (index < 122) {
                        index += 1;
                    } else {
                        index = 97;
                    }
                }

                decoded[i] = (char)(index);
            } else {
                decoded[i] = ' ';
            }
        }

        return new String(decoded);
    }




}
