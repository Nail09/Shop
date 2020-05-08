package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Acoustic extends JPanel {
    private JLabel acoustic;
    private JButton back;
    private JButton add;
    private BossFrame frame = null;
    private JComboBox firm;
    private String firma[]={" ","YAMAHA","Cort","Fender"};
    private JComboBox string;
    private String count[]={" ","6-string","7-string"};
    private JComboBox material;
    private String mat[]={" ","Olha","Klen","Makore"};
    private JLabel price;


    public Acoustic(BossFrame frame){
        this.frame = frame;
        setSize(800,700);
        setLayout(null);
        this.setBackground(Color.BLACK);
        Font font=new Font(Font.DIALOG,Font.ITALIC,20);



        File file=new File("acousticb.jpg");
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

        acoustic=new JLabel("Acoustic Guitar");
        acoustic.setBounds(335,30,200,20);
        acoustic.setFont(font);
        acoustic.setForeground(Color.WHITE);
        add(acoustic);



//        JTextArea area=new JTextArea(3,3);
//        area.setText();
//        area.setWrapStyleWord(true);
//        area.setLineWrap(true);
//        area.setOpaque(false);
//        area.setEditable(false);
//        area.setFocusable(false);
//        area.setBackground(UIManager.getColor(""));
//        area.setFont(UIManager.getFont(""));
//        area.setBorder(UIManager.getBorder(""));
//        add(area);



        back=new JButton("Back");
        back.setBounds(50,600,120,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.acoustic.setVisible(false);
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
