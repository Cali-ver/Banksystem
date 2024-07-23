package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JTextField textcon,textcon1;

    JComboBox comboBox,comboBox1,comboBox2,comboBox4,comboBox5;
    JRadioButton r1,r2;
    String name;
    JButton b1;
    Signup2(String name){
    super("APPLICATON FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);// to show image on label.
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.name=name;

        JLabel l1=new JLabel("page2");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(750,30,600,40);
        add(l1);

        JLabel l2 =new JLabel("Additional information");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(350,80,400,50);
        add(l2);

        JLabel l3 =new JLabel("Contact number");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,150,250,30);
        add(l3);

        textcon =new JTextField();
        textcon.setFont(new Font("Raleway",Font.BOLD,18));
        textcon.setBounds(300,155,200,20);
        add(textcon);

        JLabel l4=new JLabel("Aaddhar no.");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,200,250,30);
        add(l4);
       textcon1=new JTextField();
        textcon1.setFont(new Font("Raleway",Font.BOLD,18));
        textcon1.setBounds(300,200,200,25);
        add(textcon1);

        JLabel l5=new JLabel("Religion");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(100,250,250,30);
        add(l5);

        String religion[]={" ","Hindu","Muslim","Sikh","Christian","Other"};

        comboBox=new JComboBox<>(religion);//add string religion
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(300,245,200,25);
        add(comboBox);

        JLabel l6 =new JLabel("Category");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(100,295,250,30);
        add(l6);
        String category[]={"","Gen","Obc","Sc","St","Other"};
        comboBox1=new JComboBox<>(category);
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(300,295,200,25);
        add(comboBox1);

        JLabel l7 =new JLabel("Income");
        l7.setFont(new Font("Raleway",Font.BOLD,22));
        l7.setBounds(100,345,250,30);
        add(l7);

        String[]income={" ","Upto to Rs100k","250k to 300k","300k to 500k","500k to 1000k"};

        comboBox2=new JComboBox<>(income);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,345,200,25);
        add(comboBox2);



        JLabel l9= new JLabel("Education");
        l9.setFont(new Font("Raleway",Font.BOLD,22));
        l9.setBounds(100,390,250,30);
        add(l9);

        String edu[]={"School","Under Graduation","Post Graduation"};
        comboBox4=new JComboBox<>(edu);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,390,200,25);
        add(comboBox4);

        JLabel l10 = new JLabel("Occupation");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(100,445,250,30);
        add(l10);

        String occ[]={"Student","Self employed","Retired","Employed"};

        comboBox5=new JComboBox<>(occ);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,445,200,25);
        add(comboBox5);

        JLabel l11 = new JLabel("Senior Citizen");
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        l11.setBounds(100,495,250,30);
        add(l11);
        r1=new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
       r1.setBounds(300,495,80,20);
        add(r1);

        JLabel l12=new JLabel();
        l12.setFont(new Font("Raleway",Font.BOLD,22));
        l12.setBounds(100,545,250,30);
        add(l12);
        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBounds(400,495,80,20);
        add(r2);

        JLabel l13=new JLabel();                  //NAME of person//
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(700,30,600,40);
        add(l13);


          b1=new JButton("NEXT");
          b1.setFont(new Font("Raleway",Font.BOLD,25));
          b1.setBounds(650,650,150,30);
          b1.setBackground(Color.white);
          b1.setForeground(Color.black);
          b1.addActionListener(this);
          add(b1);



        getContentPane().setBackground(new Color(239, 119, 119));
        setLayout(null);
        setSize(850,800);
        setLocation(450,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String con=textcon.getText();
        String add=textcon1.getText();
        String reg=(String)comboBox.getSelectedItem() ;
        String cate=(String) comboBox1.getSelectedItem();
        String inc=(String) comboBox2.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String)comboBox4.getSelectedItem();
        String senior = null;
        if (r1.isSelected()){
            senior ="Yes";
        } else if (r2.isSelected()) {
            senior ="NO";

        }
        try {
            if (textcon.getText().equals("") || textcon1.getText().equals("")) {
                 JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                Conn c1=new Conn();
                String q="Insert into signup2 value('"+name+"','"+con+"','"+add+"','"+reg+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+ senior +"')";
                c1.statement.executeUpdate(q);
                new Signup3(name);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
               new Signup2("");
    }
}
