import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudentPanel extends javax.swing.JPanel {

    private TableRowSorter<TableModel> rowSorter;

    /**
     * Creates new form FacultyPanel
     */
    public StudentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        setLayout(null);
        searchlabel = new JLabel();
        searchlabel = new JLabel("search");
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

        searchbar.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = searchbar.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = searchbar.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    try {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                    } catch (Exception ex) {
                        System.out.println("got an error!");
                    }
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });


//        String[][] data ={
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50101","Kevin","Shaikh","1st","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50102","Kevin","Shaikh","4th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50103","Kevin","Shaikh","9th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50104","Kevin","Shaikh","2nd","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50105","Kevin","Shaikh","8th","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50106","Kevin","Shaikh","10th","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50107","Kevin","Shaikh","4th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50108","Kevin","Shaikh","3rd","Professor","null","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50109","Kevin","Shaikh","2nd","Professor","Python","11.11.00","8433624344","samaralishaikh212@gmail.com"},
//                {"c50110","Kevin","Shaikh","8th","Professor","Java","11.11.00","8433624344","samaralishaikh212@gmail.com"}
//        };
//        String[] column ={"ID","FIRST NAME","LAST NAME","CLASS","ADDRESS","HOBBY","DOB","PHONE","MAIL"};
        tbModel = new DefaultTableModel();
        jt=new JTable(tbModel);
        jt.setCellSelectionEnabled(true);

        tbModel.addColumn("ID");
        tbModel.addColumn("FIRST NAME");
        tbModel.addColumn("LAST NAME");
        tbModel.addColumn("CLASS");
        tbModel.addColumn("ADDRESS");
        tbModel.addColumn("HOBBY");
        tbModel.addColumn("DOB");
        tbModel.addColumn("PHONE");
        tbModel.addColumn("MAIL");

//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50101","Kevin","Louis","2nd","Dombivli","Java","11.03.07","9856412378","kevinlouis@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50102","Owen","Wilson","3rd","Kurla","Ruby","01.05.10","9084128945","owen2020@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50103","Edward","Gibson","7th","Thane","Python","09.04.98","8085612875","edgibson@yahoo.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50104","Antonio","Daniel","3rd","Parel","Swift","03.06.01","989654738","antoniog@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50105","Aaron","Neville","8th","Mahim","JavaScript","07.03.05","7021658935","aaronneville@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50106","Devin","Noah","4th","Sion","C Language","05.05.07","902264821","devinnoah@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50107","Marco","Leo","9th","Bandra","C++","02.12.04","9867756948","marcoleo@yahoo.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50108","Steffan","Black","10th","Andheri","HTML","18.10.01","9892566915","steffanblack@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50109","John","Oliver","4th","Borivali","PHP","14.10.10","989267564","johnoliver@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50110","Elizabeth","Olivia","7th","Vasai","SQL","08.07.06","9022468892","elizabetholivia@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50111","Walter","Joseph","9th","Parel","MATLAB","03.02.08","8082295648","walterjoseph@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50112","Harry","Alexander","5th","Mercury","Java","22.04.07","968459267","harryalexander@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50113","Michael","Archie","10th","Byculla","PHP","30.05.14","9493516853","michaelarchie@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50114","Emma","Grace","3rd","Vashi","Python","07.06.10","9451238769","emmagrace@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50115","David","William","5th","Powai","Swift","28.11.07","9359789957","davidwilliam@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50116","Susan","Ella","10th","Vikhroli","Ruby","01.11.00","9236985847","susanella@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50117","Albert","Henry","2nd","Mulund","PHP","18.01.01","9156978963","alberthenry@gmail.com"});
//        tbModel.insertRow(tbModel.getRowCount(), new Object[] {"c50118","Hannah","Ruby","3rd","Vile Parle","R","12.02.12","9985946785","hannahruby@gmail.com"});
        String filePath = "student.txt";
        File file = new File(filePath);

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                tbModel.addRow(dataRow);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

//        center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        JTableHeader header = jt.getTableHeader();
        header.setDefaultRenderer(new BookPanel.HeaderRenderer(jt));


        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(7).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(8).setCellRenderer( centerRenderer );

