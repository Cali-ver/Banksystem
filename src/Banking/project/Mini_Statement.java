package Banking.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini_Statement extends JFrame implements ActionListener {
    JButton button;
    String pin;
    Mini_Statement(String pin){
      this.pin=pin;

        this.getContentPane().setBackground(new Color(255, 204, 204));
        this.setSize(400, 600);
        this.setLocation(20, 20);
        this.setLayout((LayoutManager)null);
        JLabel label1 = new JLabel();
        label1.setBounds(20, 200, 400, 400);
        this.add(label1);
        JLabel label2 = new JLabel("BANK Statement");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150, 20, 200, 20);
        this.add(label2);
        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        this.add(label3);
        JLabel label4 = new JLabel();
        label4.setBounds(20, 650, 300, 20);
        this.add(label4);

        try{
            Conn c1=new Conn();
            ResultSet resultSet=c1.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_no"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            int balance=0;
            Conn c1=new Conn();
            ResultSet resultSet=c1.statement.executeQuery("select * from bank where pin ='"+pin+"'");
            while(resultSet.next()){
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");

                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your totaL Balance is Rs"+balance);

        }catch(Exception e){
            e.printStackTrace();
        }



        this.button = new JButton("Exit");
        this.button.setBounds(20, 700, 100, 25);
        this.button.addActionListener(this);
        this.button.setBackground(Color.BLACK);
        this.button.setForeground(Color.WHITE);
        this.add(this.button);
        this.setVisible(true);



        setSize(800,1000);
        setLocation(200,0);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource()==button){
               setVisible(false);
               new Main(pin);
           }
    }

    public static void main(String[] args) {
        new Mini_Statement("");
    }
}
