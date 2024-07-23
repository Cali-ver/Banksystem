package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin_change extends JFrame implements ActionListener {
    JTextField text1;
    JButton jnext,jback;
    JPasswordField j1,j2;
    String pin;
    Pin_change(String pin){
       this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1550,1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1080);
        add(image);

        JLabel label=new JLabel("Change your PIN");
        label.setBounds(460,340,600,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,28));
        image.add(label);

        JLabel label2 =new JLabel("NEW PIN");
        label2.setBounds(460,400,300,35);
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,28));
        image.add(label2);

        j1=new JPasswordField();
        j1.setFont(new Font("Raleway",Font.BOLD,18));
        j1.setBounds(450,450,250,30);
        j1.setForeground(Color.white);
        j1.setBackground(new Color(65,125,128));
        image.add(j1);

        JLabel label3 =new JLabel("Re-Enter NEW PIN");
        label3.setBounds(460,500,300,35);
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,28));
        image.add(label3);

        j2=new JPasswordField();
        j2.setFont(new Font("Raleway",Font.BOLD,18));
        j2.setBounds(450,550,250,30);
        j2.setForeground(Color.white);
        j2.setBackground(new Color(65,125,128));
        image.add(j2);



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
        setSize(1550,1080);
        setLocation(200,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1=j1.getText();
            String pin2=j2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"PIN didn't Match");
                return;

            }
            if (e.getSource()==jnext){
                if (j1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter Your PIN ");
                }
                Conn c1=new Conn();
                String q1 = "update bank set pin = '" + pin1 + "' where pin = '" + this.pin + "'";
                String q2=  "update login set pin = '" + pin1 + "' where pin = '" + this.pin + "'";
                String q3= "update signup3 set pin = '" + pin1 + "' where pin = '" + this.pin + "'";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                c1.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new Main(pin);
            } else if (e.getSource()==jback) {
                setVisible(false);
                new Main(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin_change("");
    }
}
