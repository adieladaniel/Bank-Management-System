/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
//    JButton b1, b2, b3;
    
//    JFrame f1 = new JFrame();
    JTextField tf1 = new JTextField();
    JPasswordField tf2 = new JPasswordField();
    JButton b1 = new JButton("SIGN IN");
    JButton b2 = new JButton("CLEAR");
    JButton b3 = new JButton("SIGN UP");
    
    Login(){
        
        setTitle("Automated Teller Machine");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3); 
        l1.setBounds(80, 50, 100, 100);
        add(l1);
        
        JLabel heading = new JLabel("WELCOME TO ATM");
        heading.setBounds(220, 82, 350, 40);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 35));
        add(heading);
        
        JLabel text1 = new JLabel("Card No:");
        text1.setBounds(118, 190, 300, 40);
        text1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(text1);
        
        
        tf1.setBounds(250, 192, 300, 40);
        tf1.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf1);
        
        JLabel text2 = new JLabel("PIN:");
        text2.setBounds(120, 270, 300, 40);
        text2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(text2);
        
        
        tf2.setBounds(250, 272, 300, 40);
        tf2.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf2);
        
        
        b1.setBounds(190, 350, 130, 40);
        b1.setBackground(Color.black);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        
        b2.setBounds(340, 350, 130, 40);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);
        
        
        b3.setBounds(190, 420, 280, 40);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b3.addActionListener(this);
        add(b3);
        
        getContentPane().setBackground(Color.white);
        setBounds(400, 100, 700, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            tf1.setText("");
            tf2.setText("");
        }
        else if(ae.getSource()==b1){
            Conn conn = new Conn();
            String cardno = tf1.getText();
            String pno = tf2.getText();
            String query = "select * from login where cardno = '"+cardno+"' and pno = '"+pno+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(cardno, pno).setVisible(true); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }
            catch(Exception e){
               System.out.println(e);
            }
        }   
        else if(ae.getSource()==b3){
            setVisible(false);
            new SignUp().setVisible(true);
        }
        
    }
    
    public static void main(String args[]){
        new Login();
    }
}
