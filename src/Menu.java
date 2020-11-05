import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

/**
 * @author palaa
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public static boolean maximized = true,HomeClSt=false,CalendarClSt=true,FacultyClSt=true,StudentClSt=true,NewsboardClSt=true,LibraryClSt=true,BroadcastClSt=true,ExamClSt=true,EventsClSt=true;

    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        JMenu = new JPanel();
        Logo1 = new JLabel();
        Logo2 = new JLabel();
        HomeBtn = new JLabel();
        CalendarBtn = new JLabel();
        FacultyBtn = new JLabel();
        StudentBtn = new JLabel();
        NewsboardBtn = new JLabel();
        LibraryBtn = new JLabel();
        BroadcastBtn = new JLabel();
        ExamBtn = new JLabel();
        EventsBtn = new JLabel();
        LogoutBtn = new JLabel();
        HomeBtnI = new JLabel();
        CalendarBtnI = new JLabel();
        FacultyBtnI = new JLabel();
        StudentBtnI = new JLabel();
        NewsboardBtnI = new JLabel();
        LibraryBtnI = new JLabel();
        BroadcastBtnI = new JLabel();
        ExamBtnI = new JLabel();
        EventsBtnI = new JLabel();
        LogoutBtnI = new JLabel();
        JBody = new JPanel();
        Home = new JPanel();
        StatsPanel = new JPanel();
        StatsNtfValue = new JLabel();
        StatsTeachersValue = new JLabel();
        StatsStudentsValue = new JLabel();
        StatsClassesValue = new JLabel();
        StatsBtnTxt4 = new JLabel();
        StatsBtnTxt3 = new JLabel();
        StatsBtnTxt2 = new JLabel();
        StatsBtnTxr1 = new JLabel();
        StatsBtnI4 = new JLabel();
        StatsBtnI3 = new JLabel();
        StatsBtnI2 = new JLabel();
        StatsBtnI1 = new JLabel();
        StatsBtn1 = new JLabel();
        StatsBtn2 = new JLabel();
        StatsBtn3 = new JLabel();
        StatsBtn4 = new JLabel();
        StatsHead = new JLabel();
        LeaderboardPanel = new JPanel();
        LeaderboardPanelTxt3 = new JLabel();
        LeaderboardPanelTxt2 = new JLabel();
        LeaderboardPanelTxt1 = new JLabel();
        LeaderPanelBtn3 = new JLabel();
        LeaderPanelBtn2 = new JLabel();
        LeaderPanelBtn1 = new JLabel();
        LeaderboardPanelBg = new JLabel();
        LeaderboardHead = new JLabel();
        CalendarPanel = new JPanel();
        MonthYear = new JLabel();
        NextMonthBtn = new JLabel();
        PrevMonthBtn = new JLabel();
        CalendarPanelClk = new JLabel();
        Dt5x2 = new JLabel();
        Dt5x1 = new JLabel();
        Dt5x7 = new JLabel();
        Dt5x6 = new JLabel();
        Dt5x5 = new JLabel();
        Dt5x3 = new JLabel();
        Dt5x4 = new JLabel();
        Dt4x3 = new JLabel();
        Dt4x2 = new JLabel();
        Dt4x4 = new JLabel();
        Dt4x5 = new JLabel();
        Dt4x7 = new JLabel();
        Dt4x6 = new JLabel();
        Dt4x1 = new JLabel();
        Dt3x1 = new JLabel();
        Dt3x2 = new JLabel();
        Dt3x3 = new JLabel();
        Dt3x4 = new JLabel();
        Dt3x5 = new JLabel();
        Dt3x6 = new JLabel();
        Dt3x7 = new JLabel();
        Dt2x7 = new JLabel();
        Dt2x6 = new JLabel();
        Dt2x5 = new JLabel();
        Dt2x4 = new JLabel();
        Dt2x3 = new JLabel();
        Dt2x2 = new JLabel();
        Dt2x1 = new JLabel();
        Dt1x7 = new JLabel();
        Dt1x6 = new JLabel();
        Dt1x5 = new JLabel();
        Dt1x4 = new JLabel();
        Dt1x3 = new JLabel();
        Dt1x2 = new JLabel();
        Dt1x1 = new JLabel();
        DoW1 = new JLabel();
        DoW2 = new JLabel();
        Dow3 = new JLabel();
        DoW4 = new JLabel();
        DoW5 = new JLabel();
        DoW6 = new JLabel();
        DoW7 = new JLabel();
        DtBg1x4 = new JLabel();
        DtBg1x5 = new JLabel();
        DtBg1x6 = new JLabel();
        DtBg1x7 = new JLabel();
        DtBg2x7 = new JLabel();
        DtBg2x6 = new JLabel();
        DtBg2x5 = new JLabel();
        DtBg2x4 = new JLabel();
        DtBg2x3 = new JLabel();
        DtBg2x2 = new JLabel();
        DtBg2x1 = new JLabel();
        DtBg3x1 = new JLabel();
        DtBg3x2 = new JLabel();
        DtBg3x3 = new JLabel();
        DtBg3x4 = new JLabel();
        DtBg3x5 = new JLabel();
        DtBg1x3 = new JLabel();
        DtBg1x2 = new JLabel();
        DtBg1x1 = new JLabel();
        DtBg5x7 = new JLabel();
        DtBg3x6 = new JLabel();
        DtBg3x7 = new JLabel();
        DtBg4x7 = new JLabel();
        DtBg4x6 = new JLabel();
        DtBg4x5 = new JLabel();
        DtBg4x4 = new JLabel();
        DtBg4x3 = new JLabel();
        DtBg4x2 = new JLabel();
        DtBg4x1 = new JLabel();
        DtBg5x1 = new JLabel();
        DtBg5x2 = new JLabel();
        DtBg5x3 = new JLabel();
        DtBg5x4 = new JLabel();
        DtBg5x5 = new JLabel();
        DtBg5x6 = new JLabel();
        CalendarPanelBg2 = new JLabel();
        CalendarPanelBg1 = new JLabel();
        CalendarHead = new JLabel();
        StatResultsPanel = new JPanel();
        StatResultsBtn4Txt = new JLabel();
        StatResultsBtn3Txt = new JLabel();
        StatResultsBtn2Txt = new JLabel();
        StatResultsBtn1Txt = new JLabel();
        StatResultsFailValue = new JLabel();
        StatResultsPassValue = new JLabel();
        StatResultsHigMValue = new JLabel();
        StatResultsRetakeValue = new JLabel();
        StatResultsBtn1 = new JLabel();
        StatResultsBtn2 = new JLabel();
        StatResultsBtn3 = new JLabel();
        StatResultsBtn4 = new JLabel();
        StatResultsHead = new JLabel();
        NewsEventsPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        NewsEventsPanelList = new JList<>();
        NewsEventsPanelBg = new JLabel();
        NewsEventsHead = new JLabel();
        CalculatorBtn = new JLabel();
        HomeBorder = new JLabel();
        Calendar = new JPanel();
        jPanel8 = new JPanel();
        jPanel7 = new JPanel();
        jPanel6 = new JPanel();
        jPanel5 = new JPanel();
        jPanel4 = new JPanel();
        jPanel3 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setUndecorated(true);
        getContentPane().setLayout(null);

        JMenu.setBackground(new Color(67, 67, 89));
        JMenu.setLayout(null);

        Logo1.setBackground(new Color(0, 0, 0));
        Logo1.setFont(new Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        Logo1.setForeground(new Color(255, 221, 31));
        Logo1.setHorizontalAlignment(SwingConstants.CENTER);
        Logo1.setText("oo");
        JMenu.add(Logo1);
        Logo1.setBounds(122, 33, 50, 50);

        Logo2.setBackground(new Color(0, 0, 0));
        Logo2.setFont(new Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        Logo2.setForeground(new Color(255, 255, 255));
        Logo2.setHorizontalAlignment(SwingConstants.CENTER);
        Logo2.setText("Skool");
        JMenu.add(Logo2);
        Logo2.setBounds(1, 33, 250, 50);

        HomeBtn.setBackground(new Color(196, 196, 196));
        HomeBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        HomeBtn.setForeground(new Color(67, 67, 89));
        HomeBtn.setHorizontalAlignment(SwingConstants.LEFT);
        HomeBtn.setText("Home");
        HomeBtn.setOpaque(true);
        HomeBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                HomeBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                HomeBtnMouseExited(evt);
            }
        });
        JMenu.add(HomeBtn);
        HomeBtn.setBounds(81, 116, 170, 55);

        CalendarBtn.setBackground(new Color(67, 67, 89));
        CalendarBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        CalendarBtn.setForeground(new Color(255, 255, 255));
        CalendarBtn.setHorizontalAlignment(SwingConstants.LEFT);
        CalendarBtn.setText("Calendar");
        CalendarBtn.setOpaque(true);
        CalendarBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CalendarBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                CalendarBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                CalendarBtnMouseExited(evt);
            }
        });
        JMenu.add(CalendarBtn);
        CalendarBtn.setBounds(81, 172, 170, 55);

        FacultyBtn.setBackground(new Color(67, 67, 89));
        FacultyBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        FacultyBtn.setForeground(new Color(255, 255, 255));
        FacultyBtn.setHorizontalAlignment(SwingConstants.LEFT);
        FacultyBtn.setText("Faculty");
        FacultyBtn.setOpaque(true);
        FacultyBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                FacultyBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                FacultyBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                FacultyBtnMouseExited(evt);
            }
        });
        JMenu.add(FacultyBtn);
        FacultyBtn.setBounds(81, 228, 170, 55);

        StudentBtn.setBackground(new Color(67, 67, 89));
        StudentBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        StudentBtn.setForeground(new Color(255, 255, 255));
        StudentBtn.setHorizontalAlignment(SwingConstants.LEFT);
        StudentBtn.setText("Student");
        StudentBtn.setOpaque(true);
        StudentBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StudentBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StudentBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StudentBtnMouseExited(evt);
            }
        });
        JMenu.add(StudentBtn);
        StudentBtn.setBounds(81, 284, 170, 55);

        NewsboardBtn.setBackground(new Color(67, 67, 89));
        NewsboardBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        NewsboardBtn.setForeground(new Color(255, 255, 255));
        NewsboardBtn.setHorizontalAlignment(SwingConstants.LEFT);
        NewsboardBtn.setText("Newsboard");
        NewsboardBtn.setOpaque(true);
        NewsboardBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NewsboardBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NewsboardBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NewsboardBtnMouseExited(evt);
            }
        });
        JMenu.add(NewsboardBtn);
        NewsboardBtn.setBounds(81, 340, 170, 55);

        LibraryBtn.setBackground(new Color(67, 67, 89));
        LibraryBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        LibraryBtn.setForeground(new Color(255, 255, 255));
        LibraryBtn.setHorizontalAlignment(SwingConstants.LEFT);
        LibraryBtn.setText("Library");
        LibraryBtn.setOpaque(true);
        LibraryBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LibraryBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LibraryBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LibraryBtnMouseExited(evt);
            }
        });
        JMenu.add(LibraryBtn);
        LibraryBtn.setBounds(81, 396, 170, 55);

        BroadcastBtn.setBackground(new Color(67, 67, 89));
        BroadcastBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        BroadcastBtn.setForeground(new Color(255, 255, 255));
        BroadcastBtn.setHorizontalAlignment(SwingConstants.LEFT);
        BroadcastBtn.setText("Broadcast");
        BroadcastBtn.setOpaque(true);
        BroadcastBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BroadcastBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                BroadcastBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                BroadcastBtnMouseExited(evt);
            }
        });
        JMenu.add(BroadcastBtn);
        BroadcastBtn.setBounds(81, 452, 170, 55);

        ExamBtn.setBackground(new Color(67, 67, 89));
        ExamBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        ExamBtn.setForeground(new Color(255, 255, 255));
        ExamBtn.setHorizontalAlignment(SwingConstants.LEFT);
        ExamBtn.setText("Exam");
        ExamBtn.setOpaque(true);
        ExamBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ExamBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                ExamBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                ExamBtnMouseExited(evt);
            }
        });
        JMenu.add(ExamBtn);
        ExamBtn.setBounds(81, 508, 170, 55);

        EventsBtn.setBackground(new Color(67, 67, 89));
        EventsBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        EventsBtn.setForeground(new Color(255, 255, 255));
        EventsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        EventsBtn.setText("Events");
        EventsBtn.setOpaque(true);
        EventsBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                EventsBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                EventsBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                EventsBtnMouseExited(evt);
            }
        });
        JMenu.add(EventsBtn);
        EventsBtn.setBounds(81, 564, 170, 55);

        LogoutBtn.setBackground(new Color(67, 67, 89));
        LogoutBtn.setFont(new Font("Dialog", 0, 32)); // NOI18N
        LogoutBtn.setForeground(new Color(255, 255, 255));
        LogoutBtn.setHorizontalAlignment(SwingConstants.LEFT);
        LogoutBtn.setText("Logout");
        LogoutBtn.setOpaque(true);
        LogoutBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
        });
        JMenu.add(LogoutBtn);
        LogoutBtn.setBounds(81, 620, 170, 55);

        HomeBtnI.setBackground(new Color(196, 196, 196));
        HomeBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        HomeBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_home_52px_2.png"))); // NOI18N
        HomeBtnI.setOpaque(true);
        HomeBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HomeBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                HomeBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                HomeBtnIMouseExited(evt);
            }
        });
        JMenu.add(HomeBtnI);
        HomeBtnI.setBounds(1, 116, 80, 55);

        CalendarBtnI.setBackground(new Color(67, 67, 89));
        CalendarBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png"))); // NOI18N
        CalendarBtnI.setOpaque(true);
        CalendarBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CalendarBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                CalendarBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                CalendarBtnIMouseExited(evt);
            }
        });
        JMenu.add(CalendarBtnI);
        CalendarBtnI.setBounds(1, 172, 80, 55);

        FacultyBtnI.setBackground(new Color(67, 67, 89));
        FacultyBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        FacultyBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png"))); // NOI18N
        FacultyBtnI.setOpaque(true);
        FacultyBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                FacultyBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                FacultyBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                FacultyBtnIMouseExited(evt);
            }
        });
        JMenu.add(FacultyBtnI);
        FacultyBtnI.setBounds(1, 228, 80, 55);

        StudentBtnI.setBackground(new Color(67, 67, 89));
        StudentBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        StudentBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png"))); // NOI18N
        StudentBtnI.setOpaque(true);
        StudentBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StudentBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StudentBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StudentBtnIMouseExited(evt);
            }
        });
        JMenu.add(StudentBtnI);
        StudentBtnI.setBounds(1, 284, 80, 55);

        NewsboardBtnI.setBackground(new Color(67, 67, 89));
        NewsboardBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        NewsboardBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png"))); // NOI18N
        NewsboardBtnI.setOpaque(true);
        NewsboardBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NewsboardBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NewsboardBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NewsboardBtnIMouseExited(evt);
            }
        });
        JMenu.add(NewsboardBtnI);
        NewsboardBtnI.setBounds(1, 340, 80, 55);

        LibraryBtnI.setBackground(new Color(67, 67, 89));
        LibraryBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        LibraryBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png"))); // NOI18N
        LibraryBtnI.setOpaque(true);
        LibraryBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LibraryBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LibraryBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LibraryBtnIMouseExited(evt);
            }
        });
        JMenu.add(LibraryBtnI);
        LibraryBtnI.setBounds(1, 396, 80, 55);

        BroadcastBtnI.setBackground(new Color(67, 67, 89));
        BroadcastBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        BroadcastBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png"))); // NOI18N
        BroadcastBtnI.setOpaque(true);
        BroadcastBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BroadcastBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                BroadcastBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                BroadcastBtnIMouseExited(evt);
            }
        });
        JMenu.add(BroadcastBtnI);
        BroadcastBtnI.setBounds(1, 452, 80, 55);

        ExamBtnI.setBackground(new Color(67, 67, 89));
        ExamBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        ExamBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png"))); // NOI18N
        ExamBtnI.setOpaque(true);
        ExamBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ExamBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                ExamBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                ExamBtnIMouseExited(evt);
            }
        });
        JMenu.add(ExamBtnI);
        ExamBtnI.setBounds(1, 508, 80, 55);

        EventsBtnI.setBackground(new Color(67, 67, 89));
        EventsBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        EventsBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png"))); // NOI18N
        EventsBtnI.setOpaque(true);
        EventsBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                EventsBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                EventsBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                EventsBtnIMouseExited(evt);
            }
        });
        JMenu.add(EventsBtnI);
        EventsBtnI.setBounds(1, 564, 80, 55);

        LogoutBtnI.setBackground(new Color(67, 67, 89));
        LogoutBtnI.setHorizontalAlignment(SwingConstants.CENTER);
        LogoutBtnI.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_sign_out_52px_1 1.png"))); // NOI18N
        LogoutBtnI.setOpaque(true);
        LogoutBtnI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LogoutBtnIMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LogoutBtnIMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LogoutBtnIMouseExited(evt);
            }
        });
        JMenu.add(LogoutBtnI);
        LogoutBtnI.setBounds(1, 620, 80, 55);

        getContentPane().add(JMenu);
        JMenu.setBounds(0, 0, 252, 700);

        JBody.setLayout(new CardLayout());

        Home.setBackground(new Color(255, 255, 255));
        Home.setLayout(null);


        StatsPanel.setBackground(new Color(255, 255, 255));
        StatsPanel.setLayout(null);

        StatsNtfValue.setFont(new Font("Arial Black", 0, 30)); // NOI18N
        StatsNtfValue.setForeground(new Color(67, 67, 89));
        StatsNtfValue.setText("02");
        StatsPanel.add(StatsNtfValue);
        StatsNtfValue.setBounds(792, 50, 40, 30);

        StatsTeachersValue.setFont(new Font("Arial Black", 0, 30)); // NOI18N
        StatsTeachersValue.setForeground(new Color(67, 67, 89));
        StatsTeachersValue.setText("07");
        StatsPanel.add(StatsTeachersValue);
        StatsTeachersValue.setBounds(536, 50, 40, 30);

        StatsStudentsValue.setFont(new Font("Arial Black", 0, 30)); // NOI18N
        StatsStudentsValue.setForeground(new Color(67, 67, 89));
        StatsStudentsValue.setText("12");
        StatsPanel.add(StatsStudentsValue);
        StatsStudentsValue.setBounds(280, 50, 60, 30);

        StatsClassesValue.setFont(new Font("Arial Black", 0, 30)); // NOI18N
        StatsClassesValue.setForeground(new Color(67, 67, 89));
        StatsClassesValue.setText("00");
        StatsPanel.add(StatsClassesValue);
        StatsClassesValue.setBounds(22, 50, 40, 30);

        StatsBtnTxt4.setFont(new Font("Dialog", 0, 25)); // NOI18N
        StatsBtnTxt4.setForeground(new Color(67, 67, 89));
        StatsBtnTxt4.setText("Notification");
        StatsPanel.add(StatsBtnTxt4);
        StatsBtnTxt4.setBounds(792, 88, 130, 20);

        StatsBtnTxt3.setFont(new Font("Dialog", 0, 25)); // NOI18N
        StatsBtnTxt3.setForeground(new Color(67, 67, 89));
        StatsBtnTxt3.setText("Teachers");
        StatsPanel.add(StatsBtnTxt3);
        StatsBtnTxt3.setBounds(536, 89, 104, 20);

        StatsBtnTxt2.setFont(new Font("Dialog", 0, 25)); // NOI18N
        StatsBtnTxt2.setForeground(new Color(67, 67, 89));
        StatsBtnTxt2.setText("Students");
        StatsPanel.add(StatsBtnTxt2);
        StatsBtnTxt2.setBounds(280, 89, 100, 20);

        StatsBtnTxr1.setFont(new Font("Dialog", 0, 25)); // NOI18N
        StatsBtnTxr1.setForeground(new Color(67, 67, 89));
        StatsBtnTxr1.setText("Classes");
        StatsPanel.add(StatsBtnTxr1);
        StatsBtnTxr1.setBounds(22, 88, 100, 20);

        StatsBtnI4.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_inbox_60px 1.png"))); // NOI18N
        StatsPanel.add(StatsBtnI4);
        StatsBtnI4.setBounds(932, 50, 60, 60);

        StatsBtnI3.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_teacher_60px 1.png"))); // NOI18N
        StatsPanel.add(StatsBtnI3);
        StatsBtnI3.setBounds(673, 50, 60, 60);

        StatsBtnI2.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_60px 1.png"))); // NOI18N
        StatsPanel.add(StatsBtnI2);
        StatsBtnI2.setBounds(416, 50, 60, 60);

        StatsBtnI1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_class_100px 1.png"))); // NOI18N
        StatsPanel.add(StatsBtnI1);
        StatsBtnI1.setBounds(160, 50, 60, 60);

        StatsBtn1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png"))); // NOI18N
        StatsBtn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatsBtn1MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatsBtn1MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatsBtn1MouseExited(evt);
            }
        });
        StatsPanel.add(StatsBtn1);
        StatsBtn1.setBounds(10, 40, 230, 80);

        StatsBtn2.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png"))); // NOI18N
        StatsBtn2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatsBtn2MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatsBtn2MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatsBtn2MouseExited(evt);
            }
        });
        StatsPanel.add(StatsBtn2);
        StatsBtn2.setBounds(267, 40, 230, 80);

        StatsBtn3.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png"))); // NOI18N
        StatsBtn3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatsBtn3MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatsBtn3MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatsBtn3MouseExited(evt);
            }
        });
        StatsPanel.add(StatsBtn3);
        StatsBtn3.setBounds(523, 40, 230, 80);

        StatsBtn4.setFont(new Font("Arial Black", 0, 30)); // NOI18N
        StatsBtn4.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png"))); // NOI18N
        StatsBtn4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatsBtn4MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatsBtn4MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatsBtn4MouseExited(evt);
            }
        });
        StatsPanel.add(StatsBtn4);
        StatsBtn4.setBounds(780, 40, 230, 80);

        StatsHead.setFont(new Font("Dialog", 0, 20)); // NOI18N
        StatsHead.setForeground(new Color(150, 144, 144));
        StatsHead.setText("Statistics");
        StatsPanel.add(StatsHead);
        StatsHead.setBounds(10, 10, 90, 20);

        Home.add(StatsPanel);
        StatsPanel.setBounds(10, 40, 1020, 130);

        LeaderboardPanel.setBackground(new Color(255, 255, 255));
        LeaderboardPanel.setLayout(null);

        LeaderboardPanelTxt3.setFont(new Font("Dialog", 0, 18)); // NOI18N
        LeaderboardPanelTxt3.setForeground(new Color(67, 67, 89));
        LeaderboardPanelTxt3.setHorizontalAlignment(SwingConstants.CENTER);
        LeaderboardPanelTxt3.setText("Best Student");
        LeaderboardPanel.add(LeaderboardPanelTxt3);
        LeaderboardPanelTxt3.setBounds(350, 70, 110, 20);

        LeaderboardPanelTxt2.setFont(new Font("Dialog", 0, 18)); // NOI18N
        LeaderboardPanelTxt2.setForeground(new Color(67, 67, 89));
        LeaderboardPanelTxt2.setHorizontalAlignment(SwingConstants.CENTER);
        LeaderboardPanelTxt2.setText("Best Teacher");
        LeaderboardPanel.add(LeaderboardPanelTxt2);
        LeaderboardPanelTxt2.setBounds(190, 70, 120, 20);

        LeaderboardPanelTxt1.setFont(new Font("Dialog", 0, 18)); // NOI18N
        LeaderboardPanelTxt1.setForeground(new Color(67, 67, 89));
        LeaderboardPanelTxt1.setHorizontalAlignment(SwingConstants.CENTER);
        LeaderboardPanelTxt1.setText("Topper, 2020");
        LeaderboardPanel.add(LeaderboardPanelTxt1);
        LeaderboardPanelTxt1.setBounds(40, 70, 110, 20);

        LeaderPanelBtn3.setIcon(new ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png"))); // NOI18N
        LeaderPanelBtn3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeaderPanelBtn3MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LeaderPanelBtn3MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LeaderPanelBtn3MouseExited(evt);
            }
        });
        LeaderboardPanel.add(LeaderPanelBtn3);
        LeaderPanelBtn3.setBounds(335, 50, 140, 120);

        LeaderPanelBtn2.setIcon(new ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png"))); // NOI18N
        LeaderPanelBtn2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeaderPanelBtn2MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LeaderPanelBtn2MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LeaderPanelBtn2MouseExited(evt);
            }
        });
        LeaderboardPanel.add(LeaderPanelBtn2);
        LeaderPanelBtn2.setBounds(180, 50, 140, 120);

        LeaderPanelBtn1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png"))); // NOI18N
        LeaderPanelBtn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeaderPanelBtn1MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LeaderPanelBtn1MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LeaderPanelBtn1MouseExited(evt);
            }
        });
        LeaderboardPanel.add(LeaderPanelBtn1);
        LeaderPanelBtn1.setBounds(25, 50, 140, 120);

        LeaderboardPanelBg.setIcon(new ImageIcon(getClass().getResource("/HomeImages/LeaderboardPanelBg.png"))); // NOI18N
        LeaderboardPanel.add(LeaderboardPanelBg);
        LeaderboardPanelBg.setBounds(10, 40, 480, 140);

        LeaderboardHead.setFont(new Font("Dialog", 0, 20)); // NOI18N
        LeaderboardHead.setForeground(new Color(150, 144, 144));
        LeaderboardHead.setText("Leaderboard");
        LeaderboardHead.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeaderboardHeadMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                LeaderboardHeadMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                LeaderboardHeadMouseExited(evt);
            }
        });
        LeaderboardPanel.add(LeaderboardHead);
        LeaderboardHead.setBounds(10, 10, 120, 20);

        Home.add(LeaderboardPanel);
        LeaderboardPanel.setBounds(10, 180, 500, 190);

        CalendarPanel.setBackground(new Color(255, 255, 255));
        CalendarPanel.setLayout(null);

        MonthYear.setFont(new Font("Dialog", 0, 20)); // NOI18N
        MonthYear.setForeground(new Color(255, 255, 255));
        MonthYear.setHorizontalAlignment(SwingConstants.CENTER);
        MonthYear.setText("October 2020");
        MonthYear.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                MonthYearMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                MonthYearMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MonthYearMouseExited(evt);
            }
        });
        CalendarPanel.add(MonthYear);
        MonthYear.setBounds(190, 40, 130, 40);

        NextMonthBtn.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 1.png"))); // NOI18N
        NextMonthBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NextMonthBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NextMonthBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NextMonthBtnMouseExited(evt);
            }
        });
        CalendarPanel.add(NextMonthBtn);
        NextMonthBtn.setBounds(330, 45, 30, 30);

        PrevMonthBtn.setIcon(new ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 2.png"))); // NOI18N
        PrevMonthBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                PrevMonthBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                PrevMonthBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                PrevMonthBtnMouseExited(evt);
            }
        });
        CalendarPanel.add(PrevMonthBtn);
        PrevMonthBtn.setBounds(150, 45, 30, 30);

        CalendarPanelClk.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CalendarPanelClkMouseClicked(evt);
            }
        });
        CalendarPanel.add(CalendarPanelClk);
        CalendarPanelClk.setBounds(10, 40, 490, 210);

        Dt5x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x2.setForeground(new Color(67, 67, 89));
        Dt5x2.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x2.setText("27");
        CalendarPanel.add(Dt5x2);
        Dt5x2.setBounds(108, 215, 26, 26);

        Dt5x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x1.setForeground(new Color(67, 67, 89));
        Dt5x1.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x1.setText("26");
        CalendarPanel.add(Dt5x1);
        Dt5x1.setBounds(41, 215, 26, 26);

        Dt5x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x7.setForeground(new Color(204, 204, 204));
        Dt5x7.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x7.setText("1");
        CalendarPanel.add(Dt5x7);
        Dt5x7.setBounds(443, 215, 26, 26);

        Dt5x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x6.setForeground(new Color(67, 67, 89));
        Dt5x6.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x6.setText("31");
        CalendarPanel.add(Dt5x6);
        Dt5x6.setBounds(376, 215, 26, 26);

        Dt5x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x5.setForeground(new Color(67, 67, 89));
        Dt5x5.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x5.setText("30");
        CalendarPanel.add(Dt5x5);
        Dt5x5.setBounds(309, 215, 26, 26);

        Dt5x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x3.setForeground(new Color(67, 67, 89));
        Dt5x3.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x3.setText("28");
        CalendarPanel.add(Dt5x3);
        Dt5x3.setBounds(175, 215, 26, 26);

        Dt5x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt5x4.setForeground(new Color(67, 67, 89));
        Dt5x4.setHorizontalAlignment(SwingConstants.CENTER);
        Dt5x4.setText("29");
        CalendarPanel.add(Dt5x4);
        Dt5x4.setBounds(242, 215, 26, 26);

        Dt4x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x3.setForeground(new Color(67, 67, 89));
        Dt4x3.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x3.setText("21");
        CalendarPanel.add(Dt4x3);
        Dt4x3.setBounds(175, 188, 26, 26);

        Dt4x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x2.setForeground(new Color(67, 67, 89));
        Dt4x2.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x2.setText("20");
        CalendarPanel.add(Dt4x2);
        Dt4x2.setBounds(108, 188, 26, 26);

        Dt4x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x4.setForeground(new Color(67, 67, 89));
        Dt4x4.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x4.setText("22");
        CalendarPanel.add(Dt4x4);
        Dt4x4.setBounds(242, 188, 26, 26);

        Dt4x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x5.setForeground(new Color(67, 67, 89));
        Dt4x5.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x5.setText("23");
        CalendarPanel.add(Dt4x5);
        Dt4x5.setBounds(309, 188, 26, 26);

        Dt4x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x7.setForeground(new Color(67, 67, 89));
        Dt4x7.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x7.setText("25");
        CalendarPanel.add(Dt4x7);
        Dt4x7.setBounds(443, 188, 26, 26);

        Dt4x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x6.setForeground(new Color(67, 67, 89));
        Dt4x6.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x6.setText("24");
        CalendarPanel.add(Dt4x6);
        Dt4x6.setBounds(376, 188, 26, 26);

        Dt4x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt4x1.setForeground(new Color(67, 67, 89));
        Dt4x1.setHorizontalAlignment(SwingConstants.CENTER);
        Dt4x1.setText("19");
        CalendarPanel.add(Dt4x1);
        Dt4x1.setBounds(41, 188, 26, 26);

        Dt3x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x1.setForeground(new Color(67, 67, 89));
        Dt3x1.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x1.setText("12");
        CalendarPanel.add(Dt3x1);
        Dt3x1.setBounds(41, 161, 26, 26);

        Dt3x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x2.setForeground(new Color(67, 67, 89));
        Dt3x2.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x2.setText("13");
        CalendarPanel.add(Dt3x2);
        Dt3x2.setBounds(108, 161, 26, 26);

        Dt3x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x3.setForeground(new Color(67, 67, 89));
        Dt3x3.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x3.setText("14");
        CalendarPanel.add(Dt3x3);
        Dt3x3.setBounds(175, 161, 26, 26);

        Dt3x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x4.setForeground(new Color(67, 67, 89));
        Dt3x4.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x4.setText("15");
        CalendarPanel.add(Dt3x4);
        Dt3x4.setBounds(242, 161, 26, 26);

        Dt3x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x5.setForeground(new Color(67, 67, 89));
        Dt3x5.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x5.setText("16");
        CalendarPanel.add(Dt3x5);
        Dt3x5.setBounds(309, 161, 26, 26);

        Dt3x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x6.setForeground(new Color(67, 67, 89));
        Dt3x6.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x6.setText("17");
        CalendarPanel.add(Dt3x6);
        Dt3x6.setBounds(376, 161, 26, 26);

        Dt3x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt3x7.setForeground(new Color(67, 67, 89));
        Dt3x7.setHorizontalAlignment(SwingConstants.CENTER);
        Dt3x7.setText("18");
        CalendarPanel.add(Dt3x7);
        Dt3x7.setBounds(443, 161, 26, 26);

        Dt2x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x7.setForeground(new Color(67, 67, 89));
        Dt2x7.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x7.setText("11");
        CalendarPanel.add(Dt2x7);
        Dt2x7.setBounds(443, 134, 26, 26);

        Dt2x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x6.setForeground(new Color(67, 67, 89));
        Dt2x6.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x6.setText("10");
        CalendarPanel.add(Dt2x6);
        Dt2x6.setBounds(376, 134, 26, 26);

        Dt2x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x5.setForeground(new Color(67, 67, 89));
        Dt2x5.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x5.setText("9");
        CalendarPanel.add(Dt2x5);
        Dt2x5.setBounds(309, 134, 26, 26);

        Dt2x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x4.setForeground(new Color(67, 67, 89));
        Dt2x4.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x4.setText("8");
        CalendarPanel.add(Dt2x4);
        Dt2x4.setBounds(242, 134, 26, 26);

        Dt2x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x3.setForeground(new Color(67, 67, 89));
        Dt2x3.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x3.setText("7");
        CalendarPanel.add(Dt2x3);
        Dt2x3.setBounds(175, 134, 26, 26);

        Dt2x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x2.setForeground(new Color(67, 67, 89));
        Dt2x2.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x2.setText("6");
        CalendarPanel.add(Dt2x2);
        Dt2x2.setBounds(108, 134, 26, 26);

        Dt2x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt2x1.setForeground(new Color(67, 67, 89));
        Dt2x1.setHorizontalAlignment(SwingConstants.CENTER);
        Dt2x1.setText("5");
        CalendarPanel.add(Dt2x1);
        Dt2x1.setBounds(41, 134, 26, 26);

        Dt1x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x7.setForeground(new Color(67, 67, 89));
        Dt1x7.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x7.setText("4");
        CalendarPanel.add(Dt1x7);
        Dt1x7.setBounds(443, 107, 26, 26);

        Dt1x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x6.setForeground(new Color(67, 67, 89));
        Dt1x6.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x6.setText("3");
        CalendarPanel.add(Dt1x6);
        Dt1x6.setBounds(376, 107, 26, 26);

        Dt1x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x5.setForeground(new Color(67, 67, 89));
        Dt1x5.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x5.setText("2");
        CalendarPanel.add(Dt1x5);
        Dt1x5.setBounds(309, 107, 26, 26);

        Dt1x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x4.setForeground(new Color(67, 67, 89));
        Dt1x4.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x4.setText("1");
        CalendarPanel.add(Dt1x4);
        Dt1x4.setBounds(242, 107, 26, 26);

        Dt1x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x3.setForeground(new Color(204, 204, 204));
        Dt1x3.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x3.setText("30");
        CalendarPanel.add(Dt1x3);
        Dt1x3.setBounds(175, 107, 26, 26);

        Dt1x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x2.setForeground(new Color(204, 204, 204));
        Dt1x2.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x2.setText("29");
        CalendarPanel.add(Dt1x2);
        Dt1x2.setBounds(108, 107, 26, 26);

        Dt1x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dt1x1.setForeground(new Color(204, 204, 204));
        Dt1x1.setHorizontalAlignment(SwingConstants.CENTER);
        Dt1x1.setText("28");
        CalendarPanel.add(Dt1x1);
        Dt1x1.setBounds(41, 107, 26, 26);

        DoW1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW1.setForeground(new Color(67, 67, 89));
        DoW1.setHorizontalAlignment(SwingConstants.CENTER);
        DoW1.setText("S");
        CalendarPanel.add(DoW1);
        DoW1.setBounds(41, 80, 26, 26);

        DoW2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW2.setForeground(new Color(67, 67, 89));
        DoW2.setHorizontalAlignment(SwingConstants.CENTER);
        DoW2.setText("M");
        CalendarPanel.add(DoW2);
        DoW2.setBounds(108, 80, 26, 26);

        Dow3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        Dow3.setForeground(new Color(67, 67, 89));
        Dow3.setHorizontalAlignment(SwingConstants.CENTER);
        Dow3.setText("T");
        CalendarPanel.add(Dow3);
        Dow3.setBounds(175, 80, 26, 26);

        DoW4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW4.setForeground(new Color(67, 67, 89));
        DoW4.setHorizontalAlignment(SwingConstants.CENTER);
        DoW4.setText("W");
        CalendarPanel.add(DoW4);
        DoW4.setBounds(242, 80, 26, 26);

        DoW5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW5.setForeground(new Color(67, 67, 89));
        DoW5.setHorizontalAlignment(SwingConstants.CENTER);
        DoW5.setText("T");
        CalendarPanel.add(DoW5);
        DoW5.setBounds(309, 80, 26, 26);

        DoW6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW6.setForeground(new Color(67, 67, 89));
        DoW6.setHorizontalAlignment(SwingConstants.CENTER);
        DoW6.setText("F");
        CalendarPanel.add(DoW6);
        DoW6.setBounds(376, 80, 26, 26);

        DoW7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DoW7.setForeground(new Color(67, 67, 89));
        DoW7.setHorizontalAlignment(SwingConstants.CENTER);
        DoW7.setText("S");
        CalendarPanel.add(DoW7);
        DoW7.setBounds(443, 80, 26, 26);

        DtBg1x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x4.setForeground(new Color(67, 67, 89));
        DtBg1x4.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg1x4);
        DtBg1x4.setBounds(242, 107, 26, 26);

        DtBg1x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x5.setForeground(new Color(67, 67, 89));
        DtBg1x5.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg1x5);
        DtBg1x5.setBounds(309, 107, 26, 26);

        DtBg1x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x6.setForeground(new Color(67, 67, 89));
        DtBg1x6.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg1x6);
        DtBg1x6.setBounds(376, 107, 26, 26);

        DtBg1x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x7.setForeground(new Color(67, 67, 89));
        DtBg1x7.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg1x7);
        DtBg1x7.setBounds(443, 107, 26, 26);

        DtBg2x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x7.setForeground(new Color(67, 67, 89));
        DtBg2x7.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x7);
        DtBg2x7.setBounds(443, 134, 26, 26);

        DtBg2x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x6.setForeground(new Color(67, 67, 89));
        DtBg2x6.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x6);
        DtBg2x6.setBounds(376, 134, 26, 26);

        DtBg2x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x5.setForeground(new Color(67, 67, 89));
        DtBg2x5.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x5);
        DtBg2x5.setBounds(309, 134, 26, 26);

        DtBg2x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x4.setForeground(new Color(67, 67, 89));
        DtBg2x4.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x4);
        DtBg2x4.setBounds(242, 134, 26, 26);

        DtBg2x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x3.setForeground(new Color(67, 67, 89));
        DtBg2x3.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x3);
        DtBg2x3.setBounds(175, 134, 26, 26);

        DtBg2x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x2.setForeground(new Color(67, 67, 89));
        DtBg2x2.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x2);
        DtBg2x2.setBounds(108, 134, 26, 26);

        DtBg2x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg2x1.setForeground(new Color(67, 67, 89));
        DtBg2x1.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg2x1);
        DtBg2x1.setBounds(41, 134, 26, 26);

        DtBg3x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x1.setForeground(new Color(67, 67, 89));
        DtBg3x1.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x1);
        DtBg3x1.setBounds(41, 161, 26, 26);

        DtBg3x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x2.setForeground(new Color(67, 67, 89));
        DtBg3x2.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x2);
        DtBg3x2.setBounds(108, 161, 26, 26);

        DtBg3x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x3.setForeground(new Color(67, 67, 89));
        DtBg3x3.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x3);
        DtBg3x3.setBounds(175, 161, 26, 26);

        DtBg3x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x4.setForeground(new Color(67, 67, 89));
        DtBg3x4.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x4);
        DtBg3x4.setBounds(242, 161, 26, 26);

        DtBg3x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x5.setForeground(new Color(67, 67, 89));
        DtBg3x5.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x5);
        DtBg3x5.setBounds(309, 161, 26, 26);

        DtBg1x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x3.setForeground(new Color(204, 204, 204));
        DtBg1x3.setHorizontalAlignment(SwingConstants.CENTER);
        DtBg1x3.setText("30");
        CalendarPanel.add(DtBg1x3);
        DtBg1x3.setBounds(175, 107, 26, 26);

        DtBg1x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x2.setForeground(new Color(204, 204, 204));
        DtBg1x2.setHorizontalAlignment(SwingConstants.CENTER);
        DtBg1x2.setText("29");
        CalendarPanel.add(DtBg1x2);
        DtBg1x2.setBounds(108, 107, 26, 26);

        DtBg1x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg1x1.setForeground(new Color(204, 204, 204));
        DtBg1x1.setHorizontalAlignment(SwingConstants.CENTER);
        DtBg1x1.setText("28");
        CalendarPanel.add(DtBg1x1);
        DtBg1x1.setBounds(41, 107, 26, 26);

        DtBg5x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x7.setForeground(new Color(204, 204, 204));
        DtBg5x7.setHorizontalAlignment(SwingConstants.CENTER);
        DtBg5x7.setText("1");
        CalendarPanel.add(DtBg5x7);
        DtBg5x7.setBounds(443, 215, 26, 26);

        DtBg3x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x6.setForeground(new Color(67, 67, 89));
        DtBg3x6.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x6);
        DtBg3x6.setBounds(376, 161, 26, 26);

        DtBg3x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg3x7.setForeground(new Color(67, 67, 89));
        DtBg3x7.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg3x7);
        DtBg3x7.setBounds(443, 161, 26, 26);

        DtBg4x7.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x7.setForeground(new Color(67, 67, 89));
        DtBg4x7.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x7);
        DtBg4x7.setBounds(443, 188, 26, 26);

        DtBg4x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x6.setForeground(new Color(67, 67, 89));
        DtBg4x6.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x6);
        DtBg4x6.setBounds(376, 188, 26, 26);

        DtBg4x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x5.setForeground(new Color(67, 67, 89));
        DtBg4x5.setHorizontalAlignment(SwingConstants.CENTER);
        DtBg4x5.setIcon(new ImageIcon(getClass().getResource("/HomeImages/CalendarCurrentDateBg.png")));
        CalendarPanel.add(DtBg4x5);
        DtBg4x5.setBounds(309, 188, 26, 26);

        DtBg4x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x4.setForeground(new Color(67, 67, 89));
        DtBg4x4.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x4);
        DtBg4x4.setBounds(242, 188, 26, 26);

        DtBg4x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x3.setForeground(new Color(67, 67, 89));
        DtBg4x3.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x3);
        DtBg4x3.setBounds(175, 188, 26, 26);

        DtBg4x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x2.setForeground(new Color(67, 67, 89));
        DtBg4x2.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x2);
        DtBg4x2.setBounds(108, 188, 26, 26);

        DtBg4x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg4x1.setForeground(new Color(67, 67, 89));
        DtBg4x1.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg4x1);
        DtBg4x1.setBounds(41, 188, 26, 26);

        DtBg5x1.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x1.setForeground(new Color(67, 67, 89));
        DtBg5x1.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x1);
        DtBg5x1.setBounds(41, 215, 26, 26);

        DtBg5x2.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x2.setForeground(new Color(67, 67, 89));
        DtBg5x2.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x2);
        DtBg5x2.setBounds(108, 215, 26, 26);

        DtBg5x3.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x3.setForeground(new Color(67, 67, 89));
        DtBg5x3.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x3);
        DtBg5x3.setBounds(175, 215, 26, 26);

        DtBg5x4.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x4.setForeground(new Color(67, 67, 89));
        DtBg5x4.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x4);
        DtBg5x4.setBounds(242, 215, 26, 26);

        DtBg5x5.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x5.setForeground(new Color(67, 67, 89));
        DtBg5x5.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x5);
        DtBg5x5.setBounds(309, 215, 26, 26);

        DtBg5x6.setFont(new Font("Dialog", 0, 13)); // NOI18N
        DtBg5x6.setForeground(new Color(67, 67, 89));
        DtBg5x6.setHorizontalAlignment(SwingConstants.CENTER);
        CalendarPanel.add(DtBg5x6);
        DtBg5x6.setBounds(376, 215, 26, 26);

        CalendarPanelBg2.setIcon(new ImageIcon(getClass().getResource("/HomeImages/CalendarPanelBg2.png"))); // NOI18N
        CalendarPanel.add(CalendarPanelBg2);
        CalendarPanelBg2.setBounds(20, 80, 470, 160);

        CalendarPanelBg1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/CalendarPanelBg1.png"))); // NOI18N
        CalendarPanel.add(CalendarPanelBg1);
        CalendarPanelBg1.setBounds(10, 40, 490, 210);

        CalendarHead.setFont(new Font("Dialog", 0, 20)); // NOI18N
        CalendarHead.setForeground(new Color(150, 144, 144));
        CalendarHead.setText("Calendar");
        CalendarHead.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CalendarHeadMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                CalendarHeadMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                CalendarHeadMouseExited(evt);
            }
        });
        CalendarPanel.add(CalendarHead);
        CalendarHead.setBounds(10, 10, 80, 30);

        Home.add(CalendarPanel);
        CalendarPanel.setBounds(520, 180, 510, 260);

        StatResultsPanel.setBackground(new Color(255, 255, 255));
        StatResultsPanel.setLayout(null);

        StatResultsBtn4Txt.setFont(new Font("Dialog", 0, 18)); // NOI18N
        StatResultsBtn4Txt.setForeground(new Color(67, 67, 89));
        StatResultsBtn4Txt.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsBtn4Txt.setText("Failed");
        StatResultsPanel.add(StatResultsBtn4Txt);
        StatResultsBtn4Txt.setBounds(420, 115, 50, 24);

        StatResultsBtn3Txt.setFont(new Font("Dialog", 0, 18)); // NOI18N
        StatResultsBtn3Txt.setForeground(new Color(67, 67, 89));
        StatResultsBtn3Txt.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsBtn3Txt.setText("Passed");
        StatResultsPanel.add(StatResultsBtn3Txt);
        StatResultsBtn3Txt.setBounds(280, 115, 70, 20);

        StatResultsBtn2Txt.setFont(new Font("Dialog", 0, 18)); // NOI18N
        StatResultsBtn2Txt.setForeground(new Color(67, 67, 89));
        StatResultsBtn2Txt.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsBtn2Txt.setText("<html>Highest<br>&nbsp;Marks</html>");
        StatResultsPanel.add(StatResultsBtn2Txt);
        StatResultsBtn2Txt.setBounds(150, 115, 70, 40);

        StatResultsBtn1Txt.setFont(new Font("Dialog", 0, 18)); // NOI18N
        StatResultsBtn1Txt.setForeground(new Color(67, 67, 89));
        StatResultsBtn1Txt.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsBtn1Txt.setText("Retake");
        StatResultsPanel.add(StatResultsBtn1Txt);
        StatResultsBtn1Txt.setBounds(25, 115, 60, 24);

        StatResultsFailValue.setFont(new Font("Arial Black", 0, 36)); // NOI18N
        StatResultsFailValue.setForeground(new Color(67, 67, 89));
        StatResultsFailValue.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsFailValue.setText("007");
        StatResultsPanel.add(StatResultsFailValue);
        StatResultsFailValue.setBounds(409, 60, 72, 30);

        StatResultsPassValue.setFont(new Font("Arial Black", 0, 36)); // NOI18N
        StatResultsPassValue.setForeground(new Color(67, 67, 89));
        StatResultsPassValue.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsPassValue.setText("568");
        StatResultsPanel.add(StatResultsPassValue);
        StatResultsPassValue.setBounds(279, 60, 72, 30);

        StatResultsHigMValue.setFont(new Font("Arial Black", 0, 36)); // NOI18N
        StatResultsHigMValue.setForeground(new Color(67, 67, 89));
        StatResultsHigMValue.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsHigMValue.setText("097");
        StatResultsPanel.add(StatResultsHigMValue);
        StatResultsHigMValue.setBounds(145, 60, 80, 30);

        StatResultsRetakeValue.setFont(new Font("Arial Black", 0, 36)); // NOI18N
        StatResultsRetakeValue.setForeground(new Color(67, 67, 89));
        StatResultsRetakeValue.setHorizontalAlignment(SwingConstants.CENTER);
        StatResultsRetakeValue.setText("000");
        StatResultsPanel.add(StatResultsRetakeValue);
        StatResultsRetakeValue.setBounds(15, 60, 80, 30);

        StatResultsBtn1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); // NOI18N
        StatResultsBtn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatResultsBtn1MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatResultsBtn1MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatResultsBtn1MouseExited(evt);
            }
        });
        StatResultsPanel.add(StatResultsBtn1);
        StatResultsBtn1.setBounds(10, 40, 90, 150);

        StatResultsBtn2.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); // NOI18N
        StatResultsBtn2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatResultsBtn2MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatResultsBtn2MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatResultsBtn2MouseExited(evt);
            }
        });
        StatResultsPanel.add(StatResultsBtn2);
        StatResultsBtn2.setBounds(140, 40, 90, 150);

        StatResultsBtn3.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); // NOI18N
        StatResultsBtn3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatResultsBtn3MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatResultsBtn3MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatResultsBtn3MouseExited(evt);
            }
        });
        StatResultsPanel.add(StatResultsBtn3);
        StatResultsBtn3.setBounds(270, 40, 90, 150);

        StatResultsBtn4.setIcon(new ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); // NOI18N
        StatResultsBtn4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatResultsBtn4MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatResultsBtn4MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatResultsBtn4MouseExited(evt);
            }
        });
        StatResultsPanel.add(StatResultsBtn4);
        StatResultsBtn4.setBounds(400, 40, 90, 150);

        StatResultsHead.setFont(new Font("Dialog", 0, 20)); // NOI18N
        StatResultsHead.setForeground(new Color(150, 144, 144));
        StatResultsHead.setText("Student Result Statistics");
        StatResultsHead.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StatResultsHeadMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                StatResultsHeadMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                StatResultsHeadMouseExited(evt);
            }
        });
        StatResultsPanel.add(StatResultsHead);
        StatResultsHead.setBounds(10, 10, 214, 20);

        Home.add(StatResultsPanel);
        StatResultsPanel.setBounds(10, 380, 500, 200);

        NewsEventsPanel.setBackground(new Color(255, 255, 255));
        NewsEventsPanel.setLayout(null);

        jScrollPane1.setBackground(new Color(243, 243, 247));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jScrollPane1MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                jScrollPane1MouseExited(evt);
            }
        });

        NewsEventsPanelList.setBackground(new Color(243, 243, 247));
        NewsEventsPanelList.setFont(new Font("Dialog", 0, 20)); // NOI18N
        NewsEventsPanelList.setForeground(new Color(67, 67, 89));
        NewsEventsPanelList.setModel(new AbstractListModel<String>() {
            String[] strings = { "(14, Nov)  Children's Day", "(17, Nov)  Annual Sports", "<html><font color=#434359>(20, Nov)&nbsp;&nbsp;<font color=#FEE03A>DJ Night organized by RSC</html>", "(28, Nov)  Mid sem Exam", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        NewsEventsPanelList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        NewsEventsPanelList.setToolTipText("");
        NewsEventsPanelList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NewsEventsPanelListMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NewsEventsPanelListMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NewsEventsPanelListMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(NewsEventsPanelList);

        NewsEventsPanel.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 450, 150);

        NewsEventsPanelBg.setIcon(new ImageIcon(getClass().getResource("/HomeImages/NewsEventsPanelBg.png"))); // NOI18N
        NewsEventsPanelBg.setText("jLabel2");
        NewsEventsPanelBg.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NewsEventsPanelBgMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NewsEventsPanelBgMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NewsEventsPanelBgMouseExited(evt);
            }
        });
        NewsEventsPanel.add(NewsEventsPanelBg);
        NewsEventsPanelBg.setBounds(10, 30, 490, 170);

        NewsEventsHead.setFont(new Font("Dialog", 0, 20)); // NOI18N
        NewsEventsHead.setForeground(new Color(150, 144, 144));
        NewsEventsHead.setText("News & Events");
        NewsEventsHead.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NewsEventsHeadMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                NewsEventsHeadMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                NewsEventsHeadMouseExited(evt);
            }
        });
        NewsEventsPanel.add(NewsEventsHead);
        NewsEventsHead.setBounds(10, 0, 133, 26);

        Home.add(NewsEventsPanel);
        NewsEventsPanel.setBounds(520, 450, 510, 200);

        CalculatorBtn.setIcon(new ImageIcon(getClass().getResource("/HomeImages/button_calculator2.png"))); // NOI18N
        CalculatorBtn.setDoubleBuffered(true);
        CalculatorBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CalculatorBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                CalculatorBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                CalculatorBtnMouseExited(evt);
            }
        });
        Home.add(CalculatorBtn);
        CalculatorBtn.setBounds(18, 600, 480, 50);

        HomeBorder.setBackground(new Color(255, 255, 255));
//        HomeBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 67, 89), 10));
        HomeBorder.setOpaque(true);
        Home.add(HomeBorder);
        HomeBorder.setBounds(-12, 0, 1060, 700);

        JBody.add(Home, "card10");

        Calendar.setBackground(new Color(0, 240, 0));
        Calendar.setLayout(null);
        JBody.add(Calendar, "card9");

        jPanel8.setLayout(null);
        JBody.add(jPanel8, "card8");

        jPanel7.setLayout(null);
        JBody.add(jPanel7, "card7");

        jPanel6.setLayout(null);
        JBody.add(jPanel6, "card6");

        jPanel5.setLayout(null);
        JBody.add(jPanel5, "card5");

        jPanel4.setLayout(null);
        JBody.add(jPanel4, "card4");

        jPanel3.setLayout(null);
        JBody.add(jPanel3, "card3");

        jPanel2.setLayout(null);
        JBody.add(jPanel2, "card2");

        getContentPane().add(JBody);
        JBody.setBounds(252, 0, 1048, 700);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/HomeImages/rsz_home.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 700);

        setSize(new Dimension(1300, 700));
        setLocationRelativeTo(null);
        setTitle("Home");
        setUndecorated(true);
        URL iconURL = getClass().getResource("/HomeImages/icons8_home_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setResizable(false);
    }// </editor-fold>//GEN-END:initComponents

    private void CalendarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=false;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(196, 196, 196));
        CalendarBtn.setForeground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(196, 196, 196));
        CalendarBtnI.setForeground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_thursday_52px_2.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        CalenderPanel CALENDER = new CalenderPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(CALENDER);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Calender");
        URL iconURL = getClass().getResource("/HomeImages/icons8_thursday_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_CalendarBtnMouseClicked

    private void FacultyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=false;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(196, 196, 196));
        FacultyBtn.setForeground(new java.awt.Color(67, 67, 89));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(196, 196, 196));
        FacultyBtnI.setForeground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_classroom_52px_2.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        FacultyPanel FACULTY = new FacultyPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(FACULTY);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Faculty");
        URL iconURL = getClass().getResource("/HomeImages/icons8_classroom_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        
    }//GEN-LAST:event_FacultyBtnMouseClicked

    private void StudentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=false;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(196, 196, 196));
        StudentBtn.setForeground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(196, 196, 196));
        StudentBtnI.setForeground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_student_male_52px_2.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        StudentPanel STUDENT = new StudentPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(STUDENT);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Student");
        URL iconURL = getClass().getResource("/HomeImages/icons8_student_male_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_StudentBtnMouseClicked

    private void NewsboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=false;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(196, 196, 196));
        NewsboardBtn.setForeground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));     
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(196, 196, 196));
        NewsboardBtnI.setForeground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));  
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_news_52px_2.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        NewsPanel NEWS = new NewsPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(NEWS);
        JBody.repaint();
        JBody.revalidate();
        setTitle("News Board");
        URL iconURL = getClass().getResource("/HomeImages/icons8_news_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_NewsboardBtnMouseClicked

    private void LibraryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=false;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(196, 196, 196));
        LibraryBtn.setForeground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));    
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(196, 196, 196));
        LibraryBtnI.setForeground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));   
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_books_48px_2.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        BookPanel BOOK = new BookPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(BOOK);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Library");
        URL iconURL = getClass().getResource("/HomeImages/icons8_books_48px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_LibraryBtnMouseClicked

    private void BroadcastBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=false;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(196, 196, 196));
        BroadcastBtn.setForeground(new java.awt.Color(67, 67, 89));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255)); 
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(196, 196, 196));
        BroadcastBtnI.setForeground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255)); 
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_1icons8_online_52px_2.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        BroadcastPanel BROADCAST = new BroadcastPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(BROADCAST);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Broadcast");
        URL iconURL = getClass().getResource("/HomeImages/icons8_online_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_BroadcastBtnMouseClicked

    private void ExamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=false;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(196, 196, 196));
        ExamBtn.setForeground(new java.awt.Color(67, 67, 89));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255)); 
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(196, 196, 196));
        ExamBtnI.setForeground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255)); 
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_exam_52px_2.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        ExamPanel EXAM = new ExamPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(EXAM);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Exam");
        URL iconURL = getClass().getResource("/HomeImages/icons8_exam_52px_3(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_ExamBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void CalendarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnMouseEntered
        if(Menu.CalendarClSt){
        CalendarBtn.setBackground(new Color(1,89,77));
        CalendarBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_CalendarBtnMouseEntered

    private void FacultyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnMouseEntered
        if(Menu.FacultyClSt){
        FacultyBtn.setBackground(new Color(1,89,77));
        FacultyBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_FacultyBtnMouseEntered

    private void StudentBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseEntered
        if(Menu.StudentClSt){
        StudentBtn.setBackground(new Color(1,89,77));
        StudentBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_StudentBtnMouseEntered

    private void NewsboardBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnMouseEntered
        if(Menu.NewsboardClSt){
        NewsboardBtn.setBackground(new Color(1,89,77));
        NewsboardBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_NewsboardBtnMouseEntered

    private void LibraryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnMouseEntered
        if(Menu.LibraryClSt){
        LibraryBtn.setBackground(new Color(1,89,77));
        LibraryBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_LibraryBtnMouseEntered

    private void BroadcastBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnMouseEntered
        if(Menu.BroadcastClSt){
        BroadcastBtn.setBackground(new Color(1,89,77));
        BroadcastBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_BroadcastBtnMouseEntered

    private void ExamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnMouseEntered
        if(Menu.ExamClSt){
        ExamBtn.setBackground(new Color(1,89,77));
        ExamBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_ExamBtnMouseEntered

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        LogoutBtn.setBackground(new Color(1,89,77));
        LogoutBtnI.setBackground(new Color(1,89,77));
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void CalendarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnMouseExited
        if(Menu.CalendarClSt){
        CalendarBtn.setBackground(new Color(67,67,89));
        CalendarBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_CalendarBtnMouseExited

    private void FacultyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnMouseExited
        if(Menu.FacultyClSt){
        FacultyBtn.setBackground(new Color(67,67,89));
        FacultyBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_FacultyBtnMouseExited

    private void StudentBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseExited
        if(Menu.StudentClSt){
        StudentBtn.setBackground(new Color(67,67,89));
        StudentBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_StudentBtnMouseExited

    private void NewsboardBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnMouseExited
        if(Menu.NewsboardClSt){
        NewsboardBtn.setBackground(new Color(67,67,89));
        NewsboardBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_NewsboardBtnMouseExited

    private void LibraryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnMouseExited
        if(Menu.LibraryClSt){
        LibraryBtn.setBackground(new Color(67,67,89));
        LibraryBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_LibraryBtnMouseExited

    private void BroadcastBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnMouseExited
        if(Menu.BroadcastClSt){
        BroadcastBtn.setBackground(new Color(67,67,89));
        BroadcastBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_BroadcastBtnMouseExited

    private void ExamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnMouseExited
        if(Menu.ExamClSt){
        ExamBtn.setBackground(new Color(67,67,89));
        ExamBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_ExamBtnMouseExited

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        LogoutBtn.setBackground(new Color(67,67,89));
        LogoutBtnI.setBackground(new Color(67,67,89));
    }//GEN-LAST:event_LogoutBtnMouseExited

    private void HomeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseExited
        if(Menu.HomeClSt){
            HomeBtn.setBackground(new Color(67,67,89));
            HomeBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_HomeBtnMouseExited

    private void HomeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseEntered
        if(Menu.HomeClSt) {
            HomeBtn.setBackground(new Color(1,89,77));
            HomeBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_HomeBtnMouseEntered

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        Menu.HomeClSt=false;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=true;
        HomeBtn.setBackground(new java.awt.Color(196, 196, 196));
        HomeBtn.setForeground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setBackground(new java.awt.Color(196, 196, 196));
        HomeBtnI.setForeground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(67, 67, 89));
        EventsBtnI.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_home_52px_2.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_schedule_52px 1.png")));
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(Home);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Home");
        URL iconURL = getClass().getResource("/HomeImages/icons8_home_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void HomeBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnIMouseClicked
        this.HomeBtnMouseClicked(evt);
    }//GEN-LAST:event_HomeBtnIMouseClicked

    private void CalendarBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnIMouseClicked
        this.CalendarBtnMouseClicked(evt);
    }//GEN-LAST:event_CalendarBtnIMouseClicked

    private void FacultyBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnIMouseClicked
        this.FacultyBtnMouseClicked(evt);
    }//GEN-LAST:event_FacultyBtnIMouseClicked

    private void StudentBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnIMouseClicked
        this.StudentBtnMouseClicked(evt);
    }//GEN-LAST:event_StudentBtnIMouseClicked

    private void NewsboardBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnIMouseClicked
        this.NewsboardBtnMouseClicked(evt);
    }//GEN-LAST:event_NewsboardBtnIMouseClicked

    private void LibraryBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnIMouseClicked
        this.LibraryBtnMouseClicked(evt);
    }//GEN-LAST:event_LibraryBtnIMouseClicked

    private void BroadcastBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnIMouseClicked
        this.BroadcastBtnMouseClicked(evt);
    }//GEN-LAST:event_BroadcastBtnIMouseClicked

    private void ExamBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnIMouseClicked
        this.ExamBtnMouseClicked(evt);
    }//GEN-LAST:event_ExamBtnIMouseClicked

    private void EventsBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnIMouseClicked
        this.EventsBtnMouseClicked(evt);
    }//GEN-LAST:event_EventsBtnIMouseClicked

    private void LogoutBtnIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnIMouseClicked
        this.LogoutBtnMouseClicked(evt);
    }//GEN-LAST:event_LogoutBtnIMouseClicked

    private void CalendarBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnIMouseEntered
        this.CalendarBtnMouseEntered(evt);
    }//GEN-LAST:event_CalendarBtnIMouseEntered

    private void CalendarBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarBtnIMouseExited
        this.CalendarBtnMouseExited(evt);
    }//GEN-LAST:event_CalendarBtnIMouseExited

    private void FacultyBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnIMouseEntered
        this.FacultyBtnMouseEntered(evt);
    }//GEN-LAST:event_FacultyBtnIMouseEntered

    private void FacultyBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyBtnIMouseExited
        this.FacultyBtnMouseExited(evt);
    }//GEN-LAST:event_FacultyBtnIMouseExited

    private void StudentBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnIMouseEntered
        this.StudentBtnMouseEntered(evt);
    }//GEN-LAST:event_StudentBtnIMouseEntered

    private void StudentBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnIMouseExited
        this.StudentBtnMouseExited(evt);
    }//GEN-LAST:event_StudentBtnIMouseExited

    private void NewsboardBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnIMouseEntered
        this.NewsboardBtnMouseEntered(evt);
    }//GEN-LAST:event_NewsboardBtnIMouseEntered

    private void NewsboardBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsboardBtnIMouseExited
        this.NewsboardBtnMouseExited(evt);
    }//GEN-LAST:event_NewsboardBtnIMouseExited

    private void LibraryBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnIMouseEntered
        this.LibraryBtnMouseEntered(evt);
    }//GEN-LAST:event_LibraryBtnIMouseEntered

    private void LibraryBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryBtnIMouseExited
        this.LibraryBtnMouseExited(evt);
    }//GEN-LAST:event_LibraryBtnIMouseExited

    private void BroadcastBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnIMouseEntered
        this.BroadcastBtnMouseEntered(evt);
    }//GEN-LAST:event_BroadcastBtnIMouseEntered

    private void BroadcastBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BroadcastBtnIMouseExited
        this.BroadcastBtnMouseExited(evt);
    }//GEN-LAST:event_BroadcastBtnIMouseExited

    private void ExamBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnIMouseEntered
        this.ExamBtnMouseEntered(evt);
    }//GEN-LAST:event_ExamBtnIMouseEntered

    private void ExamBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamBtnIMouseExited
        this.ExamBtnMouseExited(evt);
    }//GEN-LAST:event_ExamBtnIMouseExited

    private void EventsBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnIMouseEntered
        this.EventsBtnMouseEntered(evt);
    }//GEN-LAST:event_EventsBtnIMouseEntered

    private void EventsBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnIMouseExited
        this.EventsBtnMouseExited(evt);
    }//GEN-LAST:event_EventsBtnIMouseExited

    private void LogoutBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnIMouseEntered
        this.LogoutBtnMouseEntered(evt);
    }//GEN-LAST:event_LogoutBtnIMouseEntered

    private void LogoutBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnIMouseExited
        this.LogoutBtnMouseExited(evt);
    }//GEN-LAST:event_LogoutBtnIMouseExited

    private void HomeBtnIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnIMouseEntered
        this.HomeBtnMouseEntered(evt);
    }//GEN-LAST:event_HomeBtnIMouseEntered

    private void HomeBtnIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnIMouseExited
        this.HomeBtnMouseExited(evt);
    }//GEN-LAST:event_HomeBtnIMouseExited

    private void CalculatorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculatorBtnMouseEntered
        CalculatorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/button_calculator1.png")));
    }//GEN-LAST:event_CalculatorBtnMouseEntered

    private void CalculatorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculatorBtnMouseExited
        CalculatorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/button_calculator2.png")));
    }//GEN-LAST:event_CalculatorBtnMouseExited

    private void CalculatorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculatorBtnMouseClicked
        // TODO add your handling code here:
        Runtime app=Runtime.getRuntime();
        try
        {
            //open calculator
            app.exec("calc");
        }
        catch (Exception Ex)
        {
            System.out.println("Error: " + Ex.toString());
        }
    }//GEN-LAST:event_CalculatorBtnMouseClicked

    private void EventsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnMouseExited
        if(Menu.EventsClSt){
            EventsBtn.setBackground(new Color(67,67,89));
            EventsBtnI.setBackground(new Color(67,67,89));
        }
    }//GEN-LAST:event_EventsBtnMouseExited

    private void EventsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnMouseEntered
        if(Menu.EventsClSt){
            EventsBtn.setBackground(new Color(1,89,77));
            EventsBtnI.setBackground(new Color(1,89,77));
        }
    }//GEN-LAST:event_EventsBtnMouseEntered

    private void EventsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsBtnMouseClicked
        Menu.HomeClSt=true;Menu.CalendarClSt=true;Menu.FacultyClSt=true;Menu.StudentClSt=true;Menu.NewsboardClSt=true;Menu.LibraryClSt=true;Menu.BroadcastClSt=true;Menu.ExamClSt=true;Menu.EventsClSt=false;
        HomeBtn.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtn.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtn.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtn.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtn.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtn.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtn.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtn.setBackground(new java.awt.Color(196, 196, 196));
        EventsBtn.setForeground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setBackground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setForeground(new java.awt.Color(255, 255, 255));
        CalendarBtnI.setBackground(new java.awt.Color(67, 67, 89));
        CalendarBtnI.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtnI.setBackground(new java.awt.Color(67, 67, 89));
        FacultyBtnI.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtnI.setBackground(new java.awt.Color(67, 67, 89));
        StudentBtnI.setForeground(new java.awt.Color(255, 255, 255));
        NewsboardBtnI.setBackground(new java.awt.Color(67, 67, 89));
        NewsboardBtnI.setForeground(new java.awt.Color(255, 255, 255));
        LibraryBtnI.setBackground(new java.awt.Color(67, 67, 89));
        LibraryBtnI.setForeground(new java.awt.Color(255, 255, 255));
        BroadcastBtnI.setBackground(new java.awt.Color(67, 67, 89));
        BroadcastBtnI.setForeground(new java.awt.Color(255, 255, 255));
        ExamBtnI.setBackground(new java.awt.Color(67, 67, 89));
        ExamBtnI.setForeground(new java.awt.Color(255, 255, 255));
        EventsBtnI.setBackground(new java.awt.Color(196, 196, 196));
        EventsBtnI.setForeground(new java.awt.Color(67, 67, 89));
        HomeBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_home_52px 1.png")));
        CalendarBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_thursday_52px 1.png")));
        FacultyBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_classroom_52px 1.png")));
        StudentBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_student_male_52px 1.png")));
        NewsboardBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_news_52px 1.png")));
        LibraryBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_books_48px 1.png")));
        BroadcastBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_online_52px 1.png")));
        ExamBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_exam_52px 1.png")));
        EventsBtnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/rsz_icons8_schedule_52px_2.png")));
        EventPanel EVENT = new EventPanel();
        JBody.removeAll();
        JBody.repaint();
        JBody.revalidate();
        JBody.add(EVENT);
        JBody.repaint();
        JBody.revalidate();
        setTitle("Exam");
        setTitle("Events");
        URL iconURL = getClass().getResource("/HomeImages/icons8_schedule_52px_2(black).png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }//GEN-LAST:event_EventsBtnMouseClicked

    private void NewsEventsPanelBgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelBgMouseEntered
        NewsEventsPanelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/NewsEventsPanelBgX.png")));
        NewsEventsPanelList.setBackground(Color.decode("#d4e9fb"));
    }//GEN-LAST:event_NewsEventsPanelBgMouseEntered

    private void NewsEventsPanelBgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelBgMouseExited
        NewsEventsPanelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/NewsEventsPanelBg.png")));
        jScrollPane1.setBackground(new java.awt.Color(243, 243, 247));
        NewsEventsPanelList.setBackground(new java.awt.Color(243, 243, 247));
    }//GEN-LAST:event_NewsEventsPanelBgMouseExited

    private void jScrollPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseEntered

    }//GEN-LAST:event_jScrollPane1MouseEntered

    private void jScrollPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseExited

    }//GEN-LAST:event_jScrollPane1MouseExited

    private void NewsEventsPanelListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelListMouseEntered
        this.NewsEventsPanelBgMouseEntered(evt);
    }//GEN-LAST:event_NewsEventsPanelListMouseEntered

    private void NewsEventsPanelListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelListMouseExited
        this.NewsEventsPanelBgMouseExited(evt);
    }//GEN-LAST:event_NewsEventsPanelListMouseExited

    private void NewsEventsHeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsHeadMouseEntered
       NewsEventsHead.setForeground(new java.awt.Color(67, 67, 89));
    }//GEN-LAST:event_NewsEventsHeadMouseEntered

    private void NewsEventsHeadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsHeadMouseExited
        NewsEventsHead.setForeground(new java.awt.Color(150, 144, 144));
    }//GEN-LAST:event_NewsEventsHeadMouseExited

    private void NewsEventsHeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsHeadMouseClicked
        // TODO add your handling code here:
        EventsBtnMouseClicked(evt);
    }//GEN-LAST:event_NewsEventsHeadMouseClicked

    private void NewsEventsPanelListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelListMouseClicked
        this.NewsEventsHeadMouseClicked(evt);
    }//GEN-LAST:event_NewsEventsPanelListMouseClicked

    private void NewsEventsPanelBgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsEventsPanelBgMouseClicked
        this.NewsEventsHeadMouseClicked(evt);
    }//GEN-LAST:event_NewsEventsPanelBgMouseClicked

    private void StatResultsBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn1MouseEntered
        StatResultsBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBgX.png")));
    }//GEN-LAST:event_StatResultsBtn1MouseEntered

    private void StatResultsBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn1MouseExited
        StatResultsBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); 
    }//GEN-LAST:event_StatResultsBtn1MouseExited

    private void StatResultsBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn2MouseExited
        StatResultsBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); 
    }//GEN-LAST:event_StatResultsBtn2MouseExited

    private void StatResultsBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn2MouseEntered
        StatResultsBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBgX.png"))); 
    }//GEN-LAST:event_StatResultsBtn2MouseEntered

    private void StatResultsBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn3MouseEntered
        StatResultsBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBgX.png"))); 
    }//GEN-LAST:event_StatResultsBtn3MouseEntered

    private void StatResultsBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn3MouseExited
        StatResultsBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); 
    }//GEN-LAST:event_StatResultsBtn3MouseExited

    private void StatResultsBtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn4MouseEntered
        StatResultsBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBgX.png"))); 
    }//GEN-LAST:event_StatResultsBtn4MouseEntered

    private void StatResultsBtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn4MouseExited
        StatResultsBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatResultsBg.png"))); 
    }//GEN-LAST:event_StatResultsBtn4MouseExited

    private void StatResultsHeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsHeadMouseEntered
        StatResultsHead.setForeground(new java.awt.Color(67, 67, 89));
    }//GEN-LAST:event_StatResultsHeadMouseEntered

    private void StatResultsHeadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsHeadMouseExited
        StatResultsHead.setForeground(new java.awt.Color(150, 144, 144));
    }//GEN-LAST:event_StatResultsHeadMouseExited

    private void StatResultsHeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsHeadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StatResultsHeadMouseClicked

    private void StatResultsBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn1MouseClicked
        this.StatResultsHeadMouseClicked(evt);
    }//GEN-LAST:event_StatResultsBtn1MouseClicked

    private void StatResultsBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn2MouseClicked
        this.StatResultsHeadMouseClicked(evt);
    }//GEN-LAST:event_StatResultsBtn2MouseClicked

    private void StatResultsBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn3MouseClicked
        this.StatResultsHeadMouseClicked(evt);
    }//GEN-LAST:event_StatResultsBtn3MouseClicked

    private void StatResultsBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatResultsBtn4MouseClicked
        this.StatResultsHeadMouseClicked(evt);
    }//GEN-LAST:event_StatResultsBtn4MouseClicked

    private void LeaderPanelBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn1MouseEntered
        LeaderPanelBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBgX.png")));
    }//GEN-LAST:event_LeaderPanelBtn1MouseEntered

    private void LeaderPanelBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn1MouseExited
        LeaderPanelBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png")));
    }//GEN-LAST:event_LeaderPanelBtn1MouseExited

    private void LeaderPanelBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn2MouseEntered
        LeaderPanelBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBgX.png"))); 
    }//GEN-LAST:event_LeaderPanelBtn2MouseEntered

    private void LeaderPanelBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn2MouseExited
        LeaderPanelBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png"))); 
    }//GEN-LAST:event_LeaderPanelBtn2MouseExited

    private void LeaderPanelBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn3MouseEntered
        LeaderPanelBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBgX.png"))); 
    }//GEN-LAST:event_LeaderPanelBtn3MouseEntered

    private void LeaderPanelBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn3MouseExited
        LeaderPanelBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/LeaderboardBtnBg.png"))); 
    }//GEN-LAST:event_LeaderPanelBtn3MouseExited

    private void LeaderboardHeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardHeadMouseEntered
        LeaderboardHead.setForeground(new java.awt.Color(67, 67, 89));
    }//GEN-LAST:event_LeaderboardHeadMouseEntered

    private void LeaderboardHeadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardHeadMouseExited
        LeaderboardHead.setForeground(new java.awt.Color(150, 144, 144));
    }//GEN-LAST:event_LeaderboardHeadMouseExited

    private void LeaderboardHeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardHeadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LeaderboardHeadMouseClicked

    private void LeaderPanelBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn1MouseClicked
        this.LeaderboardHeadMouseClicked(evt);
    }//GEN-LAST:event_LeaderPanelBtn1MouseClicked

    private void LeaderPanelBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn2MouseClicked
        this.LeaderboardHeadMouseClicked(evt);
    }//GEN-LAST:event_LeaderPanelBtn2MouseClicked

    private void LeaderPanelBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderPanelBtn3MouseClicked
        this.LeaderboardHeadMouseClicked(evt);
    }//GEN-LAST:event_LeaderPanelBtn3MouseClicked

    private void StatsBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn1MouseEntered
        StatsBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBgX.png")));
    }//GEN-LAST:event_StatsBtn1MouseEntered

    private void StatsBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn1MouseExited
        StatsBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png")));
    }//GEN-LAST:event_StatsBtn1MouseExited

    private void StatsBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn2MouseEntered
        StatsBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBgX.png")));
    }//GEN-LAST:event_StatsBtn2MouseEntered

    private void StatsBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn2MouseExited
        StatsBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png")));
    }//GEN-LAST:event_StatsBtn2MouseExited

    private void StatsBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn3MouseEntered
        StatsBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBgX.png")));
    }//GEN-LAST:event_StatsBtn3MouseEntered

    private void StatsBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn3MouseExited
        StatsBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png")));
    }//GEN-LAST:event_StatsBtn3MouseExited

    private void StatsBtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn4MouseEntered
        StatsBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBgX.png")));
    }//GEN-LAST:event_StatsBtn4MouseEntered

    private void StatsBtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn4MouseExited
        StatsBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/StatsBtnBg.png"))); 
    }//GEN-LAST:event_StatsBtn4MouseExited

    private void StatsBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StatsBtn1MouseClicked

    private void StatsBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn2MouseClicked
        // TODO add your handling code here:
        StudentBtnMouseClicked(evt);
    }//GEN-LAST:event_StatsBtn2MouseClicked

    private void StatsBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn3MouseClicked
        // TODO add your handling code here:
        FacultyBtnMouseClicked(evt);
    }//GEN-LAST:event_StatsBtn3MouseClicked

    private void StatsBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsBtn4MouseClicked
        // TODO add your handling code here:
        BroadcastBtnIMouseClicked(evt);

    }//GEN-LAST:event_StatsBtn4MouseClicked

    private void CalendarHeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarHeadMouseEntered
        CalendarHead.setForeground(new java.awt.Color(67, 67, 89));
    }//GEN-LAST:event_CalendarHeadMouseEntered

    private void CalendarHeadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarHeadMouseExited
        CalendarHead.setForeground(new java.awt.Color(150, 144, 144));
    }//GEN-LAST:event_CalendarHeadMouseExited

    private void PrevMonthBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMonthBtnMouseEntered
        PrevMonthBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 2x.png"))); 
    }//GEN-LAST:event_PrevMonthBtnMouseEntered

    private void PrevMonthBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMonthBtnMouseExited
        PrevMonthBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 2.png"))); 
    }//GEN-LAST:event_PrevMonthBtnMouseExited

    private void NextMonthBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMonthBtnMouseEntered
        NextMonthBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 1x.png")));
    }//GEN-LAST:event_NextMonthBtnMouseEntered

    private void NextMonthBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMonthBtnMouseExited
        NextMonthBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeImages/icons8_expand_arrow_52px 1.png")));
    }//GEN-LAST:event_NextMonthBtnMouseExited

    private void MonthYearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthYearMouseEntered
        MonthYear.setForeground(new java.awt.Color(255, 221, 31));
    }//GEN-LAST:event_MonthYearMouseEntered

    private void MonthYearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthYearMouseExited
        MonthYear.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_MonthYearMouseExited

    private void CalendarHeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarHeadMouseClicked
        // TODO add your handling code here:
        CalendarBtnMouseClicked(evt);
    }//GEN-LAST:event_CalendarHeadMouseClicked

    private void CalendarPanelClkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarPanelClkMouseClicked
        this.CalendarHeadMouseClicked(evt);
    }//GEN-LAST:event_CalendarPanelClkMouseClicked

    private void PrevMonthBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMonthBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrevMonthBtnMouseClicked

    private void MonthYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthYearMouseClicked
        this.CalendarHeadMouseClicked(evt);
    }

    private void NextMonthBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMonthBtnMouseClicked
        // TODO add your handling code here:
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel BroadcastBtn;
    private javax.swing.JLabel BroadcastBtnI;
    private javax.swing.JLabel CalculatorBtn;
    private javax.swing.JPanel Calendar;
    private javax.swing.JLabel CalendarBtn;
    private javax.swing.JLabel CalendarBtnI;
    private javax.swing.JLabel CalendarHead;
    private javax.swing.JPanel CalendarPanel;
    private javax.swing.JLabel CalendarPanelBg1;
    private javax.swing.JLabel CalendarPanelBg2;
    private javax.swing.JLabel CalendarPanelClk;
    private javax.swing.JLabel DoW1;
    private javax.swing.JLabel DoW2;
    private javax.swing.JLabel DoW4;
    private javax.swing.JLabel DoW5;
    private javax.swing.JLabel DoW6;
    private javax.swing.JLabel DoW7;
    private javax.swing.JLabel Dow3;
    private javax.swing.JLabel Dt1x1;
    private javax.swing.JLabel Dt1x2;
    private javax.swing.JLabel Dt1x3;
    private javax.swing.JLabel Dt1x4;
    private javax.swing.JLabel Dt1x5;
    private javax.swing.JLabel Dt1x6;
    private javax.swing.JLabel Dt1x7;
    private javax.swing.JLabel Dt2x1;
    private javax.swing.JLabel Dt2x2;
    private javax.swing.JLabel Dt2x3;
    private javax.swing.JLabel Dt2x4;
    private javax.swing.JLabel Dt2x5;
    private javax.swing.JLabel Dt2x6;
    private javax.swing.JLabel Dt2x7;
    private javax.swing.JLabel Dt3x1;
    private javax.swing.JLabel Dt3x2;
    private javax.swing.JLabel Dt3x3;
    private javax.swing.JLabel Dt3x4;
    private javax.swing.JLabel Dt3x5;
    private javax.swing.JLabel Dt3x6;
    private javax.swing.JLabel Dt3x7;
    private javax.swing.JLabel Dt4x1;
    private javax.swing.JLabel Dt4x2;
    private javax.swing.JLabel Dt4x3;
    private javax.swing.JLabel Dt4x4;
    private javax.swing.JLabel Dt4x5;
    private javax.swing.JLabel Dt4x6;
    private javax.swing.JLabel Dt4x7;
    private javax.swing.JLabel Dt5x1;
    private javax.swing.JLabel Dt5x2;
    private javax.swing.JLabel Dt5x3;
    private javax.swing.JLabel Dt5x4;
    private javax.swing.JLabel Dt5x5;
    private javax.swing.JLabel Dt5x6;
    private javax.swing.JLabel Dt5x7;
    private javax.swing.JLabel DtBg1x1;
    private javax.swing.JLabel DtBg1x2;
    private javax.swing.JLabel DtBg1x3;
    private javax.swing.JLabel DtBg1x4;
    private javax.swing.JLabel DtBg1x5;
    private javax.swing.JLabel DtBg1x6;
    private javax.swing.JLabel DtBg1x7;
    private javax.swing.JLabel DtBg2x1;
    private javax.swing.JLabel DtBg2x2;
    private javax.swing.JLabel DtBg2x3;
    private javax.swing.JLabel DtBg2x4;
    private javax.swing.JLabel DtBg2x5;
    private javax.swing.JLabel DtBg2x6;
    private javax.swing.JLabel DtBg2x7;
    private javax.swing.JLabel DtBg3x1;
    private javax.swing.JLabel DtBg3x2;
    private javax.swing.JLabel DtBg3x3;
    private javax.swing.JLabel DtBg3x4;
    private javax.swing.JLabel DtBg3x5;
    private javax.swing.JLabel DtBg3x6;
    private javax.swing.JLabel DtBg3x7;
    private javax.swing.JLabel DtBg4x1;
    private javax.swing.JLabel DtBg4x2;
    private javax.swing.JLabel DtBg4x3;
    private javax.swing.JLabel DtBg4x4;
    private javax.swing.JLabel DtBg4x5;
    private javax.swing.JLabel DtBg4x6;
    private javax.swing.JLabel DtBg4x7;
    private javax.swing.JLabel DtBg5x1;
    private javax.swing.JLabel DtBg5x2;
    private javax.swing.JLabel DtBg5x3;
    private javax.swing.JLabel DtBg5x4;
    private javax.swing.JLabel DtBg5x5;
    private javax.swing.JLabel DtBg5x6;
    private javax.swing.JLabel DtBg5x7;
    private javax.swing.JLabel EventsBtn;
    private javax.swing.JLabel EventsBtnI;
    private javax.swing.JLabel ExamBtn;
    private javax.swing.JLabel ExamBtnI;
    private javax.swing.JLabel FacultyBtn;
    private javax.swing.JLabel FacultyBtnI;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel HomeBorder;
    private javax.swing.JLabel HomeBtn;
    private javax.swing.JLabel HomeBtnI;
    public static javax.swing.JPanel JBody;
    private javax.swing.JPanel JMenu;
    private javax.swing.JLabel LeaderPanelBtn1;
    private javax.swing.JLabel LeaderPanelBtn2;
    private javax.swing.JLabel LeaderPanelBtn3;
    private javax.swing.JLabel LeaderboardHead;
    private javax.swing.JPanel LeaderboardPanel;
    private javax.swing.JLabel LeaderboardPanelBg;
    private javax.swing.JLabel LeaderboardPanelTxt1;
    private javax.swing.JLabel LeaderboardPanelTxt2;
    private javax.swing.JLabel LeaderboardPanelTxt3;
    private javax.swing.JLabel LibraryBtn;
    private javax.swing.JLabel LibraryBtnI;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel LogoutBtnI;
    private javax.swing.JLabel MonthYear;
    private javax.swing.JLabel NewsEventsHead;
    private javax.swing.JPanel NewsEventsPanel;
    private javax.swing.JLabel NewsEventsPanelBg;
    private javax.swing.JList<String> NewsEventsPanelList;
    private javax.swing.JLabel NewsboardBtn;
    private javax.swing.JLabel NewsboardBtnI;
    private javax.swing.JLabel NextMonthBtn;
    private javax.swing.JLabel PrevMonthBtn;
    private javax.swing.JLabel StatResultsBtn1;
    private javax.swing.JLabel StatResultsBtn1Txt;
    private javax.swing.JLabel StatResultsBtn2;
    private javax.swing.JLabel StatResultsBtn2Txt;
    private javax.swing.JLabel StatResultsBtn3;
    private javax.swing.JLabel StatResultsBtn3Txt;
    private javax.swing.JLabel StatResultsBtn4;
    private javax.swing.JLabel StatResultsBtn4Txt;
    private javax.swing.JLabel StatResultsFailValue;
    private javax.swing.JLabel StatResultsHead;
    private javax.swing.JLabel StatResultsHigMValue;
    private javax.swing.JPanel StatResultsPanel;
    private javax.swing.JLabel StatResultsPassValue;
    private javax.swing.JLabel StatResultsRetakeValue;
    private javax.swing.JLabel StatsBtn1;
    private javax.swing.JLabel StatsBtn2;
    private javax.swing.JLabel StatsBtn3;
    private javax.swing.JLabel StatsBtn4;
    private javax.swing.JLabel StatsBtnI1;
    private javax.swing.JLabel StatsBtnI2;
    private javax.swing.JLabel StatsBtnI3;
    private javax.swing.JLabel StatsBtnI4;
    private javax.swing.JLabel StatsBtnTxr1;
    private javax.swing.JLabel StatsBtnTxt2;
    private javax.swing.JLabel StatsBtnTxt3;
    private javax.swing.JLabel StatsBtnTxt4;
    private javax.swing.JLabel StatsClassesValue;
    private javax.swing.JLabel StatsHead;
    private javax.swing.JLabel StatsNtfValue;
    private javax.swing.JPanel StatsPanel;
    private javax.swing.JLabel StatsStudentsValue;
    private javax.swing.JLabel StatsTeachersValue;
    private javax.swing.JLabel StudentBtn;
    private javax.swing.JLabel StudentBtnI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
