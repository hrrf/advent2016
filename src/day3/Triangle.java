package day3;

/**
 * Created by nathan.lamb on 12/5/2016.
 */
public class Triangle implements Shape {

    public static final int numberOfSides = 3;

    private int mSide1;
    private int mSide2;
    private int mSide3;

    public Triangle(int side1, int side2, int side3) {
        this.mSide1 = side1;
        this.mSide2 = side2;
        this.mSide3 = side3;
    }

    @Override
    public boolean isValid() {

        boolean firstTest  = (mSide1 + mSide2) > mSide3;
        boolean secondTest = (mSide1 + mSide3) > mSide2;
        boolean thirdTest  = (mSide2 + mSide3) > mSide1;

        return firstTest && secondTest && thirdTest;
    }
}
