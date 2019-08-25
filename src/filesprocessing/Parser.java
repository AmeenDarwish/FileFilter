

package filesprocessing;

import java.io.*;
import java.util.ArrayList;


//This class exists for all out parsing operations that we may need


/*Recomendations:
A module that knows the logical order of the commands file
○ First comes the filters, then the orders, …
● Generates the different objects consisting the program
○ The different sections, filters and orders, etc.
● A change in the file structure affects this module only
*/


/*

You may use the classes available under packages java.util.*, java.util.function, java.lang.*, java.io.*
and java.text.* in standard java 1.8 distribution. Specifically, in this exercise you are allowed
to change the java API level to 8. You are advised to use the java.io.File class for reading
directories, and String for working with text.

 */



/*
Working structure
1.check if file to be parsed , is in directory,otherwise return error(exception type II)
2.Recognize Section start and end , return as object
2+3.recognize section filter and order, return as same object
4.recognize spaces and return(error TYPE I)
5.recognize end and stop
6.return object to be used by main function
 */
/*
Exceptions :
- file not found
- Sections not ordered(two FILTER one after the other or Orders one after the other)
- no filter
- no order
 */


//TODO: NO EMPTY LINES WHAT SO EVER
//TODO : if input is "." =DOT ,it means current working directory and TWODOTS = prev directory,~ = home directory
//TODO : FILE OBJECT IS FALLIBLE

public class Parser {

    public static final String PATH_SEPERATOR = System.getProperty("file.separator");
    public static final String WORKING_DIRECTORY = System.getProperty("user.dir");
    public static final String PREV_PATH = "..";
    public static final String CURRENT_PATH =".";
    public static final String HOME_DIRECTORY = System.getProperty("user.home");
    public static final int EXIT_NORMALLY = 0;

    public static final String BAD_SECTION_NAME = "Error: Bad section name";
    public static final String FILE_NOT_FOUND = "Error: Command not found";
    public static final String NO_FILES_IN_SOURCEDIR = "ERROR: No files in sourcedir\n";
    BufferedReader reader;
    private ArrayList<File> FilesInDirectory;

    private File fileObject;
    public Parser(String destinationDirectory, String fileName) {
        this.FilesInDirectory = this.storeFilesInDirectory(destinationDirectory);
        this.fileObject = new File(destinationDirectory+ PATH_SEPERATOR + fileName);
        this.createReadable();
    }

    /**
     * method to make a reader out of the file and to catch the exception if the file was not found
     */
    private void createReadable(){
        try {
            this.reader = new BufferedReader(new FileReader(fileObject));
        }
        catch (FileNotFoundException | NullPointerException e) { //Todo make it more beautiful

            System.out.println(FILE_NOT_FOUND);
            System.exit(EXIT_NORMALLY); //todo check what do
        }
    }


    /**
     * Method to read line from file , catching each exception if line empty or file doesn't exit
     * @return line as string
     */
    protected String readLine() {
        try {
            return reader.readLine();
        }
        catch (IOException e) {
            System.out.println(FILE_NOT_FOUND);
            System.exit(EXIT_NORMALLY);
        }
        return null;
    }



    /**
     * gets list of files (with no directories) in any directory
     * @return
     */
    public ArrayList<File> storeFilesInDirectory(String destination){
        ArrayList<File> filesInDirectory = new ArrayList<>();
        File dir = new File(destination);
        File[] filesList = dir.listFiles();

        if(filesList == null || !checkDestination(destination)){
            System.out.println(NO_FILES_IN_SOURCEDIR);
            System.exit(EXIT_NORMALLY);
        }

        for(File file:filesList){

            if(file.isFile()){
                filesInDirectory.add(file);
            }
        }
        return filesInDirectory;
    }

    /**
     * Checks if given directory exists in the first place or not in any directory
     * @param destination
     * @return
     */
    boolean checkDestination(String destination){
        File dir = new File(destination);
        return dir.exists();
    }


    public ArrayList<File> getFilesInDirectory(){
        return this.FilesInDirectory;
    }

}

























