package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener  {
    JLabel label1,label2,label3;
    JTextField text1;
    JPasswordField pwf2;
    JButton button1,button2,button3;
    private Label cardTextField, pinTextField;

    Login() {
        setLayout(null);
        setTitle("Automated Teller Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(200,40,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setBounds(125,150,375,30);
        add(label2);

        text1 = new JTextField(15);
        text1.setBounds(300,150,230,30);
        text1.setFont(new Font("Arial", Font.BOLD, 14));
        add(text1);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setBounds(125,220,375,30);
        add(label3);

        pwf2 = new JPasswordField(15);
        pwf2.setFont(new Font("Arial", Font.BOLD, 14));
        pwf2.setBounds(300,220,230,30);
        add(pwf2);

        button1 = new JButton("SIGN IN");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(300,300,100,30);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(430,300,100,30);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBounds(300,350,230,30);
        add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setLocation(550,200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try{
            if(ae.getSource()==button1){
                Conn c1 = new Conn();
                String cardnumber  = text1.getText();
                String pin  = pwf2.getText();
                String q  = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }else if(ae.getSource()==button2){
                text1.setText("");
                pwf2.setText("");
            }else if(ae.getSource()==button3){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public static void main(String[] args){
        Login obj= new Login();
        System.out.println(obj);
    }


}





