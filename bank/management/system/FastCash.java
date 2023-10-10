package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton button1, button2, button3, button4, button5, button6, button7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel AtmLabel = new JLabel(i3);
        AtmLabel.setBounds(0, 0, 960, 1080);
        add(AtmLabel);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(235, 400, 700, 35);
        AtmLabel.add(l1);

        button1 = new JButton("Rs 100");
        button2 = new JButton("Rs 500");
        button3 = new JButton("Rs 1000");
        button4 = new JButton("Rs 2000");
        button5 = new JButton("Rs 5000");
        button6 = new JButton("Rs 10000");
        button7 = new JButton("BACK");


        button1.setBounds(170, 499, 150, 35);
        AtmLabel.add(button1);

        button2.setBounds(390, 499, 150, 35);
        AtmLabel.add(button2);

        button3.setBounds(170, 543, 150, 35);
        AtmLabel.add(button3);

        button4.setBounds(390, 543, 150, 35);
        AtmLabel.add(button4);

        button5.setBounds(170, 588, 150, 35);
        AtmLabel.add(button5);

        button6.setBounds(390, 588, 150, 35);
        AtmLabel.add(button6);

        button7.setBounds(390, 633, 150, 35);
        AtmLabel.add(button7);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } String num = "17";
            if (ae.getSource() != button7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == button7) {
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");

                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
