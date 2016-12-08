package day1; /**
 * Created by nathan.lamb on 12/1/2016.
 */
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Navigator {

    private static int cX = 0;

    private static int cY = 0;

    public static void main(String[] args) {
        String input = "R1, L3, R5, R5, R5, L4, R5, R1, R2, L1, L1, R5, R1, L3, L5, L2, R4, L1, R4, R5, L3, R5, L1, R3, L5, R1, L2, R1, L5, L1, R1, R4, R1, L1, L3, R3, R5, L3, R4, L4, R5, L5, L1, L2, R4, R3, R3, L185, R3, R4, L5, L4, R48, R1, R2, L1, R1, L4, L4, R77, R5, L2, R192, R2, R5, L4, L5, L3, R2, L4, R1, L5, R5, R4, R1, R2, L3, R4, R4, L2, L4, L3, R5, R4, L2, L1, L3, R1, R5, R5, R2, L5, L2, L3, L4, R2, R1, L4, L1, R1, R5, R3, R3, R4, L1, L4, R1, L2, R3, L3, L2, L1, L2, L2, L1, L2, R3, R1, L4, R1, L1, L4, R1, L2, L5, R3, L5, L2, L2, L3, R1, L4, R1, R1, R2, L1, L4, L4, R2, R2, R2, R2, R5, R1, L1, L4, L5, R2, R4, L3, L5, R2, R3, L4, L1, R2, R3, R5, L2, L3, R3, R1, R3";
        String[] bunnyDirections = input.split(", ");

        List<String> coordList = new ArrayList<>();

        char facing = 'n';
        int x = 0;
        int y = 0;

        for(int i = 0; i < bunnyDirections.length; i++) {
            if(bunnyDirections[i].charAt(0) == 'R'){
                switch (facing){
                    case 'n':
                        facing = 'e';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            x+=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 'e':
                        facing = 's';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            y-=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 's':
                        facing = 'w';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            x-=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 'w':
                        facing = 'n';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            y+=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                }
            } else {
                switch (facing){
                    case 'n':
                        facing = 'w';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            x-=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 'e':
                        facing = 'n';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            y+=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 's':
                        facing = 'e';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            x+=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                    case 'w':
                        facing = 's';
                        for (int j = 0; j < parseInt(bunnyDirections[i].substring(1, bunnyDirections[i].length())); j++) {
                            y-=1;
                            isCrossover(coordList, x, y);
                        }
                        break;
                }
            }
        }

        int distance = Math.abs(0 - x) + Math.abs(0 - y);

        System.out.println("Crossover is " + (Math.abs(0 - cX) + Math.abs(0 - cY)));
    }

    private static void isCrossover(List<String> coordArrayList, int x, int y) {
        if(coordArrayList.contains(x + ", " + y)){
            if(cX == 0 && cY == 0){
                cX = x;
                cY = y;
            }
        }
        coordArrayList.add(x + ", " + y);
    }

}
