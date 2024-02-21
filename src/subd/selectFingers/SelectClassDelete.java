package subd.selectFingers;
import subd.addOrDelete.Delete;
import subd.addOrDelete.Delete2;
import java.util.Scanner;
public class SelectClassDelete {
    public void selectToDelete() {
        System.out.println("""
                Which one from line you want to delete?
                1.First line
                2.Second line""");
        int button = new Scanner(System.in).nextInt();
        try {
            switch (button) {
                case 1 -> {
                    Delete delete = new Delete();
                    delete.toDelete();
                }
                case 2 -> {
                    Delete2 delete2 = new Delete2();
                    delete2.toDelete1();
                }
                default -> {
                    System.out.println("Such command is missing");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
