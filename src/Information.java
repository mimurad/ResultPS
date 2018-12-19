
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Information implements ActionListener {

    JFrame window = new JFrame();
    JButton input = new JButton("MARKS");

    JButton back = new JButton("BACK");
    String regNo;

    public void showWindow(String regno) {
        this.regNo = regno;
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

        input.addActionListener(this);

        back.addActionListener(this);

        JLabel loginWindowInfo = new JLabel("TEACHER'S PANEL ");

        window.setLayout(null);

        window.add(loginWindowInfo);
        loginWindowInfo.setBounds(275, 8, 350, 100);
        loginWindowInfo.setFont(new Font(null, Font.BOLD, 25));
        loginWindowInfo.setForeground(Color.DARK_GRAY);

        window.add(input);
        input.setBounds(550, 120, 150, 80);
        input.setFont(new Font(null, Font.BOLD, 15));
        input.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(550, 320, 150, 80);
        back.setFont(new Font(null, Font.BOLD, 15));
        back.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == input) {

            InputWindow loginWindow = new InputWindow();
            loginWindow.showWindow();
            System.out.println(regNo);
            window.setVisible(false);

        } else if (e.getSource() == back) {
            TeacherLogin mainWindow = new TeacherLogin();
            mainWindow.showWindow();
            window.setVisible(false);
        }

    }

}
