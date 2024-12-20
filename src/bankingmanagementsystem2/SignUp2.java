/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingmanagementsystem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener{

//    JFrame f1 = new JFrame();
    String[] o1 = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
    JComboBox cb1 = new JComboBox(o1);
    String[] o2 = {"General", "OBC", "SC", "ST", "Other"};
    JComboBox cb2 = new JComboBox(o2);
    String[] o3 = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto !0,00,000", "Above 10,00,000"};
    JComboBox cb3 = new JComboBox(o3);
    String[] o4 = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
    JComboBox cb4 = new JComboBox(o4);
    String[] o5 = {"Salaried", "Self-Employeed", "Buisness", "Student", "Retired", "Others"};
    JComboBox cb5 = new JComboBox(o5);
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JRadioButton r1 = new JRadioButton("Yes");
    JRadioButton r2 = new JRadioButton("No");
    JRadioButton r3 = new JRadioButton("Yes");
    JRadioButton r4 = new JRadioButton("No");
    JButton submit = new JButton("Next");
//    SignUp s1 = new SignUp();
//    JLabel formno2 = new JLabel("Form no: "+s1.formno1);
    String formno;
    SignUp2(String formno){
        
        this.formno = formno;
        
        setTitle("New Account Application Form - Page 2");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel j1 = new JLabel(i3);
        j1.setBounds(150, 20, 100, 100);
        add(j1);
        
        JLabel heading = new JLabel("Page 2: Additional Details");
        heading.setBounds(270, 50, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);
        
        
        
//        formno2.setFont(new Font("Raleway", Font.BOLD, 15));
//        formno2.setBounds(610, 25, 150, 40);
//        f1.add(formno2);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(80, 130, 100, 40);
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        add(religion);
                
        cb1.setBounds(350, 130, 350, 40);
        cb1.setFont(new Font("Raleway", Font.BOLD, 15));
        cb1.setBackground(Color.white);
        add(cb1);
        
        JLabel category = new JLabel("Category: ");
        category.setBounds(80, 185, 100, 40);
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        add(category);
                
        cb2.setBounds(350, 185, 350, 40);
        cb2.setFont(new Font("Raleway", Font.BOLD, 15));
        cb2.setBackground(Color.white);
        add(cb2);
                
        JLabel income = new JLabel("Income: ");
        income.setBounds(80, 240, 100, 40);
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        add(income);
                
        cb3.setBounds(350, 240, 350, 40);
        cb3.setFont(new Font("Raleway", Font.BOLD, 15));
        cb3.setBackground(Color.white);
        add(cb3);
        
        JLabel edq = new JLabel("Education Qualification: ");
        edq.setBounds(80, 295, 250, 40);
        edq.setFont(new Font("Raleway", Font.BOLD, 20));
        add(edq);
               
        cb4.setBounds(350, 295, 350, 40);
        cb4.setFont(new Font("Raleway", Font.BOLD, 15));
        cb4.setBackground(Color.white);
        add(cb4);
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setBounds(80, 350, 250, 40);
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        add(occupation);
        
        
        cb5.setBounds(350, 350, 350, 40);
        cb5.setFont(new Font("Raleway", Font.BOLD, 15));
        cb5.setBackground(Color.white);
        add(cb5);
        
        JLabel pno = new JLabel("Pan Number: ");
        pno.setBounds(80, 405, 250, 40);
        pno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pno);
        
        
        t1.setBounds(350, 405, 350, 40);
        t1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(t1);
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setBounds(80, 460, 250, 40);
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        add(aadhar);
        
        
        t2.setBounds(350, 460, 350, 40);
        t2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(t2);
        
        JLabel scitizen = new JLabel("Senior Citizen: ");
        scitizen.setBounds(80, 515, 250, 40);
        scitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        add(scitizen);
        
        
        r1.setBounds(350, 515, 100, 40);
        r1.setFont(new Font("Raleway", Font.BOLD, 15));
        r1.setBackground(Color.white);
        add(r1);
        
        
        r2.setBounds(470, 515, 100, 40);
        r2.setFont(new Font("Raleway", Font.BOLD, 15));
        r2.setBackground(Color.white);
        add(r2);
        
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
//        f1.add(bg1);
        
        JLabel exacc = new JLabel("Existing Account: ");
        exacc.setBounds(80, 570, 250, 40);
        exacc.setFont(new Font("Raleway", Font.BOLD, 20));
        add(exacc);
                
        r3.setBounds(350, 570, 100, 40);
        r3.setFont(new Font("Raleway", Font.BOLD, 15));
        r3.setBackground(Color.white);
        add(r3);
                
        r4.setBounds(470, 570, 100, 40);
        r4.setFont(new Font("Raleway", Font.BOLD, 15));
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);        
        
        submit.setBounds(600, 630, 100, 40);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.white);
        setBounds(400, 20, 800, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
//            String formno1 = "" + formno2;
            String religion = cb1.getSelectedItem().toString();
            String category = cb2.getSelectedItem().toString();
            String income = cb3.getSelectedItem().toString();
            String edq = cb4.getSelectedItem().toString();
            String occupation = cb5.getSelectedItem().toString();
            String pno = t1.getText();
            String aadhar = t2.getText();
            String scitizen = "";
            if(r1.isSelected()){
                scitizen = "Yes";
            }
            else if(r2.isSelected()){
                scitizen = "No";
            }
            String exacc = "";
            if(r3.isSelected()){
                exacc = "Yes";
            }
            else if(r4.isSelected()){
                exacc = "No";
            }

            try{      

                if(religion.equals("")){
                    JOptionPane.showMessageDialog(null, "Name is required");
                }
                else if(category.equals("")){
                    JOptionPane.showMessageDialog(null, "Father's Name is required");
                }
                else if(income.equals("")){
                    JOptionPane.showMessageDialog(null, "Date of Birth is required");
                }
                else if(edq.equals("")){
                    JOptionPane.showMessageDialog(null, "Gender is required");
                }
                else if(occupation.equals("")){
                    JOptionPane.showMessageDialog(null, "Email is required");
                }
                else if(pno.equals("")){
                    JOptionPane.showMessageDialog(null, "Marital Status is required");
                }
                else if(aadhar.equals("")){
                    JOptionPane.showMessageDialog(null, "Address is required");
                }
                else if(scitizen.equals("")){
                    JOptionPane.showMessageDialog(null, "City is required");
                }
                else if(exacc.equals("")){
                    JOptionPane.showMessageDialog(null, "Pin Code is required");
                }
                else{
                    Conn c = new Conn();
                    String query = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+edq+"','"+occupation+"','"+pno+"','"+aadhar+"','"+scitizen+"','"+exacc+"')";     
                    c.s.executeUpdate(query);       

                    setVisible(false);
//                    dispose();
                    new SignUp3(formno).setVisible(true);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        new SignUp2("");        
    }
    
}
