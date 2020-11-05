import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewsPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyPanel
     */
    public NewsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        setLayout(null);

        searchlabel = new JLabel();
        searchlabel = new JLabel("search");
//        searchlabel.setSize(62,23);
//        searchlabel.setLocation(289,28);
        searchlabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        searchlabel.setForeground(new Color(67,67,84));
        add(searchlabel);
        searchlabel.setBounds(24,11,62,23);

        searchbar = new JTextField();
        searchbar = new JTextField("");
        searchbar.setLocation(24,35);
        searchbar.setSize(331,45);
        searchbar.setBackground(new Color(67,67,89));
        searchbar.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(67,67,84)));
        searchbar.setFont(new Font("Roboto", Font.PLAIN, 18));
        searchbar.setForeground(new Color(255,255,255));
        add(searchbar);
//        searchbar.setBounds(24, 35, 331, 45);


        panel = new JPanel();
        panel.setSize(978,414);
//        newspanel.setLocation(24, 120);
        panel.setBackground(new Color(255,255,255));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createMatteBorder(
                0, 10, 0, 0, new Color(67,67,84)));
//        add(newspanel);

        JScrollPane sp=new JScrollPane(panel);
//        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setLocation(24,120);
        sp.setSize(978,414);
        add(sp);

        newspanel = new JPanel();
        newspanel.setPreferredSize(new Dimension(838,814));
//        newspanel.setLocation(24, 120);
        newspanel.setBackground(new Color(255,255,255));
        newspanel.setLayout(null);
//        newspanel.setBorder(BorderFactory.createMatteBorder(
//                2, 8, 2, 2, new Color(67,67,84)));
        panel.add(newspanel);

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_1st_30px.png"));
        JLabel label1 = new JLabel(icon1, JLabel.CENTER);
        label1.setBackground(Color.gray);
        label1.setOpaque(true);
        newspanel.add(label1);
        label1.setBounds(20, 20, 72, 61);

        JLabel label2 = new JLabel("Admission Notice SYBSc, SYBMM, SYBVoc, SYBA 2020-21");
        label2.setBackground(Color.gray);
        label2.setOpaque(true);
        label2.setForeground(Color.WHITE);
        newspanel.add(label2);
        label2.setBounds(92, 20, 838, 61);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_2_30px.png"));
        JLabel label3 = new JLabel(icon2, JLabel.CENTER);
        label3.setBackground(Color.gray);
        label3.setOpaque(true);
        newspanel.add(label3);
        label3.setBounds(20, 100, 72, 61);

        JLabel label4 = new JLabel("Instructions to Download MS Teams to Attend Orientation 2020-21");
        label4.setBackground(Color.gray);
        label4.setOpaque(true);
        label4.setForeground(Color.WHITE);
        newspanel.add(label4);
        label4.setBounds(92, 100, 838, 61);

        ImageIcon icon3 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_3_30px.png"));
        JLabel label5 = new JLabel(icon3, JLabel.CENTER);
        label5.setBackground(Color.gray);
        label5.setOpaque(true);
        newspanel.add(label5);
        label5.setBounds(20, 180, 72, 61);

        JLabel label6 = new JLabel("ADMISSION NOTICE FOR FOREIGN LANGUAGE CENTRE");
        label6.setBackground(Color.gray);
        label6.setOpaque(true);
        label6.setForeground(Color.WHITE);
        newspanel.add(label6);
        label6.setBounds(92, 180, 838, 61);

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_4_30px.png"));
        JLabel label7 = new JLabel(icon4, JLabel.CENTER);
        label7.setBackground(Color.gray);
        label7.setOpaque(true);
        newspanel.add(label7);
        label7.setBounds(20, 260, 72, 61);

        JLabel label8 = new JLabel("Notice for Assistance to SC/ST/DT/NT_Students");
        label8.setBackground(Color.gray);
        label8.setOpaque(true);
        label8.setForeground(Color.WHITE);
        newspanel.add(label8);
        label8.setBounds(92, 260, 838, 61);

        ImageIcon icon5 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_5_30px.png"));
        JLabel label9 = new JLabel(icon5, JLabel.CENTER);
        label9.setBackground(Color.gray);
        label9.setOpaque(true);
        newspanel.add(label9);
        label9.setBounds(20, 340, 72, 61);

        JLabel label10 = new JLabel("MSc Part-I Admissions 2020-21");
        label10.setBackground(Color.gray);
        label10.setOpaque(true);
        label10.setForeground(Color.WHITE);
        newspanel.add(label10);
        label10.setBounds(92, 340, 838, 61);

        ImageIcon icon6 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_6_30px.png"));
        JLabel label11 = new JLabel(icon6, JLabel.CENTER);
        label11.setBackground(Color.gray);
        label11.setOpaque(true);
        newspanel.add(label11);
        label11.setBounds(20, 420, 72, 61);

        JLabel label12 = new JLabel("Instructions to Download MS Teams to Attend Orientation 2020-21");
        label12.setBackground(Color.gray);
        label12.setOpaque(true);
        label12.setForeground(Color.WHITE);
        newspanel.add(label12);
        label12.setBounds(92, 420, 838, 61);

        entry = new JTextField();
        entry.setSize(620,80);
        entry.setLocation(24,572);
//        entry.setBorder(BorderFactory.createMatteBorder(
//                2, 2, 2, 2, new Color(67,67,84)));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("news");
        entry.setBorder(title1);
        Color color = this.getBackground();
        entry.setBackground(color);
        add(entry);

        addbutton = new JButton("    ADD EVENT");
        addbutton.setLocation(720,586);
        addbutton.setSize(270,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { AddNewsButtonClickd(evt); }
        });

        setBackground(new Color(255,255,255));

    }// </editor-fold>

    private void AddNewsButtonClickd(MouseEvent evt) {
    if (entry.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "please enter news details");
    }else{
            ImageIcon iconadd = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_"+newspath+"_30px.png"));
            JLabel labeladd1 = new JLabel(iconadd, JLabel.CENTER);
            labeladd1.setBackground(Color.gray);
            labeladd1.setOpaque(true);
            newspanel.add(labeladd1);
            labeladd1.setBounds(20, newsy, 72, 61);

            JLabel labeladd2 = new JLabel(entry.getText());
            labeladd2.setBackground(Color.gray);
            labeladd2.setOpaque(true);
            labeladd2.setForeground(Color.WHITE);
            newspanel.add(labeladd2);
            labeladd2.setBounds(92, newsy, 838, 61);

            entry.setText("");

            newsy = newsy+80;
            newspath = newspath+1;
            JOptionPane.showMessageDialog(this, "news added successfully!");
        }
    }

    // Variables declaration - do not modify
//    public static JButton jButton1;
    private static JLabel searchlabel;
    public static JTextField searchbar;
    public static JButton searchbutton;
    public static JButton addbutton;
    public static JPanel panel;
    public static JPanel newspanel;
    public static JTextField entry;
    public int newsy = 500;
    public int newspath = 7;
    // End of variables declaration
}