package Project.GUI;

import Project.data.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Project.data.User;
import Project.Client.ClientSocket;




public class Registration extends JPanel {
    private JLabel createlogin;
    private JTextField login;
    private JLabel createUser;
    private JLabel createPassword;
    private JTextField username;
    private JPasswordField password;
    private JButton addb;
    private JButton backbb;
    private JLabel regist;
    private BossFrame frame = null;


    public Registration(BossFrame frame){
        this.frame=frame;
        setSize( 800,700);
        setLayout(null);



        Font font=new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        regist=new JLabel("Registrate");
        regist.setBounds(360,65,120,23);
        regist.setForeground(Color.WHITE);
        regist.setFont(font);
        add(regist);

        createUser=new JLabel("Enter the user name:");
        createUser.setBounds(230,110,120,20);
        createUser.setForeground(Color.WHITE);
        add(createUser);

        username=new JTextField();
        username.setBounds(360,110,120,20);
        add(username);

        createlogin=new JLabel("Create a login:");
        createlogin.setBounds(265,140,120,20);
        createlogin.setForeground((Color.WHITE));
        add(createlogin);

        login=new JTextField();
        login.setBounds(360,140,120,20);
        add(login);

        createPassword=new JLabel("Create a password:");
        createPassword.setBounds(235,170,120,20);
        createPassword.setForeground(Color.WHITE);
        add(createPassword);

        password=new JPasswordField();
        password.setBounds(360,170,120,20);
        add(password);



        backbb=new JButton("BACK");
        backbb.setBounds(310,210,80,20);
        add(backbb);
        backbb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.registration.setVisible(false);
                frame.login.setVisible(true);
            }
        });
            addb=new JButton("ADD");
        addb.setBounds(410,210,80,20);
        add(addb);
        addb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username.getText().isEmpty() || login.getText().isEmpty() || password.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fill all fields");
                }
                else{
                    User u = new User();
                    u.setLogin(login.getText());
                    u.setName(username.getText());
                    u.setPassword(password.getText());

                    boolean registered = frame.clientSocket.toRegister(u);
                    if(registered == true){
                        JOptionPane.showMessageDialog(frame, "You are registered");
                        username.setText("");
                        login.setText("");
                        password.setText("");

                        frame.registration.setVisible(false);
                        frame.authorization.setVisible(true);
                    }
                }
            }
        });
    }
}
