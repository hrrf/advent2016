package day8;

import org.bouncycastle.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nathan.lamb on 12/8/2016.
 */
public class BunnyScreenRowTest {
    @Test
    public void turnPixelsOn() throws Exception {
        BunnyScreenRow bsr = new BunnyScreenRow(10);

        bsr.print();

        bsr.turnPixelsOn(5);

        bsr.print();

        assertTrue(bsr.getPixel(0) == '#');
        assertTrue(bsr.getPixel(9) == ' ');

        bsr.putPixel(0, '#');
        assertTrue( bsr.getPixel(0) == '#');

    }

    @Test
    public void getPixel() throws Exception {

    }

    @Test
    public void putPixel() throws Exception {

    }

}