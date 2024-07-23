package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton jback;
    BalanceEnquriy(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1550,1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1080);
        add(image);

        JLabel label1=new JLabel("Your current Balance is");
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setBounds(350,350,700,25);
        label1.setForeground(Color.white);
        image.add(label1);

        label2=new JLabel();
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(350,400,100,35);
        image.add(label2);


        jback=new JButton("BACK");
        jback.setFont(new Font("Raleway",Font.BOLD,20));
        jback.setBounds(750,680,100,30);
        jback.setForeground(new Color(88,211,45));
        jback.addActionListener(this);
        image.add(jback);

        int balance =0;
          try{
              Conn c1=new Conn();
              ResultSet resultSet= c1.statement.executeQuery("select * from bank where pin = '"+pin+"'");
              while (resultSet.next()){
                  if (resultSet.getString("type").equals("Deposit")){
                      balance += Integer.parseInt(resultSet.getString("amount"));
                  }else {
                      balance -= Integer.parseInt(resultSet.getString("amount"));
                  }
              }
          }catch (Exception E){
              E.printStackTrace();
          }
          label2.setText(""+balance);
        setLayout(null);
        setLocation(200,0);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           setVisible(false);
           new Main(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}
