package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Electro extends JPanel {
    private JLabel electro;
    private JLabel info;
    private JButton back;
    private JButton add;
    private BossFrame frame = null;
    private JComboBox firm;
    private String firma[]={" ","Epiphone","Gretsch","Ibanez"};
    private JComboBox string;
    private String count[]={" ","6-string","7-string"};
    private JComboBox material;
    private String mat[]={" ","Olha","Klen","Makore"};
    private JLabel price;

    public Electro(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);
        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        File file =new File("electrob.jpg");
        JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
        imgLabel.setBounds(50,100,300,400);
        add(imgLabel);

        price=new JLabel("Price:");
        price.setFont(font);
        price.setBounds(600,400,120,30);
        price.setForeground(Color.WHITE);
        add(price);


        firm=new JComboBox(firma);
        firm.setBounds(600,350,120,30);
        firm.setFont(font);
        add(firm);

        string=new JComboBox(count);
        string.setBounds(450,350,120,30);
        string.setFont(font);
        add(string);

        material=new JComboBox(mat);
        material.setBounds(450,400,120,30);
        material.setFont(font);
        add(material);

        electro=new JLabel("Electro Guitar");
        electro.setBounds(335,30,200,20);
        electro.setFont(font);
        electro.setForeground(Color.WHITE);
        add(electro);

        info=new JLabel("info");
        info.setBounds(500,100,100,40);
        info.setFont(font);
        info.setForeground(Color.WHITE);
        add(info);

        back=new JButton("Back");
        back.setBounds(50,600,120,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.electro.setVisible(false);
                frame.shop.setVisible(true);
            }
        });
        add(back);

        add=new JButton("Add");
        add.setBounds(600,600,120,30);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        add(add);
    }

}
