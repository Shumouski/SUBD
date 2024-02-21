package subd.selectFingers;
import subd.addOrDelete.AddValues;
import java.util.List;
import java.util.Scanner;
import static subd.read.PrintTable.printResult;
import static subd.read.ReadFromTable.readFile;
import static subd.read.ReadFromTable.readHeaders;

public class SelectClass {
    public void selectPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please, select a positions
               
                1. First position
                2. Second position
                3. Third position
                4. Fourth position
                5. Fifth position
                6. Sixth position
                7. Seventh position
                8. Eighth position
                9. All table
                10. Add values
                11. Delete values
                12. Exit
                """);
        try{
        int command = scanner.nextInt();
        switch (command) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                List<String> result = readFile();
                List<String> headers = readHeaders();
                printResult(result, headers, command);
            }
            case 10 -> {
                AddValues addValues = new AddValues();
                addValues.addNewFinger();
            }
            case 11 -> {
                SelectClassDelete selectClassDelete = new SelectClassDelete();
                selectClassDelete.selectToDelete();
            }
            case 12 -> {
                System.out.println("Thanks for check my subd");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice\n");
        }
        } catch (java.util.InputMismatchException e) {
                System.out.println("Error! Please enter the number.\n");
                scanner.nextLine();
                SelectClass selectClass = new SelectClass();
                selectClass.selectPosition();
        }
    }
}

