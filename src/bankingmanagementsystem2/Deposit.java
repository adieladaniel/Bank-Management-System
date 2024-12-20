
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener{

    JTextField amount = new JTextField();
    JButton deposit = new JButton("DEPOSIT");
    JButton back = new JButton("BACK");
    String pno;
    String cardno;
    
    Deposit(String cardno, String pno){
        this.pno = pno;
        this.cardno = cardno;
        
        setTitle("Deposit Window");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 800, 800);
        add(l1);
        
        JLabel text = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        text.setBounds(155, 260, 290, 40);
        text.setFont(new Font("System", Font.BOLD, 14));
        text.setForeground(Color.white);
        l1.add(text);
        
        
        amount.setBounds(160, 310, 280, 40);
        amount.setFont(new Font("System", Font.BOLD, 15));
        l1.add(amount);
        
        
        deposit.setBounds(310, 430, 150, 27);
        deposit.addActionListener(this);
//        deposit.setBackground(Color.white);
        l1.add(deposit);
        
        
        back.addActionListener(this);
        back.setBounds(310, 460, 150, 27);
//        back.setBackground(Color.white);
        l1.add(back);
        
        
        
        setBounds(400, 20, 800, 800);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "ENTER AN AMOUNT TO DEPOSIT");
            }
            else{
                try{
                    
                    
                    
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+cardno+"', '"+pno+"', '"+date+"', '"+"Deposit"+"', '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Deposited ₹"+number+" into your account");
                    setVisible(false);
                    new Transactions(cardno, pno).setVisible(true);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(cardno, pno).setVisible(true);
        }
    }
    
    
    public static void main(String[] args) {
        new Deposit("", "");
        
    }
    
}
