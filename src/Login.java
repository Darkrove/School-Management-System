/*
  @author Sajjad
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Login extends JFrame implements ActionListener {
    // Variables declaration - do not modify
    private final JButton button;
    private final JTextField mail;
    private final JPasswordField password;
    private final JButton close;
    // End of variables declaration
    public Login() {

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(67,67,89));
        jPanel1.setLocation(0,0);
        jPanel1.setSize(400,700);
        add(jPanel1);

        /*
          Creates new form Login
         */

        JLabel jLabel1 = new JLabel("");
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/img/Group-24.png")));
//        jLabel1.setSize(260,200);
        jPanel1.add(jLabel1);

        JLabel jLabel2 = new JLabel("Sign in");
        jLabel2.setLocation(788,114);
        jLabel2.setFont(new Font("Roboto", Font.PLAIN, 40));
        jLabel2.setSize(121,47);
        add(jLabel2);

        JLabel jLabel3 = new JLabel("");
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/img/icons8_user_48px.png")));
        jLabel3.setLocation(504,238);
        jLabel3.setSize(60,60);
        add(jLabel3);

        JLabel jLabel4 = new JLabel("");
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/img/lock_48px.png")));
        jLabel4.setLocation(504,361);
        jLabel4.setSize(60,60);
        add(jLabel4);


        mail = new JTextField();
        mail.setLocation(572,235);
        mail.setSize(554,74);
//        mail.setBorder(null);
        mail.setFont(new Font("Roboto`", Font.PLAIN, 25));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("Email address*");
        mail.setBorder(title1);
        add(mail);

        password = new JPasswordField();
        password.setLocation(572,358);
//        password.setBorder(null);
        password.setFont(new Font("Roboto", Font.PLAIN, 25));
        password.setSize(554,74);
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder("Password*");
        password.setBorder(title2);
        add(password);

        button = new JButton("SIGN IN");
        button.setLocation(572,506);
        button.setSize(554,74);
        button.setFont(new Font("Roboto", Font.PLAIN, 25));
        button.setBackground(new Color(67,67,89));
        button.setForeground(new Color(255,255,255));
        add(button);
        button.addActionListener(this);

        JLabel jLabel7 = new JLabel("Forgot password?");
        jLabel7.setLocation(572,580);
        jLabel7.setFont(new Font("Roboto", Font.PLAIN, 17));
        jLabel7.setSize(160,23);
        add(jLabel7);

        JLabel jLabel8 = new JLabel("Don't have an account? Sign Up");
        jLabel8.setLocation(894,580);
        jLabel8.setFont(new Font("Roboto", Font.PLAIN, 17));
        jLabel8.setSize(278,23);
        add(jLabel8);

        close = new JButton();
        close.setLocation(1250, 7);
        close.setSize(40,40);
        close.setBackground(new Color(67,67,89));
        close.setForeground(new Color(255,255,255));
        close.setBorder(null);
        close.setFont(new Font("Roboto", Font.PLAIN, 25));
        close.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_delete_26px_1.png")));
        add(close);
        close.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { CloseMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { CloseMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { CloseMouseExited(evt);}
        });

        setTitle("Login");
        URL iconURL = getClass().getResource("/HomeImages/icons8_login_52px_1(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setUndecorated(true);
//        getRootPane().setBorder(BorderFactory.createMatteBorder(15,0,15,15,new Color(67,67,89)));
        setSize(1300,700);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,255,255));
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void CloseMouseEntered(MouseEvent evt) {
        close.setBackground(Color.red);
    }
    private void CloseMouseExited(MouseEvent evt) {
        close.setBackground(new Color(67,67,89));
    }

    private void CloseMouseCLicked(MouseEvent evt) {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e){
;        if(e.getSource()==button){
            //mail JTextField variable
            if (mail.getText().equals("samaralishaikh212@gmail.com") || mail.getText().equals("admin")) {
                //password JPassword variable
                if (String.valueOf(password.getPassword()).equals("admin")){
                    JOptionPane.showMessageDialog(this, "logged in successfully!");
                    new Menu().setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Wrong password");
                    password.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Wrong email id");
                mail.setText("");
                password.setText("");
            }
        }
    }

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

}
