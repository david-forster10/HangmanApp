package hangmanapp;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainStageJFrame extends javax.swing.JFrame {
    

    char SelectedLetter;
    String word; 
    String masked_word = "";
    
    // Random number generator instance
    Random randomGenerator = new Random();

    public String next() {

        // Value retrieved from array-list
        String item = null;
        // Index to be read from array-list
        int index = 0;

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
            for (int i = 0; i < item.length(); i++)
            {
                masked_word = masked_word + "_ ";
            }
            lblWord.setText(masked_word);
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
        btnGuess = new javax.swing.JButton();
        lbl_timergraphic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(845, 630));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblWord.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        lblWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWord.setText("_ _ _ _ _ _ _ _ _");
        lblWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_q.setText("q");
        btn_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qActionPerformed(evt);
            }
        });

        btn_w.setText("w");
        btn_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wActionPerformed(evt);
            }
        });

        btn_e.setText("e");
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });

        btn_r.setText("r");
        btn_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rActionPerformed(evt);
            }
        });

        btn_t.setText("t");
        btn_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tActionPerformed(evt);
            }
        });

        btn_y.setText("y");
        btn_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yActionPerformed(evt);
            }
        });

        btn_u.setText("u");
        btn_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uActionPerformed(evt);
            }
        });

        btn_i.setText("i");
        btn_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iActionPerformed(evt);
            }
        });

        btn_o.setText("o");
        btn_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oActionPerformed(evt);
            }
        });

        btn_p.setText("p");
        btn_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pActionPerformed(evt);
            }
        });

        btn_a.setText("a");
        btn_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aActionPerformed(evt);
            }
        });

        btn_s.setText("s");
        btn_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sActionPerformed(evt);
            }
        });

        btn_d.setText("d");
        btn_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dActionPerformed(evt);
            }
        });

        btn_f.setText("f");
        btn_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fActionPerformed(evt);
            }
        });

        btn_g.setText("g");
        btn_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gActionPerformed(evt);
            }
        });

        btn_h.setText("h");
        btn_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hActionPerformed(evt);
            }
        });

        btn_j.setText("j");
        btn_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jActionPerformed(evt);
            }
        });

        btn_k.setText("k");
        btn_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kActionPerformed(evt);
            }
        });

        btn_l.setText("l");
        btn_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lActionPerformed(evt);
            }
        });

        btn_z.setText("z");
        btn_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zActionPerformed(evt);
            }
        });

        btn_x.setText("x");
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });

        btn_c.setText("c");
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });

        btn_v.setText("v");
        btn_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vActionPerformed(evt);
            }
        });

        btn_b.setText("b");
        btn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bActionPerformed(evt);
            }
        });

        btn_m.setText("m");
        btn_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mActionPerformed(evt);
            }
        });

        btn_n.setText("n");
        btn_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_guessesleftgraphic.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_guessesleftgraphic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_guessesleftgraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanapp/images/GuessLeft.png"))); // NOI18N
        lbl_guessesleftgraphic.setText("9");
        lbl_guessesleftgraphic.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_guessesleftgraphic.setIconTextGap(-230);

        btnGuess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuess.setText("Guess the Word");

        lbl_timergraphic.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_timergraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanapp/images/TimeTaken.png"))); // NOI18N
        lbl_timergraphic.setText("0:00");
        lbl_timergraphic.setIconTextGap(-115);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanapp/images/NewGif4.gif"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_guessesleftgraphic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_timergraphic))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblWord, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btn_q)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(btn_w)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(btn_e)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(btn_r)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(btn_t)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn_y)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(btn_u)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btn_i)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn_o)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn_p))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(22, 22, 22)
                                                            .addComponent(btn_a)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(btn_l))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addGap(75, 75, 75)
                                                            .addComponent(btn_z)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btn_x)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btn_c)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(btn_v)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btn_b)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btn_n)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btn_m)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_guessesleftgraphic)
                    .addComponent(lbl_timergraphic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblWord)
                        .addGap(42, 42, 42)
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
                        .addGap(18, 18, 18)
                        .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       word = next();
    }//GEN-LAST:event_formWindowOpened

    private void btn_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'q';
        Compare();
        btn_q.setEnabled(false);
    }//GEN-LAST:event_btn_qActionPerformed

    private void btn_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'w';
        Compare();
        btn_w.setEnabled(false);
    }//GEN-LAST:event_btn_wActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'e';
        Compare();
        btn_e.setEnabled(false);
    }//GEN-LAST:event_btn_eActionPerformed

    private void btn_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'r';
        Compare();
        btn_r.setEnabled(false);
    }//GEN-LAST:event_btn_rActionPerformed

    private void btn_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tActionPerformed
        SelectedLetter = 't';
        Compare();
        btn_t.setEnabled(false);
    }//GEN-LAST:event_btn_tActionPerformed

    private void btn_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'y';
        Compare();
        btn_y.setEnabled(false);
    }//GEN-LAST:event_btn_yActionPerformed

    private void btn_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'u';
        Compare();
        btn_u.setEnabled(false);
    }//GEN-LAST:event_btn_uActionPerformed

    private void btn_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'i';
        Compare();
        btn_i.setEnabled(false);
    }//GEN-LAST:event_btn_iActionPerformed

    private void btn_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'o';
        Compare();
        btn_o.setEnabled(false);
    }//GEN-LAST:event_btn_oActionPerformed

    private void btn_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'p';
        Compare();
        btn_p.setEnabled(false);
    }//GEN-LAST:event_btn_pActionPerformed

    private void btn_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'a';
        Compare();
        btn_a.setEnabled(false);
    }//GEN-LAST:event_btn_aActionPerformed

    private void btn_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 's';
        Compare();
        btn_s.setEnabled(false);
    }//GEN-LAST:event_btn_sActionPerformed

    private void btn_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'd';
        Compare();
        btn_d.setEnabled(false);
    }//GEN-LAST:event_btn_dActionPerformed

    private void btn_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'f';
        Compare();
        btn_f.setEnabled(false);
    }//GEN-LAST:event_btn_fActionPerformed

    private void btn_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'g';
        Compare();
        btn_g.setEnabled(false);
    }//GEN-LAST:event_btn_gActionPerformed

    private void btn_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'h';
        Compare();
        btn_h.setEnabled(false);
    }//GEN-LAST:event_btn_hActionPerformed

    private void btn_jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'j';
        Compare();
        btn_j.setEnabled(false);
    }//GEN-LAST:event_btn_jActionPerformed

    private void btn_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'k';
        Compare();
        btn_k.setEnabled(false);
    }//GEN-LAST:event_btn_kActionPerformed

    private void btn_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'l';
        Compare();
        btn_l.setEnabled(false);
    }//GEN-LAST:event_btn_lActionPerformed

    private void btn_zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'z';
        Compare();
        btn_z.setEnabled(false);
    }//GEN-LAST:event_btn_zActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'x';
        Compare();
        btn_x.setEnabled(false);
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'c';
        Compare();
        btn_c.setEnabled(false);
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'v';
        Compare();
        btn_v.setEnabled(false);
    }//GEN-LAST:event_btn_vActionPerformed

    private void btn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'b';
        Compare();
        btn_b.setEnabled(false);
    }//GEN-LAST:event_btn_bActionPerformed

    private void btn_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'n';
        Compare();
        btn_n.setEnabled(false);
    }//GEN-LAST:event_btn_nActionPerformed

    private void btn_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mActionPerformed
        // TODO add your handling code here:
        SelectedLetter = 'm';
        Compare();
        btn_m.setEnabled(false);
    }//GEN-LAST:event_btn_mActionPerformed

    
    public void Compare()
    { 
        boolean matched = false;
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == SelectedLetter)
            {
                JOptionPane.showMessageDialog(null,"This should be a match at index " + i, "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                matched = true;
            }
        }
            if (matched == false){
            {
                JOptionPane.showMessageDialog(null,"wrong", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            }   
            }
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
    private javax.swing.JButton btnGuess;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblWord;
    private javax.swing.JLabel lbl_guessesleftgraphic;
    private javax.swing.JLabel lbl_timergraphic;
    // End of variables declaration//GEN-END:variables
}