
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Withdraw extends JFrame implements ActionListener{

    JTextField amount = new JTextField();
    JButton withdraw = new JButton("WITHDRAW");
    JButton back = new JButton("BACK");
    String pno;
    String cardno;
    
    Withdraw(String cardno, String pno){
        this.pno = pno;
        this.cardno = cardno;
        
        setTitle("Withdraw Window");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 800, 800);
        add(l1);
        
        JLabel text = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        text.setBounds(145, 260, 310, 40);
        text.setFont(new Font("System", Font.BOLD, 14));
        text.setForeground(Color.white);
        l1.add(text);
        
        
        amount.setBounds(160, 310, 280, 40);
        amount.setFont(new Font("System", Font.BOLD, 15));
        l1.add(amount);
        
        
        withdraw.setBounds(310, 430, 150, 27);
        withdraw.addActionListener(this);
//        deposit.setBackground(Color.white);
        l1.add(withdraw);
        
        
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
        if(ae.getSource()==withdraw){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "ENTER AN AMOUNT TO WITHDRAW");
            }
            else{
                try{
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+cardno+"', '"+pno+"', '"+date+"', '"+"Withdraw"+"', '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Withdrawn ₹"+number+" from your account");
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
        new Withdraw("", "");
        
    }
    
}
