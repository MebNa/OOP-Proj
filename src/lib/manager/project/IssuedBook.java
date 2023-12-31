/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.manager.project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author bikash
 */
public class IssuedBook extends javax.swing.JFrame {

    /**
     * Creates new form ViewBook
     * @throws java.sql.SQLException
     */
    public IssuedBook() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
       // String Data[][]=null;
      //  String Column[]=null;
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            
            
         /*   Column = new String[colnum];
            for(int i=1;i<=colnum;i++){
               Column[i-1]=rsmd.getColumnClassName(i);
                }
            rs.last();
            
            int rows=rs.getRow();
            rs.beforeFirst();
            
            String[][] data = new String[rows][colnum];
            
            int count=0; */
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        NameRadio = new javax.swing.JRadioButton();
        BookIDRadio = new javax.swing.JRadioButton();
        ALL = new javax.swing.JRadioButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        UserIDRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID","User ID", "Book Name", "Issued Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NameRadio.setText("Name");
        NameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRadioActionPerformed(evt);
            }
        });

        BookIDRadio.setText("BookID");
        BookIDRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDRadioActionPerformed(evt);
            }
        });

        ALL.setText("ALL");
        ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLActionPerformed(evt);
            }
        });

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        UserIDRadio.setText("UserID");
        UserIDRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDRadioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Issued Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ALL)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(NameRadio)
                .addGap(47, 47, 47)
                .addComponent(BookIDRadio)
                .addGap(43, 43, 43)
                .addComponent(UserIDRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Search)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(ALL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameRadio)
                        .addComponent(BookIDRadio)
                        .addComponent(UserIDRadio))
                    .addComponent(Search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code hereset
        this.dispose();
        LibrarianSuccess.ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        
                    DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
        if(NameRadio.isSelected())
        {
       // String Data[][]=null;
      //  String Column[]=null;
            String Search = "%"+SearchField.getText()+"%";
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and Books.BookName like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, Search);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            //code here
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    } }
        
        else if(BookIDRadio.isSelected())
        {
            
       // String Data[][]=null;
      //  String Column[]=null;
            String Search = SearchField.getText();
            int BookIDV;
        BookIDV = Integer.parseInt(Search);
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and IssuedBook.BookID=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,BookIDV);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            //code here
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
        }
         else if(UserIDRadio.isSelected())
        {
            
       // String Data[][]=null;
      //  String Column[]=null;
            String Search = SearchField.getText();
            int UserIDV;
        UserIDV = Integer.parseInt(Search);
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and IssuedBook.UserID=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,UserIDV);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            //code here
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
        }
        
        else
        {
            
				JOptionPane.showMessageDialog(IssuedBook.this, "Select Name or Author","No Selection!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void BookIDRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDRadioActionPerformed
        // TODO add your handling code here:
        NameRadio.setSelected(false);
        ALL.setSelected(false);
        UserIDRadio.setSelected(false);
    }//GEN-LAST:event_BookIDRadioActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
        // TODO add your handling code here:
        BookIDRadio.setSelected(false);
        ALL.setSelected(false);
        UserIDRadio.setSelected(false);
        
    }//GEN-LAST:event_NameRadioActionPerformed

    private void ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLActionPerformed
        // TODO add your handling code here:
        SearchField.setText("");
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
          try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            
            
         /*   Column = new String[colnum];
            for(int i=1;i<=colnum;i++){
               Column[i-1]=rsmd.getColumnClassName(i);
                }
            rs.last();
            
            int rows=rs.getRow();
            rs.beforeFirst();
            
            String[][] data = new String[rows][colnum];
            
            int count=0; */
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
        }
    }//GEN-LAST:event_ALLActionPerformed

    private void UserIDRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDRadioActionPerformed
        // TODO add your handling code here:
        ALL.setSelected(false);
        NameRadio.setSelected(false);
        BookIDRadio.setSelected(false);    
    }//GEN-LAST:event_UserIDRadioActionPerformed

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
            java.util.logging.Logger.getLogger(IssuedBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssuedBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssuedBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssuedBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IssuedBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(IssuedBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JRadioButton BookIDRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JRadioButton UserIDRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
