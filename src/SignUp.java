
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp implements ActionListener {

    JFrame window = new JFrame();
    JButton creat = new JButton("Create");
    JButton back = new JButton("Back");
    JPasswordField passWordField = new JPasswordField();
    JPasswordField rpassWordField = new JPasswordField();
    JTextField name = new JTextField();
    public String UN;

    public void showWindow() {
        window.setContentPane(new JLabel(new ImageIcon("Images\\logo.png")));
        initWindow();
        window.setTitle("Academic");
        window.setSize(800, 500);
        window.setLocation(100, 100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public void initWindow() {

        creat.addActionListener(this);
        back.addActionListener(this);

        JLabel accountHolderInfo = new JLabel("Enter Information");

        JLabel user = new JLabel("Enter UserName");

        JLabel passWord = new JLabel("Enter PassWord");

        JLabel rpassWord = new JLabel("Re-enter PassWord");

        window.setLayout(null);

        window.add(accountHolderInfo);
        accountHolderInfo.setBounds(240, 10, 300, 60);
        accountHolderInfo.setFont(new Font(null, Font.BOLD, 25));
        accountHolderInfo.setForeground(Color.DARK_GRAY);

        window.add(user);
        user.setBounds(50, 120, 300, 80);
        user.setFont(new Font(null, Font.BOLD, 25));
        user.setForeground(Color.DARK_GRAY);

        window.add(name);
        name.setBounds(450, 130, 300, 50);
        name.setFont(new Font(null, Font.BOLD, 25));
        name.setForeground(Color.DARK_GRAY);

        window.add(passWord);
        passWord.setBounds(50, 220, 300, 80);
        passWord.setFont(new Font(null, Font.BOLD, 25));
        passWord.setForeground(Color.DARK_GRAY);

        window.add(passWordField);
        passWordField.setBounds(450, 230, 300, 50);
        passWordField.setFont(new Font(null, Font.BOLD, 25));
        passWordField.setForeground(Color.DARK_GRAY);

        window.add(rpassWord);
        rpassWord.setBounds(50, 300, 300, 80);
        rpassWord.setFont(new Font(null, Font.BOLD, 25));
        rpassWord.setForeground(Color.DARK_GRAY);

        window.add(rpassWordField);
        rpassWordField.setBounds(450, 310, 300, 50);
        rpassWordField.setFont(new Font(null, Font.BOLD, 25));
        rpassWordField.setForeground(Color.DARK_GRAY);

        window.add(creat);
        creat.setBounds(590, 400, 150, 30);
        creat.setFont(new Font(null, Font.BOLD, 15));
        creat.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(50, 400, 150, 30);
        back.setFont(new Font(null, Font.BOLD, 15));
        back.setForeground(Color.DARK_GRAY);

    }

    public void actionPerformed(ActionEvent e) {

        UN = name.getText().toString();
        @SuppressWarnings("deprecation")
        String passWord = passWordField.getText().toString();
        @SuppressWarnings("deprecation")
        String rpassWord = rpassWordField.getText().toString();
        String uname = name.getText().toString();

        if (e.getSource() == creat) {
            if (uname.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Username");
            } else {
                FilePrint filePrint = new FilePrint();
                filePrint.marksFile(uname);

            }
            if (!passWord.equals(rpassWord)) {
                //System.out.println("Please Input Same Password Twice");
                JOptionPane.showMessageDialog(null, "Please Input Same Password Twice");
            } else {
                FilePrint filePrint = new FilePrint();
                filePrint.marksPassrPass(UN, passWord);
                JOptionPane.showMessageDialog(null, "Account Created");

            }
        } else if (e.getSource() == back) {
            TeacherLogin mainWindow = new TeacherLogin();
            mainWindow.showWindow();
            window.setVisible(false);
        }

    }

}
