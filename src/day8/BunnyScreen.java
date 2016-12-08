package day8;

import java.util.ArrayList;

/**
 * Created by nathan.lamb on 12/8/2016.
 */
public class BunnyScreen {

    public static Character off  = new Character(' ');
    public static Character on = new Character( '#');

    private ArrayList<BunnyScreenRow> matrix;

    private int xPixels;
    private int yPixels;


    public BunnyScreen(int xPixels, int yPixels) {

        this.matrix = new ArrayList<>(yPixels);
        for (int i = 0; i < yPixels; i++) {
            matrix.add(i, new BunnyScreenRow(xPixels));
        }
    }

    public void rect(int x, int y) {
        for(int i = 0; i < y; i++) {
            matrix.get(i).turnPixelsOn(x);
        }
    }

    public void rotateRow(int row, int pixels) {
        matrix.get(row).rotate(pixels);
    }

    public void rotateColumn(int col, int pixels) {
        this.putColumn(col, BunnyScreen.shift(getColumn(col), pixels));
    }

    public ArrayList<Character> getColumn(int column) {
        ArrayList<Character> generatedColumn = new ArrayList<Character>(matrix.size());

        for (int i = 0; i < matrix.size(); i++) {
            generatedColumn.add(i, matrix.get(i).getPixel(column));
        }

        return generatedColumn;
    }

    public void putColumn(int column, ArrayList<Character> newColumn) {
        for (int i = 0; i < matrix.size(); i++) {
            matrix.get(i).putPixel(column, newColumn.get(i));
        }
    }

    public static <T> ArrayList<T> shift(ArrayList<T> aL, int shift)
    {
        if (aL.size() == 0)
            return aL;

        T element = null;
        for(int i = 0; i < shift; i++)
        {
            // remove last element, add it to front of the ArrayList
            element = aL.remove( aL.size() - 1 );
            aL.add(0, element);
        }

        return aL;
    }

    public void print() {
        int litPixels = 0;

        System.out.println();
        for(BunnyScreenRow bsr: matrix) {
            litPixels += bsr.print();
        }
        System.out.println();
        System.out.println("Screen has " + litPixels + " lit pixels.");
    }
}
