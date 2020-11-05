import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BroadcastPanel  extends javax.swing.JPanel {

    /**
     * Creates new form FacultyPanel
     */
    public BroadcastPanel () {
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
        panel.setSize(668,414);
//        newspanel.setLocation(24, 120);
        panel.setBackground(new Color(255,255,255));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
//        panel.setBorder(BorderFactory.createMatteBorder(
//                0, 10, 0, 0, new Color(67,67,84)));
//        add(newspanel);

        JScrollPane sp=new JScrollPane(panel);
//        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setLocation(24,120);
        sp.setSize(678,414);
        add(sp);

        broadcastpanel = new JPanel();
        broadcastpanel.setPreferredSize(new Dimension(648,814));
//        newspanel.setLocation(24, 120);
        broadcastpanel.setBackground(new Color(255,255,255));
        broadcastpanel.setLayout(null);
//        newspanel.setBorder(BorderFactory.createMatteBorder(
//                2, 8, 2, 2, new Color(67,67,84)));
        panel.add(broadcastpanel);

        JLabel label1 = new JLabel("<html>We are collectively facing a Pandemic<br/>"+
                "threat that is sweeping across the humanity<br/>" +
                "beyond oceans and borders. Considering<br/>" +
                "the seriousness of COVID-19, it's about time<br/>" +
                "we step up against this deadly disease. For<br/>" +
                "the sake of lives lost and the rest of humanity,<br/>" +
                "let us all pledge to beat Corona back.<br/>" +
                "<br/>" +
                "Acknowledge the issue, care for precautions,<br/>" +
                "act in the best health interests of your society<br/>" +
                "and isolated, yet together, we shall hurt Corona.</html>",SwingConstants.CENTER);
        label1.setSize(288,195);
        label1.setLocation(240,10);
        label1.setBackground(new Color(196,196,196));
        label1.setOpaque(true);
        broadcastpanel.add(label1);

        JLabel label2 = new JLabel("11 june, 10.02 am");
        label2.setSize(184,23);
        label2.setLocation(540,185);
        label2.setBackground(new Color(255,255,255));
        label2.setOpaque(true);
        broadcastpanel.add(label2);

        JLabel label3 = new JLabel("<html><b>COVID 19</b><br/>" +
                "<br/><br/>"+
                "1. HANDS Wash them often<br/>" +
                "2. ELBOW Cough into it<br/>" +
                "3. FACE Don't touch it<br/>" +
                "4. SPACE Keep safe distance<br/>" +
                "5. FEEL sick? Stay home</html>",SwingConstants.CENTER);
        label3.setSize(185,150);
        label3.setLocation(343,220);
        label3.setBackground(new Color(196,196,196));
        label3.setOpaque(true);
        broadcastpanel.add(label3);

        JLabel label4 = new JLabel("25 mar, 1.29 pm");
        label4.setSize(184,23);
        label4.setLocation(540,352);
        label4.setBackground(new Color(255,255,255));
        label4.setOpaque(true);
        broadcastpanel.add(label4);

        JLabel label5 = new JLabel("<html><b>Scientists Are Trying to See Our Dreams</b><br/><br/>"+
                "<b>DO ANDROIDS</b>, AS sci-fi novelist Philip K. Dick asked, really dream of electric sheep?<br/>" +
                "The purpose and meaning of dreams have long been debated. Now scientists are getting<br/>" +
                "closer to deciphering what humans see as they sleep—and how a robot can simulate it.<br/>"+
                ".............</html>",SwingConstants.CENTER);
        label5.setSize(505,120);
        label5.setLocation(23,385);
        label5.setBackground(new Color(196,196,196));
        label5.setOpaque(true);
        broadcastpanel.add(label5);

        JLabel label6 = new JLabel("22 mar, 12.47 pm");
        label6.setSize(184,23);
        label6.setLocation(540,482);
        label6.setBackground(new Color(255,255,255));
        label6.setOpaque(true);
        broadcastpanel.add(label6);

        entry = new JTextArea();
        entry.setSize(270,414);
        entry.setLocation(720,120);
        entry.setFont(new Font("Roboto", Font.PLAIN, 20));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("broadcast message");
        entry.setBorder(title1);
        add(entry);

        addbutton = new JButton("    ADD EXAM NOTICE");
        addbutton.setLocation(24,595);
        addbutton.setSize(958,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);

        setBackground(new Color(255,255,255));
    }// </editor-fold>

    // Variables declaration - do not modify
//    public static JButton jButton1;
    private static JLabel searchlabel;
    public static JTextField searchbar;
    public static JButton searchbutton;
    public static JButton addbutton;
    public static JPanel panel;
    public static JPanel broadcastpanel;
    public static JTextArea entry;
    // End of variables declaration
}