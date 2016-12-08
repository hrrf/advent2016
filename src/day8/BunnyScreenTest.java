package day8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nathan.lamb on 12/8/2016.
 */
public class BunnyScreenTest {
    @Test
    public void rect() throws Exception {
        BunnyScreen bs = new BunnyScreen(10, 10);
        bs.print();

        bs.rect(5, 5);
        bs.print();
    }

    @Test
    public void getColumn() throws Exception {

    }

    @Test
    public void putColumn() throws Exception {

    }

    @Test
    public void rotateColumn() throws Exception {
        BunnyScreen bs = new BunnyScreen(10, 10);
        bs.rect(5, 5);
        bs.print();
        bs.rotateColumn(3, 5);
        bs.print();
        bs.rotateColumn(0, 7);
        bs.print();
    }


}