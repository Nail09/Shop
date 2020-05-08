package Project.GUI;

import Project.Client.ClientSocket;

import javax.swing.*;

public class BossFrame extends JFrame {
public  Login login;
public  Authorization authorization;
public  Registration registration;
public  Profile profile;
public  Shop shop;
public  Basket basket;
public  Acoustic acoustic;
public  Classic classic;
public  Electro electro;
public  Chehol chehol;
public  Mediatr mediatr;
public  Struna struna;
public ClientSocket clientSocket;
public Admin admin;


public BossFrame(){
    setTitle("Shop");
    setSize(800,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);

    clientSocket=new ClientSocket();

    login=new Login(this);
    add(login);

    admin=new Admin(this);
    admin.setVisible(false);
    add(admin);


    authorization=new Authorization(this);
    authorization.setVisible(false);
    add(authorization);

    registration=new Registration(this);
    registration.setVisible(false);
    add(registration);

    profile=new Profile(this);
    profile.setVisible(false);
    add(profile);

    shop=new Shop(this);
    shop.setVisible(false);
    add(shop);

    basket=new Basket(this);
    basket.setVisible(false);
    add(basket);

    acoustic=new Acoustic(this);
    acoustic.setVisible(false);
    add(acoustic);

    classic=new Classic(this);
    classic.setVisible(false);
    add(classic);

    electro=new Electro(this);
    electro.setVisible(false);
    add(electro);

    chehol=new Chehol(this);
    chehol.setVisible(false);
    add(chehol);

    mediatr=new Mediatr(this);
    mediatr.setVisible(false);
    add(mediatr);

    struna=new Struna(this);
    struna.setVisible(false);
    add(struna);
}
}
