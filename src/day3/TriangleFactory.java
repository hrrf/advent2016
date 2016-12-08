package day3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nathan.lamb on 12/5/2016.
 */
public class TriangleFactory {

    public static List<Triangle> getTrianglesFromFile(Path path) throws IOException {
       List<String> triangleArray = Files.readAllLines(path, StandardCharsets.UTF_8);

       LinkedList<Triangle> triangles = new LinkedList<Triangle>();

       int rowCount = 0;

       String[] column1 = new String[3];
       String[] column2 = new String[3];
       String[] column3 = new String[3];

        for(String t : triangleArray) {
            // t is "  ###  ###  ### "
            String temp = t.trim();
            String[] sides = temp.split("\\s+");

            column1[rowCount] = sides[0];
            column2[rowCount] = sides[1];
            column3[rowCount] = sides[2];

            rowCount += 1;

            if (rowCount == 3) {

                triangles.add(new Triangle(Integer.valueOf(column1[0]), Integer.valueOf(column1[1]), Integer.valueOf(column1[2])));
                triangles.add(new Triangle(Integer.valueOf(column2[0]), Integer.valueOf(column2[1]), Integer.valueOf(column2[2])));
                triangles.add(new Triangle(Integer.valueOf(column3[0]), Integer.valueOf(column3[1]), Integer.valueOf(column3[2])));

                rowCount = 0;
            }

        }

        return triangles;
    }
}
