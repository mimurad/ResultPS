
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayResult implements ActionListener {

    JFrame window = new JFrame();
    JButton ok = new JButton("OK");
    JButton back = new JButton("Back");
    JButton print = new JButton("Print");
    String regNo;
    int attendence;
    int term1;
    int term2, Finalmarks;
    private void PritnActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    Toolkit tkp = window.getToolkit();
    PrintJob pjp;
    
    pjp = tkp.getPrintJob( window, null, null);
    Graphics g = pjp.getGraphics();
    window.print(g);
    g.dispose();
    pjp.end();
}

//    public void printComponenet() {
//        
//
//        PrinterJob pj = PrinterJob.getPrinterJob();
//        pj.setJobName(" Print Component ");
//        
//
//        pj.setPrintable(new Printable() {
//            public int print(Graphics pg, PageFormat pf, int pageNum) {
//                if (pageNum > 0) {
//                    return Printable.NO_SUCH_PAGE;
//                }
//
//                Graphics2D g2 = (Graphics2D) pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                window.paint(g2);
//                return Printable.PAGE_EXISTS;
//            }
//        });
//        if (pj.printDialog() == false) {
//            return;
//        }
//
//        try {
//            pj.print();
//        } catch (PrinterException ex) {
//            // handle exception
//        }
//    }

    public void showWindow(String regNo, int atndnc, int tt2, int tt1, int Final) {
        this.regNo = regNo;
        this.attendence = atndnc;
        this.term1 = tt2;
        this.term2 = tt1;
        this.Finalmarks = Final;

        window.setContentPane(new JLabel(new ImageIcon("Images\\blue.jpg")));
        initWindow();
        window.setTitle("ACADEMIC");
        window.setSize(800, 500);
        window.setLocation(100, 100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public void initWindow() {

        ok.addActionListener(this);
        back.addActionListener(this);
        print.addActionListener(this);

        JLabel reg = new JLabel("ATTENDENCE");
        JLabel regLabel = new JLabel(attendence + "");
        JLabel Tt2 = new JLabel("TERM TEST 1");
        JLabel tt2Label = new JLabel(term2 + "");
        JLabel Tt1 = new JLabel("TERM TEST 2");
        JLabel tt1Label = new JLabel(term1 + "");
        JLabel fiNal = new JLabel("FINAL");
        JLabel finalLabel = new JLabel(Finalmarks + "");
        int total = attendence + term1 + term2 + Finalmarks;
        JLabel totalmarks = new JLabel("" + total);
        JLabel tm = new JLabel("TOTAL(out of 100)");

        window.setLayout(null);

        window.add(reg);
        reg.setBounds(50, 10, 300, 60);
        reg.setFont(new Font(null, Font.BOLD, 25));
        reg.setForeground(Color.DARK_GRAY);

        window.add(regLabel);
        regLabel.setBounds(450, 10, 300, 60);
        regLabel.setFont(new Font(null, Font.BOLD, 25));
        regLabel.setForeground(Color.DARK_GRAY);

        window.add(Tt2);
        Tt2.setBounds(50, 80, 300, 60);
        Tt2.setFont(new Font(null, Font.BOLD, 25));
        Tt2.setForeground(Color.DARK_GRAY);

        window.add(tt2Label);
        tt2Label.setBounds(450, 80, 300, 60);
        tt2Label.setFont(new Font(null, Font.BOLD, 25));
        tt2Label.setForeground(Color.DARK_GRAY);

        window.add(Tt1);
        Tt1.setBounds(50, 150, 300, 60);
        Tt1.setFont(new Font(null, Font.BOLD, 25));
        Tt1.setForeground(Color.DARK_GRAY);

        window.add(tt1Label);
        tt1Label.setBounds(450, 150, 300, 60);
        tt1Label.setFont(new Font(null, Font.BOLD, 25));
        tt1Label.setForeground(Color.DARK_GRAY);

        window.add(fiNal);
        fiNal.setBounds(50, 220, 300, 60);
        fiNal.setFont(new Font(null, Font.BOLD, 25));
        fiNal.setForeground(Color.DARK_GRAY);

        window.add(finalLabel);
        finalLabel.setBounds(450, 220, 300, 60);
        finalLabel.setFont(new Font(null, Font.BOLD, 25));
        finalLabel.setForeground(Color.DARK_GRAY);

        window.add(tm);
        tm.setBounds(50, 290, 300, 60);
        tm.setFont(new Font(null, Font.BOLD, 25));
        tm.setForeground(Color.DARK_GRAY);

        window.add(totalmarks);
        totalmarks.setBounds(440, 290, 300, 60);
        totalmarks.setFont(new Font(null, Font.BOLD, 25));
        totalmarks.setForeground(Color.DARK_GRAY);

        window.add(back);
        back.setBounds(50, 380, 150, 30);
        back.setFont(new Font(null, Font.BOLD, 15));
        back.setForeground(Color.DARK_GRAY);

        window.add(print);
        print.setBounds(300, 380, 150, 30);
        print.setFont(new Font(null, Font.BOLD, 15));
        print.setForeground(Color.DARK_GRAY);

        window.add(ok);
        ok.setBounds(530, 380, 150, 30);
        ok.setFont(new Font(null, Font.BOLD, 15));
        ok.setForeground(Color.DARK_GRAY);
//        DisplayResult d = new DisplayResult();
//            d.printComponenet();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ok) {
            MainWindow anew = new MainWindow();
            anew.showWindow();
            window.setVisible(false);
        } else if (e.getSource() == back) {
            EnterReg marks = new EnterReg();
            marks.showWindow();
        } 
        else if (e.getSource() == print) {
//                DisplayResult a= new DisplayResult();
//                a.PritnActionPerformed(e);

PrinterJob pjob = PrinterJob.getPrinterJob();
PageFormat preformat = pjob.defaultPage();
preformat.setOrientation(PageFormat.LANDSCAPE);
PageFormat postformat = pjob.pageDialog(preformat);
//If user does not hit cancel then print.
if (preformat != postformat) {
    //Set print component
    pjob.setPrintable(new Printer(window), postformat);
    if (pjob.printDialog()) {
        try {
            pjob.print();
        } catch (PrinterException ex) {
            Logger.getLogger(DisplayResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
           
        }

    }

}
