
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class AddMedicine extends javax.swing.JFrame {

    private String username = "";
    public String numberPattern = "^\\d{1,8}(\\.\\d{1,2})?$";

    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
        initComponents();
    }

    public AddMedicine(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtmedid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcompanyname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpricepertunit = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 14, 255, 58));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 819, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 112, 109, -1));

        txtmedid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtmedid, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 149, 236, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 83, 23));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 236, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 126, 23));

        txtcompanyname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtcompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 236, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 116, -1));

        txtquantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 236, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price Per Unit (Rs:)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 112, 140, 23));

        txtpricepertunit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtpricepertunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 147, 236, 34));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 227, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 820, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do You want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new PharmacistDashBoard().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private Connection con;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String medicineid = txtmedid.getText();
        String name = txtname.getText();
        String companyName = txtcompanyname.getText();
        String quantity = txtquantity.getText();
        String priceperUnit = txtpricepertunit.getText();
        if (medicineid.equals("")) {
            JOptionPane.showMessageDialog(null, "Medicine ID Feild is Required");
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Feild is Required");
        } else if (companyName.equals("")) {
            JOptionPane.showMessageDialog(null, "Company Name Feild is Required");
        } else if (quantity.equals("")) {
            JOptionPane.showMessageDialog(null, "Quantity Feild is Required");
        } else if (priceperUnit.equals("")) {
            JOptionPane.showMessageDialog(null, "Price Per Unit Feild is Required");
        } else if (!priceperUnit.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Price Per Unit Feild is invalid");
            txtpricepertunit.setText("");
            txtpricepertunit.requestFocus();
        } else {
            PreparedStatement stmt = null;
            try {
                String url = "jdbc:mysql://localhost:3306/pharmacy";
                con = DriverManager.getConnection(url, "root", "lahiru@123");
                stmt = con.prepareStatement("INSERT INTO medicine (medid,name,companyname,quantity,priceperunit)VALUES(?,?,?,?,?)");
                stmt.setString(1, medicineid);
                stmt.setString(2, name);
                stmt.setString(3, companyName);
                stmt.setString(4, quantity);
                stmt.setString(5, priceperUnit);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Medicine Added successful!");
                getClear();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Storing Medicine is Failed. Please try again.");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public void getClear() {
        txtmedid.setText("");
        txtname.setText("");
        txtcompanyname.setText("");
        txtquantity.setText("");
        txtpricepertunit.setText("");
    }

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcompanyname;
    private javax.swing.JTextField txtmedid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpricepertunit;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
