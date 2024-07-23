package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import java.util.Date;


public class Cash_withdraw extends JFrame implements ActionListener {
    String pin ;
    JTextField text1;
    JButton jback,jnext;
    Cash_withdraw(String pin){
              this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1550,1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1080);
        add(image);

        JLabel label1=new JLabel("MAXIMUM WITHDRAW IS 10,000:/");
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setBounds(400,350,400,25);
        label1.setForeground(new Color(88, 211, 45));
        image.add(label1);

        text1=new JTextField();
        text1.setFont(new Font("Raleway",Font.BOLD,22));
        text1.setBounds(530,380,100,30);
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
             String amo=text1.getText();
            Date date=new Date();
            if (e.getSource()==jnext){
                if (text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"please enter your withdraw amount");
                }else {
                    Conn c1=new Conn();
                    ResultSet resultSet=c1.statement.executeQuery("select * from bank where pin ='"+this.pin+"'");
                    int balance=0;
                    while(resultSet.next()){
                        if (resultSet.getString("type").equals("Deposit")){
                            balance+=Integer.parseInt(resultSet.getString("amount"));
                        }else {
                            balance-=Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if(balance<Integer.parseInt(amo)){
                        JOptionPane.showMessageDialog(null,"Insuffient Balance");
                        return;

                    }

                    c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdraw','"+amo+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amo+"Debited Successfully");
                    setVisible(false);
                    new Main(pin);
                }

            } else if (e.getSource()==jback) {
                new Main(pin);
                setVisible(false);
            }
            {

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Cash_withdraw("");
    }
}
