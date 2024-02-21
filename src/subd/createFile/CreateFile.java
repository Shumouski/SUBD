package subd.createFile;
import subd.selectFingers.Headers;
import subd.write.TableOfFingers;
import java.io.File;
import java.io.IOException;
public class CreateFile {
    public void toCreateFile() {
        Headers headers = new Headers("Header1","Header2","Header3","Header4","Header5","Header6","Header7","Header8");
        TableOfFingers.header = headers;

        String createFile = System.getProperty("user.home") + File.separator + "OneDrive" + File.separator + "Desktop";

        File fileOnDesktop = new File(createFile, "subd.txt");

        try { boolean fileCreated = fileOnDesktop.createNewFile();

            if (fileCreated) {
                System.out.println("File has created.\n");
                System.out.println();
            } else {
                System.out.println("This file has been created until that.\n");
            }
        } catch (IOException e) {
            System.err.println("We have error to created file: " + e.getMessage());
        }
        TableOfFingers.toWrite();
    }
}

