
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TeacherLogin implements ActionListener {

    JFrame window = new JFrame();
    JTextField username = new JTextField();
    JPasswordField ePassWord = new JPasswordField();
    JPasswordField rePassWord = new JPasswordField();
    JButton submit = new JButton("SUBMIT");
    JButton back = new JButton("BACK");
    JButton anew = new JButton("SIGNUP");

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
        anew.addActionListener(this);

        JLabel loginWindow = new JLabel("Login Window");
        JLabel USERNAME = new JLabel("USERNAME ::");
        JLabel passWord = new JLabel("Enter Password ::");
        JLabel rpassWord = new JLabel("ReEnter Password ::");

        window.setLayout(null);

        window.add(loginWindow);
        loginWindow.setBounds(300, 10, 300, 60);
        loginWindow.setFont(new Font(null, Font.BOLD, 25));
        loginWindow.setForeground(Color.BLACK);

        window.add(USERNAME);
        USERNAME.setBounds(50, 80, 300, 80);
        USERNAME.setFont(new Font(null, Font.BOLD, 25));
        USERNAME.setForeground(Color.DARK_GRAY);

        window.add(username);
        username.setBounds(450, 90, 300, 50);
        username.setFont(new Font(null, Font.BOLD, 25));
        username.setForeground(Color.DARK_GRAY);

        window.add(passWord);
        passWord.setBounds(50, 140, 300, 80);
        passWord.setFont(new Font(null, Font.BOLD, 25));
        passWord.setForeground(Color.DARK_GRAY);

        window.add(ePassWord);
        ePassWord.setBounds(450, 150, 300, 50);
        ePassWord.setFont(new Font(null, Font.BOLD, 25));
        ePassWord.setForeground(Color.DARK_GRAY);

        window.add(rpassWord);
        rpassWord.setBounds(50, 200, 300, 80);
        rpassWord.setFont(new Font(null, Font.BOLD, 25));
        rpassWord.setForeground(Color.RED);

        window.add(rePassWord);
        rePassWord.setBounds(450, 210, 300, 50);
        rePassWord.setFont(new Font(null, Font.BOLD, 25));
        rePassWord.setForeground(Color.DARK_GRAY);

        window.add(anew);
        anew.setBounds(300, 350, 150, 30);
        anew.setFont(new Font(null, Font.BOLD, 10));
        anew.setForeground(Color.DARK_GRAY);

        window.add(submit);
        submit.setBounds(600, 350, 150, 30);
        submit.setFont(new Font(null, Font.BOLD, 10));
        submit.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(50, 350, 150, 30);
        back.setFont(new Font(null, Font.BOLD, 10));
        back.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String un = username.getText().toString();
            if (un.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Registration Number");
            } else {
                @SuppressWarnings("deprecation")
                String passWord = ePassWord.getText().toString();
                File file = new File(un + "pass.txt");
//            String fileLocation = un+"pass.txt";
                Scanner myFileScanner;
                try {
                    myFileScanner = new Scanner(file);
                    String pass = myFileScanner.nextLine();
                    System.out.println("new pass = " + pass + "\nold = " + passWord);
                    if (passWord.equals(pass)) {
                        Information finformation = new Information();
                        finformation.showWindow(un);
                        window.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password");
                    }
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(null, "wrong information");
                }
//             window.setVisible(false);
            }

        } else if (e.getSource() == back) {
            MainWindow mainWindow = new MainWindow();
            mainWindow.showWindow();
            window.setVisible(false);
        } else if (e.getSource() == anew) {
            SignUp account = new SignUp();
            account.showWindow();
            window.setVisible(false);
        }

    }

}
