package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Chehol extends JPanel {
    private JLabel chehol;
    private JLabel info;
    private JButton back;
    private JButton add;
    private BossFrame frame = null;
    private JComboBox firm;
    private String firma[]={" ","acoustic","classic","electro"};
    private JComboBox count_of_pocket ;
    private String pocket[]={" ","1-pocket","2-pocket","3-pocket"};
    private JComboBox material;
    private String mat[]={" ","heat-insulated","not-insulated"};
    private JLabel price;

    public Chehol(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);
        Font font =new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        File file =new File("cheholb.jpg");
        JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
        imgLabel.setBounds(50,100,300,400);
        add(imgLabel);

        firm=new JComboBox(firma);
        firm.setBounds(600,350,120,30);
        firm.setFont(font);
        add(firm);

        count_of_pocket=new JComboBox(pocket);
        count_of_pocket.setBounds(450,350,120,30);
        count_of_pocket.setFont(font);
        add(count_of_pocket);

        material=new JComboBox(mat);
        material.setBounds(450,400,120,30);
        material.setFont(font);
        add(material);

        price=new JLabel("Price:");
        price.setFont(font);
        price.setBounds(600,400,120,30);
        price.setForeground(Color.WHITE);
        add(price);

        chehol=new JLabel("Case for Guitar");
        chehol.setBounds(335,30,200,20);
        chehol.setFont(font);
        chehol.setForeground(Color.WHITE);
        add(chehol);

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
                frame.chehol.setVisible(false);
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
