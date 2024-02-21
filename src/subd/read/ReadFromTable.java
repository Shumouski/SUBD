package subd.read;
import subd.selectFingers.SelectClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReadFromTable {
    public static List<String> readFile() {
        List<String> result = new ArrayList<>();

        try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {

            file.readLine();

            String line;
            if ((line = file.readLine()) != null) {
                result.add(line);
            } else {
                System.out.println("This line does not exist in the file.\n");
                SelectClass selectClass = new SelectClass();
                selectClass.selectPosition();
                return result;
            }

            while ((line = file.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return result;
    }
    public static List<String> readHeaders() {
        List<String> headers = new ArrayList<>();

        try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
            String line;

            if ((line = file.readLine()) != null) {
                headers.addAll(Arrays.asList(line.split("\t")));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return headers;
    }
}
