package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Classic extends JPanel {
private JLabel classic;
private JLabel info;
private JButton back;
private JButton add;
private BossFrame frame = null;
    private JComboBox firm;
    private String firma[]={" ","Gibson","Martin","Godin"};
    private int firmaPrice[]={0, 50, 100, 130};

    private JComboBox string;
    private String count[]={" ","6-string","7-string"};
    private int stringPrice[]={0, 60, 70};

    private JComboBox material;
    private String mat[]={" ","Olha","Klen","Makore"};
    private int matPrice[]={0, 60, 70, 80};
    private JLabel price;
    private int sum=0;

public Classic(BossFrame frame){
    this.frame=frame;
    setSize(800,700);
    setLayout(null);
    this.setBackground(Color.BLACK);
    Font font=new Font(Font.DIALOG,Font.ITALIC,20);

    File file=new File("classicb.jpg");
    JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
    imgLabel.setBounds(50,100,300,400);
    add(imgLabel);


    price=new JLabel();
    price.setFont(font);
    price.setBounds(600,400,120,30);
    price.setForeground(Color.WHITE);
    price.setText("Price: " + String.valueOf(sum));
    add(price);


    firm=new JComboBox(firma);
    firm.setBounds(600,350,120,30);
    firm.setFont(font);
    firm.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            sum+=firmaPrice[firm.getSelectedIndex()];
        }
    });
    add(firm);

    string=new JComboBox(count);
    string.setBounds(450,350,120,30);
    string.setFont(font);
    string.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            sum+=stringPrice[string.getSelectedIndex()];
        }
    });
    add(string);

    material=new JComboBox(mat);
    material.setBounds(450,400,120,30);
    material.setFont(font);
    material.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            sum += matPrice[material.getSelectedIndex()];

        }
    });
    add(material);


    classic=new JLabel("Classic Guitar");
    classic.setBounds(335,30,200,20);
    classic.setFont(font);
    classic.setForeground(Color.WHITE);
    add(classic);

    info=new JLabel("info");
    info.setBounds(500,100,300,200);
    info.setForeground(Color.WHITE);
    info.setFont(font);
    add(info);

    back=new JButton("Back");
    back.setBounds(50,600,120,30);
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            frame.classic.setVisible(false);
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

