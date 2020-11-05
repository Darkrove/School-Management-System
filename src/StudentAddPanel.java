import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.regex.Pattern;


public class StudentAddPanel extends JPanel {
    public StudentAddPanel(){ initComponents(); }

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

        sclass = new JTextField();
        sclass.setBounds(632, 208, 300, 70);
        add(sclass);
        TitledBorder title4;
        title4 = BorderFactory.createTitledBorder("class");
        sclass.setBorder(title4);
        sclass.setBackground(color);

        address = new JTextField();
        address.setBounds(70, 300, 300, 70);
        add(address);
        TitledBorder title5;
        title5 = BorderFactory.createTitledBorder("address");
        address.setBorder(title5);
        address.setBackground(color);

        hobby = new JTextField();
        hobby.setBounds(632, 300, 300, 70);
        add(hobby);
        TitledBorder title6;
        title6 = BorderFactory.createTitledBorder("hobby");
        hobby.setBorder(title6);
        hobby.setBackground(color);

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
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        addbutton.setBounds(351, 583, 300, 70);
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) { AddButtonClickd(evt); }
        });
    }

    private void AddButtonClickd(MouseEvent evt) {
//        JOptionPane.showMessageDialog(this, "record added successfully!");
//        StudentPanel STUDENT = new StudentPanel();
//        Menu.JBody.removeAll();
//        Menu.JBody.repaint();
//        Menu.JBody.revalidate();
//        Menu.JBody.add(STUDENT);
//        Menu.JBody.repaint();
//        StudentPanel.tbModel.insertRow(StudentPanel.tbModel.getRowCount(), new Object[] {
//                id.getText(),
//                firstname.getText(),
//                lastname.getText(),
//                sclass.getText(),
//                address.getText(),
//                hobby.getText(),
//                dob.getText(),
//                phone.getText(),
//                email.getText()
//        });
        if (id.getText().isEmpty() ||
                firstname.getText().isEmpty() ||
                lastname.getText().isEmpty() ||
                sclass.getText().isEmpty() ||
                address.getText().isEmpty() ||
                hobby.getText().isEmpty() ||
                dob.getText().isEmpty() ||
                phone.getText().isEmpty() ||
                email.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all values!");
        } else {
            if(isId(id.getText())) {
                if (isWord(firstname.getText()) && isWord(lastname.getText())) {
                    if (isClass(sclass.getText())) {
                        if (isWord(address.getText())) {
                            if (isWord(hobby.getText())) {
                                if (isDate(dob.getText())) {
                                    if (isPhoneNumber(phone.getText())) {
                                        if (isEmail(email.getText())) {

                                            String filePath = "student.txt";
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
                                                        sclass.getText()+","+
                                                        address.getText()+","+
                                                        hobby.getText()+","+
                                                        dob.getText()+","+
                                                        phone.getText()+","+
                                                        email.getText());
                                                output.close();
                                                JOptionPane.showMessageDialog(this, "record added successfully!");
                                                StudentPanel STUDENT = new StudentPanel();
                                                Menu.JBody.removeAll();
                                                Menu.JBody.repaint();
                                                Menu.JBody.revalidate();
                                                Menu.JBody.add(STUDENT);
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
                                JOptionPane.showMessageDialog(this, "Invalid Hobby!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid Address!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Class!");
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
        return Pattern.matches("^c50[0-9]+",in);
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
    private static boolean isClass(String in) { return Pattern.matches("[0-9]+[a-z]+", in); }
    private static boolean isPhoneNumber(String in)
    {
        return Pattern.matches("(0/91)?[7-9][0-9]{9}", in);
    }
    private static boolean isEmail(String in)
    {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",in);
    }

    private void BackButtonClickd(MouseEvent evt) {
        StudentPanel STUDENT = new StudentPanel();
        Menu.JBody.removeAll();
        Menu.JBody.repaint();
        Menu.JBody.revalidate();
        Menu.JBody.add(STUDENT);
        Menu.JBody.repaint();
    }

    public JButton backbutton;
    public JTextField id;
    public JTextField firstname;
    public JTextField lastname;
    public JTextField sclass;
    public JTextField address;
    public JTextField hobby;
    public JTextField dob;
    public JTextField phone;
    public JTextField email;
    public JButton addbutton;

}
