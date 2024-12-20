/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingmanagementsystem2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
import com.toedter.calendar.JDateChooser;


public class SignUp extends JFrame implements ActionListener{

//    JFrame f1 = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JDateChooser t3 = new JDateChooser();
    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("Female");
    JTextField t4 = new JTextField();
    JRadioButton r3 = new JRadioButton("Married");
    JRadioButton r4 = new JRadioButton("Unmarried");
    JRadioButton r5 = new JRadioButton("Other");
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    JTextField t8 = new JTextField();
    JTextField t9 = new JTextField();
    Random ran = new Random();
    long formno1 = (Math.abs( ran.nextLong()%9000L) + 1000L);
    JButton submit = new JButton("Next");    
    
    SignUp(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel j1 = new JLabel(i3);
        j1.setBounds(50, 0, 100, 100);
        add(j1);
        
        
        
        
        JLabel heading = new JLabel("APPLICATION FORM NO. "+ formno1);
        heading.setBounds(150, 30, 550, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 35));
        add(heading);
        
        JLabel subheading = new JLabel("Page 1: Personal Details");
        subheading.setBounds(240, 80, 400, 40);
        subheading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(subheading);
        
        JLabel name = new JLabel("Name: ");
        name.setBounds(100, 150, 200, 40);
        name.setFont(new Font("Ralweay", Font.BOLD, 20));
        add(name);
        
        
        t1.setBounds(250, 155, 450, 40);
        t1.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t1);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setBounds(100, 200, 200, 40);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);
                
        t2.setBounds(250, 205, 450, 40);
        t2.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t2);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setBounds(100, 250, 200, 40);
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        add(dob);
                
        t3.setBounds(250, 255, 450, 40);
        t3.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t3);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(100, 300, 200, 40);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);
        
        r1.setBounds(250, 305, 100, 40);
        r1.setBackground(Color.white);
        r1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(r1);
                
        r2.setBounds(400, 305, 100, 40);
        r2.setBackground(Color.white);
        r2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(r2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        JLabel email = new JLabel("Email Address: ");
        email.setBounds(100, 350, 200, 40);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);
                
        t4.setBounds(250, 355, 450, 40);
        t4.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t4);
        
        JLabel mstatus = new JLabel("Marital Status: ");
        mstatus.setBounds(100, 400, 200, 40);
        mstatus.setFont(new Font("Raleway", Font.BOLD, 20));
        add(mstatus);
                
        r3.setBounds(250, 400, 100, 40);
        r3.setBackground(Color.white);
        r3.setFont(new Font("Raleway", Font.BOLD, 15));
        add(r3);
                
        r4.setBounds(370, 400, 120, 40);
        r4.setBackground(Color.white);
        r4.setFont(new Font("Raleway", Font.BOLD, 15));
        add(r4);
                
        r5.setBounds(510, 400, 100, 40);
        r5.setBackground(Color.white);
        r5.setFont(new Font("Raleway", Font.BOLD, 15));
        add(r5);
       
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);
        bg1.add(r5);
        
        JLabel address = new JLabel("Address: ");
        address.setBounds(100, 450, 200, 40);
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        add(address);
                
        t6.setBounds(250, 455, 450, 40);
        t6.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t6);
        
        JLabel city = new JLabel("City: ");
        city.setBounds(100, 500, 200, 40);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);
                
        t7.setBounds(250, 505, 450, 40);
        t7.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t7);
        
        JLabel pcode = new JLabel("Pin Code: ");
        pcode.setBounds(100, 550, 200, 40);
        pcode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pcode);
                
        t8.setBounds(250, 555, 450, 40);
        t8.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t8);
        
        JLabel state = new JLabel("State: ");
        state.setBounds(100, 600, 200, 40);
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        add(state);
                
        t9.setBounds(250, 605, 450, 40);
        t9.setFont(new Font("Ralweay", Font.BOLD, 15));
        add(t9);
                
        submit.setBounds(600, 680, 100, 40);
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setBounds(400, 20, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String formno = " " + formno1;
            String name = t1.getText();
            String fname = t2.getText();
    //        String dob = ( ( JTextField) t3.getDateEditor().getUiComponent().getText());
            String dob = "";
            if (t3.getDate() != null) { // Ensure a date is selected
                dob = new SimpleDateFormat("yyyy-MM-dd").format(t3.getDate());
            }
            String gender = "";
            if(r1.isSelected()){
                gender = "Male";
            }
            else if(r2.isSelected()){
                gender = "Female";
            }
            String email = t4.getText();
            String mstatus = "";
            if(r3.isSelected()){
                mstatus= "Married";
            }
            else if(r4.isSelected()){
                mstatus = "Unmarried";
            }
            else if(r5.isSelected()){
                mstatus = "Other";
            }
            String address = t6.getText();
            String city = t7.getText();
            String pcode = t8.getText();
            String state = t9.getText();       

            try{
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null, "Name is required");
                }
                else if(fname.equals("")){
                    JOptionPane.showMessageDialog(null, "Father's Name is required");
                }
                else if(dob.equals("")){
                    JOptionPane.showMessageDialog(null, "Date of Birth is required");
                }
                else if(gender.equals("")){
                    JOptionPane.showMessageDialog(null, "Gender is required");
                }
                else if(email.equals("")){
                    JOptionPane.showMessageDialog(null, "Email is required");
                }
                else if(mstatus.equals("")){
                    JOptionPane.showMessageDialog(null, "Marital Status is required");
                }
                else if(address.equals("")){
                    JOptionPane.showMessageDialog(null, "Address is required");
                }
                else if(city.equals("")){
                    JOptionPane.showMessageDialog(null, "City is required");
                }
                else if(pcode.equals("")){
                    JOptionPane.showMessageDialog(null, "Pin Code is required");
                }
                else if(state.equals("")){
                    JOptionPane.showMessageDialog(null, "State is required");
                }
                else{
                    Conn c = new Conn();
                    String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+mstatus+"','"+address+"','"+city+"','"+pcode+"','"+state+"')";
                    c.s.executeUpdate(query);

                    setVisible(false);
//                    dispose();
                    new SignUp2(formno).setVisible(true);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }            
        }    
        
        
    }
    
    public static void main(String[] args) {
        new SignUp();
    }
    
}
