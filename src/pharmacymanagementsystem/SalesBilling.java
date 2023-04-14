/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;

import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;


public class SalesBilling extends javax.swing.JFrame {

    /**
     * Creates new form SalesBilling
     */
    public SalesBilling() {
        initComponents();
        dispalayMedTableDetail();
        ShowDate();
        BillDetailsTblDelete();
        
    }

 Connection connection =null;
 Statement statement = null;
 ResultSet result =null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ManMedComp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SBClearBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SBSellerlbl = new javax.swing.JLabel();
        SBMedName = new javax.swing.JTextField();
        SBMedID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SBMedTbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SBQty = new javax.swing.JTextField();
        SBAddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        SBPrintBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillDetailTbl = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        SBPricetxt = new javax.swing.JTextField();
        SBDatelbl = new javax.swing.JLabel();
        BillAmtlbl = new javax.swing.JLabel();
        BillAmtTxt = new javax.swing.JTextField();
        LogOutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        ManMedComp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManMedComp.setForeground(new java.awt.Color(255, 255, 255));
        ManMedComp.setText("Company");
        ManMedComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManMedCompMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManMedCompMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agents");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sales Billing");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        SBClearBtn.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sales Billing");

        SBSellerlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SBSellerlbl.setForeground(new java.awt.Color(0, 153, 0));
        SBSellerlbl.setText("Seller");

        SBMedName.setEditable(false);
        SBMedName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SBMedID.setEditable(false);
        SBMedID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Medicine");

        SBMedTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Med Id", "Med Name", "Med Price", "Med Qty", "Manf. Date", "Exp. Date", "Company"
            }
        ));
        SBMedTbl.setSelectionBackground(new java.awt.Color(0, 153, 0));
        SBMedTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SBMedTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SBMedTbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Medicine List");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Qty");

        SBQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SBAddBtn.setBackground(new java.awt.Color(0, 153, 0));
        SBAddBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SBAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        SBAddBtn.setText("Add to Bill");
        SBAddBtn.setActionCommand("");
        SBAddBtn.setAutoscrolls(true);
        SBAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SBAddBtnMouseClicked(evt);
            }
        });
        SBAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBAddBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(0, 153, 0));
        ClearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.setActionCommand("");
        ClearBtn.setAutoscrolls(true);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        SBPrintBtn.setBackground(new java.awt.Color(0, 153, 0));
        SBPrintBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SBPrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        SBPrintBtn.setText("Print");
        SBPrintBtn.setActionCommand("");
        SBPrintBtn.setAutoscrolls(true);
        SBPrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SBPrintBtnMouseClicked(evt);
            }
        });
        SBPrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBPrintBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("Bill Details");

        BillDetailTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SNo", "Medicine", "Price", "Quantity", "Total Price"
            }
        ));
        jScrollPane2.setViewportView(BillDetailTbl);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setText("Price");

        SBPricetxt.setEditable(false);
        SBPricetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SBDatelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SBDatelbl.setForeground(new java.awt.Color(0, 153, 0));
        SBDatelbl.setText("Date");

        BillAmtlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BillAmtlbl.setForeground(new java.awt.Color(0, 153, 0));
        BillAmtlbl.setText("Bill Amount : Rs");

        BillAmtTxt.setEditable(false);
        BillAmtTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout SBClearBtnLayout = new javax.swing.GroupLayout(SBClearBtn);
        SBClearBtn.setLayout(SBClearBtnLayout);
        SBClearBtnLayout.setHorizontalGroup(
            SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                        .addComponent(SBPrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))))
            .addGroup(SBClearBtnLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SBClearBtnLayout.createSequentialGroup()
                        .addComponent(BillAmtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillAmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SBClearBtnLayout.createSequentialGroup()
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SBClearBtnLayout.createSequentialGroup()
                                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SBMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SBMedID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SBQty, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SBClearBtnLayout.createSequentialGroup()
                                .addComponent(SBAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SBSellerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SBPricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SBClearBtnLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SBClearBtnLayout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, Short.MAX_VALUE))
            .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SBClearBtnLayout.createSequentialGroup()
                    .addContainerGap(796, Short.MAX_VALUE)
                    .addComponent(SBDatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        SBClearBtnLayout.setVerticalGroup(
            SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SBClearBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBSellerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SBClearBtnLayout.createSequentialGroup()
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBMedID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBPricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SBAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BillAmtTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(BillAmtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(SBPrintBtn)
                .addGap(28, 28, 28))
            .addGroup(SBClearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SBClearBtnLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(SBDatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(700, Short.MAX_VALUE)))
        );

        LogOutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Log Out");
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManMedComp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(SBClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(ManMedComp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SBClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void dispalayMedTableDetail(){
        
        try{
        connection= DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacyManagementdb");
        statement = connection.createStatement();
        result= statement.executeQuery("SELECT * FROM APP.MEDICINETBL FETCH FIRST 15 ROWS ONLY");
        SBMedTbl.setModel(DbUtils.resultSetToTableModel(result));
        connection.close();
        }
        
        catch(SQLException e){
            
           e.printStackTrace();
        }
    }
    
    public void updateMedIDQty(){
        int newSBQty;
        newSBQty = OldQty-Integer.valueOf(SBQty.getText());
        
        try{

            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacyManagementdb");
            String UpdateQuery = "Update APP.MEDICINETBL set MEDQTY = "+newSBQty+""+"where MEDID ="+SBMedIDtxt;
            System.out.println(UpdateQuery);
            Statement Add = connection.createStatement();
            Add.executeUpdate(UpdateQuery);
            JOptionPane.showMessageDialog(this,"The Stock Qty Updated in the Medicine List based on Order Placed...");
            dispalayMedTableDetail();
            connection.close();
            }
            
            catch(SQLException e){
                
                e.printStackTrace();
           
            }
    }
    
    public void ShowDate(){
        Date SBDate=new Date();
        SimpleDateFormat Sdf=new SimpleDateFormat("dd-MM-yyyy");
        SBDatelbl.setText(Sdf.format(SBDate));
    }
    public void BillDetailsTblDelete(){
       try{

            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacyManagementdb");
            String DeleteBillDetTblQuery = "Delete from APP.BILLDETTBL";
            Statement Add = connection.createStatement();
            Add.executeUpdate(DeleteBillDetTblQuery);
            connection.close();
            }
            
            catch(SQLException e){
                
                e.printStackTrace();
           
            }
    }
    
    
    
        private void MedTblMouseClicked(java.awt.event.MouseEvent evt) {                                     
  
    } 
        
        
    private void ManMedCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManMedCompMouseClicked

        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManMedCompMouseClicked

    private void ManMedCompMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManMedCompMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ManMedCompMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new ManageAgents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    
    int BillId=0, OldQty,SBMedIDtxt, TotalPrice,BillAmtCal=0;
    private void SBAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SBAddBtnMouseClicked
        updateMedIDQty();
        try{
           BillId++;
           TotalPrice= Integer.valueOf(SBQty.getText())* Integer.valueOf(SBPricetxt.getText());
           BillAmtCal=BillAmtCal+TotalPrice;
          SBMedID.setText(Integer.valueOf(BillId).toString());
          connection = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacyManagementdb");
          System.out.println("Connection created");  
          PreparedStatement add= connection.prepareStatement("Insert into BILLDETTBL values(?,?,?,?,?)");
          add.setInt(1,BillId);
          add.setString(2, SBMedName.getText());
          add.setInt(3,Integer.valueOf(SBQty.getText()));
          add.setInt(4,Integer.valueOf(SBPricetxt.getText()));
          add.setInt(5,TotalPrice);
          BillAmtTxt.setText(Integer.valueOf(BillAmtCal).toString());

          int row = add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Bill Details Successfully Added...");
          SBQty.setText("");
          SBMedID.setText("");
          dispalayBillTableDetail();
          TotalPrice=0;
          connection.close();
       }
       
       catch(SQLException e)
       {
           e.printStackTrace();
       }
 
    }//GEN-LAST:event_SBAddBtnMouseClicked

        private void dispalayBillTableDetail(){
        
        try{
        connection= DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacyManagementdb");
        statement = connection.createStatement();
        result= statement.executeQuery("SELECT * FROM APP.BILLDETTBL");
        BillDetailTbl.setModel(DbUtils.resultSetToTableModel(result));
        }
        
        catch(SQLException e){
            
           e.printStackTrace();
        }
    }
    private void SBAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBAddBtnActionPerformed
 

    }//GEN-LAST:event_SBAddBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked


        SBMedName.setText("");
        SBQty.setText("");
        SBPricetxt.setText("");

    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SBPrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SBPrintBtnMouseClicked

           /* try{
                BillTxt.print();
                }
        catch(Exception e){
            
           e.printStackTrace();
            }*/

    }//GEN-LAST:event_SBPrintBtnMouseClicked

    private void SBPrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBPrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SBPrintBtnActionPerformed

    private void SBMedTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SBMedTblMouseClicked
          
        DefaultTableModel model = (DefaultTableModel)SBMedTbl.getModel();
        int MedIdindex = SBMedTbl.getSelectedRow();
        SBMedIDtxt =Integer.valueOf(model.getValueAt(MedIdindex, 0).toString());
        SBMedName.setText(model.getValueAt(MedIdindex, 1).toString());
        SBPricetxt.setText(model.getValueAt(MedIdindex, 2).toString());
        OldQty=Integer.valueOf(model.getValueAt(MedIdindex, 3).toString());
    }//GEN-LAST:event_SBMedTblMouseClicked

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked

        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SalesBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesBilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillAmtTxt;
    private javax.swing.JLabel BillAmtlbl;
    private javax.swing.JTable BillDetailTbl;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JLabel ManMedComp;
    private javax.swing.JButton SBAddBtn;
    private javax.swing.JPanel SBClearBtn;
    private javax.swing.JLabel SBDatelbl;
    private javax.swing.JTextField SBMedID;
    private javax.swing.JTextField SBMedName;
    private javax.swing.JTable SBMedTbl;
    private javax.swing.JTextField SBPricetxt;
    private javax.swing.JButton SBPrintBtn;
    private javax.swing.JTextField SBQty;
    private javax.swing.JLabel SBSellerlbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
