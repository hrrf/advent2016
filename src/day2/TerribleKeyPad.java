package day2;

/**
 * Created by nathan.lamb on 12/2/2016.
 */
public class TerribleKeyPad {
    private char[][] alphaKeys;
    private int xIndex;
    private int yIndex;

    public TerribleKeyPad() {
        String[] shitKeypadString = {
                "XX1XX",
                "X234X",
                "56789",
                "XABCX",
                "XXDXX"
        };

        alphaKeys = new char[5][5];
        for(int i = 0; i < shitKeypadString.length; i++) {
            alphaKeys[i] = shitKeypadString[i].toCharArray();
        }

        for(int i = 0; i < 5; i++) {
            System.out.print("[");
            for(int j = 0; j < 5; j++) {
                System.out.print("{" + alphaKeys[i][j] + "}");
            }
            System.out.println("]");
        }

        xIndex = 2;
        yIndex = 0;

    }

    public char currentKey() {
        System.out.println("Current coords: " + xIndex + "," + yIndex);
        return alphaKeys[xIndex][yIndex];
    }

    public char moveUp() {
        currentKey();
        // Condition where you can't move up
        int xPeek = xIndex - 1;

        if ((xIndex == 0) || (isVerboten(xPeek, yIndex))) {
            System.out.println("Can't move up from [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        } else {
            xIndex -= 1;
            System.out.println("Moving up to [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        }
    }

    public char moveDown() {
        currentKey();
        // Condition where you can't move down

        int xPeek = xIndex + 1;

        if ((xIndex == 4) || (isVerboten(xPeek, yIndex))) {
            System.out.println("Can't move down from [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        } else {
            xIndex += 1;
            System.out.println("Moving down to [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        }
    }

    public char moveRight() {
        currentKey();
        int yPeek = yIndex + 1;

        if ((yIndex == 4) || (isVerboten(xIndex, yPeek))) {
            System.out.println("Can't move right from [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        } else {
            yIndex += 1;
            System.out.println("Moving right to [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        }
    }

    public char moveLeft() {
        currentKey();
        // Condition where you can't move left
        int yPeek = yIndex - 1;

        if ((yIndex == 0) || (isVerboten(xIndex, yPeek))) {
            System.out.println("Can't move left from [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        } else {
            yIndex -= 1;
            System.out.println("Moving left to [" + xIndex + "," + yIndex + "]");
            return alphaKeys[xIndex][yIndex];
        }
    }

    public boolean isValidKey(int x, int y) {
        return alphaKeys[x][y] != 'X';
    }

    public boolean isVerboten(int x, int y) {
        return alphaKeys[x][y] == 'X';
    }
}
