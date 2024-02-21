package subd.back;
import subd.selectFingers.SelectClass;
import java.util.Scanner;
public class BackToSelect {
    public void toBackToSelect() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                What do you want to do?
                1.Back to select
                2.Exit""");
        int command = scanner.nextInt();
        try {
            switch (command) {
                case 1:
                    SelectClass selectClass = new SelectClass();
                    selectClass.selectPosition();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Such command is missing");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
