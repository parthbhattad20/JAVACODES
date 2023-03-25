
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Prac_3 {

    public static void Frame() {
        JFrame f1 = new JFrame("go to the next page ");
        JButton b4;

        b4 = new JButton("Go");
        b4.setBounds(420, 470, 70, 30);

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                StudentInfo();

            }
        });

        f1.add(b4);

        f1.setLayout(null);
        f1.setSize(700, 600);
        f1.setVisible(true);
    }

 

    public static void StudentInfo() {
        JFrame f = new JFrame("Student Registration and result Fom in java");
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
        JTextField t1, t2, t3, t4, t5, t6, t7;
        JComboBox j1, j2;
        JButton b1, b2;

        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("College Email ID:");
        l2.setBounds(50, 120, 120, 30);
        l3 = new JLabel("Branch:");
        l3.setBounds(50, 190, 50, 30);
        l4 = new JLabel("Section:");
        l4.setBounds(420, 50, 70, 30);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(420, 120, 70, 30);
        l6 = new JLabel("Chemistry:");
        l6.setBounds(40, 250, 70, 30);
        l7 = new JLabel("Physics:");
        l7.setBounds(40, 280, 70, 30);
        l8 = new JLabel("Maths:");
        l8.setBounds(40, 310, 70, 30);
        l9 = new JLabel("Result:");
        l9.setBounds(40, 340, 70, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 30, 30);
        t2 = new JTextField();
        t2.setBounds(160, 120, 130, 30);
        t3 = new JTextField();
        t3.setBounds(490, 120, 130, 30);

        t4 = new JTextField();
        t4.setBounds(150, 250, 130, 30);
        t5 = new JTextField();
        t5.setBounds(150, 280, 130, 30);
        t6 = new JTextField();
        t6.setBounds(150, 310, 130, 30);

        t7 = new JTextField();
        t7.setBounds(150, 340, 130, 30);

        String s1[] = { " ", "CS", "ENTC", "ELE",
                "CIVIL", "MEC", "Others" };
        String s2[] = { "  ", "A", "B", "C", "D", "E" };

        j1 = new JComboBox(s1);
        j1.setBounds(120, 190, 100, 30);
        j2 = new JComboBox(s2);
        j2.setBounds(470, 50, 140, 30);

        b1 = new JButton("Save");
        b1.setBounds(150, 470, 70, 30);
        b2 = new JButton("Close");
        b2.setBounds(420, 470, 70, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double m, n, o, result;

                m = Double.parseDouble(t4.getText());
                n = Double.parseDouble(t5.getText());
                o = Double.parseDouble(t6.getText());

                result = m + n + o;
                String s = String.valueOf(result);
                t7.setText(s);

                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + "";
                String s5 = t3.getText();

                String res = "";
                if (e.getSource() == b1) {

                    res = res + " Name :" + s1 + " ";

                    res = res + "Mobile Number :" + s5 + " ";
                    res = res + "Branch:" + s4 + " ";
                    res = res + "Result " + s;

                    JOptionPane.showMessageDialog(f, "Successfully calculated");
                    f.dispose();
                    new ResultForm(res);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(j1);
        f.add(l4);
        f.add(j2);
        f.add(l5);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(l6);
        f.add(t5);

        f.add(l7);
        f.add(t6);
        f.add(l8);
        f.add(t6);
        f.add(l9);
        f.add(t7);

        f.add(b1);
        f.add(b2);

        f.setLayout(null);
        f.setSize(700, 600);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        Frame();
    }
}

class ResultForm extends JFrame {

    public ResultForm(String res) {
        super("Result Form");
        JLabel l1 = new JLabel("Student Info");
        l1.setBounds(50, 10, 100, 30);
        JLabel l2 = new JLabel(res);
        l2.setBounds(20, 15, 120, 30);
        add(l1);
        add(l2);
        setSize(500, 500);
        setVisible(true);

    }
}
