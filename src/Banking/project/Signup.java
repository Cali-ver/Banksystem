package Banking.project;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JTextField textname ,textFname,textMname,textEmail,textPAN,textadd,textpin;
    JDateChooser dataChooser;
    JRadioButton r1,r2,r3,r4,r5;
    JButton Jbutton ;

    Signup(String name){
      super("Applicaton form");

        JLabel label1= new JLabel("APPLICATION FORM");
        label1.setBounds(130,20,400,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

          JLabel label2=new JLabel("Page 1");
          label2.setFont(new Font("Ralway",Font.BOLD,22));
          label2.setBounds(330,70,600,30);
          add(label2);

          JLabel label3=new JLabel("Personal information");
          label3.setFont(new Font("Raleway",Font.BOLD,22));
          label3.setBounds(280,100,600,30);
          add(label3);

          JLabel label4= new JLabel("Name");
          label4.setFont(new Font("Raleway",Font.BOLD,20));
          label4.setBounds(100,190,100,30);
          add(label4);

          textname=new JTextField();
          textname.setFont(new Font("Raleway",Font.BOLD,14));
          textname.setBounds(300,190,400,30);
          add(textname);

        JLabel label5= new JLabel("Father Name");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,240,200,30);
        add(label5);

           textFname =new JTextField();
           textFname.setFont(new Font("Raleway",Font.BOLD,14));
           textFname.setBounds(300,240,400,30);
           add(textFname);

           JLabel label6=new JLabel("Mother Name");
           label6.setFont(new Font("Raleway",Font.BOLD,20));
           label6.setBounds(100,290,200,30);
           add(label6);

           textMname=new JTextField();
           textMname.setFont(new Font("Raleway",Font.BOLD,14));
           textMname.setBounds(300,290,400,30);
           add(textMname);

        JLabel label7=new JLabel("Date of Birth");
        label7.setFont(new Font("Raleway",Font.BOLD,20));
        label7.setBounds(100,340,200,30);
        add(label7);

        dataChooser=new JDateChooser();
        dataChooser.setForeground(new Color(135,125,105));
        dataChooser.setBounds(300,340,400,30);
        add(dataChooser);

        JLabel label8 =new JLabel("Gender");
        label8.setFont(new Font("Raleway",Font.BOLD,20));
        label8.setBounds(100,390,200,30);
        add(label8);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1. setBackground(new Color(225,255,228));
        r1.setBounds(300,390,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2. setBackground(new Color(225,255,228));
        r2.setBounds(400,390,90,30);
        add(r2);

        r3=new JRadioButton("other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3. setBackground(new Color(225, 255, 228));
        r3.setBounds(500,390,90,30);
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel label9 =new JLabel("Email");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,440,200,20);
        add(label9);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,440,400,30);
        add(textEmail);

        JLabel label10 =new JLabel("Marital status");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,480,200,30);
        add(label10);

        r4=new JRadioButton("Married");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(300,480,110,30);
        r4.setBackground(new Color(222,255,228));
        add(r4);

        r5=new JRadioButton("Unmarried");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBounds(500,480,130,30);
        r5.setBackground(new Color(222,255,228));
        add(r5);

         ButtonGroup buttonGroup1 =new ButtonGroup();
         buttonGroup1.add(r4);
         buttonGroup1.add(r5);

        JLabel label11 =new JLabel("PAN card");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,520,200,30);
        add(label11);

        textPAN=new JTextField();
        textPAN.setFont(new Font("Raleway",Font.BOLD,14));
        textPAN.setBounds(300,520,400,30);
        add(textPAN);

        JLabel label12 =new JLabel("Address");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(100,560,200,30);
        add(label12);

        textadd=new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,560,400,30);
        add(textadd);

        JLabel label13 =new JLabel("PIN code");
        label13.setFont(new Font("Raleway",Font.BOLD,20));
        label13.setBounds(100,600,200,30);
        add(label13);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,600,100,30);
        add(textpin);

        Jbutton=new JButton("Next");
        Jbutton.setFont(new Font("Raleway",Font.BOLD,20));
        Jbutton.setBackground(new Color(72, 159, 68));
        Jbutton.setBounds(700,650,100,60);
        Jbutton.addActionListener(this);
        add(Jbutton);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

  @Override
  public void actionPerformed(ActionEvent e) {

      String name=textname.getText();
      String Fname=textFname.getText();
      String dob=((JTextField)dataChooser.getDateEditor().getUiComponent()).getText();// important
      String gender =null;
      if (r1.isSelected()){
        gender="male";
      }else if (r2.isSelected()){
         gender="female";
      } else if (r3.isSelected()) {
        gender="other";
      }
    String email= textEmail.getText();
      String marital =null;
      if(r4.isSelected()){
        marital="married";

      } else if (r5.isSelected()) {
        marital="Unmarried";
      }
     String pan=textPAN.getText();
      String address= textadd.getText();
      String pin=textpin.getText();

      try{
         if(textname.getText().equals("")){
           JOptionPane.showMessageDialog(null,"fill all the fields");
         } else {
           Conn con1= new Conn();
           String q="insert into signup value('"+name+"','"+Fname+"','"+dob+"','"+ gender+"','"+email+"','"+marital+"','"+address+"','"+pan+"','"+pin+"')";
           con1.statement.executeUpdate(q);
           new Signup2(name);
           setVisible(false);

         }
      }catch (Exception E){
           E.printStackTrace();
      }
  }


  public static void main(String[] args) {
        new Signup("");
    }
}
