package Project.GUI;

import javax.swing.*;

public class Admin extends JPanel {
    private BossFrame frame=null;
    private JLabel admin ;

    public Admin(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);
        admin=new JLabel("admin");
        admin.setBounds(100,100,120,30);
        add(admin);
    }
}
