
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExamPanel  extends javax.swing.JPanel {

    /**
     * Creates new form FacultyPanel
     */
    public ExamPanel () {
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

        exampanel = new JPanel();
        exampanel.setPreferredSize(new Dimension(838,814));
//        newspanel.setLocation(24, 120);
        exampanel.setBackground(new Color(255,255,255));
        exampanel.setLayout(null);
//        newspanel.setBorder(BorderFactory.createMatteBorder(
//                2, 8, 2, 2, new Color(67,67,84)));
        panel.add(exampanel);

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_1st_30px.png"));
        JLabel label1 = new JLabel(icon1, JLabel.CENTER);
        label1.setBackground(Color.gray);
        label1.setOpaque(true);
        exampanel.add(label1);
        label1.setBounds(20, 20, 72, 61);

        JLabel label2 = new JLabel("Final Year Examination Time Table 2019-20");
        label2.setBackground(Color.gray);
        label2.setOpaque(true);
        label2.setForeground(Color.WHITE);
        exampanel.add(label2);
        label2.setBounds(92, 20, 838, 61);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_2_30px.png"));
        JLabel label3 = new JLabel(icon2, JLabel.CENTER);
        label3.setBackground(Color.gray);
        label3.setOpaque(true);
        exampanel.add(label3);
        label3.setBounds(20, 100, 72, 61);

        JLabel label4 = new JLabel("Instructions for Online Examination Platform");
        label4.setBackground(Color.gray);
        label4.setOpaque(true);
        label4.setForeground(Color.WHITE);
        exampanel.add(label4);
        label4.setBounds(92, 100, 838, 61);

        ImageIcon icon3 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_3_30px.png"));
        JLabel label5 = new JLabel(icon3, JLabel.CENTER);
        label5.setBackground(Color.gray);
        label5.setOpaque(true);
        exampanel.add(label5);
        label5.setBounds(20, 180, 72, 61);

        JLabel label6 = new JLabel("NOTICE for EXAMINATIONS, EVALUATION AND PROMOTION ");
        label6.setBackground(Color.gray);
        label6.setOpaque(true);
        label6.setForeground(Color.WHITE);
        exampanel.add(label6);
        label6.setBounds(92, 180, 838, 61);

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_4_30px.png"));
        JLabel label7 = new JLabel(icon4, JLabel.CENTER);
        label7.setBackground(Color.gray);
        label7.setOpaque(true);
        exampanel.add(label7);
        label7.setBounds(20, 260, 72, 61);

        JLabel label8 = new JLabel("ATKT University Examination");
        label8.setBackground(Color.gray);
        label8.setOpaque(true);
        label8.setForeground(Color.WHITE);
        exampanel.add(label8);
        label8.setBounds(92, 260, 838, 61);

        entry = new JTextField();
        entry.setSize(620,80);
        entry.setLocation(24,572);
//        entry.setBorder(BorderFactory.createMatteBorder(
//                2, 2, 2, 2, new Color(67,67,84)));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("exam related news");
        entry.setBorder(title1);
        Color color = this.getBackground();
        entry.setBackground(color);
        add(entry);

        addbutton = new JButton("    ADD EXAM NOTICE");
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
        if (entry.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter exam details");
        } else {
            ImageIcon iconadd = new ImageIcon(getClass().getResource("/HomeImages/number/icons8_circled_" + exampath + "_30px.png"));
            JLabel labeladd1 = new JLabel(iconadd, JLabel.CENTER);
            labeladd1.setBackground(Color.gray);
            labeladd1.setOpaque(true);
            exampanel.add(labeladd1);
            labeladd1.setBounds(20, examy, 72, 61);

            JLabel labeladd2 = new JLabel(entry.getText());
            labeladd2.setBackground(Color.gray);
            labeladd2.setOpaque(true);
            labeladd2.setForeground(Color.WHITE);
            exampanel.add(labeladd2);
            labeladd2.setBounds(92, examy, 838, 61);

            entry.setText("");

            examy = examy + 80;
            exampath = exampath + 1;
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
    public static JPanel exampanel;
    public static JTextField entry;
    public int examy = 340;
    public int exampath = 5;
    // End of variables declaration
}