//        row height
        jt.setRowHeight(30);

        jt.setFont(new Font("Roboto", Font.PLAIN, 15));
        jt.setBackground(new Color(255,255,255));
        ListSelectionModel select= jt.getSelectionModel();


        JTableHeader tableHeader = jt.getTableHeader();
        tableHeader.setFont(new Font("Roboto", Font.BOLD, 15));

        rowSorter = new TableRowSorter<>(jt.getModel());
        jt.setRowSorter(rowSorter);

        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int k : row) {
                    for (int i : columns) {
                        Data = (String) jt.getValueAt(k, i);
                    }
                }
                System.out.println("Table element selected is: " + Data);
            }
        });

        JScrollPane sp=new JScrollPane(jt);
        sp.setLocation(24,120);
        sp.setSize(978,434);
        add(sp);

        addbutton = new JButton("    ADD NEW STUDENT");
        addbutton.setLocation(24,586);
        addbutton.setSize(270,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { AddStudentMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { AddStudentMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { AddStudentMouseExited(evt);}
        });

        updatebutton = new JButton("    UPDATE RECORDS");
        updatebutton.setLocation(378,586);
        updatebutton.setSize(270,60);
        updatebutton.setBorder(null);
        updatebutton.setBackground(new Color(196,196,196));
        updatebutton.setIcon(new ImageIcon(getClass().getResource("/img/refresh_45px.png")));
        add(updatebutton);
        updatebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { UpdateStudentMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { UpdateStudentMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { UpdateStudentMouseExited(evt);}
        });

        removebutton = new JButton("    REMOVE RECORDS");
        removebutton.setLocation(731,586);
        removebutton.setSize(270,60);
        removebutton.setBorder(null);
        removebutton.setBackground(new Color(196,196,196));
        removebutton.setIcon(new ImageIcon(getClass().getResource("/img/delete_52px.png")));
        add(removebutton);
        removebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { RemoveStudentMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { RemoveStudentMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { RemoveStudentMouseExited(evt);}
        });

        setBackground(new Color(255,255,255));
    }// </editor-fold>

    private void RemoveStudentMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void RemoveStudentMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void RemoveStudentMouseCLicked(MouseEvent evt) {
        String student_id;
        student_id = JOptionPane.showInputDialog(this,"Student id: ");
        if(student_id.isEmpty()){
            System.out.println("empty");
        }else {
            int j;
            for (j=0;j<18;j++){
                String text = tbModel.getValueAt(j, 0).toString();
                if (text.equals(student_id)){
                    tbModel.removeRow(j);
                    JOptionPane.showMessageDialog(this, "Record with id  '" + student_id + "' deleted successfully!");
                    break;
                }
            }
        }
    }

    private void UpdateStudentMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateStudentMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateStudentMouseCLicked(MouseEvent evt) {
        j = jt.getSelectedRow();
        System.out.println(j);
        if (j>=0){
            StudentUpdatePanel UPDATESTU = new StudentUpdatePanel();
            Menu.JBody.removeAll();
            Menu.JBody.repaint();
            Menu.JBody.revalidate();
            Menu.JBody.add(UPDATESTU);
            Menu.JBody.repaint();
            StudentUpdatePanel.id.setText(tbModel.getValueAt(j,0).toString());
            StudentUpdatePanel.firstname.setText(tbModel.getValueAt(j,1).toString());
            StudentUpdatePanel.lastname.setText(tbModel.getValueAt(j,2).toString());
            StudentUpdatePanel.sclass.setText(tbModel.getValueAt(j,3).toString());
            StudentUpdatePanel.address.setText(tbModel.getValueAt(j,4).toString());
            StudentUpdatePanel.hobby.setText(tbModel.getValueAt(j,5).toString());
            StudentUpdatePanel.dob.setText(tbModel.getValueAt(j,6).toString());
            StudentUpdatePanel.phone.setText(tbModel.getValueAt(j,7).toString());
            StudentUpdatePanel.email.setText(tbModel.getValueAt(j,8).toString());
        } else {
            JOptionPane.showMessageDialog(this, "select row you want to update!");
        }
    }

    private void AddStudentMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void AddStudentMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void AddStudentMouseCLicked(MouseEvent evt) {
        StudentAddPanel ADDSTU = new StudentAddPanel();
        Menu.JBody.removeAll();
        Menu.JBody.repaint();
        Menu.JBody.revalidate();
        Menu.JBody.add(ADDSTU);
        Menu.JBody.repaint();
    }

    // Variables declaration - do not modify                     
//    public static JButton jButton1;
    private static JLabel searchlabel;
    public static JTextField searchbar;
    public static JButton searchbutton;
    public static JTable jt;
    public static JButton addbutton;
    public static JButton updatebutton;
    public static JButton removebutton;
    public static DefaultTableModel tbModel;
    public static int j;
    // End of variables declaration
}