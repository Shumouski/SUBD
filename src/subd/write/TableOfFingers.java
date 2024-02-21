package subd.write;
import subd.selectFingers.Values;
import subd.selectFingers.Headers;
import subd.selectFingers.SelectClass;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class TableOfFingers {
    public static Headers header;

    public static void toWrite() {
        List<subd.selectFingers.Headers> headers1 = header.getHeader();
        headers1.add(new subd.selectFingers.Headers("Header1","Header2","Header3","Header4","Header5","Header6","Header7","Header8"));

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
            for (subd.selectFingers.Headers headers2 : headers1) {
                if (headers2 != null) {
                    fileWriter.write(headers2.getHeaders1() + "\t");
                    fileWriter.write(headers2.getHeaders2() + "\t");
                    fileWriter.write(headers2.getHeaders3() + "\t");
                    fileWriter.write(headers2.getHeaders4() + "\t");
                    fileWriter.write(headers2.getHeaders5() + "\t");
                    fileWriter.write(headers2.getHeaders6() + "\t");
                    fileWriter.write(headers2.getHeaders7() + "\t");
                    fileWriter.write(headers2.getHeaders8() + "\n");
                } else {
                    fileWriter.write("null");
                }
            }
        } catch (IOException e) {
            System.out.println("We have error to created file: " + e.getMessage());
        }
        SelectClass selectClass = new SelectClass();
        selectClass.selectPosition();
    }
    public static void writeToFile(Values newValue) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt", true))) {

            fileWriter.write(newValue.getValue1() + "\t");
            fileWriter.write(newValue.getValue2() + "\t");
            fileWriter.write(newValue.getValue3() + "\t");
            fileWriter.write(newValue.getValue4() + "\t");
            fileWriter.write(newValue.getValue5() + "\t");
            fileWriter.write(newValue.getValue6() + "\t");
            fileWriter.write(newValue.getValue7() + "\t");
            fileWriter.write(newValue.getValue8() + "\n");
            System.out.println();
            System.out.println("All is done");
        } catch (IOException e) {
            System.out.println("We have an error creating the file: " + e.getMessage());
        }
        SelectClass selectClass = new SelectClass();
        selectClass.selectPosition();
    }
    public static void writeToFile2(List<String> newValue) {
        try {
            List<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            }
            if (lines.size() >= 2) {
                lines.set(1, String.join("\t", newValue));
            } else {
                System.out.println("File does not have a second line.\n");
                return;
            }
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
                for (String updatedLine : lines) {
                    fileWriter.write(updatedLine);
                    fileWriter.newLine();
                }
            }
            System.out.println("Updated the second line in the file.\n");

        } catch (IOException e) {
            System.out.println("Error updating the file: " + e.getMessage());
        }
        SelectClass selectClass = new SelectClass();
        selectClass.selectPosition();
    }
    public static void writeToFile3(List<String> newValue) {
        try {
            List<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
                String line;
                for (int i = 0; i < 2; i++) {
                    lines.add(reader.readLine());
                }

                if ((line = reader.readLine()) != null) {
                    lines.add(String.join("\t", newValue));
                } else {
                    System.out.println("The third line does not exist in the file.\n");
                    return;
                }

                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            }
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\shumo\\OneDrive\\Desktop\\subd.txt"))) {
                for (String updatedLine : lines) {
                    fileWriter.write(updatedLine);
                    fileWriter.newLine();
                }
            }
            System.out.println("Updated the third line in the file.");
        } catch (IOException e) {
            System.out.println("Error updating the file: " + e.getMessage());
        }
        SelectClass selectClass = new SelectClass();
        selectClass.selectPosition();
    }
}
