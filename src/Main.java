import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {


    public static void main(String[] args) {

        /* gets current working directory */
        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();



        File dir = new File(path.toString()); /* Creates file (a directory) from the above path name */

        File[] directoryListing = dir.listFiles(); /* creates array of all files in above directory */
        if (directoryListing != null) {
            for (File child : directoryListing) {
                
            }
        } else {

        }

    }

}
