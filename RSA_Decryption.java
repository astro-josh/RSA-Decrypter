/**
 * @description COSC 314 Final Project
 * @author Joshua Alexander
 */

public class RSA_Decryption extends javax.swing.JFrame  {

    /**
     * Creates new form RSA_Decryption
     */
    public RSA_Decryption() {
        initComponents();
    }
    
    private final RSA a = new RSA();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cipherText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        decryptBtn = new javax.swing.JButton();
        nText = new javax.swing.JTextField();
        eText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        plainText = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        spacesBtn = new javax.swing.JButton();
        upperBtn = new javax.swing.JButton();
        lowerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RSA Decrypter by Joshua Alexander");

        cipherText.setColumns(20);
        cipherText.setLineWrap(true);
        cipherText.setRows(5);
        jScrollPane1.setViewportView(cipherText);

        jLabel1.setText("Cipher Text");

        decryptBtn.setText("Decrypt");
        decryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Public Key (n, e)");

        jLabel3.setText("n");

        jLabel4.setText("e");

        plainText.setColumns(20);
        plainText.setLineWrap(true);
        plainText.setRows(5);
        jScrollPane2.setViewportView(plainText);

        jLabel5.setText("Plain Text");

        clearBtn.setText("Clear Cipher Text");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        spacesBtn.setText("Remove Spaces");
        spacesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spacesBtnActionPerformed(evt);
            }
        });

        upperBtn.setText("To Uppercase");
        upperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperBtnActionPerformed(evt);
            }
        });

        lowerBtn.setText("To Lowercase");
        lowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spacesBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(upperBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lowerBtn)))
                                .addGap(0, 105, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(decryptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spacesBtn)
                    .addComponent(upperBtn)
                    .addComponent(lowerBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Actions to perform when clear button is pushed.
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        cipherText.setText(""); // set cipherText to empty
    }//GEN-LAST:event_clearBtnActionPerformed

    // Actions to perform when decrypt button is pushed.
    private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBtnActionPerformed
        String message = "";
        plainText.setText(""); // set plainText to empty
        
        // check for valid n and e values
        if (nText.getText().isEmpty() || Integer.parseInt(nText.getText()) > 100000 || eText.getText().isEmpty()) {
            plainText.setText("Invalid n and/or e value, please enter integers only and a n value no greater than 100000.");
        }
        // check to see if ciphertext is empty
        else if (cipherText.getText().isEmpty()) {
            plainText.setText("No Ciphertext Given");
        }
        // run decryption on ciphertext
        else {
            String [] ctText = cipherText.getText().split(" ");
            int [] ctNums = new int [ctText.length];

            for (int i = 0; i < ctText.length; i++) {
                ctNums[i] = Integer.parseInt(ctText[i]);
            }
            
            // decrypt for each number in ctNums list, append decrypted letters to message string
            for (int j = 0; j < ctNums.length; j++) {
                message += " " + a.decrypt(ctNums[j], Integer.parseInt(nText.getText()), Integer.parseInt(eText.getText()));
            }
            
            // set the plaintext box to the message string
            plainText.setText(message);
        }
    }//GEN-LAST:event_decryptBtnActionPerformed

    // Add spaces button function.
    private void spacesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spacesBtnActionPerformed
        if(!plainText.getText().isEmpty())
            plainText.setText(plainText.getText().replaceAll(" ", ""));
    }//GEN-LAST:event_spacesBtnActionPerformed

    // To uppercsae button function.
    private void upperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperBtnActionPerformed
        if(!plainText.getText().isEmpty())
            plainText.setText(plainText.getText().toUpperCase());
    }//GEN-LAST:event_upperBtnActionPerformed

    // To lowercase button function.
    private void lowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerBtnActionPerformed
        if(!plainText.getText().isEmpty())
            plainText.setText(plainText.getText().toLowerCase());
    }//GEN-LAST:event_lowerBtnActionPerformed

    // Main driver of the program, sets up the GUI
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
            java.util.logging.Logger.getLogger(RSA_Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA_Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA_Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA_Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RSA_Decryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cipherText;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton decryptBtn;
    private javax.swing.JTextField eText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lowerBtn;
    private javax.swing.JTextField nText;
    private javax.swing.JTextArea plainText;
    private javax.swing.JButton spacesBtn;
    private javax.swing.JButton upperBtn;
    // End of variables declaration//GEN-END:variables
}