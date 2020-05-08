package Project.GUI;

import Project.GUI.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Shop extends JPanel{
    private JLabel gs;
    private JButton pr;
    private JButton acoustic;
    private JButton classic;
    private JButton electro;
    private JButton chehol;
    private JButton mediatr;
    private JButton struna;
    private BossFrame frame = null;
    private JLabel efg;

    public Shop(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);

        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);



        gs=new JLabel("Guitar Store");
        gs.setBounds(335,30,120,20);
        gs.setFont(font);
        gs.setForeground(Color.WHITE);
        add(gs);

        efg=new JLabel("Everything for Guitar");
        efg.setBounds(290,325,250,25);
        efg.setForeground(Color.WHITE);
        efg.setFont(font);
        add(efg);



        pr=new JButton("Profile");
        pr.setBounds(650,10,120,20);
       add(pr);
       pr.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              frame.shop.setVisible(false);
              frame.profile.setVisible(true);
           }
       });

       acoustic=new JButton("GET");
       acoustic.setBounds(110 ,270,140,30);
       acoustic.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              frame.shop.setVisible(false);
              frame.acoustic.setVisible(true);
           }
       });
       add(acoustic);



        File file=new File("acoustic.jpg");
        JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
        imgLabel.setBounds(110,90,140,170);
        add(imgLabel);



        classic=new JButton("GET");
       classic.setBounds(310,270,140,30);
       classic.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               frame.shop.setVisible(false);
               frame.classic.setVisible(true);
           }
       });
       add(classic);


        File file1=new File("classic.jpg");
        JLabel imgLabel1=new JLabel(new ImageIcon(file1.getName()));
        imgLabel1.setBounds(310,90,140,170);
        add(imgLabel1);

       electro=new JButton("GET");
       electro.setBounds(510,270,140,30);
       electro.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              frame.shop.setVisible(false);
               frame.electro.setVisible(true);
           }
       });
       add(electro);



       File file2=new File("electro.jpg");
       JLabel imgLabel2=new JLabel(new ImageIcon(file2.getName()));
       imgLabel2.setBounds(510,90,140,170);
       add(imgLabel2);

        chehol =new JButton("GET");
       chehol.setBounds(110,550,140,30);
       chehol.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               frame.shop.setVisible(false);
              frame.chehol.setVisible(true);
           }
       });
       add(chehol);


        File file3=new File("chehol.jpg");
        JLabel imgLabel3=new JLabel(new ImageIcon(file3.getName()));
        imgLabel3.setBounds(110,370,140,170);
        add(imgLabel3);


        mediatr=new JButton("GET");
       mediatr.setBounds(310,550,140,30);
       mediatr.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              frame.shop.setVisible(false);
              frame.mediatr.setVisible(true);
           }
       });
       add(mediatr);


        File file4=new File("mediatr.jpg");
        JLabel imgLabel4=new JLabel(new ImageIcon(file4.getName()));
        imgLabel4.setBounds(310,370,140,170);
        add(imgLabel4);

       struna=new JButton("GET");
       struna.setBounds(510,550,140,30);
       struna.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
             frame.shop.setVisible(false);
             frame.struna.setVisible(true);
           }
       });
       add(struna);



        File file5=new File("struna.jpg");
        JLabel imgLabel5=new JLabel(new ImageIcon(file5.getName()));
        imgLabel5.setBounds(510,370,140,170);
        add(imgLabel5);


    }



}

