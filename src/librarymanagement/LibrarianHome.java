/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LibrarianHome.java
 *
 * Created on Dec 8, 2013, 9:14:41 AM
 */

package librarymanagement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md.Foridur Kayes
 */
public class LibrarianHome extends javax.swing.JFrame {


    /** Creates new form LibrarianHome */
    public LibrarianHome() {
        initComponents();

        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);

        jButton9.setVisible(false);


        jLabel18.setText("");
        jLabel19.setText("");
        jLabel20.setText("");
        jLabel21.setText("");
        jLabel22.setText("");
        jLabel23.setText("");


        viewStudent();
        viewBook();
    }

    public void viewBook(){


        Connection con=null;
        PreparedStatement stm=null;
        PreparedStatement stm1=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm = (PreparedStatement) con.prepareStatement("select *from book");
            stm1 = (PreparedStatement) con.prepareStatement("select *from book");


            ResultSet r = stm.executeQuery();
            ResultSet s = stm1.executeQuery();

    String name,serial,total,left;
                int length = 0;


                while (s.next() == true) {
                     length= length+1;
            }

                String row[][]=new String[length][5];
            String col[]={" Name","Serial No.","Total","Left"};


            DefaultTableModel dm=new DefaultTableModel(row,col);
            jTable2.setModel(dm);

            int i=0;
            while (r.next() == true) {

                name=r.getString("name");
                serial=r.getString("serial");
                total=r.getString("total");
                left=r.getString("left");
                jTable2.setValueAt( name,i,0);
                jTable2.setValueAt( serial,i,1);
                jTable2.setValueAt( total,i,2);
                jTable2.setValueAt( left,i,3);
                
                i++;

            }


            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }


        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }



    }












    public void viewStudent(){


        Connection con=null;
        PreparedStatement stm=null;
        PreparedStatement stm1=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm = (PreparedStatement) con.prepareStatement("select *from student");
            stm1 = (PreparedStatement) con.prepareStatement("select *from student");


            ResultSet r = stm.executeQuery();
            ResultSet s = stm1.executeQuery();

    String name,reg,roll,mobile,email;
                int length = 0;


                while (s.next() == true) {
                     length= length+1;
            }

                String row[][]=new String[length][5];
            String col[]={" Name","Registration","Roll No.","Mobile","Email"};

                
            DefaultTableModel dm=new DefaultTableModel(row,col);
            jTable1.setModel(dm);

            int i=0;
            while (r.next() == true) {

                name=r.getString("name");
                reg=r.getString("reg");
                roll=r.getString("roll");
                mobile=r.getString("cell");
                email=r.getString("email");
                jTable1.setValueAt( name,i,0);
                jTable1.setValueAt( reg,i,1);
                jTable1.setValueAt( roll,i,2);
                jTable1.setValueAt( mobile,i,3);
                jTable1.setValueAt( email,i,4);

                i++;
                
            }

            
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }


        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }



    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bookname = new javax.swing.JTextField();
        serial = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BookSerial = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        stname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        streg = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stmbl = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        regNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RegNo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sign out");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(773, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patuakhali Science and Technology University");

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Book Name     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Serial No        :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Amount          :");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serial, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(95, 95, 95)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(bookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Adding A Book", jPanel6);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Book Serial No.");

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Receive Book");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton7)
                    .addComponent(BookSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recieve A Book", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Student Id  :");

        jLabel7.setText("Name         :");

        jLabel8.setText("Reg No.    :");

        stid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stidActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 24));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add New Student");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Email");

        jLabel11.setText("Mobile No. :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(stmbl, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stid, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(stname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(79, 79, 79))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(streg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(stmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("Add Student", jPanel9);

        jLabel12.setText("Reg. No.");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Registration", "Roll No", "Cell. No.", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regNo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(regNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );

        jTabbedPane1.addTab("Veiw Student", jPanel10);

        jLabel13.setText("Registration No. :");

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jLabel22.setText("jLabel22");

        jLabel23.setText("jLabel23");

        jButton9.setText("Renew");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(RegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(RegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("Issue Book", jPanel5);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About Me", jPanel13);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String StudenId, StudentName,StudentReg,StudentMobile, StudentEmail;

        StudenId=stid.getText();
        StudentName=stname.getText();
        StudentReg=streg.getText();
        StudentMobile=stmbl.getText();
        StudentEmail=email.getText();

        Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm = (PreparedStatement) con.prepareStatement("select *from student where reg='"+StudentReg+"'");

            ResultSet r = stm.executeQuery();

            if (r.next() == true) {
                 JOptionPane.showMessageDialog(rootPane, "THIS ID NO. ALREADY EXISTS...");

            }
            
    else
    {
            stm=(PreparedStatement) con.prepareStatement("insert into student (id,name,reg,roll,cell,email) values (NULL,'"+StudentName+"','"+StudentReg+"','"+StudenId+"','"+StudentMobile+"','"+StudentEmail+"')");
        int x = stm.executeUpdate();

        if(x==1){
        JOptionPane.showMessageDialog(rootPane, "successfully saved!!!!!!!!!!!!");

        stname.setText("");
        streg.setText("");
        stid.setText("");
        stmbl.setText("");
        email.setText("");

        if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }

        }
 else
     JOptionPane.showMessageDialog(rootPane, "not saved!!!!!!!!!!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }



        viewStudent();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        stname.setText("");
        streg.setText("");
        stid.setText("");
        stmbl.setText("");
        email.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");
            stm = (PreparedStatement) con.prepareStatement("select *from student where reg='"+regNo.getText()+"'");

            ResultSet r = stm.executeQuery();

            String row[][]=new String[1][5];
            String col[]={" Name","Registration","Roll No.","Mobile","Email"};


            DefaultTableModel dm=new DefaultTableModel(row,col);
            jTable1.setModel(dm);

            String name, reg, roll, mobile,email;

            int i=0;
            while (r.next() == true) {

                name=r.getString("name");
                reg=r.getString("reg");
                roll=r.getString("roll");
                mobile=r.getString("cell");
                email=r.getString("email");
                jTable1.setValueAt( name,i,0);
                jTable1.setValueAt( reg,i,1);
                jTable1.setValueAt( roll,i,2);
                jTable1.setValueAt( mobile,i,3);
                jTable1.setValueAt( email,i,4);

                i++;

            }
if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }

        

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        // TODO add your handling code here:

        int ti; String tx;
        ti=jTable1.getSelectedRow();
        tx=(String) jTable1.getModel().getValueAt(ti,0);

        JOptionPane.showMessageDialog(rootPane, tx);
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void stidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Bookname,Serial;
        int Amount,Left;
        Bookname=bookname.getText();
        Serial=serial.getText();
        Amount=Integer.parseInt(amount.getText());
        Left=Amount;
        Connection con=null;
        PreparedStatement stm=null;
          try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm = (PreparedStatement) con.prepareStatement("select *from book where serial='"+Serial+"'");

            ResultSet r = stm.executeQuery();

            if (r.next() == true) {
                 JOptionPane.showMessageDialog(rootPane, "THIS SERIAL NO. ALREADY EXISTS...");

            }
             else
    {
            stm=(PreparedStatement) con.prepareStatement("INSERT INTO `book` (`id`, `name`, `serial`, `total`, `left`) VALUES (NULL,'"+Bookname+"','"+Serial+"','"+Amount+"','"+Left+"')");
        int x = stm.executeUpdate();

        if(x==1){
        JOptionPane.showMessageDialog(rootPane, "successfully saved!!!!!!!!!!!!");

        viewBook();
        bookname.setText("");
        serial.setText("");
        amount.setText("");


        if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }

        }
 else
     JOptionPane.showMessageDialog(rootPane, "not saved!!!!!!!!!!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");
            stm = (PreparedStatement) con.prepareStatement("select *from book where serial='"+BookSerial.getText()+"'");

            ResultSet r = stm.executeQuery();

            String row[][]=new String[1][5];
            String col[]={" Name","Serial No.","Total","Left"};


            DefaultTableModel dm=new DefaultTableModel(row,col);
            jTable2.setModel(dm);

            String name, serial, total, left;

int i=0;
            while (r.next() == true) {

                name=r.getString("name");
                serial=r.getString("serial");
                total=r.getString("total");
                left=r.getString("left");
                jTable2.setValueAt( name,i,0);
                jTable2.setValueAt( serial,i,1);
                jTable2.setValueAt( total,i,2);
                jTable2.setValueAt( left,i,3);

                i++;

            }


            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        int row=jTable2.getSelectedRow();
        String serial = (String) jTable2.getModel().getValueAt(row, 1);
        String total = (String) jTable2.getModel().getValueAt(row, 2);
        String left = (String) jTable2.getModel().getValueAt(row, 3);


        String amount=JOptionPane.showInputDialog("Enter The amount of books Received",0);

        int inTotal=Integer.parseInt(total)+Integer.parseInt(amount);
        int TotalLeft=Integer.parseInt(left)+Integer.parseInt(amount);
        int id=Integer.parseInt((String) jTable2.getModel().getValueAt(row, 1));

        Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");
            stm = (PreparedStatement) con.prepareStatement("select *from book");
            // System.out.println(stm);
            ResultSet r=stm.executeQuery();

            while(r.next())
            stm = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `total` = '"+inTotal+"',`left` = '"+TotalLeft+"' WHERE `book`.`serial` ='"+id+"'" );
            int m = stm.executeUpdate();
            jTable2.removeAll();
            if(m==1) {
                JOptionPane.showMessageDialog(rootPane,"Successfully Added!","Information",JOptionPane.PLAIN_MESSAGE);

                //                         jTable1.add(this);
                viewBook();
                // jTabbedPane1.setSelectedIndex(3);


            } else {
                JOptionPane.showMessageDialog(rootPane, "not added!", "Information", JOptionPane.ERROR_MESSAGE);  }



        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String reg=RegNo.getText();

        Connection con=null;
        PreparedStatement stm=null;
        PreparedStatement stm1=null;
        PreparedStatement stm2=null;
        PreparedStatement stm3=null;
        PreparedStatement stm4=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm = (PreparedStatement) con.prepareStatement("select *from student where reg='"+reg+"'");

            ResultSet r = stm.executeQuery();

            int i=0;
            while (r.next() == true) {

               String name=r.getString("name");
               jLabel15.setText("Student Name :");
               jLabel16.setText(name);

               jLabel15.setVisible(true);
               jLabel16.setVisible(true);
               jButton9.setVisible(true);

            }

            stm1 = (PreparedStatement) con.prepareStatement("select *from issue where studentReg='"+reg+"'");

            ResultSet s = stm1.executeQuery();
 String name1 = null, name2 = null, name3 = null;
            if (s.next() == true) {

               String book1=s.getString("book1");
               String book2=s.getString("book2");
               String book3=s.getString("book3");


               stm2 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book1+"'");

            ResultSet t = stm2.executeQuery();

           

            while (t.next() == true) {

                name1=t.getString("name");

            }

            stm3 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book2+"'");

            ResultSet u = stm3.executeQuery();

            while (u.next() == true) {

                name2=u.getString("name");

            }

            stm4 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book3+"'");

            ResultSet v = stm4.executeQuery();

            while (v.next() == true) {

                name3=v.getString("name");

            }

                   jLabel17.setText("Book List :");
                   jLabel18.setText(book1);
                   jLabel19.setText(name1);
                   jLabel20.setText(book2);
                   jLabel21.setText(name2);
                   jLabel22.setText(book3);
                   jLabel23.setText(name3);

                   jLabel17.setVisible(true);
               jLabel18.setVisible(true);
               jLabel19.setVisible(true);
               jLabel20.setVisible(true);
               jLabel21.setVisible(true);
               jLabel22.setVisible(true);
               jLabel23.setVisible(true);
               

            }
            else{

                jLabel18.setText("");
            jLabel19.setText("");
            jLabel20.setText("");
            jLabel21.setText("");
            jLabel22.setText("");
            jLabel23.setText("");


            }


            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }


        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        String currentBook1=jLabel18.getText();
        String currentBook2=jLabel20.getText();
        String currentBook3=jLabel22.getText();

        JTextField book1Textfield = new JTextField();
        book1Textfield.setText(currentBook1);
        
        JTextField book2Textfield = new JTextField();
        book2Textfield.setText(currentBook2);

        JTextField book3Textfield = new JTextField();
        book3Textfield.setText(currentBook3);
        Object[] message = {
            "Book-1 Serial:", book1Textfield,
            "Book-2 Serial:", book2Textfield,
            "Book-3 Serial ",book3Textfield
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Issue", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            
            String book1NewSerial=book1Textfield.getText();
            String book2NewSerial=book2Textfield.getText();
            String book3NewSerial=book3Textfield.getText();


            String reg=RegNo.getText();

             Connection con=null;
        PreparedStatement stm=null;
        PreparedStatement stm1=null;
        PreparedStatement stm2=null;
        PreparedStatement stm3=null;
        PreparedStatement stm4=null;
        PreparedStatement stm5=null;
        PreparedStatement stm6=null;
        PreparedStatement stm7=null;
        PreparedStatement stm8=null;
        PreparedStatement stm9=null;

        PreparedStatement stm10=null;
        PreparedStatement stm11=null;
        PreparedStatement stm12=null;
        PreparedStatement stm13=null;
        PreparedStatement stm14=null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryPstu","root","");

            stm1 = (PreparedStatement) con.prepareStatement("select *from `issue` where `studentReg`='"+reg+"'");

            ResultSet s = stm1.executeQuery();
            String name1 = null, name2 = null, name3 = null;
            if (s.next() == true) {

                stm2 = (PreparedStatement) con.prepareStatement("UPDATE `issue` SET `book1` = '"+book1NewSerial+"',`book2` = '"+book2NewSerial+"',`book3` = '"+book3NewSerial+"' WHERE `studentReg` ='"+reg+"'" );
            int m = stm2.executeUpdate();

            if(m==1) {


                if(     !currentBook1.equals(book1NewSerial)){

                    stm3 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book1NewSerial+"'");
                // System.out.println(stm);
                ResultSet r=stm3.executeQuery();

                if(r.next())
                {

                    int left=Integer.parseInt(r.getString("left"));
                    left=left-1;
                    stm4 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book1NewSerial+"'" );
                    int n = stm4.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                stm5 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+currentBook1+"'");
                // System.out.println(stm);
                ResultSet r1=stm5.executeQuery();

                if(r1.next())
                {

                    int left1=Integer.parseInt(r1.getString("left"));
                    left1=left1+1;
                    stm6 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left1+"' WHERE `book`.`serial` ='"+currentBook1+"'" );
                    int n = stm6.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                }


                if(     !currentBook2.equals(book2NewSerial)){

                    stm7 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book2NewSerial+"'");
                // System.out.println(stm);
                ResultSet r=stm7.executeQuery();

                if(r.next())
                {

                    int left=Integer.parseInt(r.getString("left"));
                    left=left-1;
                    stm8 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book2NewSerial+"'" );
                    int n = stm8.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                stm9 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+currentBook2+"'");
                // System.out.println(stm);
                ResultSet r1=stm9.executeQuery();

                if(r1.next())
                {

                    int left1=Integer.parseInt(r1.getString("left"));
                    left1=left1+1;
                    stm10 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left1+"' WHERE `book`.`serial` ='"+currentBook2+"'" );
                    int n = stm10.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                }



                if(     !currentBook3.equals(book3NewSerial)){

                    stm11 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book3NewSerial+"'");
                // System.out.println(stm);
                ResultSet r=stm11.executeQuery();

                if(r.next())
                {

                    int left=Integer.parseInt(r.getString("left"));
                    left=left-1;
                    stm12 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book3NewSerial+"'" );
                    int n = stm12.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                stm13 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+currentBook3+"'");
                // System.out.println(stm);
                ResultSet r1=stm13.executeQuery();

                if(r1.next())
                {

                    int left1=Integer.parseInt(r1.getString("left"));
                    left1=left1+1;
                    stm14 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left1+"' WHERE `book`.`serial` ='"+currentBook3+"'" );
                    int n = stm14.executeUpdate();
                    if(n==1)
                    {

                    }
                }

                }

                JOptionPane.showMessageDialog(rootPane, "Successfully saved");
            }
                
            }

            else
            {
            stm=(PreparedStatement) con.prepareStatement("INSERT INTO `libraryPstu`.`issue` (`id`, `studentReg`, `book1`, `book2`, `book3`) VALUES (NULL,'"+reg+"','"+book1NewSerial+"','"+book2NewSerial+"','"+book3NewSerial+"')");
            int x = stm.executeUpdate();

            if(x==1){



                stm3 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book1NewSerial+"'");
                // System.out.println(stm);
                ResultSet r=stm3.executeQuery();

                if(r.next())
                {

                    int left=Integer.parseInt(r.getString("left"));
                    left=left-1;
                    stm4 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book1NewSerial+"'" );
                    int n = stm4.executeUpdate();
                    if(n==1)
                    {

                    }
                }




                stm7 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book2NewSerial+"'");
                // System.out.println(stm);
                ResultSet r1=stm7.executeQuery();

                if(r1.next())
                {

                    int left=Integer.parseInt(r1.getString("left"));
                    left=left-1;
                    stm8 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book2NewSerial+"'" );
                    int n = stm8.executeUpdate();
                    if(n==1)
                    {

                    }
                }




                stm11 = (PreparedStatement) con.prepareStatement("select *from book where serial='"+book3NewSerial+"'");
                // System.out.println(stm);
                ResultSet r2=stm11.executeQuery();

                if(r2.next())
                {

                    int left=Integer.parseInt(r2.getString("left"));
                    left=left-1;
                    stm12 = (PreparedStatement) con.prepareStatement("UPDATE `libraryPstu`.`book` SET `left` = '"+left+"' WHERE `book`.`serial` ='"+book3NewSerial+"'" );
                    int n = stm12.executeUpdate();
                    if(n==1)
                    {

                    }
                }



            JOptionPane.showMessageDialog(rootPane, "successfully saved!!!!!!!!!!!!");
                }




            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianHome.class.getName()).log(Level.SEVERE, null, ex);
        }



        } else {
            
            System.out.println("issue canceled");
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        bookname.setText("");
        serial.setText("");
        amount.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new LoginFormLibrarian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookSerial;
    private javax.swing.JTextField RegNo;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField bookname;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField regNo;
    private javax.swing.JTextField serial;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField stmbl;
    private javax.swing.JTextField stname;
    private javax.swing.JTextField streg;
    // End of variables declaration//GEN-END:variables

}
