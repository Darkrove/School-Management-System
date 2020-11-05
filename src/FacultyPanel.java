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

public class FacultyPanel extends javax.swing.JPanel {

    private TableRowSorter<TableModel> rowSorter;

    /**
     * Creates new form FacultyPanel
     */
    public FacultyPanel() {
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


//        searchbar.setBounds(24, 35, 331, 45);

        tableModel = new DefaultTableModel();
        jt=new JTable(tableModel);
        jt.setCellSelectionEnabled(true);

        tableModel.addColumn("ID");
        tableModel.addColumn("FIRST NAME");
        tableModel.addColumn("LAST NAME");
        tableModel.addColumn("SALARY");
        tableModel.addColumn("DESIGNATION");
        tableModel.addColumn("SUBJECT");
        tableModel.addColumn("DOB");
        tableModel.addColumn("PHONE");
        tableModel.addColumn("MAIL");

//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20101","Teresa","Butler","67000","Professor","C++","12/02/2012","9985946785","teresabutler@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20102","Harold","Simmons","17000","Peon","null","18/01/2001","9156978963","haroldsimmons@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20103","Ashley","Flores","60000","Professor","Python","20/11/2000","9236985847","ashleyflores@yahoo.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20104","Peter","Nicole","73000","Accountant","null","28/11/2007","9359789957","peternicole@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20105","Rose","Hughes","47000","Professor","Java","07/06/2010","9451238769","rosehughes@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20106","Juliana","Bryant","19000","Peon","null","30/05/2014","9493516853","julianabryant@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20107","Alice","Patterson","50000","Professor","Python","22/04/2007","968459267","alicepatterson@yahoo.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20108","Gloria","Jenkins","93000","Professor","JavaScript","03/02/2008","8082295648","gloriajenkins@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20109","Luna","Watkins","78000","Professor","PHP","08/07/2006","9022468892","lunawatkins@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20110","Paul","Ward","44000","Professor","Swift","14/10/2010","989267564","paulward@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20111","Ricardo","Murphy","37000","Professor","MATLAB","18/10/2001","9892566915","ricardomurphy@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20112","Hector","Bailey","84000","Professor","C Language","02/12/2004","9867756948","hectorbaily@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20113","Alexis","Bell","19000","Peon","null","05/05/2007","902264821","alexisbell@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20114","Scott","Tucker","64000","Accountant","null","07/03/2005","7021658935","scotttucker@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20115","Martin","Hicks","14000","Peon","null","03/06/2001","9867756948","martinhicks@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20116","Charlie","Murray","86000","Professor","Swift","09/04/1998","8085612875","charliemurray@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20117","Jeoy","Peterson","12000","Peon","null","01/05/2010","9084128945","joeypeterson@gmail.com"});
//        tableModel.insertRow(tableModel.getRowCount(), new Object[] {"f20118","Elena","Gilbert","43000","Professor","R","11/03/2007","9856412378","elenagilbert@gmail.com"});

        String filePath = "faculty.txt";
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
                tableModel.addRow(dataRow);
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

        addbutton = new JButton("    ADD NEW FACULTY");
        addbutton.setLocation(24,586);
        addbutton.setSize(270,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);
        addbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { AddFacultyMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { AddFacultyMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { AddFacultyMouseExited(evt);}
        });

        updatebutton = new JButton("    UPDATE RECORDS");
        updatebutton.setLocation(378,586);
        updatebutton.setSize(270,60);
        updatebutton.setBorder(null);
        updatebutton.setBackground(new Color(196,196,196));
        updatebutton.setIcon(new ImageIcon(getClass().getResource("/img/refresh_45px.png")));
        add(updatebutton);
        updatebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { UpdateFacultyMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { UpdateFacultyMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { UpdateFacultyMouseExited(evt);}
        });

        removebutton = new JButton("    REMOVE RECORDS");
        removebutton.setLocation(731,586);
        removebutton.setSize(270,60);
        removebutton.setBorder(null);
        removebutton.setBackground(new Color(196,196,196));
        removebutton.setIcon(new ImageIcon(getClass().getResource("/img/delete_52px.png")));
        add(removebutton);
        removebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { RemoveFacultyMouseCLicked(evt); }
            public void mouseEntered(MouseEvent evt) { RemoveFacultyMouseEntered(evt); }
            public void mouseExited(MouseEvent evt) { RemoveFacultyMouseExited(evt);}
        });

        setBackground(new Color(255,255,255));
    }// </editor-fold>

    private void RemoveFacultyMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void RemoveFacultyMouseCLicked(MouseEvent evt) {
        String faculty_id;
        faculty_id = JOptionPane.showInputDialog(this,"Faculty id: ");
        if(faculty_id.isEmpty()){
            System.out.println("empty");
        }else {
            int j;
            for (j=0;j<18;j++){
                String text = tableModel.getValueAt(j, 0).toString();
                if (text.equals(faculty_id)){
                    System.out.println("get it!");
                    System.out.println(j);
                    tableModel.removeRow(j);
                    JOptionPane.showMessageDialog(this, "Record with id  '" + faculty_id + "' deleted successfully!");
                    break;
                }
            }
        }
    }

    private void RemoveFacultyMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateFacultyMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateFacultyMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void UpdateFacultyMouseCLicked(MouseEvent evt) {
        // i = the index of the selected row
        i = jt.getSelectedRow();
        System.out.println(i);
        if (i>=0){
            FacultyUpdatePanel UPDATEFACT = new FacultyUpdatePanel();
            Menu.JBody.removeAll();
            Menu.JBody.repaint();
            Menu.JBody.revalidate();
            Menu.JBody.add(UPDATEFACT);
            Menu.JBody.repaint();
            FacultyUpdatePanel.id.setText(tableModel.getValueAt(i,0).toString());
            FacultyUpdatePanel.firstname.setText(tableModel.getValueAt(i,1).toString());
            FacultyUpdatePanel.lastname.setText(tableModel.getValueAt(i,2).toString());
            FacultyUpdatePanel.salary.setText(tableModel.getValueAt(i,3).toString());
            FacultyUpdatePanel.designation.setText(tableModel.getValueAt(i,4).toString());
            FacultyUpdatePanel.subject.setText(tableModel.getValueAt(i,5).toString());
            FacultyUpdatePanel.dob.setText(tableModel.getValueAt(i,6).toString());
            FacultyUpdatePanel.phone.setText(tableModel.getValueAt(i,7).toString());
            FacultyUpdatePanel.email.setText(tableModel.getValueAt(i,8).toString());
        } else {
            JOptionPane.showMessageDialog(this, "select row you want to update!");
        }
    }

    private void AddFacultyMouseExited(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void AddFacultyMouseEntered(MouseEvent evt) {
        // TODO add your handling code here:
    }


    private void AddFacultyMouseCLicked(MouseEvent evt) {
        FacultyAddPanel ADDFACT = new FacultyAddPanel();
        Menu.JBody.removeAll();
        Menu.JBody.repaint();
        Menu.JBody.revalidate();
        Menu.JBody.add(ADDFACT);
        Menu.JBody.repaint();
    }

    // Variables declaration - do not modify                     
//    public static JButton jButton1;
    private static JLabel searchlabel;
    private static JTextField searchbar;
    private static JButton searchbutton;
    private static JTable jt;
    private static JButton addbutton;
    private static JButton updatebutton;
    private static JButton removebutton;public static DefaultTableModel tableModel;
    public static int i;
    // End of variables declaration

}
