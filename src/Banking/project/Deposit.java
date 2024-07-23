package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin ;
    JTextField text1;
    JButton jback,jnext;


    Deposit(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1550,1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1080);
        add(image);

        JLabel label1=new JLabel("Enter amount you want to Deposit");
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setBounds(400,350,400,25);
        label1.setForeground(new Color(88, 211, 45));
        image.add(label1);

        text1=new JTextField();
        text1.setFont(new Font("Raleway",Font.BOLD,18));
        text1.setBounds(450,380,250,30);
       image.add(text1);

       jnext=new JButton("NEXT");
       jnext.setFont(new Font("Raleway",Font.BOLD,20));
       jnext.setBounds(750,630,100,30);
       jnext.setForeground(new Color(88,211,45));
       jnext.addActionListener(this);
       image.add(jnext);

        jback=new JButton("BACK");
        jback.setFont(new Font("Raleway",Font.BOLD,20));
        jback.setBounds(750,680,100,30);
        jback.setForeground(new Color(88,211,45));
        jback.addActionListener(this);
        image.add(jback);



        setLayout(null);
        setLocation(200,0);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=text1.getText();
            Date date= new Date();
            if (e.getSource()==jnext){
                  if (text1.getText().equals("")){
                      JOptionPane.showMessageDialog(null,"Enter your deposit amount ");
                  }else {
                      Conn c1=new Conn();
                      c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                      JOptionPane.showMessageDialog(null,"Rs."+amount+"Transfer to your account");
                      setVisible(false);
                      new Main(pin);
                  }
            } else if (e.getSource()==jback) {
                setVisible(false);
                new Main(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");

    }
}
