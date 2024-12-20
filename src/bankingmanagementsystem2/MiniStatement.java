
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class MiniStatement extends JFrame implements ActionListener{

    JButton back = new JButton("Back");
    JButton print = new JButton("Print");
    
    String cardno;
    String pno;
    MiniStatement(String cardno, String pno){
        
        this.cardno = cardno;
        this.pno = pno;
        
        setTitle("Mini Statement");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(130,50,50,50);
        add(l1);
        
        JLabel heading = new JLabel("ADIEL JAVA BANK");
        heading.setBounds(200, 50, 200, 50);
        heading.setFont(new Font("System", Font.BOLD, 20));
        add(heading);
        
        JLabel card = new JLabel();
        card.setBounds(30, 120, 300, 40);
        card.setFont(new Font("System", Font.BOLD, 15));
        add(card);
        
        JLabel col1 = new JLabel("DATE");
        col1.setBounds(30, 180, 200, 40);
        col1.setFont(new Font("System", Font.BOLD, 15));
        add(col1);
        
        JLabel col2 = new JLabel("TYPE");
        col2.setBounds(260, 180, 100, 40);
        col2.setFont(new Font("System", Font.BOLD, 15));
        add(col2);
        
        JLabel col3 = new JLabel("AMOUNT");
        col3.setBounds(360, 180, 200, 40);
        col3.setFont(new Font("System", Font.BOLD, 15));
        add(col3);
        
        JLabel main = new JLabel();
        main.setBounds(30, 50, 400, 400);
        main.setFont(new Font("System", Font.BOLD, 15));
        add(main);
        int balance=0;
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pno+"'"); 
            while(rs.next()){
                card.setText("CARD NUMBER: "+rs.getString("cardno").substring(0,4)+"XXXXXXXX"+ rs.getString("cardno").substring(12,16));
                if(rs.getString("type").equals("Deposit")){
                    main.setText("<html>"+main.getText() +"<br>"+ rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<span style = 'color:green;'> +"+rs.getString("amount")+"</span>");                   
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    main.setText("<html>"+main.getText() +"<br>"+ rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<span style = 'color:red;'> -"+rs.getString("amount")+"</span>");  
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        JLabel showbalance = new JLabel("Your total balance is Rs: "+balance);
        showbalance.setBounds(30, 400, 300, 40);
        showbalance.setFont(new Font("System", Font.BOLD, 15));
        add(showbalance);
        
        
        print.setBounds(120, 460, 100, 30);
        add(print);
        
        
        back.setBounds(270, 460, 100, 30);
        back.addActionListener(this);
        add(back);
        
        setBounds(500,70,500,600);
        getContentPane().setBackground(Color.white);
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
        new MiniStatement("", "");
    }
    
}
