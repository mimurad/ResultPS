
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrint {

    public void marksFile(String regno) {
        try {
            File file = new File(regno + ".txt");
            File file2 = new File("marks.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            FileWriter fileWrter2 = new FileWriter(file2, true);
            fileWriter.write(regno + " \n");
            fileWrter2.write("markss.txt");
            fileWriter.close();
            fileWrter2.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void marksPassrPass(String username, String passWord) {
        File file = new File(username + "pass.txt");
        System.out.println("NO = " + username);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(passWord + "\r\n");
            fileWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void marks(String regno, String attendences, String tt1marks, String tt2marks, String finalmarks) {
        File attendence = new File(regno + "attendence.txt");
        File tt1mark = new File(regno + "termtest1.txt");
        File tt2mark = new File(regno + "termtest2.txt");
        File finalmark = new File(regno + "final.txt");
        FileWriter fileWriterAtndnc;
        FileWriter fileWriterTT1;
        FileWriter fileWriterTT2;
        FileWriter fileWriterFinal;
        try {
            fileWriterAtndnc = new FileWriter(attendence, true);
            fileWriterTT2 = new FileWriter(tt2mark, true);
            fileWriterTT1 = new FileWriter(tt1mark, true);
            fileWriterFinal = new FileWriter(finalmark, true);
            fileWriterTT1.write(tt1marks + "\n");
            fileWriterTT2.write(tt2marks + "\n");
            fileWriterAtndnc.write(attendences + "\n");
            fileWriterFinal.write(finalmarks + "\n");
            fileWriterTT1.close();
            fileWriterAtndnc.close();
            fileWriterTT2.close();
            fileWriterFinal.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
