/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiAhorcado;

import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author Estudiantes
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
    }
    Palabra1 palabra = new Palabra1();
    JLabel casilla[];
    JLabel etiquetaPerdio;
    String PalabraSeleccionada = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        A = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        H = new javax.swing.JButton();
        W = new javax.swing.JButton();
        E = new javax.swing.JButton();
        R = new javax.swing.JButton();
        F = new javax.swing.JButton();
        V = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        T = new javax.swing.JButton();
        B = new javax.swing.JButton();
        N = new javax.swing.JButton();
        G = new javax.swing.JButton();
        S = new javax.swing.JButton();
        X = new javax.swing.JButton();
        U = new javax.swing.JButton();
        I = new javax.swing.JButton();
        M = new javax.swing.JButton();
        J = new javax.swing.JButton();
        O = new javax.swing.JButton();
        L = new javax.swing.JButton();
        K = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Ñ = new javax.swing.JButton();
        Q = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("JUGAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Z.setText("Z");
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZMouseClicked(evt);
            }
        });

        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });

        Y.setText("Y");
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YMouseClicked(evt);
            }
        });

        H.setText("H");
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
        });

        W.setText("W");
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WMouseClicked(evt);
            }
        });

        E.setText("E");
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
        });

        R.setText("R");
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
        });

        F.setText("F");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
        });

        V.setText("V");
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VMouseClicked(evt);
            }
        });

        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });

        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });

        T.setText("T");
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMouseClicked(evt);
            }
        });

        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });

        N.setText("N");
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMouseClicked(evt);
            }
        });

        G.setText("G");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
        });

        S.setText("S");
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SMouseClicked(evt);
            }
        });

        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });

        U.setText("U");
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UMouseClicked(evt);
            }
        });

        I.setText("I");
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMouseClicked(evt);
            }
        });

        M.setText("M");
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMouseClicked(evt);
            }
        });

        J.setText("J");
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMouseClicked(evt);
            }
        });

        O.setText("O");
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OMouseClicked(evt);
            }
        });

        L.setText("L");
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMouseClicked(evt);
            }
        });

        K.setText("K");
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KMouseClicked(evt);
            }
        });

        P.setText("P");
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMouseClicked(evt);
            }
        });

        Ñ.setText("Ñ");
        Ñ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ÑMouseClicked(evt);
            }
        });

        Q.setText("Q");
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(A)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                    .addComponent(S)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(D)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(F)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(G)
                    .addGap(7, 7, 7)
                    .addComponent(H)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(J)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(K)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(L)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Ñ)
                    .addGap(362, 362, 362))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(Z)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(X)
                            .addGap(13, 13, 13)
                            .addComponent(C)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(V)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(B)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(N)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(M))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(Q)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(W)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E)
                            .addGap(9, 9, 9)
                            .addComponent(R)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(T)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Y)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(U)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(O)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(W)
                    .addComponent(E)
                    .addComponent(R)
                    .addComponent(T)
                    .addComponent(Y)
                    .addComponent(U)
                    .addComponent(I)
                    .addComponent(O)
                    .addComponent(P)
                    .addComponent(Q))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(F)
                    .addComponent(D)
                    .addComponent(S)
                    .addComponent(G)
                    .addComponent(H)
                    .addComponent(J)
                    .addComponent(K)
                    .addComponent(L)
                    .addComponent(Ñ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Z)
                    .addComponent(V)
                    .addComponent(C)
                    .addComponent(X)
                    .addComponent(B)
                    .addComponent(N)
                    .addComponent(M))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        PalabraSeleccionada = palabra.mipalabrita();
        casilla = new JLabel[PalabraSeleccionada.length()];

        for (int i = 0; i < PalabraSeleccionada.length(); i++) {

            casilla[i] = new JLabel();
            casilla[i].setBounds(18 * i, 40, 20, 30);
            casilla[i].setSize(new Dimension(50, 50));
            casilla[i].setText("-");
            //casilla[i].setText(String.valueOf(palabrita.charAt(i)));
            this.add(casilla[i]);
            casilla[i].setVisible(true);
        }
        this.repaint();

    }//GEN-LAST:event_jButton1MouseClicked
    public void ValidarLetra(String letra) {
        String qletter = letra;
        int contadorErrores = 0;
        String palabrita = PalabraSeleccionada;
        etiquetaPerdio = new JLabel();
        if (contadorErrores < 5) {
            for (int n = 0; n < palabrita.length(); n++) {
                char c = palabrita.charAt(n);

                if (String.valueOf(c).equals(qletter)) {
                    System.out.println("la posicion es" + n);
                    System.out.println(c);
                    casilla[n] = new JLabel();
                    casilla[n].setBounds(18 * n, 30, 20, 30);
                    casilla[n].setSize(new Dimension(50, 50));
                    // casilla[i].setText("-");
                    casilla[n].setText(letra);
                    this.add(casilla[n]);
                    casilla[n].setVisible(true);
                } else {
                    contadorErrores++;
                    etiquetaPerdio.setBounds(60, 190, 50, 30);
                    etiquetaPerdio.setSize(new Dimension(50, 50));
                    etiquetaPerdio.setText("Fallas" + contadorErrores);
                    this.add(etiquetaPerdio);
                    etiquetaPerdio.setVisible(true);
                    //agregar dibujo
                }
            }
        } else {

            etiquetaPerdio.setBounds(60, 190, 50, 30);
            etiquetaPerdio.setSize(new Dimension(50, 50));
            etiquetaPerdio.setText("¡Perdiste!");
            this.add(etiquetaPerdio);
            etiquetaPerdio.setVisible(true);
            //perdio

        }

        // char [] aPalabrita = palabrita.toCharArray();
        this.repaint();
        /*for (int i = 0; i<palabrita.length(); i++){
       String letra = String.valueOf(palabrita.charAt(i));
       if(letra.equals(qletter)){
           
            casilla[i]=new JLabel();
            casilla[i].setBounds(18 * i, 40, 20, 30);
            casilla[i].setSize(new Dimension(50,50));
           // casilla[i].setText("-");
            casilla[i].setText("q");
            this.add(casilla[i]);
            casilla[i].setVisible(true);
       }
       this.repaint();*/
    }
    private void WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseClicked
        ValidarLetra("w");        // TODO add your handling code here:
    }//GEN-LAST:event_WMouseClicked

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        ValidarLetra("a");        // TODO add your handling code here:
    }//GEN-LAST:event_AMouseClicked

    private void ZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseClicked
        ValidarLetra("z");        // TODO add your handling code here:
    }//GEN-LAST:event_ZMouseClicked

    private void SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseClicked
        ValidarLetra("s");        // TODO add your handling code here:
    }//GEN-LAST:event_SMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        ValidarLetra("x");        // TODO add your handling code here:
    }//GEN-LAST:event_XMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
        ValidarLetra("e");        // TODO add your handling code here:
    }//GEN-LAST:event_EMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        ValidarLetra("d");        // TODO add your handling code here:
    }//GEN-LAST:event_DMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        ValidarLetra("c");        // TODO add your handling code here:
    }//GEN-LAST:event_CMouseClicked

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
        ValidarLetra("r");        // TODO add your handling code here:
    }//GEN-LAST:event_RMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        ValidarLetra("f");        // TODO add your handling code here:
    }//GEN-LAST:event_FMouseClicked

    private void VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseClicked
        ValidarLetra("v");        // TODO add your handling code here:
    }//GEN-LAST:event_VMouseClicked

    private void TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseClicked
        ValidarLetra("t");        // TODO add your handling code here:
    }//GEN-LAST:event_TMouseClicked

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
        ValidarLetra("g");        // TODO add your handling code here:
    }//GEN-LAST:event_GMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        ValidarLetra("b");        // TODO add your handling code here:
    }//GEN-LAST:event_BMouseClicked

    private void YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseClicked
        ValidarLetra("y");        // TODO add your handling code here:
    }//GEN-LAST:event_YMouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked
        ValidarLetra("h");        // TODO add your handling code here:
    }//GEN-LAST:event_HMouseClicked

    private void NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseClicked
        ValidarLetra("n");        // TODO add your handling code here:
    }//GEN-LAST:event_NMouseClicked

    private void UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseClicked
        ValidarLetra("u");        // TODO add your handling code here:
    }//GEN-LAST:event_UMouseClicked

    private void JMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseClicked
        ValidarLetra("j");        // TODO add your handling code here:
    }//GEN-LAST:event_JMouseClicked

    private void MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseClicked
        ValidarLetra("m");        // TODO add your handling code here:
    }//GEN-LAST:event_MMouseClicked

    private void IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseClicked
        ValidarLetra("i");        // TODO add your handling code here:
    }//GEN-LAST:event_IMouseClicked

    private void KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseClicked
        ValidarLetra("k");        // TODO add your handling code here:
    }//GEN-LAST:event_KMouseClicked

    private void OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseClicked
        ValidarLetra("o");        // TODO add your handling code here:
    }//GEN-LAST:event_OMouseClicked

    private void LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseClicked
        ValidarLetra("l");        // TODO add your handling code here:
    }//GEN-LAST:event_LMouseClicked

    private void PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseClicked
        ValidarLetra("p");        // TODO add your handling code here:
    }//GEN-LAST:event_PMouseClicked

    private void ÑMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÑMouseClicked
        ValidarLetra("ñ");        // TODO add your handling code here:
    }//GEN-LAST:event_ÑMouseClicked

    private void QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseClicked
        ValidarLetra("q");    // TODO add your handling code here:
    }//GEN-LAST:event_QMouseClicked
    //}
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton Ñ;
    // End of variables declaration//GEN-END:variables

    private static class Jlabel {

    }
}
