
package bankingmanagementsystem2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{

    JPasswordField newpin = new JPasswordField();
    JPasswordField renewpin = new JPasswordField();
    JButton change  = new JButton("CHANGE");
    JButton back  = new JButton("BACK");
    
    String pno;
    String cardno;
    
    PinChange(String cardno, String pno){
        this.pno = pno;
        this.cardno = cardno;
        
        setTitle("Change PIN");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,800,800);
        add(l1);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(225, 260, 250, 40);
        text.setFont(new Font("System", Font.BOLD, 15));
        text.setForeground(Color.white);
        l1.add(text);
        
        JLabel text2 = new JLabel("New PIN:");
        text2.setBounds(150, 300, 100, 40);
        text2.setFont(new Font("System", Font.BOLD, 14));
        text2.setForeground(Color.white);
        l1.add(text2);
        
        
        newpin.setBounds(295, 310, 150, 30);
        newpin.setFont(new Font("System", Font.BOLD, 15));
        l1.add(newpin);
        
        JLabel text3 = new JLabel("Re-Enter New PIN:");
        text3.setBounds(150, 350, 150, 40);
        text3.setFont(new Font("System", Font.BOLD, 14));
        text3.setForeground(Color.white);
        l1.add(text3);
        
        
        renewpin.setBounds(295, 355, 150, 30);
        renewpin.setFont(new Font("System", Font.BOLD, 15));
        l1.add(renewpin);
        
        
        change.setBounds(305, 430, 150, 27);
        change.addActionListener(this);
        l1.add(change);
        
        
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
        if(ae.getSource()==change){
            try{
                String newpno = newpin.getText();
                String repno = renewpin.getText();
                if(!newpno.equals(repno)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                }
                else if(newpno.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a new PIN");
                }
                else if(repno.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter the PIN");
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "update bank set pin = '"+newpno+"' where pin = '"+pno+"'";
                    String query2 = "update login set pno = '"+newpno+"' where pno = '"+pno+"'";
                    String query3 = "update signup3 set pno = '"+newpno+"' where pno = '"+pno+"'";
                    
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    conn.s.executeUpdate(query3);
                    
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    setVisible(false);
                    new Transactions(cardno, newpno).setVisible(true);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(cardno, pno).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new PinChange("", "");
    }
    
}
