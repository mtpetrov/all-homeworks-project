package lecture7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FixThisCode {
    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }



    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the file path: ");
            String filePath = scanner.nextLine();
            System.out.println("Enter how many times to add the text in the file: ");
            int howManyTimesToPrintTheTextToFile = Integer.parseInt(scanner.nextLine());
            System.out.println("Please provide the text: ");
            String textToAdd = scanner.nextLine();
            fileWriter = getFileWriter(filePath);
            printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (IOException e) {
            System.out.println("Unable to print the text to the file!");
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid number for how many times to add the text!");
        } finally {
            if (fileWriter != null) {
                closeFileWriter(fileWriter);
            }
        }
    }
    /*Test 1 Valid test:
    src/lecture07/exceptions/testFile.txt
    3
    This is a test line.

    Test2 Invalid test:
    invalidpath/test.txt
    2
    Another test. */
}

