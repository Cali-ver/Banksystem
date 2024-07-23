package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Main(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1550,1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1080);
        add(image);

         JLabel label=new JLabel("Please select your Transaction");
         label.setBounds(400,380,600,35);
         label.setForeground(Color.white);
         label.setFont(new Font("System",Font.BOLD,28));
         image.add(label);

         b1= new JButton("DEPOSIT");
         b1.setFont(new Font("Raleway",Font.BOLD,20));
         b1.setBackground(Color.BLACK);
         b1.setForeground(new Color(88,211,45));
         b1.setBounds(280,550,180,30);
         b1.addActionListener(this);
         image.add(b1);

        b2= new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(new Color(88,211,45));
        b2.setBounds(660,550,220,30);
        b2.addActionListener(this);
        image.add(b2);

        b3= new JButton("FAST CASH");
        b3.setFont(new Font("Raleway",Font.BOLD,20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(new Color(88,211,45));
        b3.setBounds(280,600,180,30);
        b3.addActionListener(this);
        image.add(b3);

        b4= new JButton("MINI STATEMENT");
        b4.setFont(new Font("Raleway",Font.BOLD,20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(new Color(88,211,45));
        b4.setBounds(280,650,220,30);
        b4.addActionListener(this);
        image.add(b4);

        b5= new JButton("PIN CHANGE");
        b5.setFont(new Font("Raleway",Font.BOLD,20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(new Color(88,211,45));
        b5.setBounds(280,700,180,30);
        b5.addActionListener(this);
        image.add(b5);

        b6= new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("Raleway",Font.BOLD,20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(new Color(88,211,45));
        b6.setBounds(660,600,220,30);
        b6.addActionListener(this);
        image.add(b6);

        b7= new JButton("EXIT");
        b7.setFont(new Font("Raleway",Font.BOLD,20));
        b7.setBackground(Color.BLACK);
        b7.setForeground(new Color(88,211,45));
        b7.setBounds(660,650,154,30);
        b7.addActionListener(this);
        image.add(b7);







       setLayout(null);
       setSize(1550,1080);
       setLocation(200,0);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           try{
               if (e.getSource()==b1){
                new Deposit(pin);
                setVisible(false);
               } else if (e.getSource()==b2) {
                       new Cash_withdraw(pin);
                       setVisible(false);
               } else if (e.getSource()==b6) {
                   new BalanceEnquriy(pin);
                   setVisible(false);
               }else if (e.getSource()==b3){
                   new Fast_cash(pin);
                   setVisible(false);
               } else if (e.getSource()==b5) {
                   new Pin_change(pin);
                   setVisible(false);
               } else if (e.getSource()==b4) {
                   new Mini_Statement(pin);
                   setVisible(false);
               } else if (e.getSource()==b7) {
                   new Login(pin);
                   setVisible(false);
               }

           }catch (Exception E){
               E.printStackTrace();
           }
    }

    public static void main(String[] args) {
        new Main("");
    }
}
