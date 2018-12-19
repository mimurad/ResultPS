
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow implements ActionListener {

    JFrame window = new JFrame();
    JButton TP = new JButton("TEACHER'S PANEL");
    JButton SP = new JButton("STUDENT'S PANEL");

    public void showWindow() {

        window.setContentPane(new JLabel(new ImageIcon("Images\\logo.png")));
        initWindow();
        window.setTitle("ACADEMICS");
        window.setSize(800, 500);
        window.setLocation(100, 100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public void initWindow() {

        TP.addActionListener(this);
        SP.addActionListener(this);

        JLabel welcome = new JLabel("Welcome!!!");

        window.setLayout(null);

        window.add(welcome);
        welcome.setBounds(330, 10, 300, 60);
        welcome.setFont(new Font(null, Font.BOLD, 25));
        welcome.setForeground(Color.DARK_GRAY);

        window.add(TP);
        TP.setBounds(50, 250, 185, 70);
        TP.setFont(new Font(null, Font.BOLD, 15));
        TP.setForeground(Color.DARK_GRAY);

        window.add(SP);
        SP.setBounds(550, 250, 185, 70);
        SP.setFont(new Font(null, Font.BOLD, 15));
        SP.setForeground(Color.DARK_GRAY);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == TP) {
            TeacherLogin loginWindow = new TeacherLogin();
            loginWindow.showWindow();
            window.setVisible(false);
        } else if (e.getSource() == SP) {
            EnterReg marks = new EnterReg();
            marks.showWindow();
            window.setVisible(false);

        }
    }

}
