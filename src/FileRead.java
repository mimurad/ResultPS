
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    private Scanner fileScanner;
    private Scanner fileScanner2;
    private Scanner fileScanner3;
    private Scanner fileScanner4;
    private Scanner fileScanner5;

    public int totalAttendence(String regno) {
        File attendenceFile = new File(regno + "attendence.txt");
        int sum = 0;
        try {
            fileScanner5 = new Scanner(attendenceFile);
            while (fileScanner5.hasNextInt()) {
                int number = fileScanner5.nextInt();
                //int sum =0;
                sum = number;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sum;
    }

    public int termtest2(String regno) {
        File tt2 = new File(regno + "termtest2.txt");
        //int totalAttendence;
        int sum = 0;
        try {
            fileScanner4 = new Scanner(tt2);
            while (fileScanner4.hasNextInt()) {
                int number = fileScanner4.nextInt();
                sum = number;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sum;
    }

    public int termtest1(String regno) {
        File tt1 = new File(regno + "termtest1.txt");
        //int totalAttendence;
        int sum = 0;
        try {
            fileScanner3 = new Scanner(tt1);
            while (fileScanner3.hasNextInt()) {
                int number = fileScanner3.nextInt();
                sum = number;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sum;
    }

    public int finalmarks(String regno) {
        File mfinal = new File(regno + "final.txt");
        //int totalAttendence;
        int sum = 0;
        try {
            fileScanner2 = new Scanner(mfinal);
            while (fileScanner2.hasNextInt()) {
                int number = fileScanner2.nextInt();
                sum = number;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sum;
    }

}
