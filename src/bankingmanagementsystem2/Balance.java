
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Balance extends JFrame implements ActionListener{
    
    JButton back = new JButton("BACK");
    
    String cardno;
    String pno;
    Balance(String cardno,String pno){
        this.cardno = cardno;
        this.pno = pno;
        
        setTitle("Balance");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,800,800);
        add(l1);
        
        int balance=0;
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pno+"'");
            
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        JLabel text = new JLabel("Your Current Account Balance is Rs "+balance);
        text.setBounds(150, 260, 300, 40);
        text.setFont(new Font("System", Font.BOLD, 14));
        text.setForeground(Color.white);
        l1.add(text);
        
        
        back.setBounds(305, 460, 150, 27);
        back.addActionListener(this);
        l1.add(back);
        
        setBounds(400, 20, 800, 800);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        
        
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(cardno, pno).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Balance("", "");
    }
    
}
