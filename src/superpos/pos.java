/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpos;


import com.mysql.jdbc.Statement;
import com.sun.glass.events.KeyEvent; 
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;  
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sachi
 */
public class pos extends javax.swing.JFrame {

    /**
     * Creates new form brand
     */
    public pos() {
         initComponents();
        jLabel3.setEnabled(false);
        jLabel2.setEnabled(false);
        jLabel4.setEnabled(false);
        Product.setEnabled(false);
        jLabel6.setEnabled(false);

    }
    
    String lname;
    
        public pos(String name) {
        initComponents();
        this.lname =name;
        jLabel20.setText(name);
   
    }
   
        
    Connection con1;
    PreparedStatement insert;
    ResultSet rs;
    DefaultTableModel model=new DefaultTableModel();

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JButton();
        Product = new javax.swing.JButton();
        jLabel3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtprocode = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtproname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 102, 0));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-exit-25.png"))); // NOI18N
        jLabel40.setText(" Logout");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 150, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/bgbgbg.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 50));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        jLabel2.setText("  Brand");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel2ActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        jLabel1.setText("  POS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel1ActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 50));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        jLabel6.setText("  Report");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 50));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        jLabel4.setText("  Admin");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel4ActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, 50));

        Product.setBackground(new java.awt.Color(102, 102, 102));
        Product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Product.setForeground(new java.awt.Color(153, 153, 153));
        Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        Product.setText("  Product");
        Product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMouseClicked(evt);
            }
        });
        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });
        jPanel1.add(Product, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 50));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-buy-25.png"))); // NOI18N
        jLabel3.setText("  Category");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel3ActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 630));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-account-45.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-exit-20.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(863, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(106, 106, 106)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1040, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Product Code");

        txtprocode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtprocode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprocodeActionPerformed(evt);
            }
        });
        txtprocode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprocodeKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Product Name");

        txtproname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtproname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpronameActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Price");

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Quantity");

        txtqty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-delete-12.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.setPreferredSize(new java.awt.Dimension(51, 26));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-add-13.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(51, 26));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprocode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtprocode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 980, 150));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 980, 290));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Sub Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Payment");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        txtpay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });
        getContentPane().add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 152, -1));

        txtsub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });
        txtsub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubKeyPressed(evt);
            }
        });
        getContentPane().add(txtsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 115, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Balance");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, -1));

        txtbal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });
        getContentPane().add(txtbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 117, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-invoice-20 (1).png"))); // NOI18N
        jButton3.setText(" Invoice");
        jButton3.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(51, 26));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, 110, 60));

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superpos/icons8-payment-20.png"))); // NOI18N
        jButton4.setText("Pay ");
        jButton4.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(51, 26));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 90, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void pos()
    {
        String name=txtprocode.getText();
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos","root","");
             insert=con1.prepareStatement("select * from product where barcode=?");
             insert.setString(1, name);
             rs = insert.executeQuery();
             
             while(rs.next())
             {
                int currentqty;
                
                currentqty=rs.getInt("qty");
                
                int price =Integer.parseInt(txtprice.getText());
                 int qtynew =Integer.parseInt(txtqty.getText());
                
             int tot=price*qtynew;
             
             if(qtynew>= currentqty )
             {
             
                  JOptionPane.showMessageDialog(this, "Available product is "  + currentqty);
                  JOptionPane.showMessageDialog(this, "Quantity is not enough");
             }
             else
             {
                  model =(DefaultTableModel)jTable1.getModel();
                  model.addRow(new Object[]
                  {
                      txtprocode.getText(),
                       txtproname.getText(),
                        txtprice.getText(),
                         txtqty.getText(),
                         tot,
                  
                  });
                  
                        int sum=0;
                        
                        for(int i=0;i<jTable1.getRowCount();i++)
                        {
                         
                            sum = sum +Integer.parseInt(jTable1.getValueAt(i,4).toString());
                        
                        }
                  
                        txtsub.setText(Integer.toString(sum));
             
                       txtprocode.setText("");
                       txtproname.setText("");
                       txtprice.setText("");
                        txtqty.setText("");
                        txtprocode.requestFocus();
                  
             }
             
             
             }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      
                    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void POSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POSMouseClicked
        // POS Button
     
        
    }//GEN-LAST:event_POSMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // Report Button
     
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Admin Button
     
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4ActionPerformed

    private void jLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ActionPerformed

    private void POSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_POSActionPerformed

    private void jLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ActionPerformed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
       //exit button
     JFrame frame = new JFrame("EXIT");
         if(JOptionPane.showConfirmDialog(frame,"Do You Wish exit?","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
         {
              System.exit(0);
         }
        
        
        
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // Exit
        login l = new login();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void txtprocodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprocodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprocodeActionPerformed

    private void txtprocodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprocodeKeyPressed
       //Product Search
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)

          { 
              String name=txtprocode.getText();
              try {
                  Class.forName("com.mysql.jdbc.Driver");
                  con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos","root","");
                  insert=con1.prepareStatement("select * from product where barcode=?");
                  insert.setString(1, name);
                  rs = insert.executeQuery();
                  
                  if(rs.next()==false)
                  {
                     JOptionPane.showMessageDialog(this, "Barcode not found");
                  
                  }
                  else
                  {
                    String productname=rs.getString("product");
                    String price=rs.getString("retail_price");
                    
                    txtproname.setText(productname.trim());
                    txtprice.setText(price.trim());
                    
                  }
                  
                  
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
              } catch (SQLException ex) {
                  Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
              }
           
              
          
          
          }
    
    }//GEN-LAST:event_txtprocodeKeyPressed

    private void txtpronameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpronameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpronameActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Add Button
        pos();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Delete Button
         model.removeRow(jTable1.getSelectedRow());
          int sum=0;
           for(int i=0;i<jTable1.getRowCount();i++)
                        
                     
                       {
                         
                            sum = sum +Integer.parseInt(jTable1.getValueAt(i,4).toString());
                        
                        }
                  
                        txtsub.setText(Integer.toString(sum));


    }//GEN-LAST:event_jButton2ActionPerformed

       private void sales()
        {
           DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY/MM/dd");
           LocalDateTime now =LocalDateTime.now();
           String date =dtf.format(now);
           
           String subtot =txtsub.getText();
           String cashier = jLabel20.getText();
           
           String pay =txtpay.getText();
           String bal =txtbal.getText();
           int lastinsertid =0;
           
           
          try{ 
           
           Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos","root","");
            
            String query = "insert into sales (date,cashier,subtotal,pay,balance)values(?,?,?,?,?)";
            
            insert=con1.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
            insert.setString(1,date);
            insert.setString(2,cashier);
            insert.setString(3, subtot);
            insert.setString(4, pay);
            insert.setString(5, bal);
            insert.executeUpdate();
            ResultSet genteratedKeyResult =insert.getGeneratedKeys();
            
            if(genteratedKeyResult.next())
                
            {
               lastinsertid = genteratedKeyResult.getInt(1);
            }
            
            
           // JOptionPane.showMessageDialog(this,lastinsertid);
         
            int rows=jTable1.getRowCount();
           
             String query1 = "insert into sales_product(sales_id,product_id,sell_price,qty,total)values(?,?,?,?,?)";
           
             insert=con1.prepareStatement(query1);
             
             String product_id="";
             String price="";
             String qty="";
             int total=0;
             
             for(int i=0;i<jTable1.getRowCount();i++)
                 
             {  product_id =(String)jTable1.getValueAt(i, 0);
                price =(String)jTable1.getValueAt(i, 2);
                qty =(String)jTable1.getValueAt(i, 3);
                total =(int)jTable1.getValueAt(i, 4);
                
                insert.setInt(1, lastinsertid);
                insert.setString(2, product_id);
                insert.setString(3, price);
                insert.setString(4, qty);
                insert.setInt(5, total);
                insert.executeUpdate();
             
            
             }
               String query3 = "update product set qty=qty-? where barcode=?";
               insert=con1.prepareStatement(query3);
             
               
               for(int i=0;i<jTable1.getRowCount();i++)
                 
             {  product_id =(String)jTable1.getValueAt(i, 0);
                qty =(String)jTable1.getValueAt(i, 3);
              
                
                insert.setString(1, qty);
                insert.setString(2, product_id);
                insert.execute();
             
             }
           
               insert.addBatch();
               JOptionPane.showMessageDialog(this, "Record saved");
             
             
           
           
          } catch (ClassNotFoundException ex){
                 Logger.getLogger(pos.class.getName()).log(Level.SEVERE,null,ex);
        
        
          } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 }
    

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void txtsubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubKeyPressed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // Pay 
          int pay=Integer.parseInt(txtpay.getText());
           int subtotal=Integer.parseInt(txtsub.getText());
          
            int bal= pay-subtotal;
            
           txtbal.setText(String.valueOf(bal));
           //print();
           sales();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void print()
   {
       String sub=txtsub.getText();
       String pay=txtpay.getText();
       String bal=txtbal.getText();
   
        try {
            new print (sub,pay,bal,jTable1.getModel()).setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
  
       
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Pay 
          int pay=Integer.parseInt(txtpay.getText());
           int subtotal=Integer.parseInt(txtsub.getText());
          
            int bal= pay-subtotal;
            
           txtbal.setText(String.valueOf(bal));
           print();
            sales();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductMouseClicked

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_ProductActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3ActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        JFrame frame = new JFrame("EXIT");
         if(JOptionPane.showConfirmDialog(frame,"Do You Wish exit?","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
         {
              System.exit(0);
         }// TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jLabel25MouseClicked

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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Product;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JButton jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JButton jLabel3;
    private javax.swing.JButton jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JButton jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtprocode;
    private javax.swing.JTextField txtproname;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
