package Project.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Project.data.User;

public class Authorization extends JPanel {
    private JTextField login;
    private JPasswordField pass;
    private JLabel log;
    private JLabel pas;
    private JLabel authorize;
    private JButton back;
    private JButton cont;
    private BossFrame frame = null;

    public Authorization(BossFrame frame){
        this.frame=frame;
        setSize( 800,700);
        setLayout(null);

        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        authorize=new JLabel("Authorize");
        authorize.setBounds(350,65,120,23);
        authorize.setForeground(Color.WHITE);
        authorize.setFont(font);
        add(authorize);

        log=new JLabel("Login:");
        log.setBounds(278,110,100,20);
        log.setForeground(Color.WHITE);
        add(log);

        login=new JTextField();
        login.setBounds(330,110,120,20);
        add(login);

        pas=new JLabel("Password:");
        pas.setBounds(250,140,100,20);
        pas.setForeground(Color.WHITE);
        add(pas);

        pass=new JPasswordField();
            pass.setBounds(330,140,120,20);
       add(pass);


       back=new JButton("Back");
       back.setBounds(290,180,70,20);
       back.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               frame.authorization.setVisible(false);
               frame.login.setVisible(true);
           }
       });
       add(back);
      cont=new JButton("Continue");
      cont.setBounds(380,180,90,20);
      add(cont);
      cont.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent actionEvent) {
              if(login.getText().isEmpty() || pass.getText().isEmpty()){
                  JOptionPane.showMessageDialog(frame, "Fill all fields");
              }
              else{
                  User u = new User();
                  u.setLogin(login.getText());
                  u.setPassword(pass.getText());

                  User authUser = frame.clientSocket.toLogin(u);
                  if(authUser != null){
                      JOptionPane.showMessageDialog(frame, "You are Logged in");
                      login.setText("");
                      pass.setText("");
                      frame.authorization.setVisible(false);
                      frame.shop.setVisible(true);



                  }
                  else
                      JOptionPane.showMessageDialog(frame, "Incorrect login or password");
              }
          }
      });
    }
}



