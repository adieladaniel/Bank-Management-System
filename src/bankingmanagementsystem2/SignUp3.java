/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingmanagementsystem2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignUp3 extends JFrame implements ActionListener{

//    JFrame f1 = new JFrame();
//    SignUp s1 = new SignUp();
//    JLabel formno = new JLabel("Form no: "+s1.formno1);
    JRadioButton r1 = new JRadioButton("Saving Account");
    JRadioButton r2 = new JRadioButton("Fixed Deposit Account");
    JRadioButton r3 = new JRadioButton("Current Account");
    JRadioButton r4 = new JRadioButton("Recurring Deposit Account");
    JCheckBox c1 = new JCheckBox("ATM Card");
    JCheckBox c2 = new JCheckBox("Internet Banking");
    JCheckBox c3 = new JCheckBox("Mobile Banking");
    JCheckBox c4 = new JCheckBox("Email Alerts");
    JCheckBox c5 = new JCheckBox("Cheque Book");
    JCheckBox c6 = new JCheckBox("E-Statement");
    JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
    JButton submit = new JButton("Submit");
    JButton cancel = new JButton("Cancel");
    String formnumber;
    
    SignUp3(String formnumber){
        
        this.formnumber = formnumber; 
        
        setLayout(null);
        setTitle("New Application Form - Page 3");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel j1 = new JLabel(i3);
        j1.setBounds(150, 20, 100, 100);
        add(j1);
        
        JLabel heading = new JLabel("Page 3: Account Details");
        heading.setBounds(270, 50, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);
        
        
//        formno.setFont(new Font("Raleway", Font.BOLD, 15));
//        formno.setBounds(610, 25, 150, 40);
//        f1.add(formno);
        
        JLabel acctype = new JLabel("Account Type:");
        acctype.setBounds(100, 150, 200, 40);
        acctype.setFont(new Font("Raleway", Font.BOLD, 20));
        add(acctype);
        
        
        r1.setBounds(100, 200, 150, 40);
        r1.setFont(new Font("Raleway", Font.BOLD, 15));
        r1.setBackground(Color.white);
        add(r1);
        
        
        r2.setBounds(350, 200, 250, 40);
        r2.setFont(new Font("Raleway", Font.BOLD, 15));
        r2.setBackground(Color.white);
        add(r2);
        
        
        r3.setBounds(100, 250, 150, 40);
        r3.setFont(new Font("Raleway", Font.BOLD, 15));
        r3.setBackground(Color.white);
        add(r3);
        
        
        r4.setBounds(350, 250, 250, 40);
        r4.setFont(new Font("Raleway", Font.BOLD, 15));
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);
        
        JLabel cardno = new JLabel("Card Number:");
        cardno.setBounds(100, 320, 200, 40);
        cardno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(cardno);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setBounds(350, 320, 300, 40);
        number.setFont(new Font("Raleway", Font.BOLD, 20));
        add(number);
        
        JLabel desc = new JLabel("(Your 16-digit Card Number)");
        desc.setFont(new Font("Raleway", Font.BOLD, 12));
        desc.setBounds(100, 350, 300, 40);
        add(desc);
        
        JLabel digit = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        digit.setFont(new Font("Raleway", Font.BOLD, 12));
        digit.setBounds(350, 350, 300, 40);
        add(digit);
        
        JLabel pin = new JLabel("PIN:");
        pin.setBounds(100, 400, 200, 40);
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pin);
        
        JLabel pno = new JLabel("XXXX");
        pno.setBounds(350, 400, 200, 40);
        pno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pno);
        
        JLabel pdesc = new JLabel("(Your 16-digit Card Number)");
        pdesc.setFont(new Font("Raleway", Font.BOLD, 12));
        pdesc.setBounds(100, 430, 300, 40);
        add(pdesc);
        
        JLabel services = new JLabel("Services Required:");
        services.setBounds(100, 470, 200, 40);
        services.setFont(new Font("Raleway", Font.BOLD, 20));
        add(services);
        
        
        c1.setBounds(100, 510, 100,40);
        c1.setFont(new Font("Raleway", Font.BOLD, 15));
        c1.setBackground(Color.white);
        add(c1);
        
        
        c2.setBounds(300, 510, 200,40);
        c2.setFont(new Font("Raleway", Font.BOLD, 15));
        c2.setBackground(Color.white);
        add(c2);
        
        
        c3.setBounds(100, 550, 150,40);
        c3.setFont(new Font("Raleway", Font.BOLD, 15));
        c3.setBackground(Color.white);
        add(c3);
        
        
        c4.setBounds(300, 550, 200,40);
        c4.setFont(new Font("Raleway", Font.BOLD, 15));
        c4.setBackground(Color.white);
        add(c4);
                
        c5.setBounds(100, 590, 150,40);
        c5.setFont(new Font("Raleway", Font.BOLD, 15));
        c5.setBackground(Color.white);
        add(c5);
                
        c6.setBounds(300, 590, 200,40);
        c6.setFont(new Font("Raleway", Font.BOLD, 15));
        c6.setBackground(Color.white);
        add(c6);
                
        c7.setBounds(100, 650, 520,40);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(Color.white);
        add(c7);
                
        submit.setBounds(250, 690, 100, 40);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.addActionListener(this);
        add(submit);
                
        cancel.setBounds(390, 690, 100, 40);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 15));
        cancel.addActionListener(this);
        add(cancel);
        
        setBounds(400, 20, 800, 800);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
//            String formno2 = "" + s1.formno1;
            String acctype = "";
            if(r1.isSelected()){
                acctype = "Savings Account";
            }
            else if(r2.isSelected()){
                acctype = "Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                acctype = "Current Account";
            }
            else if(r4.isSelected()){
                acctype = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardno = "" + Math.abs((random.nextLong()%90000000L))+ 50409370L;
            
            String pno = "" + (Math.abs((random.nextLong()%9000L))+1000L) ;
            
            String facilities = "";
            if(c1.isSelected()){
                facilities = facilities + "ATM Card ";
            }
            if(c2.isSelected()){
                facilities = facilities + "Internet Banking ";
            }
            if(c3.isSelected()){
                facilities = facilities + "Mobile Banking ";
            }
            if(c4.isSelected()){
                facilities = facilities + "Email Alerts ";
            }
            if(c5.isSelected()){
                facilities = facilities + "Cheque Book ";
            }
            if(c6.isSelected()){
                facilities = facilities + "E-Statement ";
            }     
            
            try{
                if(acctype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }
                else if(facilities.equals("")){
                    JOptionPane.showMessageDialog(null, "Choose One Service atleast");
                }else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Declaration is required");
                }
                else{
                    Conn c = new Conn();
                    String query = "insert into signup3 values('"+formnumber+"', '"+acctype+"', '"+cardno+"', '"+pno+"', '"+facilities+"')";
                    c.s.executeUpdate(query);
                    String query2 = "insert into login values('"+formnumber+"', '"+cardno+"', '"+pno+"')";
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardno+ "\nPin: "+pno);
//                    JOptionPane.showMessageDialog(null, "Pin: "+pno);
                    
                    setVisible(false);
                    new Deposit(cardno, pno).setVisible(true);
//                    f1.dispose();
                }
            
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    public static void main(String[] args) {
        new SignUp3("");
    }
    
}
