/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author Antonio
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculadora = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEleQuadrado = new javax.swing.JButton();
        btnEleCubo = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visorCalculadora.setColumns(20);
        visorCalculadora.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        visorCalculadora.setRows(5);
        jScrollPane1.setViewportView(visorCalculadora);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLimpar.setText("CE");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSoma.setText("+");
        btnSoma.setMaximumSize(new java.awt.Dimension(41, 31));
        btnSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSomaMouseClicked(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSub.setText("-");
        btnSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubMouseClicked(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDiv.setText("<html>&divide</html>");
        btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivMouseClicked(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMulti.setText("<html>&times</html>");
        btnMulti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiMouseClicked(evt);
            }
        });

        btnCalc.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(0, 0, 255));
        btnCalc.setText("=");
        btnCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcMouseClicked(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        btnVirgula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnVirgula.setText(".");
        btnVirgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVirgulaMouseClicked(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("←");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEleQuadrado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnEleQuadrado.setText("<html>x<sup>2</sup></html>");
        btnEleQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleQuadradoActionPerformed(evt);
            }
        });

        btnEleCubo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnEleCubo.setText("<html>x<sup>3</sup> </html>");
        btnEleCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleCuboActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnRaizQuadrada.setText("<html><span>&#8730;</span></html>");
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("<html><span>&#8731;</span></html>");
        jButton1.setActionCommand("<html><span>&#8731;</span></html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn4)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6)
                                    .addComponent(btn3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn8)
                                    .addComponent(btn0))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVirgula)
                                    .addComponent(btn9)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRaizQuadrada)
                                .addComponent(jButton1)
                                .addComponent(btnEleCubo))
                            .addComponent(btnEleQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBack)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar)
                            .addComponent(btnCalc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn2)
                        .addComponent(btn1))
                    .addComponent(btnEleQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn6)
                        .addComponent(btn5)
                        .addComponent(btn4))
                    .addComponent(btnEleCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9)
                    .addComponent(btn8)
                    .addComponent(btn7)
                    .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVirgula)
                        .addComponent(btn0))
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Developed by Antonio Carlos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        // TODO add your handling code here:
        visorCalculadora.setText("");
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        System.out.println(">>>>>"+valor);
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(valor);
        
        visorCalculadora.setText(valor + "= " + resultado);
    }//GEN-LAST:event_btnCalcMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "1");
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "2");
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "3");
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "4");
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "5");
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "6");
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "7");
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "8");
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "9");
    }//GEN-LAST:event_btn9MouseClicked

    private void btnSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSomaMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "+");
    }//GEN-LAST:event_btnSomaMouseClicked

    private void btnSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "-");
    }//GEN-LAST:event_btnSubMouseClicked

    private void btnDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "÷");
    }//GEN-LAST:event_btnDivMouseClicked

    private void btnMultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "x");
    }//GEN-LAST:event_btnMultiMouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "0");
    }//GEN-LAST:event_btn0MouseClicked

    private void btnVirgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVirgulaMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + ".");
    }//GEN-LAST:event_btnVirgulaMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StringBuffer apagar = new StringBuffer(visorCalculadora.getText());
        apagar.reverse();
        
        apagar.deleteCharAt(0);
        apagar.reverse();
        
        String x = new String(apagar);
        visorCalculadora.setText(x);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEleQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleQuadradoActionPerformed
        // TODO add your handling code here:
        Double valor = Double.parseDouble(visorCalculadora.getText());
        Double ele2 = Math.pow(valor, 2);
        visorCalculadora.setText(String.format(valor + " = " + "%.2f", ele2));
    }//GEN-LAST:event_btnEleQuadradoActionPerformed

    private void btnEleCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleCuboActionPerformed
        // TODO add your handling code here:
        Double valor = Double.parseDouble(visorCalculadora.getText());
        Double ele3 = Math.pow(valor, 3);
        visorCalculadora.setText(String.format(valor + " = " + "%.2f", ele3));
    }//GEN-LAST:event_btnEleCuboActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
        // TODO add your handling code here:
        Double valor = Double.parseDouble(visorCalculadora.getText());
        Double rq = Math.sqrt(valor);
        visorCalculadora.setText(String.format(valor + " = " + "%.2f", rq));
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Double valor = Double.parseDouble(visorCalculadora.getText());
            Double rc = Math.cbrt(valor);
            visorCalculadora.setText(String.format(valor + " = " + "%.2f", rc));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEleCubo;
    private javax.swing.JButton btnEleQuadrado;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea visorCalculadora;
    // End of variables declaration//GEN-END:variables
}
