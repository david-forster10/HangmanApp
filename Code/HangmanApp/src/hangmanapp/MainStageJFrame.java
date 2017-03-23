package hangmanapp;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainStageJFrame extends javax.swing.JFrame {

    // Random number generator instance
    Random randomGenerator = new Random();
  
    public void reset() {

        try {
            Scanner scan = new Scanner((Readable) Global.Db);
            while (scan.hasNext())
                Global.Db.add(scan.nextLine());
            scan.close();
        } catch (Exception e) {
        }
    }

    public String next() {

        // Value retrieved from array-list
        String item = null;
        // Index to be read from array-list
        int index = 0;

        // Reset the array-list if is it empty
        if (Global.Db.isEmpty()) {
            reset();
        }

        // Check the size, there is a possibility to have zero elements in your stored file
        if (Global.Db.size() > 0) {

            if (Global.Db.size() > 1) {
                // Get a random number
                index = randomGenerator.nextInt(Global.Db.size());
            } else {
                // If the array-list has only one item there is no need to get a random number.
                index = 0;
            }
            // Get the indexed item
            item = Global.Db.get(index);
       
            JOptionPane.showMessageDialog(null, item, "ERROR!", JOptionPane.INFORMATION_MESSAGE);
        }

        // Return the item
        return item;
    }
   
    /**
     * Creates new form MainStageJFrame
     */
    public MainStageJFrame() 
    {
        initComponents();   
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWord = new javax.swing.JLabel();
        btn_q = new javax.swing.JButton();
        btn_w = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_r = new javax.swing.JButton();
        btn_t = new javax.swing.JButton();
        btn_y = new javax.swing.JButton();
        btn_u = new javax.swing.JButton();
        btn_i = new javax.swing.JButton();
        btn_o = new javax.swing.JButton();
        btn_p = new javax.swing.JButton();
        btn_a = new javax.swing.JButton();
        btn_s = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();
        btn_f = new javax.swing.JButton();
        btn_g = new javax.swing.JButton();
        btn_h = new javax.swing.JButton();
        btn_j = new javax.swing.JButton();
        btn_k = new javax.swing.JButton();
        btn_l = new javax.swing.JButton();
        btn_z = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_v = new javax.swing.JButton();
        btn_b = new javax.swing.JButton();
        btn_m = new javax.swing.JButton();
        btn_n = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lbl_guessesleftgraphic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_timergraphic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(961, 665));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblWord.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        lblWord.setText("_ _ _ _ _ _ _ _ _");

        btn_q.setText("q");

        btn_w.setText("w");

        btn_e.setText("e");

        btn_r.setText("r");

        btn_t.setText("t");

        btn_y.setText("y");

        btn_u.setText("u");

        btn_i.setText("i");

        btn_o.setText("o");

        btn_p.setText("p");

        btn_a.setText("a");

        btn_s.setText("s");

        btn_d.setText("d");

        btn_f.setText("f");

        btn_g.setText("g");

        btn_h.setText("h");

        btn_j.setText("j");

        btn_k.setText("k");

        btn_l.setText("l");

        btn_z.setText("z");

        btn_x.setText("x");

        btn_c.setText("c");

        btn_v.setText("v");

        btn_b.setText("b");

        btn_m.setText("m");

        btn_n.setText("n");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_guessesleftgraphic.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_guessesleftgraphic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_guessesleftgraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanapp/images/GuessLeft.png"))); // NOI18N
        lbl_guessesleftgraphic.setText("9");
        lbl_guessesleftgraphic.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_guessesleftgraphic.setIconTextGap(-230);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Guess the Word");

        lbl_timergraphic.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_timergraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanapp/images/TimeTaken.png"))); // NOI18N
        lbl_timergraphic.setText("0:00");
        lbl_timergraphic.setIconTextGap(-115);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_guessesleftgraphic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_timergraphic))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblWord))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_a)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_z)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_x)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_c)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_v)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_b)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_n)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_m))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_s)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_d)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_f)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_g)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_h)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_j)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_k)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_l))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_q)
                                .addGap(2, 2, 2)
                                .addComponent(btn_w)
                                .addGap(2, 2, 2)
                                .addComponent(btn_e)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_r)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_y)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_u)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_i)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_o)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_p))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_guessesleftgraphic)
                    .addComponent(lbl_timergraphic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(lblWord)
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_q)
                    .addComponent(btn_w)
                    .addComponent(btn_e)
                    .addComponent(btn_r)
                    .addComponent(btn_t)
                    .addComponent(btn_y)
                    .addComponent(btn_i)
                    .addComponent(btn_o)
                    .addComponent(btn_u)
                    .addComponent(btn_p))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a)
                    .addComponent(btn_s)
                    .addComponent(btn_d)
                    .addComponent(btn_f)
                    .addComponent(btn_g)
                    .addComponent(btn_h)
                    .addComponent(btn_j)
                    .addComponent(btn_k)
                    .addComponent(btn_l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_z)
                    .addComponent(btn_n)
                    .addComponent(btn_x)
                    .addComponent(btn_c)
                    .addComponent(btn_v)
                    .addComponent(btn_b)
                    .addComponent(btn_m))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        next();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainStageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainStageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainStageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainStageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainStageJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_a;
    private javax.swing.JButton btn_b;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_d;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_f;
    private javax.swing.JButton btn_g;
    private javax.swing.JButton btn_h;
    private javax.swing.JButton btn_i;
    private javax.swing.JButton btn_j;
    private javax.swing.JButton btn_k;
    private javax.swing.JButton btn_l;
    private javax.swing.JButton btn_m;
    private javax.swing.JButton btn_n;
    private javax.swing.JButton btn_o;
    private javax.swing.JButton btn_p;
    private javax.swing.JButton btn_q;
    private javax.swing.JButton btn_r;
    private javax.swing.JButton btn_s;
    private javax.swing.JButton btn_t;
    private javax.swing.JButton btn_u;
    private javax.swing.JButton btn_v;
    private javax.swing.JButton btn_w;
    private javax.swing.JButton btn_x;
    private javax.swing.JButton btn_y;
    private javax.swing.JButton btn_z;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblWord;
    private javax.swing.JLabel lbl_guessesleftgraphic;
    private javax.swing.JLabel lbl_timergraphic;
    // End of variables declaration//GEN-END:variables
}