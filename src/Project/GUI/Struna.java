package Project.GUI;

import Project.GUI.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Struna extends JPanel {
    private JLabel struna;
    private JLabel info;
    private JButton back;
    private JButton add;
    private BossFrame frame = null;
    private JComboBox firm;
    private String firma[]={" ","acoustic","classic","electro"};
    private JComboBox count_of_width ;
    private String width[]={" ","0,50","0,46","0,42"};
    private JComboBox material;
    private String mat[]={" ","Bronze","Silver","Nylon"};
    private JLabel price;

    public Struna(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);
        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        File file = new File("strunab.jpg");
        JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
        imgLabel.setBounds(50,100,300,400);
        add(imgLabel);

        firm=new JComboBox(firma);
        firm.setBounds(600,350,120,30);
        firm.setFont(font);
        add(firm);

        count_of_width=new JComboBox(width);
        count_of_width.setBounds(450,350,120,30);
        count_of_width.setFont(font);
        add(count_of_width);

        material=new JComboBox(mat);
        material.setBounds(450,400,120,30);
        material.setFont(font);
        add(material);

        price=new JLabel("Price:");
        price.setFont(font);
        price.setBounds(600,400,120,30);
        price.setForeground(Color.WHITE);
        add(price);


        struna=new JLabel("Strings for Guitar");
        struna.setBounds(335,30,200,30);
        struna.setForeground(Color.WHITE);
        struna.setFont(font);
        add(struna);

        info=new JLabel("info");
        info.setBounds(100,200,100,20);
        info.setForeground(Color.WHITE);
        info.setFont(font);
        add(info);

        back=new JButton("Back");
        back.setBounds(50,600,120,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.struna.setVisible(false);
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
