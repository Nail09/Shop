package Project.GUI;

import Project.GUI.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JPanel {
    private JLabel prof;
    private JButton shop;
    private JButton logout;
    private JButton basket;
    private BossFrame frame = null;

    public Profile(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);

        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        prof=new JLabel("Profile");
        prof.setBounds(370,30,100,20);
        prof.setFont(font);
        prof.setForeground(Color.WHITE);
        add(prof);

        shop=new JButton("Shop");
        shop.setBounds(530,600,120,30);
        shop.setFont(font);
        add(shop);
        shop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.profile.setVisible(false);
                frame.shop.setVisible(true );
            }
        });

        basket=new JButton("Basket");
        basket.setBounds(330,600,120,30);
        basket.setFont(font);
        basket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.profile.setVisible(false);
                frame.basket.setVisible(true);
            }
        });
        add(basket);

        logout=new JButton("Log Out");
        logout.setBounds(130,600,120,30);
        logout.setFont(font);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.profile.setVisible(false);
                frame.login.setVisible(true);
            }
        });
        add(logout);
    }
}
