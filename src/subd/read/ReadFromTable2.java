package subd.read;
import subd.selectFingers.SelectClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadFromTable2 {
    public static List<String> readThirdLine() {
        List<String> result = new ArrayList<>();

        try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
            String line;
            for (int i = 0; i < 2; i++) {
                file.readLine();
            }

            if ((line = file.readLine()) != null) {
                result.add(line);
            } else {
                System.out.println("This line does not exist in the file.\n");
                SelectClass selectClass = new SelectClass();
                selectClass.selectPosition();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return result;
    }
}
