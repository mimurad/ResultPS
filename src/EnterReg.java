
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

public class EnterReg implements ActionListener {

    JFrame window = new JFrame();
    JButton submit = new JButton("Submit");
    JButton back = new JButton("Back");
    JTextField regNumberField = new JTextField();

    public void showWindow() {

        window.setContentPane(new JLabel(new ImageIcon("Images\\logo.png")));
        initWindow();
        window.setTitle("ACADEMIC");
        window.setSize(800, 500);
        window.setLocation(100, 100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public void initWindow() {

        submit.addActionListener(this);
        back.addActionListener(this);

        JLabel regnunmber = new JLabel("ENTER REGISTRATION NUMBER");

//        JLabel enterFlatnumber = new JLabel("Enter Flat Number ::");
        window.setLayout(null);

        window.add(regnunmber);
        regnunmber.setBounds(200, 10, 400, 60);
        regnunmber.setFont(new Font(null, Font.BOLD, 25));
        regnunmber.setForeground(Color.DARK_GRAY);

        window.add(regNumberField);
        regNumberField.setBounds(250, 170, 300, 50);
        regNumberField.setFont(new Font(null, Font.BOLD, 25));
        regNumberField.setForeground(Color.DARK_GRAY);

        window.add(submit);

        submit.setBounds(590, 400, 150, 30);
        submit.setFont(new Font(null, Font.BOLD, 15));
        submit.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(50, 400, 150, 30);
        back.setFont(new Font(null, Font.BOLD, 15));
        back.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String regNo = regNumberField.getText().toString();

        if (e.getSource() == submit) {
            if (regNo.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Registration Number");
            } else {
                DisplayResult marksWindow = new DisplayResult();
                FileRead objOne = new FileRead();
                
                int atndnc = objOne.totalAttendence(regNo);
                int tt1 = objOne.termtest2(regNo);
                int tt2 = objOne.termtest1(regNo);
                int Final = objOne.finalmarks(regNo);
                window.setVisible(false);
                marksWindow.showWindow(regNo, atndnc, tt1, tt2, Final);

            }
        } else if (e.getSource() == back) {
            MainWindow lgWindow = new MainWindow();
            lgWindow.showWindow();
            window.setVisible(false);
        }

    }

}
