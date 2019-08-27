package filesprocessing;

import filesprocessing.Filters.Filter;
import filesprocessing.Filters.FilterFactory;
import filesprocessing.Orders.Order;
import filesprocessing.Orders.OrderFactory;

import java.io.File;
import java.util.ArrayList;

public class DirectoryProcessor {
    //todo check hidden


    public static void main(String[] args) {
        String destination = args[0];
        String commandFile = args[1];
        Parser parser = new Parser(destination, commandFile);
        ArrayList<File> files = parser.getFilesInDirectory();
        SectionManager sectionManager = new SectionManager();
        for (;;){
            sectionManager.readSection(parser,files );
        }



    }


}



