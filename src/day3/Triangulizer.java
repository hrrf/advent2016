package day3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by nathan.lamb on 12/5/2016.
 */
public class Triangulizer {

    public static void main(String[] args) {

        List<Triangle> triangles = null;

        try {
            triangles = TriangleFactory.getTrianglesFromFile(Paths.get("C:\\Users\\Nathan.Lamb\\Downloads\\spring-mvc-server-generated\\advent2016\\src\\day3\\triangleinput"));
        } catch (IOException e) {
            System.out.println("poop");
        }

        System.out.println("There are " + triangles.size() + " triangles in the list.");

        int validCount = 0;
        for (Triangle t: triangles) {
            if (t.isValid()) {
                validCount += 1;
            }
        }

        System.out.println("There are " + validCount + " valid triangles.");
    }
}
