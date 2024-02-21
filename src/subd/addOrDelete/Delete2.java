package subd.addOrDelete;
import subd.read.ReadFromTable2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static subd.write.TableOfFingers.writeToFile3;
public class Delete2 {
    public void toDelete1() {
        List<String> originalList = ReadFromTable2.readThirdLine();

        List<String> distributedList = new ArrayList<>();

        if (!originalList.isEmpty() && originalList.get(0) != null) {

            String[] values = originalList.get(0).split("\t");

            distributedList.addAll(Arrays.asList(values));
        }
        try {
            System.out.println("What value do you want to delete? ");
            int button = new Scanner(System.in).nextInt();
            if (button >= 1 && button <= 8) {
                int index = button - 1;
                System.out.println("Deleted " + (index + 1) + " value");
                distributedList.set(index, "null");
            } else {
                System.out.println("Value did not find\n");
            }
            if (distributedList.size() >= 8) {
                writeToFile3(distributedList);
            } else {
                System.out.println("Not enough elements in the list to write to file.\n");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error! Please enter the number.\n");
        }
    }
}
