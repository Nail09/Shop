package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Project.data.User;

public class Login extends JPanel {
    private JButton loginButton;
    private JButton registrateButton;
    private JButton exitButton;
    private JLabel label;
    private BossFrame frame = null;

public Login(BossFrame frame){
    this.frame=frame;
    setSize( 800,700);
    setLayout(null);

    Font font=new Font(Font.SERIF,Font.ITALIC,20);
    this.setBackground(Color.BLACK);

    label=new JLabel("WELCOME");
    label.setBounds(350,55,120,80);
    label.setFont(font);
    label.setForeground(Color.WHITE);
    add(label);

    loginButton = new JButton("Login");
    loginButton.setBounds(330,145,135,40);
    loginButton.setFont(font);
    add(loginButton);
    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

      frame.login.setVisible(false);
      frame.authorization.setVisible(true);
        }
    });

    registrateButton=new JButton("Registration");
    registrateButton.setBounds(330,205,135,40);
    registrateButton.setFont(font);
    add(registrateButton);
    registrateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            frame.login.setVisible(false);
            frame.registration.setVisible(true);
        }
    });

    exitButton=new JButton("Exit");
    exitButton.setBounds(330,265,135,40);
    exitButton.setFont(font);
    add(exitButton);
    exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });

}

}