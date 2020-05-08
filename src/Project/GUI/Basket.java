package Project.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Basket extends JPanel {
    private JLabel list;
    private JButton back;
    private JComboBox bask;
    private BossFrame frame = null;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane pane;
    private JButton delete;

    public Basket(BossFrame frame){
        this.frame=frame;
        setSize(800,700);
        setLayout(null);

        Font font =new Font(Font.DIALOG,Font.ITALIC,20);
        this.setBackground(Color.BLACK);

        Object columns[]={"Name","Firm","String","Material","Price"};

        table=new JTable();
        model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setBackground(Color.lightGray);
        table.setForeground(Color.RED);
        table.setFont(font);
        table.setRowHeight(20,20);
        pane=new JScrollPane(table);
        pane.setBounds(20,70,745,500);
        add(pane);



        list=new JLabel("Basket");
        list.setBounds(360,30,100,20);
        list.setForeground(Color.WHITE);
        list.setFont(font);
        add(list);

        back=new JButton("Back");
        back.setBounds(20,600,120,30);
        back.setFont(font);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.basket.setVisible(false);
                frame.profile.setVisible(true);
            }
        });
        add(back);

        delete=new JButton("Delete");
        delete.setBounds(645,600,120,30);
        delete.setFont(font);
        add(delete);

    }
}
