import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;


public class EventPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyPanel
     */
    public EventPanel() {
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

        eventpanel = new JPanel();
        eventpanel.setPreferredSize(new Dimension(838,1220));
//        newspanel.setLocation(24, 120);
        eventpanel.setBackground(new Color(255,255,255));
        eventpanel.setLayout(null);
//        newspanel.setBorder(BorderFactory.createMatteBorder(
//                2, 8, 2, 2, new Color(67,67,84)));
        panel.add(eventpanel);

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/HomeImages/event/FRESHER'S PARTY 2018.jpg"));
        JLabel label1 = new JLabel(icon1, JLabel.CENTER);
        label1.setBackground(Color.gray);
        label1.setOpaque(true);
        eventpanel.add(label1);
        label1.setBounds(20, 20, 526, 274);
//
        JLabel label2 = new JLabel("<html>https://youtu.be/UVFAPc3ZMc0<br/>" +
                "Ruia has been known to be welcoming. Don't<br/>believe us? Catch a glimpse of this lit party<br/>and see it yourself, the magic of RUIA!<br/>" +
                "The freshers of Ruia college had a<br/>bash with Melvin Louis and many known<br/>celebrities." +
                "The evening was organised by the <br/>Ruia's Student Council teams.</html>",SwingConstants.LEFT);
        label2.setBackground(Color.WHITE);
        label2.setOpaque(true);
        label2.setForeground(Color.GRAY);
        label2.setFont(new Font("Roboto", Font.PLAIN, 15));
        eventpanel.add(label2);
        label2.setBounds(565, 20, 526, 160);
//
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/HomeImages/event/Utsav Aarohan 2018.jpg"));
        JLabel label3 = new JLabel(icon2, JLabel.CENTER);
        label3.setBackground(Color.gray);
        label3.setOpaque(true);
        eventpanel.add(label3);
        label3.setBounds(20, 320, 526, 274);

        JLabel label4 = new JLabel("<html>https://youtu.be/r3L70kPMsD0<br/>" +
                "<b>The Utsav Aarohan</b> After Movie 2018 is here!<br/>" +
                "See Mumbai's First College celebrating Silent DJ unfold!<br/>" +
                "Click on the link above.<br/>" +
                "Please Like and Share the video!<br/>" +
                "#silentdj #Ruiacollege #ruia #mumbai</html>",SwingConstants.LEFT);
        label4.setBackground(Color.WHITE);
        label4.setOpaque(true);
        label4.setForeground(Color.GRAY);
        label4.setFont(new Font("Roboto", Font.PLAIN, 15));
        eventpanel.add(label4);
        label4.setBounds(565, 320, 526, 117);
//
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/HomeImages/event/Utsav Aarohan 2017.jpg"));
        JLabel label5 = new JLabel(icon3, JLabel.CENTER);
        label5.setBackground(Color.gray);
        label5.setOpaque(true);
        eventpanel.add(label5);
        label5.setBounds(20, 620, 526, 274);
//
        JLabel label6 = new JLabel("<html>https://youtu.be/gUufeCDHn7U<br/>" +
                "Ramnarain Ruia Autonomous College's<br/>" +
                "<b>Utsav Aarohan 2017</b><br/>" +
                "The Official After Movie is finally here!<br/>" +
                "Catch it right away!</html>");
        label6.setBackground(Color.white);
        label6.setOpaque(true);
        label6.setForeground(Color.gray);
        label6.setFont(new Font("Roboto", Font.PLAIN, 15));
        eventpanel.add(label6);
        label6.setBounds(565, 620, 526, 107);

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/HomeImages/event/pro night.jpg"));
        JLabel label7 = new JLabel(icon4, JLabel.CENTER);
        label7.setBackground(Color.gray);
        label7.setOpaque(true);
        eventpanel.add(label7);
        label7.setBounds(20, 920, 526, 274) ;

        JLabel label8 = new JLabel("<html>GRAB YOUR PASSES TODAY! LAST DAY!<br/>" +
                "<br/>" +
                "*Buy a Pro Night pass and get a <br/>Stereostorm pass FREE!!<br/>" +
                "#UA2016 #UtsavAarohan16</html>>");
        label8.setBackground(Color.white);
        label8.setOpaque(true);
        label8.setForeground(Color.gray);
        label8.setFont(new Font("Roboto", Font.PLAIN, 15));
        eventpanel.add(label8);
        label8.setBounds(565, 920, 526, 97);

        entry = new JTextField();
        entry.setSize(620,80);
        entry.setLocation(24,545);
//        entry.setBorder(BorderFactory.createMatteBorder(
//                2, 2, 2, 2, new Color(67,67,84)));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("event details");
        entry.setBorder(title1);
        Color color = this.getBackground();
        entry.setBackground(color);
        add(entry);

        JButton button = new JButton("Upload Image!");
        button.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_upload_26px.png")));
        button.setBounds(28,630, 200, 40);
        label = new JLabel();
        label.setBounds(240,630, 500, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                fileChooser.addChoosableFileFilter(new ImageFilter());
                fileChooser.setAcceptAllFileFilterUsed(false);

                int option = fileChooser.showOpenDialog(getParent());
                if(option == JFileChooser.APPROVE_OPTION){
                    file = fileChooser.getSelectedFile();
                    label.setText("File Selected: " + file.getName());
                    System.out.println(file.getPath());
                }else{
                    label.setText("Open command canceled");
                }
            }
        });
        add(button);
        add(label);

        addbutton = new JButton("    ADD EVENT");
        addbutton.setLocation(720,558);
        addbutton.setSize(270,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { AddButtonClickd(evt); }
        });

        setBackground(new Color(255,255,255));
    }// </editor-fold>

    private void AddButtonClickd(MouseEvent evt) {
        if (entry.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "please enter events details");
        }else {
            y1 = y1 + 300;
            ImageIcon icon = new ImageIcon(file.getPath());
            JLabel labelevent1 = new JLabel(icon, JLabel.CENTER);
            labelevent1.setBackground(Color.gray);
            labelevent1.setOpaque(true);
            eventpanel.add(labelevent1);
            labelevent1.setBounds(20, y1, 526, 274);

            JLabel labelevent2 = new JLabel(entry.getText());
            labelevent2.setBackground(Color.white);
            labelevent2.setOpaque(true);
            labelevent2.setForeground(Color.gray);
            labelevent2.setFont(new Font("Roboto", Font.PLAIN, 15));
            eventpanel.add(labelevent2);
            labelevent2.setBounds(565, y1, 526, 97);

            entry.setText("");
            label.setText("");
            dim = dim + 300;
            eventpanel.setPreferredSize(new Dimension(838, dim));
            JOptionPane.showMessageDialog(this, "event added successfully!");
        }
    }

    // Variables declaration - do not modify
//    public static JButton jButton1;
    private static JLabel searchlabel;
    public static JTextField searchbar;
    public static JButton searchbutton;
    public static JButton addbutton;
    public static JPanel panel;
    public static JPanel eventpanel;
    public static JTextField entry;
    public static JFileChooser fileChooser;
    public static File file;
    public static JLabel label;
    public static int y1 = 920;
    public static int dim =  1220;
    // End of variables declaration
}

class ImageFilter extends FileFilter {
    public final static String JPEG = "jpeg";
    public final static String JPG = "jpg";
    public final static String GIF = "gif";
    public final static String TIFF = "tiff";
    public final static String TIF = "tif";
    public final static String PNG = "png";

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals(TIFF) ||
                    extension.equals(TIF) ||
                    extension.equals(GIF) ||
                    extension.equals(JPEG) ||
                    extension.equals(JPG) ||
                    extension.equals(PNG)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Image Only";
    }

    String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}