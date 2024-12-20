package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
//    JFrame f1 = new JFrame();
    JButton hundred = new JButton("Rs 100");
    JButton fivehundred  = new JButton("Rs 500");
    JButton thousand = new JButton("Rs 1000");
    JButton twothousand  = new JButton("Rs 2000");
    JButton fivethousand = new JButton("Rs 5000");
    JButton tenthousand  = new JButton("Rs 10000");
    JButton back  = new JButton("BACK");
    String pno;
    String cardno;
    
    FastCash(String cardno, String pno){
        this.pno = pno;
        this.cardno = cardno;
        
        setTitle("Main Transactions");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 800, 800);
        add(l1);
        
        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(185, 260, 250, 40);
        text.setFont(new Font("System", Font.BOLD, 15));
        text.setForeground(Color.white);
        l1.add(text);
        
        
        hundred.setBounds(145, 370, 150, 27);
        hundred.addActionListener(this);
//        deposit.setFont(new Font("System", Font.BOLD, 12));
        l1.add(hundred);
        
        fivehundred.setBounds(305, 370, 150, 27);
        fivehundred.addActionListener(this);
        l1.add(fivehundred);
        
        thousand.setBounds(145, 400, 150, 27);
        thousand.addActionListener(this);
        l1.add(thousand);
        
        twothousand.setBounds(305, 400, 150, 27);
        twothousand.addActionListener(this);
        l1.add(twothousand);
        
        fivethousand.setBounds(145, 430, 150, 27);
        fivethousand.addActionListener(this);
        l1.add(fivethousand);
        
        tenthousand.setBounds(305, 430, 150, 27);
        tenthousand.addActionListener(this);
        l1.add(tenthousand);
        
        back.setBounds(305, 460, 150, 27);
        back.addActionListener(this);
        l1.add(back);
        
        setBounds(400, 20, 800, 800);
        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(cardno, pno).setVisible(true);
        } else {
            String amount = ((JButton) ae.getSource()).getText().split(" ")[1];  // Extract amount
            try {
                Conn conn = new Conn();
                ResultSet rs = conn.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pno + "'");

                int balance = 0;
 
                while (rs.next()) {
                    String type = rs.getString("type");
                    String amt = rs.getString("amount");
                    System.out.println("Transaction Type: " + type + ", Amount: " + amt);

                    if (type.equals("Deposit")) {
                        balance += Integer.parseInt(amt);
                    } else if (type.equals("Withdraw")) {
                        balance -= Integer.parseInt(amt);
                    }
                    System.out.println("Updated Balance: " + balance);
                }

                System.out.println("Final Balance: " + balance);
                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance in Account");
                } else {
                    Date date = new Date();
                    String query = "INSERT INTO bank VALUES('"+cardno+"', '" + pno + "', '" + date + "', 'Withdraw', '" + amount + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " withdrawn successfully");
                    setVisible(false);
                    new Transactions(cardno, pno).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
                e.printStackTrace();
            }
        }
    }


    
    public static void main(String[] args) {
        new FastCash("", "");
    }
    
}
