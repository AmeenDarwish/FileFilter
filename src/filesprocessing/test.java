package filesprocessing;

import filesprocessing.Orders.Size;

import java.io.File;
import java.util.ArrayList;

public class test {

    public static final String DESTINATION_DIRECTORY = "/cs/usr/ameen_darwish/IdeaProjects/Ex5/src/filesprocessing";
    public static final String FILE_NAME = "Commands File";

    public static void main(String[] args) {

        Parser parser = new Parser(DESTINATION_DIRECTORY, FILE_NAME);
        String line = parser.readLine();
        String test = "abcd";
        char[] characters = test.toCharArray();

        ArrayList<File> filesInDirectory = parser.getFilesInDirectory();
        Size sizer = new Size(filesInDirectory, true);
        ArrayList<File> orderedSizes = sizer.getOrderedFiles();
        StringBuilder resString = new StringBuilder();
        System.out.println();
        for (char character:characters) {

            resString.append((Character.getNumericValue(character)));
            System.out.println(Character.getNumericValue(character));
        }

        System.out.println(resString);
    }
}

