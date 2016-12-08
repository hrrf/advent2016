package day8;

/**
 * Created by nathan.lamb on 12/8/2016.
 */
public class BunnyScreenSolution {

    public static String instructions = "rect 1x1\n" +
            "rotate row y=0 by 7\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 2x1\n" +
            "rotate row y=0 by 7\n" +
            "rect 6x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 2x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x2\n" +
            "rotate row y=1 by 10\n" +
            "rotate row y=0 by 3\n" +
            "rotate column x=0 by 1\n" +
            "rect 2x1\n" +
            "rotate column x=20 by 1\n" +
            "rotate column x=15 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate row y=1 by 5\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x2\n" +
            "rotate row y=0 by 5\n" +
            "rotate column x=0 by 1\n" +
            "rect 4x1\n" +
            "rotate row y=2 by 15\n" +
            "rotate row y=0 by 5\n" +
            "rotate column x=0 by 1\n" +
            "rect 4x1\n" +
            "rotate row y=2 by 5\n" +
            "rotate row y=0 by 5\n" +
            "rotate column x=0 by 1\n" +
            "rect 4x1\n" +
            "rotate row y=2 by 10\n" +
            "rotate row y=0 by 10\n" +
            "rotate column x=8 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 9x1\n" +
            "rotate column x=27 by 1\n" +
            "rotate row y=0 by 5\n" +
            "rotate column x=0 by 1\n" +
            "rect 4x1\n" +
            "rotate column x=42 by 1\n" +
            "rotate column x=40 by 1\n" +
            "rotate column x=22 by 1\n" +
            "rotate column x=17 by 1\n" +
            "rotate column x=12 by 1\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate row y=3 by 10\n" +
            "rotate row y=2 by 5\n" +
            "rotate row y=1 by 3\n" +
            "rotate row y=0 by 10\n" +
            "rect 1x4\n" +
            "rotate column x=37 by 2\n" +
            "rotate row y=3 by 18\n" +
            "rotate row y=2 by 30\n" +
            "rotate row y=1 by 7\n" +
            "rotate row y=0 by 2\n" +
            "rotate column x=13 by 3\n" +
            "rotate column x=12 by 1\n" +
            "rotate column x=10 by 1\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=6 by 3\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 3\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 14x1\n" +
            "rotate column x=38 by 3\n" +
            "rotate row y=3 by 12\n" +
            "rotate row y=2 by 10\n" +
            "rotate row y=0 by 10\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 9x1\n" +
            "rotate row y=4 by 20\n" +
            "rotate row y=3 by 25\n" +
            "rotate row y=2 by 10\n" +
            "rotate row y=0 by 15\n" +
            "rotate column x=12 by 1\n" +
            "rotate column x=10 by 1\n" +
            "rotate column x=8 by 3\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 3\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 14x1\n" +
            "rotate column x=34 by 1\n" +
            "rotate row y=1 by 45\n" +
            "rotate column x=47 by 1\n" +
            "rotate column x=42 by 1\n" +
            "rotate column x=19 by 1\n" +
            "rotate column x=9 by 2\n" +
            "rotate row y=4 by 7\n" +
            "rotate row y=3 by 20\n" +
            "rotate row y=0 by 7\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 6x1\n" +
            "rotate row y=4 by 8\n" +
            "rotate row y=3 by 5\n" +
            "rotate row y=1 by 5\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=4 by 1\n" +
            "rotate column x=3 by 2\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=1 by 3\n" +
            "rotate column x=0 by 1\n" +
            "rect 6x1\n" +
            "rotate column x=36 by 3\n" +
            "rotate column x=25 by 3\n" +
            "rotate column x=18 by 3\n" +
            "rotate column x=11 by 3\n" +
            "rotate column x=3 by 4\n" +
            "rotate row y=4 by 5\n" +
            "rotate row y=3 by 5\n" +
            "rotate row y=2 by 8\n" +
            "rotate row y=1 by 8\n" +
            "rotate row y=0 by 3\n" +
            "rotate column x=3 by 4\n" +
            "rotate column x=0 by 4\n" +
            "rect 4x4\n" +
            "rotate row y=4 by 10\n" +
            "rotate row y=3 by 20\n" +
            "rotate row y=1 by 10\n" +
            "rotate row y=0 by 10\n" +
            "rotate column x=8 by 1\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=6 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=1 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 9x1\n" +
            "rotate row y=0 by 40\n" +
            "rotate column x=44 by 1\n" +
            "rotate column x=35 by 5\n" +
            "rotate column x=18 by 5\n" +
            "rotate column x=15 by 3\n" +
            "rotate column x=10 by 5\n" +
            "rotate row y=5 by 15\n" +
            "rotate row y=4 by 10\n" +
            "rotate row y=3 by 40\n" +
            "rotate row y=2 by 20\n" +
            "rotate row y=1 by 45\n" +
            "rotate row y=0 by 35\n" +
            "rotate column x=48 by 1\n" +
            "rotate column x=47 by 5\n" +
            "rotate column x=46 by 5\n" +
            "rotate column x=45 by 1\n" +
            "rotate column x=43 by 1\n" +
            "rotate column x=40 by 1\n" +
            "rotate column x=38 by 2\n" +
            "rotate column x=37 by 3\n" +
            "rotate column x=36 by 2\n" +
            "rotate column x=32 by 2\n" +
            "rotate column x=31 by 2\n" +
            "rotate column x=28 by 1\n" +
            "rotate column x=23 by 3\n" +
            "rotate column x=22 by 3\n" +
            "rotate column x=21 by 5\n" +
            "rotate column x=20 by 1\n" +
            "rotate column x=18 by 1\n" +
            "rotate column x=17 by 3\n" +
            "rotate column x=13 by 1\n" +
            "rotate column x=10 by 1\n" +
            "rotate column x=8 by 1\n" +
            "rotate column x=7 by 5\n" +
            "rotate column x=6 by 5\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 5\n" +
            "rotate column x=2 by 5\n" +
            "rotate column x=1 by 5\n";

    public static void main(String[] args) {
        BunnyScreen bs = new BunnyScreen(50, 6);
        bs.print();

        String[] instructionList = instructions.split("\n");

        for(int i = 0; i < instructionList.length; i++) {

            String s = instructionList[i];
            if (s.startsWith("rect")) {
                String[] dim = s.split("\\s");
                dim = dim[1].split("x");
                System.out.println("Add " + dim[0] + " x " + dim[1] + " pixels to display");
                bs.rect(Integer.valueOf(dim[0]), Integer.valueOf(dim[1]));
            } else if (s.startsWith("rotate row")) {
                String[] dim = s.split("=");
                s = s.replaceAll("\\s","");
                dim = dim[1].split("by");
                System.out.println("Rotate row " + dim[0] + " by " + dim[1]);
                bs.rotateRow(Integer.valueOf(dim[0].trim()), Integer.valueOf(dim[1].trim()));
            } else if (s.startsWith("rotate column")) {
                String[] dim = s.split("=");
                s = s.replaceAll("\\s","");
                dim = dim[1].split("by");
                System.out.println("Rotate column " + dim[0] + " by " + dim[1]);
                bs.rotateColumn(Integer.valueOf(dim[0].trim()), Integer.valueOf(dim[1].trim()));
            }
        }

        bs.print();
    }
}
