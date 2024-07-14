/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

//import MiniFrames.*;
import MiniFrames.*;
import default_package.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo-x130
 */
public class ManageInventory extends javax.swing.JFrame {

    // Gets the window's screen position
    int xx, xy;

    //Global variable for Hover Effect
    Color mouseEnterColor = new Color(255, 153, 0);
    Color mouseExitColor = new Color(51, 51, 51);

    String productName, pricePerProduct, qty, qtyBal, total, today_date;

    DefaultTableModel model;

    public ManageInventory() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_menu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtTime = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_viewIssuedGood = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_manageInventory = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl_manageUsers = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_issueGood = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbl_returnGood = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl_viewRecords = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl_defaulterList = new javax.swing.JLabel();
        panel_manageInventory = new javax.swing.JPanel();
        panel_toolbar = new javax.swing.JPanel();
        lbl_addProduct = new javax.swing.JLabel();
        cbo_products = new rojerusan.RSComboMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtYesterdayQty = new javax.swing.JTextField();
        tot_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inventory = new rojerusan.RSTableMetro();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BLESSED SHOP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 280, -1));

        lbl_close.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_close.setText("X");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 40));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 5, 50));

        lbl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        lbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel2.setText("Welcome, Admin");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        jPanel15.setBackground(new java.awt.Color(102, 153, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel15.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 30));

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel15.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 190, 30));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 240, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        parentPanel.setLayout(null);

        panel_menu.setBackground(new java.awt.Color(51, 51, 51));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Features");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 60));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel5.setText("   Home Page");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 190, 30));

        panel_menu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 60));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(153, 153, 153));
        lbl_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Library_32px.png"))); // NOI18N
        lbl_dashboard.setText("  Dashboard");
        lbl_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_dashboardMouseExited(evt);
            }
        });
        jPanel6.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 60));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_viewIssuedGood.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_viewIssuedGood.setForeground(new java.awt.Color(153, 153, 153));
        lbl_viewIssuedGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_List_of_Thumbnails_50px.png"))); // NOI18N
        lbl_viewIssuedGood.setText("View Issued Goods");
        lbl_viewIssuedGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_viewIssuedGoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_viewIssuedGoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_viewIssuedGoodMouseExited(evt);
            }
        });
        jPanel7.add(lbl_viewIssuedGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 240, 40));

        panel_menu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 60));

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_manageInventory.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_manageInventory.setForeground(new java.awt.Color(153, 153, 153));
        lbl_manageInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_List_of_Thumbnails_50px.png"))); // NOI18N
        lbl_manageInventory.setText("Manage Inventory");
        jPanel8.add(lbl_manageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 240, 40));

        panel_menu.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 60));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_manageUsers.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_manageUsers.setForeground(new java.awt.Color(153, 153, 153));
        lbl_manageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        lbl_manageUsers.setText("  Manage Users");
        lbl_manageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_manageUsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_manageUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_manageUsersMouseExited(evt);
            }
        });
        jPanel9.add(lbl_manageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 60));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_issueGood.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_issueGood.setForeground(new java.awt.Color(153, 153, 153));
        lbl_issueGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        lbl_issueGood.setText("  Issue Goods");
        lbl_issueGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_issueGoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_issueGoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_issueGoodMouseExited(evt);
            }
        });
        jPanel10.add(lbl_issueGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 60));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_returnGood.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_returnGood.setForeground(new java.awt.Color(153, 153, 153));
        lbl_returnGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        lbl_returnGood.setText("  Return Goods");
        lbl_returnGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_returnGoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_returnGoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_returnGoodMouseExited(evt);
            }
        });
        jPanel11.add(lbl_returnGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 60));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_viewRecords.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_viewRecords.setForeground(new java.awt.Color(153, 153, 153));
        lbl_viewRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        lbl_viewRecords.setText("  View Records");
        lbl_viewRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_viewRecordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_viewRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_viewRecordsMouseExited(evt);
            }
        });
        jPanel12.add(lbl_viewRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 60));

        jPanel14.setBackground(new java.awt.Color(153, 51, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        lbl_logout.setText("  Log Out");
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel14.add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 250, 60));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_defaulterList.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbl_defaulterList.setForeground(new java.awt.Color(153, 153, 153));
        lbl_defaulterList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        lbl_defaulterList.setText("  Defaulter List");
        lbl_defaulterList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_defaulterListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_defaulterListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_defaulterListMouseExited(evt);
            }
        });
        jPanel13.add(lbl_defaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 230, 30));

        panel_menu.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 250, 60));

        parentPanel.add(panel_menu);
        panel_menu.setBounds(0, 0, 250, 700);

        panel_manageInventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_toolbar.setBackground(new java.awt.Color(102, 102, 102));
        panel_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_addProduct.setBackground(new java.awt.Color(0, 153, 153));
        lbl_addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/addProduct.jpeg"))); // NOI18N
        lbl_addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_addProductMouseClicked(evt);
            }
        });
        panel_toolbar.add(lbl_addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 60));

        panel_manageInventory.add(panel_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 70));

        cbo_products.setForeground(new java.awt.Color(0, 0, 0));
        cbo_products.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        cbo_products.setColorBorde(new java.awt.Color(102, 102, 102));
        cbo_products.setColorFondo(new java.awt.Color(255, 153, 0));
        cbo_products.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbo_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_productsActionPerformed(evt);
            }
        });
        panel_manageInventory.add(cbo_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Total:");
        panel_manageInventory.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Product:");
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_manageInventory.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        txtprice.setEditable(false);
        txtprice.setBackground(new java.awt.Color(255, 255, 255));
        txtprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(0, 102, 102));
        txtprice.setText("00.00");
        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpriceKeyTyped(evt);
            }
        });
        panel_manageInventory.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Price per Product:");
        panel_manageInventory.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 30));

        txtQty.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyKeyTyped(evt);
            }
        });
        panel_manageInventory.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Quantity Delivered:");
        panel_manageInventory.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 30));

        txtYesterdayQty.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtYesterdayQty.setText("0");
        txtYesterdayQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYesterdayQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYesterdayQtyKeyTyped(evt);
            }
        });
        panel_manageInventory.add(txtYesterdayQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 30));

        tot_price.setEditable(false);
        tot_price.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tot_price.setForeground(new java.awt.Color(0, 102, 102));
        panel_manageInventory.add(tot_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Yesterday's Return:");
        panel_manageInventory.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 30));

        tbl_inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price/ Item", "Qty_Delivered", "Yesterday's Return", "Qty_Total", "Total Price", "Date"
            }
        ));
        tbl_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_inventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_inventory);

        panel_manageInventory.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 820, 610));

        btnSave.setBackground(new java.awt.Color(102, 255, 102));
        btnSave.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnSave.setText("SAVE CHANGES");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panel_manageInventory.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, -1));

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnDelete.setText("DELETE ENTRIES");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panel_manageInventory.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 160, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnUpdate.setText("UPDATE ENTRIES");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panel_manageInventory.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, -1));

        btnPrint.setBackground(new java.awt.Color(153, 153, 255));
        btnPrint.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panel_manageInventory.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, -1, 30));

        parentPanel.add(panel_manageInventory);
        panel_manageInventory.setBounds(250, 0, 1120, 700);

        getContentPane().add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 700));

        setSize(new java.awt.Dimension(1366, 766));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
