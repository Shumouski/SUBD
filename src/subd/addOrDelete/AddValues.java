package subd.addOrDelete;
import subd.selectFingers.Values;

import java.util.Scanner;

import static subd.write.TableOfFingers.writeToFile;
public class AddValues {
    public void addNewFinger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 value: ");
        String value1 = scanner.nextLine();
        System.out.println("Enter 2 value: ");
        String value2 = scanner.nextLine();
        System.out.println("Enter 3 value: ");
        String value3 = scanner.nextLine();
        System.out.println("Enter 4 value: ");
        String value4 = scanner.nextLine();
        System.out.println("Enter 5 value: ");
        String value5 = scanner.nextLine();
        System.out.println("Enter 6 value: ");
        String value6 = scanner.nextLine();
        System.out.println("Enter 7 value: ");
        String value7 = scanner.nextLine();
        System.out.println("Enter 8 value: ");
        String value8 = scanner.nextLine();

        Values values = new Values(value1, value2, value3, value4, value5, value6, value7, value8);
        writeToFile(values);
    }
}