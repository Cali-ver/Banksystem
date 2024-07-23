package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3  extends JFrame implements ActionListener {
    JRadioButton Jrbutton,Jr1button,Jr2button,Jr3button;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton j1 ,j2;
    String name;
    Signup3(String name){
        this.name=name;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        JLabel l1=new JLabel("page3");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l0=new JLabel("Account Details");
        l0.setFont(new Font("Raleway",Font.BOLD,22));
        l0.setBounds(300,80,600,40);
        add(l0);

        JLabel l2=new JLabel("Type of account");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(150,145,250,30);
        add(l2);

        Jrbutton=new JRadioButton("Saving account");
        Jrbutton.setFont(new Font("Raleway",Font.BOLD,14));
        Jrbutton.setBounds(150,200,150,25);
        Jrbutton.setBackground(new Color(138, 217, 223));
        add(Jrbutton);

        Jr1button=new JRadioButton("Current account");
        Jr1button.setFont(new Font("Raleway",Font.BOLD,14));
        Jr1button.setBounds(150,250,150,25);
        Jr1button.setBackground(new Color(138, 217, 223));
        add(Jr1button);

        Jr2button=new JRadioButton("Recurring Deposit account");
        Jr2button.setFont(new Font("Raleway",Font.BOLD,14));
        Jr2button.setBounds(350,200,200,25);
        Jr2button.setBackground(new Color(138, 217, 223));
        add(Jr2button);


        Jr3button=new JRadioButton("Fixed Deposit account");
        Jr3button.setFont(new Font("Raleway",Font.BOLD,14));
        Jr3button.setBounds(350,250,150,25);
        Jr3button.setBackground(new Color(138, 217, 223));
        add(Jr3button);

        ButtonGroup r3=new ButtonGroup();
        r3.add(Jrbutton);
        r3.add(Jr1button);
        r3.add(Jr2button);
        r3.add(Jr3button);

        JLabel l3 =new JLabel("Card number");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(150,300,250,30);
        add(l3);
        JLabel l4 =new JLabel("(Your 16-digit card number");
        l4.setFont(new Font("Raleway",Font.BOLD,12));
        l4.setBounds(150,325,250,20);
        add(l4);

        JLabel l5 =new JLabel("xxxx-xxxx-xxxx-1548");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(330,300,250,30);
        add(l5);

        JLabel l6 =new JLabel("(It would appear on your card)");
        l6.setFont(new Font("Raleway",Font.BOLD,12));
        l6.setBounds(350,325,550,20);
        add(l6);
        JLabel l7 =new JLabel("PIN");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(150,370,250,30);
        add(l7);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(330,370,250,30);
        add(l9);


        JLabel l8 =new JLabel("(4-digit Password)");
        l8.setFont(new Font("Raleway",Font.BOLD,12));
        l8.setBounds(150,400,250,20);
        add(l8);

        JLabel l10 =new JLabel("Services Required");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(150,430,250,30);
        add(l10);
        c1=new JCheckBox("Debit card");
        c1.setFont(new Font("Raleway",Font.BOLD,20));
        c1.setBackground(new Color(138, 217, 223));
        c1.setBounds(150,480,200,30);
        add(c1);
        c2=new JCheckBox("Cheque Book");
        c2.setFont(new Font("Raleway",Font.BOLD,20));
        c2.setBackground(new Color(138, 217, 223));
        c2.setBounds(150,530,200,30);
        add(c2);
        c3=new JCheckBox("Internet Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,20));
        c3.setBackground(new Color(138, 217, 223));
        c3.setBounds(350,480,200,30);
        add(c3);
        c4=new JCheckBox("Mobile Banking");
        c4.setFont(new Font("Raleway",Font.BOLD,20));
        c4.setBackground(new Color(138, 217, 223));
        c4.setBounds(350,530,200,30);
        add(c4);
        c5=new JCheckBox("Credit Card ");
        c5.setFont(new Font("Raleway",Font.BOLD,20));
        c5.setBackground(new Color(138, 217, 223));
        c5.setBounds(150,580,200,30);
        add(c5);
        c6=new JCheckBox("E-statements");
        c6.setFont(new Font("Raleway",Font.BOLD,20));
        c6.setBackground(new Color(138, 217, 223));
        c6.setBounds(350,580,200,30);
        add(c6);

        JCheckBox checkBox=new JCheckBox("declare that all the information submitted by me in the application form is correct, true and valid.");
        checkBox.setFont(new Font("Raleway",Font.BOLD,12));
        checkBox.setBackground(new Color(138, 217, 223));
        checkBox.setBounds(100,650,700,30);
        add(checkBox);

        JLabel l13=new JLabel("Name:");
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(600,30,600,40);
        add(l13);

        JLabel l14=new JLabel();
        l14.setFont(new Font("Raleway",Font.BOLD,20));
        l14.setBounds(700,30,600,40);
        add(l14);

        j1=new JButton("Submit");
        j1.setFont(new Font("Raleway",Font.BOLD,25));
        j1.setBounds(600,700,150,30);
        j1.setBackground(new Color(138, 217, 223));
        j1.setForeground(Color.black);
        j1.addActionListener(this);
        add(j1);

        j2=new JButton("Cancel");
        j2.setFont(new Font("Raleway",Font.BOLD,25));
        j2.setBounds(90,700,150,30);
        j2.setBackground(new Color(138, 217, 223));
        j2.setForeground(Color.black);
        j2.addActionListener(this);
        add(j2);




        getContentPane().setBackground(new Color(138, 217, 223));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acc= null;
        if (Jrbutton.isSelected()){
            acc="Saving account";
        } else if (Jr1button.isSelected()) {
            acc="Current account";
        } else if (Jr2button.isSelected()) {
            acc="Recurring Deposit account";
        } else if (Jr3button.isSelected()) {
            acc="Fixed Deposit account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1429863000000000L;
        String cardno=""+ Math.abs(first7);

        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String ser=null;
        if (c1.isSelected()){
            ser +="Debit card";
        } else if (c2.isSelected()) {
            ser+="Cheque Book";
        } else if (c3.isSelected()) {
            ser+="Internet Banking";
        } else if (c4.isSelected()) {
            ser+="Mobile Banking";
        } else if (c5.isSelected()) {
            ser+="Credit Card";
        } else if (c6.isSelected()) {
            ser+="E-statements";
        }
        try{ 
            if (e.getSource()==j1){
                if (ser.equals("")){
                    JOptionPane.showMessageDialog(null,"Select the Account type");

            }else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 value('" + name + "','" + acc + "','" + cardno + "','" + pin + "','" + ser + "')";
                    String q2 = "insert into login value('" + name + "','" + cardno + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card number:" + cardno + "\n Pin : " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==j2) {
                System.exit(0);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
          new Signup3("");

    }

}