//        setTime();
        Time.setTime(txtTime, txtDate);  // Calling the setTime method from the Time class
        loadProducts();
    }

    private void loadProducts() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT product_name FROM products";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String productName = rs.getString("product_name");
                cbo_products.addItem(productName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get product price from the database
    private void fetchProductPrice(String productName) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT price FROM products WHERE product_name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, productName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            } else {
                txtprice.setText("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //method to clear jtable before adding new data on it
    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_inventory.getModel();
        model.setRowCount(0);
    }

    //to pull the users' details from the db to the table
    public void setPoductDetailsToTable() {

        try {
            Connection con = DBConnection.getConnection();

            // Get the current date from the JLabel in the desired format
            String today_date = txtDate.getText();

            String sql = "SELECT * FROM inventory WHERE date = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, today_date);

            ResultSet rs = st.executeQuery();
            st.setString(1, today_date);

            while (rs.next()) {
//                String productName, pricePerProduct, qty, qtyBal, total, today_date;
                String productName = rs.getString("product_name");
                String pricePerProduct = rs.getString("price_per_product");
                String qty = rs.getString("qty_delivered");
                String qtyBal = rs.getString("yesterday_bal");
                String total_qty = rs.getString("total_qty");
                String total = rs.getString("total_price");
                String t_date = rs.getString("date");

                Object[] obj = {productName, pricePerProduct, qty, qtyBal, total_qty, total, t_date};
                model = (DefaultTableModel) tbl_inventory.getModel();
                //adds a row array
                model.addRow(obj);
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    To calculate the product of Inventory
    private void pro_total() {

        Integer a = Integer.parseInt(txtprice.getText());
        Integer b = Integer.parseInt(txtQty.getText());
        Integer c = Integer.parseInt(txtYesterdayQty.getText());

        Integer tot;

        tot = a * (b + c);

        tot_price.setText(String.valueOf(tot));
    }

    //to add products to the database in student_details table
    public boolean addProduct() {

        boolean isAdded = false;

        productName = (String) cbo_products.getSelectedItem();
        pricePerProduct = txtprice.getText();
        qty = txtQty.getText();
        qtyBal = txtYesterdayQty.getText();
        total = tot_price.getText();
        today_date = txtDate.getText();

        try {
            // Parse quantity fields to integers
            int qtyValue = Integer.parseInt(qty);
            int qtyBalValue = Integer.parseInt(qtyBal);

            // Calculate total quantity
            int totalQty = qtyValue + qtyBalValue;

            //checks for duplicate entry using product name and today's date
//            checkduplicate();
            Connection con = DBConnection.getConnection();

            // Check for duplicates
            String checkSql = "SELECT COUNT(*) FROM inventory WHERE product_name = ? AND date = ?";
            PreparedStatement checkPst = con.prepareStatement(checkSql);
            checkPst.setString(1, productName);
            checkPst.setString(2, today_date);
            ResultSet rs = checkPst.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Already added this product on this day");
                clearComponents();
                return isAdded;
            }

            String sql = "insert into inventory (product_name, price_per_product, qty_delivered, yesterday_bal, total_qty,"
                    + " total_price, date) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            //sets the values from the textfield to the colums in the db
            pst.setString(1, productName);
            pst.setString(2, pricePerProduct);
            pst.setInt(3, qtyValue);
            pst.setInt(4, qtyBalValue);
            pst.setInt(5, totalQty);
            pst.setString(6, total);
            pst.setString(7, today_date);

            //If a database row is added to output a success message
            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                isAdded = true;
            } else {
                isAdded = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //returns the 'isAdded' variable value
        return isAdded;

    }

    //method to Update the product details
    public boolean updateProduct() {

        // Get the current date from the JLabel in the desired format
        String today = txtDate.getText();

        boolean isUpdated = false;

        productName = (String) cbo_products.getSelectedItem();
        pricePerProduct = txtprice.getText();
        qty = txtQty.getText();
        qtyBal = txtYesterdayQty.getText();
        total = tot_price.getText();
//        today_date = txtDate.getText();

        try {
            // Parse quantity fields to integers
            int qtyVal = Integer.parseInt(qty);
            int qtyBalVal = Integer.parseInt(qtyBal);

            // Calculate total quantity
            int totalQty = qtyVal + qtyBalVal;

            Connection con = DBConnection.getConnection();
            String sql = "update inventory set product_name = ?, price_per_product = ?, qty_delivered = ?, yesterday_bal = ?,"
                    + " total_qty = ?, total_price = ? where product_name = ? && date = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            //sets the values from the textfield to the colums in the db
            pst.setString(1, productName);
            pst.setString(2, pricePerProduct);
            pst.setInt(3, qtyVal);
            pst.setInt(4, qtyBalVal);
            pst.setInt(5, totalQty);
            pst.setString(6, total);
//            pst.setString(7, today_date);
            pst.setString(7, productName);
            pst.setString(8, today);

            //If a database row is added to output a success message
            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                isUpdated = true;
            } else {
                isUpdated = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //returns the 'isAdded' variable value
        return isUpdated;

    }

    //method to delete products details
    public boolean deleteProduct() {

        boolean isDeleted = false;

        productName = (String) cbo_products.getSelectedItem();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from inventory where product_name = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            //sets the values from the textfield to the colums in the db
            pst.setString(1, productName);

            //If a database row is added to output a success message
            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                isDeleted = true;
            } else {
                isDeleted = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //returns the 'isAdded' variable value
        return isDeleted;
    }

    //clear the interface components
    private void clearComponents() {

        cbo_products.setSelectedIndex(0);
        txtprice.setText("00.00");
        txtQty.setText("");
        txtYesterdayQty.setText("0");
        tot_price.setText("");
    }

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lbl_viewIssuedGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewIssuedGoodMouseClicked
        ViewIssuedGoodsDetails viewIssued = new ViewIssuedGoodsDetails();
        viewIssued.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_viewIssuedGoodMouseClicked

    private void lbl_viewIssuedGoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewIssuedGoodMouseEntered
        jPanel7.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_viewIssuedGoodMouseEntered

    private void lbl_viewIssuedGoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewIssuedGoodMouseExited
        jPanel7.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_viewIssuedGoodMouseExited

    private void lbl_manageUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_manageUsersMouseClicked
        ManageUsers users = new ManageUsers();
        users.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_manageUsersMouseClicked

    private void lbl_manageUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_manageUsersMouseEntered
        jPanel9.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_manageUsersMouseEntered

    private void lbl_manageUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_manageUsersMouseExited
        jPanel9.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_manageUsersMouseExited

    private void lbl_issueGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_issueGoodMouseClicked
        IssueGoods issue = new IssueGoods();
        issue.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_issueGoodMouseClicked

    private void lbl_issueGoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_issueGoodMouseEntered
        jPanel10.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_issueGoodMouseEntered

    private void lbl_issueGoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_issueGoodMouseExited
        jPanel10.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_issueGoodMouseExited

    private void lbl_returnGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_returnGoodMouseClicked
        ReturnGood ret = new ReturnGood();
        ret.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_returnGoodMouseClicked

    private void lbl_returnGoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_returnGoodMouseEntered
        jPanel11.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_returnGoodMouseEntered

    private void lbl_returnGoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_returnGoodMouseExited
        jPanel11.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_returnGoodMouseExited

    private void lbl_viewRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewRecordsMouseClicked
        ViewAllRecords view = new ViewAllRecords();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_viewRecordsMouseClicked

    private void lbl_viewRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewRecordsMouseEntered
        jPanel12.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_viewRecordsMouseEntered

    private void lbl_viewRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewRecordsMouseExited
        jPanel12.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_viewRecordsMouseExited

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        LoginPage login = new LoginPage();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void lbl_defaulterListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_defaulterListMouseClicked
        DefaulterList dl = new DefaulterList();
        dl.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_defaulterListMouseClicked

    private void lbl_defaulterListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_defaulterListMouseEntered
        jPanel13.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_defaulterListMouseEntered

    private void lbl_defaulterListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_defaulterListMouseExited
        jPanel13.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_defaulterListMouseExited

    private void lbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuMouseClicked

        if (panel_menu.isVisible()) {
            panel_menu.setVisible(false);
            // Adjust panel_display when panel_menu disappears
            panel_manageInventory.setBounds(0, 0, parentPanel.getWidth(), parentPanel.getHeight());
////            To resize panel_toolbar
//            panel_toolbar.setBounds(0, 0, panel_manageInventory.getWidth(),panel_manageInventory.getHeight());

        } else {
            panel_menu.setVisible(true);
            // Adjust panel_display when panel_menu reappears
            panel_manageInventory.setBounds(panel_menu.getWidth(), 0, parentPanel.getWidth() - panel_menu.getWidth(), 700);

        }
        // Force panel_display to re-layout its components
        parentPanel.repaint();
    }//GEN-LAST:event_lbl_menuMouseClicked

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        jPanel6.setBackground(mouseEnterColor);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        jPanel6.setBackground(mouseExitColor);
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel5.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel5.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Home_page home = new Home_page();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lbl_addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addProductMouseClicked
        MiniFrame_addProduct pr = new MiniFrame_addProduct();
        pr.setVisible(true);
    }//GEN-LAST:event_lbl_addProductMouseClicked

    private void txtpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpriceKeyTyped

    private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQtyKeyTyped

    private void cbo_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_productsActionPerformed
        String selectedProduct = (String) cbo_products.getSelectedItem();
        if (selectedProduct != null) {
            fetchProductPrice(selectedProduct);
        }
    }//GEN-LAST:event_cbo_productsActionPerformed

    private void txtYesterdayQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYesterdayQtyKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtYesterdayQtyKeyTyped

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        pro_total();
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtYesterdayQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYesterdayQtyKeyReleased
        pro_total();
    }//GEN-LAST:event_txtYesterdayQtyKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the delivered quantity field");

        } else if (cbo_products.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Product");

        } else if (addProduct() == true) {
            JOptionPane.showMessageDialog(this, "Inventory Added Successfully...");

            clearTable();
            setPoductDetailsToTable();
            clearComponents();
        } else {
            JOptionPane.showMessageDialog(this, "Inventory Addition failed, Please check your Database Connection...");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the delivered quantity field");

        } else if (cbo_products.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Product");

        } else if (updateProduct() == true) {
            JOptionPane.showMessageDialog(this, "Inventory Updated Successfully...");

            clearTable();
//            setPoductDetailsToTable();
            clearComponents();
        } else {
            JOptionPane.showMessageDialog(this, "Inventory Update failed, Please check your Database Connection...");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (cbo_products.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select the name of the product you want to delete");

        } else if (deleteProduct() == true) {
            JOptionPane.showMessageDialog(this, "Product Deleted Successfully...");

            clearTable();
            setPoductDetailsToTable();
            clearComponents();
        } else {
            JOptionPane.showMessageDialog(this, "Product Delete failed, Please check your Database Connection...");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tbl_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_inventoryMouseClicked
        int rowNo = tbl_inventory.getSelectedRow();
        TableModel model = tbl_inventory.getModel();

        cbo_products.setSelectedItem(model.getValueAt(rowNo, 0).toString());
        txtprice.setText(model.getValueAt(rowNo, 1).toString());
        txtQty.setText(model.getValueAt(rowNo, 2).toString());
        txtYesterdayQty.setText(model.getValueAt(rowNo, 3).toString());
        tot_price.setText(model.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_tbl_inventoryMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        clearTable();
        // Delay the loading of the table to ensure txtDate is initialized
        javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                setPoductDetailsToTable();
            }
        });
        timer.setRepeats(false); // Only execute once
        timer.start();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private rojerusan.RSComboMetro cbo_products;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_addProduct;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_issueGood;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_manageInventory;
    private javax.swing.JLabel lbl_manageUsers;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_returnGood;
    private javax.swing.JLabel lbl_viewIssuedGood;
    private javax.swing.JLabel lbl_viewRecords;
    private javax.swing.JPanel panel_manageInventory;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_toolbar;
    private javax.swing.JPanel parentPanel;
    private rojerusan.RSTableMetro tbl_inventory;
    private javax.swing.JTextField tot_price;
    private javax.swing.JLabel txtDate;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtYesterdayQty;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
