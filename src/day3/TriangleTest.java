package day3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nathan.lamb on 12/5/2016.
 */
public class TriangleTest {

    @Test
    public void isValid() throws Exception {
        Triangle t = new Triangle(5, 10, 25);
        assertFalse(t.isValid());
    }
}