package day8;

import java.util.ArrayList;

/**
 * Created by nathan.lamb on 12/8/2016.
 */
public class BunnyScreenRow {
    private ArrayList<Character> row;

    public BunnyScreenRow(int length) {
        this.row = new ArrayList<>(length);
        for(int i = 0; i < length; i++) {
            row.add(i, BunnyScreen.off);
        }
    }

    public void turnPixelsOn(int numPixelsXDim) {

        int boundary;

        if (numPixelsXDim > row.size()) {
            boundary = row.size();
        } else {
            boundary = numPixelsXDim;
        }

        for (int i = 0; i < boundary; i++) {
            row.remove(i);
            row.add(i, BunnyScreen.on);
        }
    }

    public void rotate(int shiftNum) {
        this.row = BunnyScreen.shift(row, shiftNum);
    }

    public Character getPixel(int index) {
        return row.get(index);
    }

    public void putPixel(int index, Character newPixel) {
        row.remove(index);
        row.add(index, newPixel);
    }

    public int print() {
        int litPixels = 0;

        for(Character c: row) {
            System.out.print(c);
            if (c == BunnyScreen.on) {
                litPixels += 1;
            }
        }
        System.out.println();
        return litPixels;
    }

}
