package day5;

import org.bouncycastle.util.encoders.Hex;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by nathan.lamb on 12/6/2016.
 */
public class BunnyMd5 {

    public BunnyMd5() {
        String code = new String();

        char[] codeArray = new char[8];
        for (int x = 0; x < codeArray.length; x++) {
            codeArray[x] = '#';
        }

        MessageDigest md5 = null;
        try {
             md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] bytesOfMessage = null;

        String input = "abbhdwsy";
        int position;
        char passcode;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                String s = input + i;
                bytesOfMessage = s.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            md5.reset();
            md5.update(bytesOfMessage);

            byte[] thedigest = md5.digest();

            String transposed = DatatypeConverter.printHexBinary(thedigest);

            if(transposed.startsWith("00000")) {
                System.out.println(i + " is valid:  " + transposed);
                position = Character.getNumericValue(transposed.charAt(5));
                passcode = transposed.charAt(6);
                System.out.println("Position: " + position + "  Passcode: " + passcode);

                if ((position >= 0) && (position < codeArray.length)) {
                    if (codeArray[position] == '#') {
                        codeArray[position] = passcode;
                    }

                    System.out.println("Updated codeArray: " + String.copyValueOf(codeArray));
                }

            }

            if (!String.copyValueOf(codeArray).contains("#")) break;
        }

        System.out.println("The code is: " + String.copyValueOf(codeArray));
    }
}
