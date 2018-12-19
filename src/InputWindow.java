
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputWindow implements ActionListener {

    JFrame window = new JFrame();
    JButton submit = new JButton("Submit");
    JButton back = new JButton("Back");
    JTextField regNo = new JTextField();
    JTextField attendence = new JTextField();
    JTextField TT1 = new JTextField();
    JTextField TT2 = new JTextField();
    JTextField Final = new JTextField();
    JTextField othersField = new JTextField();

    public void showWindow() {

        window.setContentPane(new JLabel(new ImageIcon("Images\\logo.png")));
        initWindow();
        window.setTitle("ACADEMIC");
        window.setSize(800, 600);
        window.setLocation(100, 100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public void initWindow() {

        submit.addActionListener(this);
        back.addActionListener(this);

        JLabel enterMarks = new JLabel("Enter Marks");
        JLabel regNumber = new JLabel("REG. NO.  ");
        JLabel enterAttendence = new JLabel("ATTENDENCE  ");
        JLabel entertt1 = new JLabel("Term Test 1  ");
        JLabel entertt2 = new JLabel("Term Test 2  ");
        JLabel enterFinal = new JLabel("Final  ");
//		JLabel others = new JLabel("Others ::");

        window.setLayout(null);

        window.add(enterMarks);
        enterMarks.setBounds(325, 20, 350, 100);
        enterMarks.setFont(new Font(null, Font.BOLD, 25));
        enterMarks.setForeground(Color.DARK_GRAY);

        window.add(regNumber);
        regNumber.setBounds(50, 120, 300, 80);
        regNumber.setFont(new Font(null, Font.BOLD, 25));
        regNumber.setForeground(Color.DARK_GRAY);

        window.add(regNo);
        regNo.setBounds(450, 130, 300, 50);
        regNo.setFont(new Font(null, Font.BOLD, 25));
        regNo.setForeground(Color.DARK_GRAY);

        window.add(enterAttendence);
        enterAttendence.setBounds(50, 180, 300, 80);
        enterAttendence.setFont(new Font(null, Font.BOLD, 25));
        enterAttendence.setForeground(Color.DARK_GRAY);

        window.add(attendence);
        attendence.setBounds(450, 190, 300, 50);
        attendence.setFont(new Font(null, Font.BOLD, 25));
        attendence.setForeground(Color.DARK_GRAY);

        window.add(entertt1);
        entertt1.setBounds(50, 240, 300, 80);
        entertt1.setFont(new Font(null, Font.BOLD, 25));
        entertt1.setForeground(Color.DARK_GRAY);

        window.add(TT1);
        TT1.setBounds(450, 250, 300, 50);
        TT1.setFont(new Font(null, Font.BOLD, 25));
        TT1.setForeground(Color.DARK_GRAY);

        window.add(entertt2);
        entertt2.setBounds(50, 300, 300, 80);
        entertt2.setFont(new Font(null, Font.BOLD, 25));
        entertt2.setForeground(Color.DARK_GRAY);

        window.add(TT2);
        TT2.setBounds(450, 310, 300, 50);
        TT2.setFont(new Font(null, Font.BOLD, 25));
        TT2.setForeground(Color.DARK_GRAY);

        window.add(enterFinal);
        enterFinal.setBounds(50, 360, 300, 80);
        enterFinal.setFont(new Font(null, Font.BOLD, 25));
        enterFinal.setForeground(Color.DARK_GRAY);

        window.add(Final);
        Final.setBounds(450, 370, 300, 50);
        Final.setFont(new Font(null, Font.BOLD, 25));
        Final.setForeground(Color.DARK_GRAY);

        window.add(submit);
        submit.setBounds(590, 520, 150, 30);
        submit.setFont(new Font(null, Font.BOLD, 15));
        submit.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(50, 520, 150, 30);
        back.setFont(new Font(null, Font.BOLD, 15));
        back.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String regno = regNo.getText().toString();
        String attendences = attendence.getText().toString();
        String tt1mark = TT1.getText().toString();
        String tt2mark = TT2.getText().toString();
        String finalmarks = Final.getText().toString();
//		String others = othersField.getText().toString();
        FilePrint filePrint = new FilePrint();
        filePrint.marks(regno, attendences, tt1mark, tt2mark, finalmarks);

        if (e.getSource() == submit) {
            JOptionPane.showMessageDialog(null, "Marks Entered Successfully");
        } else if (e.getSource() == back) {
            MainWindow mainWindow = new MainWindow();
            mainWindow.showWindow();
            window.setVisible(false);
        }

    }

}
