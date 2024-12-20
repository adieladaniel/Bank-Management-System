package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
//    JFrame f1 = new JFrame();
    JButton deposit = new JButton("DEPOSIT");
    JButton cashwith  = new JButton("CASH WITHDRAWAL");
    JButton fastcash = new JButton("FAST CASH");
    JButton minist  = new JButton("MINI STATEMENT");
    JButton pinchange = new JButton("PIN CHANGE");
    JButton balance  = new JButton("BALANCE ENQUIRY");
    JButton exit  = new JButton("EXIT");
    String pno;
    String cardno;
    
    Transactions(String cardno, String pno){
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
        
        JLabel text = new JLabel("PLEASE SELECT YOUR TRANSACTIONS");
        text.setBounds(150, 260, 310, 40);
        text.setFont(new Font("System", Font.BOLD, 15));
        text.setForeground(Color.white);
        l1.add(text);
        
        
        deposit.setBounds(145, 370, 150, 27);
        deposit.addActionListener(this);
//        deposit.setFont(new Font("System", Font.BOLD, 12));
        l1.add(deposit);
        
        cashwith.setBounds(305, 370, 150, 27);
        cashwith.addActionListener(this);
        l1.add(cashwith);
        
        fastcash.setBounds(145, 400, 150, 27);
        fastcash.addActionListener(this);
        l1.add(fastcash);
        
        minist.setBounds(305, 400, 150, 27);
        minist.addActionListener(this);
        l1.add(minist);
        
        pinchange.setBounds(145, 430, 150, 27);
        pinchange.addActionListener(this);
        l1.add(pinchange);
        
        balance.setBounds(305, 430, 150, 27);
        balance.addActionListener(this);
        l1.add(balance);
        
        exit.setBounds(305, 460, 150, 27);
        exit.addActionListener(this);
        l1.add(exit);
        
        
        setBounds(400, 20, 800, 800);
        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }   
    
    @Override 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(cardno, pno).setVisible(true);
        }
        else if(ae.getSource()==cashwith){
            setVisible(false);
            new Withdraw(cardno, pno).setVisible(true);
        }
        else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(cardno, pno).setVisible(true);
        }
        else if(ae.getSource()==minist){
            setVisible(false);
            new MiniStatement(cardno,pno).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(cardno, pno).setVisible(true);
        }
        else if(ae.getSource()==balance){
            setVisible(false);
            new Balance(cardno, pno).setVisible(true);
        }
        else if(ae.getSource()==exit){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Transactions("", "");
    }
    
}
