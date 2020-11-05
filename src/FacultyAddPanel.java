import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.regex.Pattern;

public class FacultyAddPanel extends JPanel {
    public FacultyAddPanel(){ initComponents(); }

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

        addbutton = new JButton("    ADD RECORD");
        addbutton.setBounds(351, 583, 300, 70);
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { AddButtonClickd(evt); }
        });
    }

    private void AddButtonClickd(MouseEvent evt) {
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

                                            String filePath = "faculty.txt";
                                            File file = new File(filePath);

                                            try{
                                                BufferedReader br = new BufferedReader(new FileReader(file));
                                                // get lines from txt file
                                                Object[] tableLines = br.lines().toArray();
                                                BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
                                                output.append("\n");
                                                output.append(id.getText()+","+
                                                        firstname.getText()+","+
                                                        lastname.getText()+","+
                                                        salary.getText()+","+
                                                        designation.getText()+","+
                                                        subject.getText()+","+
                                                        dob.getText()+","+
                                                        phone.getText()+","+
                                                        email.getText());
                                                output.close();
                                                JOptionPane.showMessageDialog(this, "record added successfully!");
                                                FacultyPanel FACULTY = new FacultyPanel();
                                                Menu.JBody.removeAll();
                                                Menu.JBody.repaint();
                                                Menu.JBody.revalidate();
                                                Menu.JBody.add(FACULTY);
                                                Menu.JBody.repaint();
                                            } catch (Exception ex) {
                                                System.out.println(ex);
                                            }
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

    private void BackButtonClickd(MouseEvent evt) {
        FacultyPanel FACULTY = new FacultyPanel();
        Menu.JBody.removeAll();
        Menu.JBody.repaint();
        Menu.JBody.revalidate();
        Menu.JBody.add(FACULTY);
        Menu.JBody.repaint();
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

    private JButton backbutton;
    private JTextField id;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField salary;
    private JTextField designation;
    private JTextField subject;
    private JTextField dob;
    private JTextField phone;
    private JTextField email;
    private JButton addbutton;
}
