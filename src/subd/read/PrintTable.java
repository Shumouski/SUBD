package subd.read;
import subd.back.BackToSelect;

import java.util.List;
public class PrintTable {
    public static void printResult(List<String> result, List<String> headers, int selectCase) {
        if (selectCase == 9) {
            for (int i = 0; i < Math.min(9, headers.size()); i++) {
                if (i != 0) {
                    System.out.print("| ");
                }
                System.out.printf("%-20s", headers.get(i));
            }
            System.out.println();
            for (String line : result) {
                String[] fingers = line.split("\t");
                for (int i = 0; i < Math.min(9, fingers.length); i++) {
                    if (i != 0) {
                        System.out.print("| ");
                    }
                    System.out.printf("%-20s", fingers[i]);
                }
                System.out.println();
            }
        } else if (selectCase >= 1 && selectCase <= 8) {
            System.out.printf("%-20s\n", headers.get(selectCase - 1));
            for (String line : result) {
                String[] fingers = line.split("\t");
                System.out.printf("%-20s\n", fingers[selectCase - 1]);
            }
        } else {
            System.out.println("Invalid command.\n");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        BackToSelect backToSelect = new BackToSelect();
        backToSelect.toBackToSelect();
    }
}
