package Views;

import Controllers.AdminController;
import Controllers.EmployeeController;
import Database.Database;
import Models.Admin;
import Models.Employee;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
//import java.awt.Event.KeyEvent;


/**
 *
 * @author khopi
 */
public class adminView extends javax.swing.JFrame {
    
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    ArrayList<String[]> results;
    
    Set<String> s;

    /**
     * Creates new form adminView
     */
    public adminView() {
        initComponents();
        this.setLocationRelativeTo(null); // to center the lgin form
        //super();
        db = new Database();
        con = db.getConnection();
        
        s = new TreeSet<String>();
        s.add("January");
        s.add("February");
        s.add("March");
        s.add("April");
        s.add("May");
        s.add("June");
        s.add("July");
        s.add("August");
        s.add("September");
        s.add("October");
        s.add("November");
        s.add("December");
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1registerminimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3registerclose = new javax.swing.JLabel();
        logOutLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btntogotoRegister = new javax.swing.JButton();
        jButton2loginCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        monthForPerforTxtFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SuddenChngPerforBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        firstMonthFroPerforTxtFld = new javax.swing.JTextField();
        secondMonthFroPerforTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yearForPerforTxtFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        secondYrTxtFld = new javax.swing.JTextField();
        firstYrTxtFld = new javax.swing.JTextField();
        perfoForMonthBtn = new javax.swing.JButton();
        perforClearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        perforSuddenChangeClearBtn = new javax.swing.JButton();
        adminNextBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rateNameTxtFld = new javax.swing.JTextField();
        rateMonthTxtFld = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rateYearTxtFld = new javax.swing.JTextField();
        ratingsTxtFld1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addRateBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 592));

        jPanel1.setBackground(new java.awt.Color(206, 104, 8));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 110));

        jLabel1registerminimize.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1registerminimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1registerminimize.setText("-");
        jLabel1registerminimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1registerminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1registerminimizeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello admin");

        jLabel3registerclose.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3registerclose.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3registerclose.setText("x");
        jLabel3registerclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3registerclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3registercloseMouseClicked(evt);
            }
        });

        logOutLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logOutLbl.setForeground(new java.awt.Color(255, 255, 255));
        logOutLbl.setText("log out");
        logOutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1registerminimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3registerclose)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logOutLbl)
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(536, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3registerclose)
                    .addComponent(jLabel1registerminimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(logOutLbl)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(33, 33, 33)))
        );

        jPanel2.setBackground(new java.awt.Color(42, 49, 66));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 492));

        btntogotoRegister.setBackground(new java.awt.Color(59, 158, 229));
        btntogotoRegister.setForeground(new java.awt.Color(0, 0, 0));
        btntogotoRegister.setText("Register employee");
        btntogotoRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntogotoRegisterActionPerformed(evt);
            }
        });

        jButton2loginCancel.setBackground(new java.awt.Color(206, 28, 28));
        jButton2loginCancel.setForeground(new java.awt.Color(0, 0, 0));
        jButton2loginCancel.setText("Cancel");
        jButton2loginCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2loginCancelMouseClicked(evt);
            }
        });
        jButton2loginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2loginCancelActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(87, 100, 132));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emoloyee", "Performance"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(87, 100, 132));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Duration Performance for Particular month");

        monthForPerforTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        monthForPerforTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        monthForPerforTxtFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monthForPerforTxtFldKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Enter month :");

        SuddenChngPerforBtn.setBackground(new java.awt.Color(59, 158, 229));
        SuddenChngPerforBtn.setForeground(new java.awt.Color(0, 0, 0));
        SuddenChngPerforBtn.setText("ok");
        SuddenChngPerforBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuddenChngPerforBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Duration Performance sudden change ");

        firstMonthFroPerforTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        firstMonthFroPerforTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        firstMonthFroPerforTxtFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstMonthFroPerforTxtFldKeyReleased(evt);
            }
        });

        secondMonthFroPerforTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        secondMonthFroPerforTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        secondMonthFroPerforTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondMonthFroPerforTxtFldActionPerformed(evt);
            }
        });
        secondMonthFroPerforTxtFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                secondMonthFroPerforTxtFldKeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("1st month :");

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("2nd month :");

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Enter year :");

        yearForPerforTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        yearForPerforTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        yearForPerforTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearForPerforTxtFldActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Year :");

        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Year :");

        secondYrTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        secondYrTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        secondYrTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondYrTxtFldActionPerformed(evt);
            }
        });

        firstYrTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        firstYrTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        firstYrTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstYrTxtFldActionPerformed(evt);
            }
        });

        perfoForMonthBtn.setBackground(new java.awt.Color(59, 158, 229));
        perfoForMonthBtn.setForeground(new java.awt.Color(0, 0, 0));
        perfoForMonthBtn.setText("ok");
        perfoForMonthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfoForMonthBtnActionPerformed(evt);
            }
        });

        perforClearBtn.setBackground(new java.awt.Color(206, 28, 28));
        perforClearBtn.setForeground(new java.awt.Color(0, 0, 0));
        perforClearBtn.setText("clear");
        perforClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perforClearBtnActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(87, 100, 132));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emoloyee", "1st Performance", "2nd Performance", "Change"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(87, 100, 132));
        jScrollPane2.setViewportView(jTable2);

        perforSuddenChangeClearBtn.setBackground(new java.awt.Color(206, 28, 28));
        perforSuddenChangeClearBtn.setForeground(new java.awt.Color(0, 0, 0));
        perforSuddenChangeClearBtn.setText("clear");
        perforSuddenChangeClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perforSuddenChangeClearBtnActionPerformed(evt);
            }
        });

        adminNextBtn.setBackground(new java.awt.Color(59, 158, 229));
        adminNextBtn.setForeground(new java.awt.Color(0, 0, 0));
        adminNextBtn.setText("Next");
        adminNextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNextBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(59, 158, 229));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Edit");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Rate employee");

        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Name :");

        rateNameTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        rateNameTxtFld.setForeground(new java.awt.Color(204, 204, 255));

        rateMonthTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        rateMonthTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        rateMonthTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateMonthTxtFldActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Month :");

        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("Year :");

        rateYearTxtFld.setBackground(new java.awt.Color(87, 100, 132));
        rateYearTxtFld.setForeground(new java.awt.Color(204, 204, 255));
        rateYearTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateYearTxtFldActionPerformed(evt);
            }
        });

        ratingsTxtFld1.setBackground(new java.awt.Color(87, 100, 132));
        ratingsTxtFld1.setForeground(new java.awt.Color(204, 204, 255));
        ratingsTxtFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingsTxtFld1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setText("Ratings :");

        addRateBtn.setBackground(new java.awt.Color(59, 158, 229));
        addRateBtn.setForeground(new java.awt.Color(0, 0, 0));
        addRateBtn.setText("Add");
        addRateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRateBtnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(59, 158, 229));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Update");

        jButton4.setBackground(new java.awt.Color(59, 158, 229));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SuddenChngPerforBtn)
                        .addGap(6, 6, 6)
                        .addComponent(perforSuddenChangeClearBtn))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(5, 5, 5)
                                    .addComponent(monthForPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(16, 16, 16)
                                    .addComponent(yearForPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(36, 36, 36)
                            .addComponent(perfoForMonthBtn)
                            .addGap(6, 6, 6)
                            .addComponent(perforClearBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rateYearTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ratingsTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rateNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rateMonthTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(addRateBtn)
                                        .addGap(526, 526, 526))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btntogotoRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(adminNextBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2loginCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstMonthFroPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstYrTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondMonthFroPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondYrTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(190, 190, 190)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfoForMonthBtn)
                            .addComponent(perforClearBtn))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(13, 13, 13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(monthForPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(yearForPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firstMonthFroPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(firstYrTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(secondMonthFroPerforTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondYrTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SuddenChngPerforBtn)
                            .addComponent(perforSuddenChangeClearBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(rateNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rateMonthTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2loginCancel)
                            .addComponent(adminNextBtn)
                            .addComponent(btntogotoRegister))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addRateBtn)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rateYearTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ratingsTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))
                                .addGap(19, 19, 19))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1registerminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1registerminimizeMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1registerminimizeMouseClicked

    private void jLabel3registercloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3registercloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel3registercloseMouseClicked

    private void jButton2loginCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2loginCancelMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jButton2loginCancelMouseClicked

    private void jButton2loginCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2loginCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2loginCancelActionPerformed

    private void btntogotoRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntogotoRegisterActionPerformed
       
        new registerForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntogotoRegisterActionPerformed

    private void yearForPerforTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearForPerforTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearForPerforTxtFldActionPerformed

    private void secondYrTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondYrTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondYrTxtFldActionPerformed

    private void firstYrTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstYrTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstYrTxtFldActionPerformed

    private void perfoForMonthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfoForMonthBtnActionPerformed
        
        String month = monthForPerforTxtFld.getText();
        String year = yearForPerforTxtFld.getText();
        

        String sql = "";
        ResultSet rs = null;
        ArrayList<User> userList = new ArrayList<User>();
        
        
            try
            
            {
                sql = "SELECT FULL_NAME,ROUND(SUM(WORKED_HOURS)/(COUNT(WORKED_HOURS)*9)*100,2) AS Performance"
                        + " FROM worked_time WHERE WORKED_YEAR =? AND"
                        + " WORKED_MONTH = ? GROUP BY FULL_NAME";
                pst = con.prepareStatement(sql);

                pst.setString(1, year);
                pst.setString(2, month);

                rs = pst.executeQuery();
                User user;

                while(rs.next()){
                   user = new User(rs.getString("FULL_NAME"),rs.getFloat("Performance")); 
                   userList.add(user);
                }


                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] row = new Object[2];

                for(int i = 0; i < userList.size(); i++){
                    row[0] = userList.get(i).FULL_NAME;
                    row[1] = userList.get(i).Performance+"%";

                    model.addRow(row);
                }
                                                     
            }catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
        
    }//GEN-LAST:event_perfoForMonthBtnActionPerformed

    private void perforClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perforClearBtnActionPerformed
       
       DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        while(dm.getRowCount() > 0)
        {
            dm.removeRow(0);
        } 
        
    }//GEN-LAST:event_perforClearBtnActionPerformed

    private void perforSuddenChangeClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perforSuddenChangeClearBtnActionPerformed
        
        DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
        while(dm.getRowCount() > 0)
        {
            dm.removeRow(0);
        }
        
    }//GEN-LAST:event_perforSuddenChangeClearBtnActionPerformed

    private void SuddenChngPerforBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuddenChngPerforBtnActionPerformed
       
        String firstMonth = firstMonthFroPerforTxtFld.getText();
        String firstYear = firstYrTxtFld.getText();
        String secondMonth = secondMonthFroPerforTxtFld.getText();
        String secondYear = secondYrTxtFld.getText();
        

        String sql = "";
        ResultSet rs = null;
        ArrayList<User2> userList = new ArrayList<User2>();
        
        
            try
            
            {
                sql = "SELECT FIRST_MONTH.FULL_NAME, FIRST_MONTH_PERFORMANCE, SECOND_MONTH_PERFORMANCE, ROUND(((SECOND_MONTH_PERFORMANCE - FIRST_MONTH_PERFORMANCE)/FIRST_MONTH_PERFORMANCE),2) AS PERFORMANCE_CHANGE "
                        + "FROM ( "
                             + "SELECT ROUND(SUM(WORKED_HOURS)/(COUNT(WORKED_HOURS)*9)*100,2) AS FIRST_MONTH_PERFORMANCE, FULL_NAME "
                             + "FROM worked_time "
                             + "WHERE WORKED_MONTH = ? AND WORKED_YEAR = ?"
                             + " GROUP BY FULL_NAME "
                             + ") AS FIRST_MONTH"
                        + " INNER JOIN "
                        + "("
                             + " SELECT ROUND(SUM(WORKED_HOURS)/(COUNT(WORKED_HOURS)*9)*100,2) AS SECOND_MONTH_PERFORMANCE, FULL_NAME "
                             + "FROM worked_time "
                             + "WHERE WORKED_MONTH = ? AND WORKED_YEAR = ? "
                             + "GROUP BY FULL_NAME "
                             + ") AS SECOND_MONTH "
                        + "ON FIRST_MONTH.FULL_NAME = SECOND_MONTH.FULL_NAME;";
                
                
                pst = con.prepareStatement(sql);

                pst.setString(1, firstMonth);
                pst.setString(2, firstYear);
                pst.setString(3, secondMonth);
                pst.setString(4, secondYear);

                rs = pst.executeQuery();
                User2 user;

                while(rs.next()){
                   user = new User2(rs.getString("FULL_NAME"),rs.getString("First_month_performance"),rs.getString("Second_month_performance"),rs.getFloat("PERFORMANCE_CHANGE")); 
                   userList.add(user);
                }


                DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                Object[] row = new Object[4];

                for(int i = 0; i < userList.size(); i++){
                    row[0] = userList.get(i).FULL_NAME;
                    row[1] = userList.get(i).First_month_performance+"%";
                    row[2] = userList.get(i).Second_month_performance+"%";
                    row[3] = userList.get(i).PERFORMANCE_CHANGE;

                    model.addRow(row);
                }
                                                     
            }catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
        
    }//GEN-LAST:event_SuddenChngPerforBtnActionPerformed

    private void secondMonthFroPerforTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondMonthFroPerforTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondMonthFroPerforTxtFldActionPerformed

    private void adminNextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNextBtnActionPerformed
        
        new adminView2().setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_adminNextBtnActionPerformed

    private void rateMonthTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateMonthTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateMonthTxtFldActionPerformed

    private void rateYearTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateYearTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateYearTxtFldActionPerformed

    private void ratingsTxtFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingsTxtFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingsTxtFld1ActionPerformed

    private void addRateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRateBtnActionPerformed
        
        String name = rateNameTxtFld.getText();
        String month = rateMonthTxtFld.getText();
        String year = rateYearTxtFld.getText();
        int ratings = Integer.parseInt(ratingsTxtFld1.getText());
        
        Admin a = new Admin();
        a.setRateName(name);
        a.setRateMonth(month);
        a.setRateYear(year);
        a.setRatings(ratings);
        
        AdminController ac = new AdminController();
        
        int res = ac.addRatings(a);
        
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Saved");
            new adminView().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save");
        }
        
        
    }//GEN-LAST:event_addRateBtnActionPerformed

    private void logOutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLblMouseClicked

        new loginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutLblMouseClicked

    private void monthForPerforTxtFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthForPerforTxtFldKeyReleased
        
       if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE){
           
       }else{
          
       String to_check = monthForPerforTxtFld.getText();
       int to_check_len = to_check.length();
       for(String data:s){
           
           String check_form_data = "";
           for(int i = 0; i < to_check_len; i++){
             
               if(to_check_len <= data.length()){
                   
                   check_form_data = check_form_data + data.charAt(i);
               }
           }
           
           if(check_form_data.equals(to_check)){
              monthForPerforTxtFld.setText(data);
              monthForPerforTxtFld.setSelectionStart(to_check_len);
              monthForPerforTxtFld.setSelectionEnd(data.length());
              break;
           }
       }
       } 
        
      
       
    }//GEN-LAST:event_monthForPerforTxtFldKeyReleased

    private void firstMonthFroPerforTxtFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstMonthFroPerforTxtFldKeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE){
           
       }else{
          
            String to_check = firstMonthFroPerforTxtFld.getText();
       int to_check_len = to_check.length();
       for(String data:s){
           
           String check_form_data = "";
           for(int i = 0; i < to_check_len; i++){
             
               if(to_check_len <= data.length()){
                   
                   check_form_data = check_form_data + data.charAt(i);
               }
           }
           
           if(check_form_data.equals(to_check)){
              firstMonthFroPerforTxtFld.setText(data);
              firstMonthFroPerforTxtFld.setSelectionStart(to_check_len);
              firstMonthFroPerforTxtFld.setSelectionEnd(data.length());
              break;
           }
       }
       } 
        
      
       
        
    }//GEN-LAST:event_firstMonthFroPerforTxtFldKeyReleased

    private void secondMonthFroPerforTxtFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondMonthFroPerforTxtFldKeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE){
           
       }else{
          
            String to_check = secondMonthFroPerforTxtFld.getText();
       int to_check_len = to_check.length();
       for(String data:s){
           
           String check_form_data = "";
           for(int i = 0; i < to_check_len; i++){
             
               if(to_check_len <= data.length()){
                   
                   check_form_data = check_form_data + data.charAt(i);
               }
           }
           
           if(check_form_data.equals(to_check)){
              secondMonthFroPerforTxtFld.setText(data);
              secondMonthFroPerforTxtFld.setSelectionStart(to_check_len);
              secondMonthFroPerforTxtFld.setSelectionEnd(data.length());
              break;
           }
       }
       } 
    }//GEN-LAST:event_secondMonthFroPerforTxtFldKeyReleased
       

    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SuddenChngPerforBtn;
    private javax.swing.JButton addRateBtn;
    private javax.swing.JButton adminNextBtn;
    private javax.swing.JButton btntogotoRegister;
    private javax.swing.JTextField firstMonthFroPerforTxtFld;
    private javax.swing.JTextField firstYrTxtFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2loginCancel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1registerminimize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3registerclose;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logOutLbl;
    private javax.swing.JTextField monthForPerforTxtFld;
    private javax.swing.JButton perfoForMonthBtn;
    private javax.swing.JButton perforClearBtn;
    private javax.swing.JButton perforSuddenChangeClearBtn;
    private javax.swing.JTextField rateMonthTxtFld;
    private javax.swing.JTextField rateNameTxtFld;
    private javax.swing.JTextField rateYearTxtFld;
    private javax.swing.JTextField ratingsTxtFld1;
    private javax.swing.JTextField secondMonthFroPerforTxtFld;
    private javax.swing.JTextField secondYrTxtFld;
    private javax.swing.JTextField yearForPerforTxtFld;
    // End of variables declaration//GEN-END:variables
}
