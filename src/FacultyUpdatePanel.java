import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;

public class FacultyUpdatePanel extends JPanel {
    public FacultyUpdatePanel(){ initComponents(); }

    private void initComponents() {
        setLayout(null);
        setBackground(new Color(255,255,255));

        backbutton = new JButton("BACK");
        backbutton.setBounds(70, 31, 100, 50);
        add(backbutton);
        backbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { BackButtonClickd(evt); }
        });

        id = new JTextField();
        id.setBounds(70, 117, 300, 70);
        add(id);
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder("id");
        id.setBorder(title1);
        Color color = this.getBackground();
        id.setBackground(color);
        id.setEditable(false);

        firstname = new JTextField();
        firstname.setBounds(632, 117, 300, 70);
        add(firstname);
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder("first name");
        firstname.setBorder(title2);
        firstname.setBackground(color);

        lastname = new JTextField();
        lastname.setBounds(70, 208, 300, 70);
        add(lastname);
        TitledBorder title3;
        title3 = BorderFactory.createTitledBorder("last name");
        lastname.setBorder(title3);
        lastname.setBackground(color);

        salary = new JTextField();
        salary.setBounds(632, 208, 300, 70);
        add(salary);
        TitledBorder title4;
        title4 = BorderFactory.createTitledBorder("salary");
        salary.setBorder(title4);
        salary.setBackground(color);

        designation = new JTextField();
        designation.setBounds(70, 300, 300, 70);
        add(designation);
        TitledBorder title5;
        title5 = BorderFactory.createTitledBorder("designation");
        designation.setBorder(title5);
        designation.setBackground(color);

        subject = new JTextField();
        subject.setBounds(632, 300, 300, 70);
        add(subject);
        TitledBorder title6;
        title6 = BorderFactory.createTitledBorder("subject");
        subject.setBorder(title6);
        subject.setBackground(color);

        dob = new JTextField();
        dob.setBounds(70, 391, 300, 70);
        add(dob);
        TitledBorder title7;
        title7 = BorderFactory.createTitledBorder("dob(mm/dd/yyyy)");
        dob.setBorder(title7);
        dob.setBackground(color);

        phone = new JTextField();
        phone.setBounds(632, 391, 300, 70);
        add(phone);
        TitledBorder title8;
        title8 = BorderFactory.createTitledBorder("phone");
        phone.setBorder(title8);
        phone.setBackground(color);

        email = new JTextField();
        email.setBounds(351, 483, 300, 70);
        add(email);
        TitledBorder title9;
        title9 = BorderFactory.createTitledBorder("email");
        email.setBorder(title9);
        email.setBackground(color);

        updatebutton = new JButton("    UPDATE RECORD");
        updatebutton.setBounds(351, 583, 300, 70);
        updatebutton.setIcon(new ImageIcon(getClass().getResource("/img/refresh_45px.png")));
        add(updatebutton);
        updatebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { UpdateButtonClickd(evt); }
        });
    }

    private void UpdateButtonClickd(MouseEvent evt) {
        if (id.getText().isEmpty() ||
                firstname.getText().isEmpty() ||
                lastname.getText().isEmpty() ||
                salary.getText().isEmpty() ||
                designation.getText().isEmpty() ||
                subject.getText().isEmpty() ||
                dob.getText().isEmpty() ||
                phone.getText().isEmpty() ||
                email.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all values!");
        } else {
            if(isId(id.getText())) {
                if (isWord(firstname.getText()) && isWord(lastname.getText())) {
                    if (isNumber(salary.getText())) {
                        if (isWord(designation.getText())) {
                            if (isWord(subject.getText())) {
                                if (isDate(dob.getText())) {
                                    if (isPhoneNumber(phone.getText())) {
                                        if (isEmail(email.getText())) {
                                            JOptionPane.showMessageDialog(this, "record updated successfully!");
                                            FacultyPanel FACULTY = new FacultyPanel();
                                            Menu.JBody.removeAll();
                                            Menu.JBody.repaint();
                                            Menu.JBody.revalidate();
                                            Menu.JBody.add(FACULTY);
                                            Menu.JBody.repaint();
                                            FacultyPanel.tableModel.setValueAt(id.getText(), FacultyPanel.i, 0);
                                            FacultyPanel.tableModel.setValueAt(firstname.getText(), FacultyPanel.i, 1);
                                            FacultyPanel.tableModel.setValueAt(lastname.getText(), FacultyPanel.i, 2);
                                            FacultyPanel.tableModel.setValueAt(salary.getText(), FacultyPanel.i, 3);
                                            FacultyPanel.tableModel.setValueAt(designation.getText(), FacultyPanel.i, 4);
                                            FacultyPanel.tableModel.setValueAt(subject.getText(), FacultyPanel.i, 5);
                                            FacultyPanel.tableModel.setValueAt(dob.getText(), FacultyPanel.i, 6);
                                            FacultyPanel.tableModel.setValueAt(phone.getText(), FacultyPanel.i, 7);
                                            FacultyPanel.tableModel.setValueAt(email.getText(), FacultyPanel.i, 8);
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Invalid Email!");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Invalid Phone Number!");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Invalid Date!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Invalid Subject!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid Designation!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Salary!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Name!");
                }
            } else{
                JOptionPane.showMessageDialog(this, "Invalid Id!");
            }
        }
    }

    private static boolean isId(String in)
    {
        return Pattern.matches("^f20[0-9]+",in);
    }
    private static boolean isWord(String in)
    {
        return Pattern.matches("[a-zA-Z]+",in);
    }
    private static boolean isNumber(String in)
    {
        return Pattern.matches("[0-9]+",in);
    }
    private static boolean isDate(String in)
    {
        return Pattern.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", in);
    }
    private static boolean isPhoneNumber(String in)
    {
        return Pattern.matches("(0/91)?[7-9][0-9]{9}", in);
    }
    private static boolean isEmail(String in)
    {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",in);
    }

    private void BackButtonClickd(MouseEvent evt) {
        FacultyPanel FACULTY = new FacultyPanel();
        Menu.JBody.removeAll();
        Menu.JBody.repaint();
        Menu.JBody.revalidate();
        Menu.JBody.add(FACULTY);
        Menu.JBody.repaint();
    }

    private JButton backbutton;
    public static JTextField id;
    public static JTextField firstname;
    public static JTextField lastname;
    public static JTextField salary;
    public static JTextField designation;
    public static JTextField subject;
    public static JTextField dob;
    public static JTextField phone;
    public static JTextField email;
    private JButton updatebutton;

}
