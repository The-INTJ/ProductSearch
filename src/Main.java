import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {


    public static void main(String[] args) {

        /* gets current working directory */
        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();



        File dir = new File(path.toString()); /* Creates file (a directory) from the above path name */

        File[] directoryListing = dir.listFiles(); /* creates array of all files in above directory */
        if (directoryListing != null) {
            String str;
            for (File child : directoryListing) {
                str = child.getName();
                System.out.println(str);
                if(str.substring(str.length()-3, str.length()).compareTo("txt") == 0) {
                    try {
                        FileReader fileReader = new FileReader(child.getName());
                        int ch = fileReader.read();
                        while (ch != -1) {
                            System.out.print((char) ch);
                            ch = fileReader.read();
                        }
                    } catch (Exception e) {

                    }
                }
            }
        } else {

        }

    }

}
