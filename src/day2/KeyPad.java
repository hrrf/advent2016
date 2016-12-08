package day2;

/**
 * Created by nathan.lamb on 12/2/2016.
 */
public class KeyPad {
    private int[][] numericKeys;
    private int xIndex;
    private int yIndex;

    public KeyPad() {
        numericKeys = new int[3][3];

        int index = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                index+=1;
                numericKeys[i][j] = index;
                System.out.println("numericKeys[" + i + "][" + j + "] = " + index);
            }
        }
        // Initialize location at the center of the keypad
        xIndex = 1;
        yIndex = 1;
    }

    public int currentKey() {
        System.out.println("Current coords: " + xIndex + "," + yIndex);
        return numericKeys[xIndex][yIndex];
    }

    public int moveUp() {
        currentKey();
        // Condition where you can't move up
        if (xIndex == 0) {
            System.out.println("Can't move up from [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        } else {
            xIndex -= 1;
            System.out.println("Moving up to [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        }
    }

    public int moveDown() {
        currentKey();
        // Condition where you can't move down
        if (xIndex == 2) {
            System.out.println("Can't move down from [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        } else {
            xIndex += 1;
            System.out.println("Moving down to [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        }
    }

    public int moveRight() {
        currentKey();
        // Condition where you can't move right
        if (yIndex == 2) {
            System.out.println("Can't move right from [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        } else {
            yIndex += 1;
            System.out.println("Moving right to [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        }
    }

    public int moveLeft() {
        currentKey();
        // Condition where you can't move left
        if (yIndex == 0) {
            System.out.println("Can't move left from [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        } else {
            yIndex -= 1;
            System.out.println("Moving left to [" + xIndex + "," + yIndex + "]");
            return numericKeys[xIndex][yIndex];
        }
    }
}
