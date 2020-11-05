import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BookPanel extends javax.swing.JPanel {

    private DefaultTableModel tableModel;

    /**
     * Creates new form FacultyPanel
     */
    public BookPanel() {
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
        String[][] data ={
                {"b101","<html>The Caine Prize for<br/>African Writing 2010:<br/>11th Annual Collection</html>","The Caine","10","New Internationalist","none","August 2010"},
                {"b102","<html>Opening Spaces: An<br/>Anthology of Contemporary<br/>African Women's Writing</html>","Yvonne Vera","12","Heinemann","1st Edition","September 1999"},
                {"b103","<html>Up the Down Escalator</html>","Linda Rode","35","Indiana University Press","New Edition","March 2008"},
                {"b104","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b105","<html>100 Best-Loved Poems</html>","Philip Smith","46","\tDover Publications","null","May 1995"},
                {"b106","<html>In Fact: The Best of<br/>Creative Nonfiction</html>","Lee Gutkind","18","<html>Norton, W. W.<br/>& Company, Inc.</html>","6th Edition","November 2004"},
                {"b107","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b108","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b109","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b110","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b111","<html>The Caine Prize for<br/>African Writing 2010:<br/>11th Annual Collection</html>","The Caine","10","New Internationalist","none","August 2010"},
                {"b112","<html>Opening Spaces: An<br/>Anthology of Contemporary<br/>African Women's Writing</html>","Yvonne Vera","12","Heinemann","1st Edition","September 1999"},
                {"b113","<html>Up the Down Escalator</html>","Linda Rode","35","Indiana University Press","New Edition","March 2008"},
                {"b114","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b115","<html>100 Best-Loved Poems</html>","Philip Smith","46","\tDover Publications","null","May 1995"},
                {"b116","<html>In Fact: The Best of<br/>Creative Nonfiction</html>","Lee Gutkind","18","<html>Norton, W. W.<br/>& Company, Inc.</html>","6th Edition","November 2004"},
                {"b117","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b118","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b119","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b120","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b121","<html>The Caine Prize for<br/>African Writing 2010:<br/>11th Annual Collection</html>","The Caine","10","New Internationalist","none","August 2010"},
                {"b122","<html>Opening Spaces: An<br/>Anthology of Contemporary<br/>African Women's Writing</html>","Yvonne Vera","12","Heinemann","1st Edition","September 1999"},
                {"b123","<html>Up the Down Escalator</html>","Linda Rode","35","Indiana University Press","New Edition","March 2008"},
                {"b124","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b125","<html>100 Best-Loved Poems</html>","Philip Smith","46","\tDover Publications","null","May 1995"},
                {"b126","<html>In Fact: The Best of<br/>Creative Nonfiction</html>","Lee Gutkind","18","<html>Norton, W. W.<br/>& Company, Inc.</html>","6th Edition","November 2004"},
                {"b127","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b128","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b139","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b130","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b131","<html>The Caine Prize for<br/>African Writing 2010:<br/>11th Annual Collection</html>","The Caine","10","New Internationalist","none","August 2010"},
                {"b132","<html>Opening Spaces: An<br/>Anthology of Contemporary<br/>African Women's Writing</html>","Yvonne Vera","12","Heinemann","1st Edition","September 1999"},
                {"b133","<html>Up the Down Escalator</html>","Linda Rode","35","Indiana University Press","New Edition","March 2008"},
                {"b134","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b135","<html>100 Best-Loved Poems</html>","Philip Smith","46","\tDover Publications","null","May 1995"},
                {"b136","<html>In Fact: The Best of<br/>Creative Nonfiction</html>","Lee Gutkind","18","<html>Norton, W. W.<br/>& Company, Inc.</html>","6th Edition","November 2004"},
                {"b137","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b138","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},
                {"b139","<html>Glass Jars among Trees</html>","Arja Salafranca","8","Jacana Media","2nd Edition","April 2005"},
                {"b140","<html>The Norton Anthology<br/> of American Literature: Volume A:<br/>Beginnings to 1820</html>","Wayne Franklin","1","<html>Norton, W. W.<br/>& Company, Inc.</html>","7th Edition","April 2007"},

        };
        String[] column ={"ID","TITLE","AUTHOR","QUANTITY","PUBLISHER","EDITION","PUBDATE"};
//        jt=new JTable(data,column);
//        jt.setCellSelectionEnabled(true);

        tableModel = new DefaultTableModel(data,column);
        jt=new JTable(tableModel);
        jt.setCellSelectionEnabled(true);
//        center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        JTableHeader header = jt.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jt));

        jt.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        jt.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );


//        row height
        jt.setRowHeight(30);

        jt.setFont(new Font("Roboto", Font.PLAIN, 15));
        jt.setBackground(new Color(255,255,255));
        jt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel select= jt.getSelectionModel();

        JTableHeader tableHeader = jt.getTableHeader();
        tableHeader.setFont(new Font("Roboto", Font.BOLD, 15));

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
        updateRowHeights();
        updateColumnWidth(jt);

        addbutton = new JButton("    ADD NEW BOOK DETAILS");
        addbutton.setLocation(24,586);
        addbutton.setSize(270,60);
        addbutton.setBorder(null);
        addbutton.setBackground(new Color(196,196,196));
        addbutton.setIcon(new ImageIcon(getClass().getResource("/img/math_52px.png")));
        add(addbutton);

        updatebutton = new JButton("    UPDATE RECORDS");
        updatebutton.setLocation(378,586);
        updatebutton.setSize(270,60);
        updatebutton.setBorder(null);
        updatebutton.setBackground(new Color(196,196,196));
        updatebutton.setIcon(new ImageIcon(getClass().getResource("/img/refresh_45px.png")));
        add(updatebutton);

        removebutton = new JButton("    REMOVE RECORDS");
        removebutton.setLocation(731,586);
        removebutton.setSize(270,60);
        removebutton.setBorder(null);
        removebutton.setBackground(new Color(196,196,196));
        removebutton.setIcon(new ImageIcon(getClass().getResource("/img/delete_52px.png")));
        add(removebutton);
        removebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) { RemoveBookMouseCLicked(evt); }
        });

        setBackground(new Color(255,255,255));
    }// </editor-fold>

    private void RemoveBookMouseCLicked(MouseEvent evt) {
        String book_id;
        book_id = JOptionPane.showInputDialog(this,"Book id: ");
        if(book_id.isEmpty()){
            System.out.println("empty");
        }else {
            int j;
            for (j=0;j<40;j++){
                String text = tableModel.getValueAt(j, 0).toString();
                if (text.equals(book_id)){
                    tableModel.removeRow(j);
                    JOptionPane.showMessageDialog(this, "Record with id  '" + book_id + "' deleted successfully!");
                    break;
                }
            }
        }
    }

    private void updateRowHeights()
    {
        for (int row = 0; row < jt.getRowCount(); row++)
        {
            int rowHeight = jt.getRowHeight();

            for (int column = 0; column < jt.getColumnCount(); column++)
            {
                Component comp = jt.prepareRenderer(jt.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }

            jt.setRowHeight(row, rowHeight);
        }
    }
    public void updateColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    static class HeaderRenderer implements TableCellRenderer {
        DefaultTableCellRenderer renderer;

        public HeaderRenderer(JTable table) {
            renderer = (DefaultTableCellRenderer)
                    table.getTableHeader().getDefaultRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int col) {
            return renderer.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, col);
        }
    }

    // Variables declaration - do not modify
    private static JLabel searchlabel;
    public static JTextField searchbar;
    public static JButton searchbutton;
    public static JTable jt;
    public static JButton addbutton;
    public static JButton updatebutton;
    public static JButton removebutton;
    // End of variables declaration
}
