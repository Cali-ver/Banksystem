package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fast_cash extends JFrame implements ActionListener {
    JButton j1,j2,j3,j4,j5,j6,jback;
    String pin;
    Fast_cash(String pin){
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

        j1=new JButton("500");
        j1.setFont(new Font("Raleway",Font.BOLD,20));
        j1.setBounds(280,550,100,30);
        j1.setForeground(Color.black);
        j1.addActionListener(this);
        image.add(j1);

        j2=new JButton("1000");
        j2.setFont(new Font("Raleway",Font.BOLD,20));
        j2.setBounds(280,600,100,30);
        j2.setForeground(Color.black);
        j2.addActionListener(this);
        image.add(j2);

        j3=new JButton("1500");
        j3.setFont(new Font("Raleway",Font.BOLD,20));
        j3.setBounds(280,650,100,30);
        j3.setForeground(Color.black);
        j3.addActionListener(this);
        image.add(j3);

        j4=new JButton("2000");
        j4.setFont(new Font("Raleway",Font.BOLD,20));
        j4.setBounds(780,550,100,30);
        j4.setForeground(Color.black);
        j4.addActionListener(this);
        image.add(j4);

        j5=new JButton("2500");
        j5.setFont(new Font("Raleway",Font.BOLD,20));
        j5.setBounds(780,600,100,30);
        j5.setForeground(Color.black);
        j5.addActionListener(this);
        image.add(j5);

        j6=new JButton("3000");
        j6.setFont(new Font("Raleway",Font.BOLD,20));
        j6.setBounds(780,650,100,30);
        j6.setForeground(Color.black);
        j6.addActionListener(this);
        image.add(j6);

        jback=new JButton("BACK");
        jback.setFont(new Font("Raleway",Font.BOLD,20));
        jback.setBounds(780,700,100,30);
        jback.setForeground(new Color(88,211,45));
        jback.addActionListener(this);
        image.add(jback);

       // int balance=0;
       // Conn c1=new Conn();
       // ResultSet resultSet= c1.statement.executeQuery("select * form bank where pin ='"+pin+"'");
        setLayout(null);
        setLocation(200,0);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource()==jback){
                 setVisible(false);
                 new Main(pin);
           }else {
               String amount = ((JButton) e.getSource()).getText();
               Conn c1 = new Conn();
               Date date = new Date();
               try{
                   ResultSet resultSet=c1.statement.executeQuery("select * from bank where pin ='"+pin+"'");
                   int balance=0;
                   while(resultSet.next()){
                       if(resultSet.getString("type").equals("Deposit")){
                           balance+=Integer.parseInt(resultSet.getString("amount"));
                       }
                       else {
                           balance-=Integer.parseInt(resultSet.getString("amount"));
                       }
                   }
                   if (e.getSource()==jback&& balance<Integer.parseInt(amount)){
                       JOptionPane.showMessageDialog(null, "Insuffient Balance");
                       return;
                   }
                   c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs."+amount+"Debited Successfully");


               }catch (Exception E){
                   E.printStackTrace();
               }


           }

      
    }

    public static void main(String[] args) {
       new Fast_cash("");
    }
}
