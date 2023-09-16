/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueria;

/**
 *
 * @author gabri
 */
public class PeluquerosGUI extends javax.swing.JFrame {

    private double acumulador11 = 0.0;
    private double acumulador12 = 0.0;
    private double acumulador13 = 0.0;
    private double acumulador14 = 0.0;
    private double acumulador15 = 0.0;
    private double acumulador16 = 0.0;
    private double acumulador17 = 0.0;
    private double acumulador18 = 0.0;
    private double acumulador21 = 0.0;
    private double acumulador22 = 0.0;
    private double acumulador23 = 0.0;
    private double acumulador24 = 0.0;
    private double acumulador25 = 0.0;
    private double acumulador26 = 0.0;
    private double acumulador27 = 0.0;
    private double acumulador28 = 0.0;
    private double acumulador31 = 0.0;
    private double acumulador32 = 0.0;
    private double acumulador33 = 0.0;
    private double acumulador34 = 0.0;
    private double acumulador35 = 0.0;
    private double acumulador36 = 0.0;
    private double acumulador37 = 0.0;
    private double acumulador38 = 0.0;
    private double acumulador41 = 0.0;
    private double acumulador42 = 0.0;
    private double acumulador43 = 0.0;
    private double acumulador44 = 0.0;
    private double acumulador45 = 0.0;
    private double acumulador46 = 0.0;
    private double acumulador47 = 0.0;
    private double acumulador48 = 0.0;
    private double acumuladortr1 = 0.0;
    private double acumuladortr2 = 0.0;
    private double acumuladortr3 = 0.0;
    private double acumuladortr4 = 0.0;
    private double acumuladorts1 = 0.0;
    private double acumuladorts2 = 0.0;
    private double acumuladorts3 = 0.0;
    private double acumuladorts4 = 0.0;
    private double acumuladortts = 0.0;
    private double acumuladorttr = 0.0;
    private double acumuladortts1 = 0.0;
    private double acumuladorttr1 = 0.0;
    
    Peluquero pelu = new Peluquero();
    
    

    public PeluquerosGUI() {
        initComponents();
        String nom1 = tn1.getText();
        String n1 = pelu.cambiarNombre1(nom1);
         tn1.setText(""+n1);
        String nom2 = tn2.getText();
        String n2 = pelu.cambiarNombre2(nom2);
        tn2.setText(""+n2);
        String nom3 = tn3.getText();
        String n3 = pelu.cambiarNombre3(nom3);
        tn3.setText(""+n3);
        String nom4 = tn4.getText();
        String n4 = pelu.cambiarNombre4(nom4);
        tn4.setText(""+n4);
        ls1.setText("0.0");
        lr1.setText("0.0");
        ls2.setText("0.0");
        lr2.setText("0.0");
        ls3.setText("0.0");
        lr3.setText("0.0");
        ls4.setText("0.0");
        lr4.setText("0.0");
        b1.setText("Registrar " +n1);
        b3.setText("Registrar " +n2);
        b4.setText("Registrar " +n3);
        b5.setText("Registrar " +n4);
       
         
        
    }

    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tn2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        ls2 = new javax.swing.JLabel();
        lr2 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tn1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        ls1 = new javax.swing.JLabel();
        lr1 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tn3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        ls3 = new javax.swing.JLabel();
        lr3 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        ls4 = new javax.swing.JLabel();
        lr4 = new javax.swing.JLabel();
        tn4 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        t13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        t15 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t16 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ltts = new javax.swing.JLabel();
        lttr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PELUQUERIA");

        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(421, 505));

        jPanel7.setBackground(new java.awt.Color(204, 0, 204));
        jPanel7.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Corte Caballero");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Corte Dama");

        tn2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tn2.setForeground(new java.awt.Color(0, 0, 0));
        tn2.setText("NNNN");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tintura Cabello");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Peinado");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total Servicios");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Total Recaudo");

        l13.setForeground(new java.awt.Color(0, 0, 0));
        l13.setText("0");

        l9.setForeground(new java.awt.Color(0, 0, 0));
        l9.setText("0");

        l14.setForeground(new java.awt.Color(0, 0, 0));
        l14.setText("0");

        l10.setForeground(new java.awt.Color(0, 0, 0));
        l10.setText("0");

        l12.setForeground(new java.awt.Color(0, 0, 0));
        l12.setText("0");

        l16.setForeground(new java.awt.Color(0, 0, 0));
        l16.setText("0");

        l11.setForeground(new java.awt.Color(0, 0, 0));
        l11.setText("0");

        l15.setForeground(new java.awt.Color(0, 0, 0));
        l15.setText("0");

        t5.setForeground(new java.awt.Color(0, 0, 0));
        t5.setText("     ");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        t6.setForeground(new java.awt.Color(0, 0, 0));
        t6.setText("     ");

        t7.setForeground(new java.awt.Color(0, 0, 0));
        t7.setText("     ");

        t8.setForeground(new java.awt.Color(0, 0, 0));
        t8.setText("     ");

        ls2.setForeground(new java.awt.Color(0, 0, 0));
        ls2.setText("0");

        lr2.setForeground(new java.awt.Color(0, 0, 0));
        lr2.setText("0");

        b3.setForeground(new java.awt.Color(0, 0, 0));
        b3.setText("Registar Raul");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(51, 102, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(377, 207));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/pelu2.jpg"))); // NOI18N
        jLabel30.setText("jLabel30");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 269, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel17))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ls2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lr2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l11)
                                    .addComponent(l12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l16, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l9)
                            .addComponent(l10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tn2)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(b3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l9))
                    .addComponent(l13))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(l10)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l14))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(l15)
                    .addComponent(l11)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(l16)
                    .addComponent(l12)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ls2)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lr2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3)
                .addGap(37, 37, 37))
        );

        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Corte Caballero");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Corte Dama");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tintura Cabello");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Peinado");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total Servicios");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total Recaudo");

        tn1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tn1.setForeground(new java.awt.Color(0, 0, 0));
        tn1.setText("NNNN");

        b1.setForeground(new java.awt.Color(0, 0, 0));
        b1.setText("Registar Jose");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        t1.setForeground(new java.awt.Color(0, 0, 0));
        t1.setText("     ");

        t2.setForeground(new java.awt.Color(0, 0, 0));
        t2.setText("     ");

        t3.setForeground(new java.awt.Color(0, 0, 0));
        t3.setText("     ");

        l1.setForeground(new java.awt.Color(0, 0, 0));
        l1.setText("0");

        l3.setForeground(new java.awt.Color(0, 0, 0));
        l3.setText("0");

        l2.setForeground(new java.awt.Color(0, 0, 0));
        l2.setText("0");

        l4.setForeground(new java.awt.Color(0, 0, 0));
        l4.setText("0");

        l5.setForeground(new java.awt.Color(0, 0, 0));
        l5.setText("0");

        l6.setForeground(new java.awt.Color(0, 0, 0));
        l6.setText("0");

        ls1.setForeground(new java.awt.Color(0, 0, 0));
        ls1.setText("0");

        lr1.setForeground(new java.awt.Color(0, 0, 0));
        lr1.setText("0");

        t4.setForeground(new java.awt.Color(0, 0, 0));
        t4.setText("     ");

        l7.setForeground(new java.awt.Color(0, 0, 0));
        l7.setText("0");

        l8.setForeground(new java.awt.Color(0, 0, 0));
        l8.setText("0");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(51, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/pelu1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l5)
                            .addComponent(l6)))
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(l7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l8))))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ls1)
                    .addComponent(l3)
                    .addComponent(l4)
                    .addComponent(l2)
                    .addComponent(l1)
                    .addComponent(lr1))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(tn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(tn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5)
                    .addComponent(l1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6)
                    .addComponent(l2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(l7)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l8)
                    .addComponent(l4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ls1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lr1))
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addGap(35, 35, 35))
        );

        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(421, 505));

        tn3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tn3.setForeground(new java.awt.Color(0, 0, 0));
        tn3.setText("NNNN");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Corte Caballero");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Corte Dama");

        t9.setForeground(new java.awt.Color(0, 0, 0));
        t9.setText("     ");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Tintura Cabello");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Peinado");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Total Servicios");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Total Recaudo");

        t10.setForeground(new java.awt.Color(0, 0, 0));
        t10.setText("     ");

        t11.setForeground(new java.awt.Color(0, 0, 0));
        t11.setText("     ");

        t12.setForeground(new java.awt.Color(0, 0, 0));
        t12.setText("     ");

        ls3.setForeground(new java.awt.Color(0, 0, 0));
        ls3.setText("0");

        lr3.setForeground(new java.awt.Color(0, 0, 0));
        lr3.setText("0");

        l17.setForeground(new java.awt.Color(0, 0, 0));
        l17.setText("0");

        l18.setForeground(new java.awt.Color(0, 0, 0));
        l18.setText("0");

        l19.setForeground(new java.awt.Color(0, 0, 0));
        l19.setText("0");

        l20.setForeground(new java.awt.Color(0, 0, 0));
        l20.setText("0");

        l21.setForeground(new java.awt.Color(0, 0, 0));
        l21.setText("0");

        l22.setForeground(new java.awt.Color(0, 0, 0));
        l22.setText("0");

        l23.setForeground(new java.awt.Color(0, 0, 0));
        l23.setText("0");

        l24.setForeground(new java.awt.Color(0, 0, 0));
        l24.setText("0");

        b4.setForeground(new java.awt.Color(0, 0, 0));
        b4.setText("jButton1");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(51, 102, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(377, 207));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/pelu3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lr3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ls3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l17)
                                    .addComponent(l18)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l19)
                                    .addComponent(l20))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l22, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(20, 20, 20))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(tn3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b4)
                .addGap(118, 118, 118))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l17)
                    .addComponent(l21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l18)
                    .addComponent(l22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l19)
                    .addComponent(l23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l24))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ls3)
                    .addComponent(jLabel22))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lr3))
                .addGap(18, 18, 18)
                .addComponent(b4)
                .addGap(43, 43, 43))
        );

        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(421, 505));

        l26.setForeground(new java.awt.Color(0, 0, 0));
        l26.setText("0");

        l27.setForeground(new java.awt.Color(0, 0, 0));
        l27.setText("0");

        l28.setForeground(new java.awt.Color(0, 0, 0));
        l28.setText("0");

        l29.setForeground(new java.awt.Color(0, 0, 0));
        l29.setText("0");

        l30.setForeground(new java.awt.Color(0, 0, 0));
        l30.setText("0");

        l31.setForeground(new java.awt.Color(0, 0, 0));
        l31.setText("0");

        l32.setForeground(new java.awt.Color(0, 0, 0));
        l32.setText("0");

        ls4.setForeground(new java.awt.Color(0, 0, 0));
        ls4.setText("0");

        lr4.setForeground(new java.awt.Color(0, 0, 0));
        lr4.setText("0");

        tn4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tn4.setForeground(new java.awt.Color(0, 0, 0));
        tn4.setText("NNNN");

        b5.setForeground(new java.awt.Color(0, 0, 0));
        b5.setText("jButton2");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        t13.setForeground(new java.awt.Color(0, 0, 0));
        t13.setText("     ");
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Corte Caballero");

        t14.setForeground(new java.awt.Color(0, 0, 0));
        t14.setText("     ");
        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Corte Dama");

        t15.setForeground(new java.awt.Color(0, 0, 0));
        t15.setText("     ");
        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Tintura Cabello");

        t16.setForeground(new java.awt.Color(0, 0, 0));
        t16.setText("     ");
        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Peinado");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Total Servicios");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Total Recaudo");

        l25.setForeground(new java.awt.Color(0, 0, 0));
        l25.setText("0");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(51, 102, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(377, 207));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/pelu4.jpg"))); // NOI18N
        jLabel31.setText("jLabel31");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l26)
                                    .addComponent(l25)))
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ls4)
                                    .addComponent(lr4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(l32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l31, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l29, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l30, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l28))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l27))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(tn4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b5)
                .addGap(115, 115, 115))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l25)
                    .addComponent(l29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l30)
                    .addComponent(l26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l31)
                    .addComponent(l27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l32)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l28)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(ls4))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lr4)
                    .addComponent(jLabel29))
                .addGap(27, 27, 27)
                .addComponent(b5)
                .addGap(39, 39, 39))
        );

        b2.setForeground(new java.awt.Color(0, 0, 0));
        b2.setText("Iniciar Dia");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b6.setForeground(new java.awt.Color(0, 0, 0));
        b6.setText("Ver Total");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total servicios de todos los peluqueros");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Recaudado de todos los peluqueros");

        ltts.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        ltts.setForeground(new java.awt.Color(0, 0, 0));
        ltts.setText("0");

        lttr.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lttr.setForeground(new java.awt.Color(0, 0, 0));
        lttr.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(b2)
                        .addGap(18, 18, 18)
                        .addComponent(b6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ltts)
                                .addGap(290, 290, 290)
                                .addComponent(lttr)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(617, 617, 617))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(517, 517, 517)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(b6)
                    .addComponent(b2)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ltts)
                    .addComponent(lttr))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        double servicio1 = Double.parseDouble(t13.getText());
        double servicio2 = Double.parseDouble(t14.getText());
        double servicio3 = Double.parseDouble(t15.getText());
        double servicio4 = Double.parseDouble(t16.getText());

        acumulador45 +=servicio1;
        acumulador46 +=servicio2;
        acumulador47 +=servicio3;
        acumulador48 +=servicio4;
        acumuladorts4 += servicio1 + servicio2 + servicio3 + servicio4;
        ls4.setText(""+acumuladorts4);
        l25.setText(""+acumulador45);
        l26.setText(""+acumulador46);
        l27.setText(""+acumulador47);
        l28.setText(""+acumulador48);

        double resultado1 = pelu.calcularCorteCaballero(servicio1);
        double resultado2 = pelu.calcularCorteDama(servicio2);
        double resultado3 = pelu.calcularTintura(servicio3);
        double resultado4 = pelu.calcularPeinado(servicio4);

        acumulador41 += resultado1;
        acumulador42 += resultado2;
        acumulador43 += resultado3;
        acumulador44 += resultado4;
        acumuladortr4 += resultado1 + resultado2 + resultado3 + resultado4;
        lr4.setText(""+acumuladortr4);

        l29.setText(""+acumulador41);
        l30.setText(""+acumulador42);
        l31.setText(""+acumulador43);
        l32.setText(""+acumulador44);
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        double servicio1 = Double.parseDouble(t9.getText());
        double servicio2 = Double.parseDouble(t10.getText());
        double servicio3 = Double.parseDouble(t11.getText());
        double servicio4 = Double.parseDouble(t12.getText());

        acumulador35 +=servicio1;
        acumulador36 +=servicio2;
        acumulador37 +=servicio3;
        acumulador38 +=servicio4;
        acumuladorts3 += servicio1 + servicio2 + servicio3 + servicio4;
        ls3.setText(""+acumuladorts3);

        l17.setText(""+acumulador35);
        l18.setText(""+acumulador36);
        l19.setText(""+acumulador37);
        l20.setText(""+acumulador38);

        double resultado1 = pelu.calcularCorteCaballero(servicio1);
        double resultado2 = pelu.calcularCorteDama(servicio2);
        double resultado3 = pelu.calcularTintura(servicio3);
        double resultado4 = pelu.calcularPeinado(servicio4);

        acumulador31 += resultado1;
        acumulador32 += resultado2;
        acumulador33 += resultado3;
        acumulador34 += resultado4;
        acumuladortr3 += resultado1 + resultado2 + resultado3 + resultado4;
        lr3.setText(""+acumuladortr3);

        l21.setText(""+acumulador31);
        l22.setText(""+acumulador32);
        l23.setText(""+acumulador33);
        l24.setText(""+acumulador34);

    }//GEN-LAST:event_b4ActionPerformed

    private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t16ActionPerformed

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t15ActionPerformed

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t14ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        acumuladortts += acumuladorts1 + acumuladorts2 + acumuladorts3 + acumuladorts4;
        ltts.setText(""+acumuladortts);
        acumuladortts1 += acumuladortts;
        acumuladortts=0;

        acumuladorttr += acumuladortr1 + acumuladortr2 + acumuladortr3 + acumuladortr4;
        lttr.setText(""+acumuladorttr);
        acumuladorttr1 += acumuladorttr;
        acumuladorttr=0;

    }//GEN-LAST:event_b6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        acumulador11 = 0.0;
        acumulador12 = 0.0;
        acumulador13 = 0.0;
        acumulador14 = 0.0;
        acumulador15 = 0.0;
        acumulador16 = 0.0;
        acumulador17 = 0.0;
        acumulador18 = 0.0;
        acumulador21 = 0.0;
        acumulador22 = 0.0;
        acumulador23 = 0.0;
        acumulador24 = 0.0;
        acumulador25 = 0.0;
        acumulador26 = 0.0;
        acumulador27 = 0.0;
        acumulador28 = 0.0;
        acumulador31 = 0.0;
        acumulador32 = 0.0;
        acumulador33 = 0.0;
        acumulador34 = 0.0;
        acumulador35 = 0.0;
        acumulador36 = 0.0;
        acumulador37 = 0.0;
        acumulador38 = 0.0;
        acumulador41 = 0.0;
        acumulador42 = 0.0;
        acumulador43 = 0.0;
        acumulador44 = 0.0;
        acumulador45 = 0.0;
        acumulador46 = 0.0;
        acumulador47 = 0.0;
        acumulador48 = 0.0;
        acumuladortr1 = 0.0;
        acumuladortr2 = 0.0;
        acumuladortr3 = 0.0;
        acumuladortr4 = 0.0;
        acumuladorts1 = 0.0;
        acumuladorts2 = 0.0;
        acumuladorts3 = 0.0;
        acumuladorts4 = 0.0;
        acumuladortts = 0.0;
        acumuladorttr = 0.0;

        l1.setText("0.0");
        l2.setText("0.0");
        l3.setText("0.0");
        l4.setText("0.0");
        l5.setText("0.0");
        l6.setText("0.0");
        l7.setText("0.0");
        l8.setText("0.0");
        l9.setText("0.0");
        l10.setText("0.0");
        l11.setText("0.0");
        l12.setText("0.0");
        l13.setText("0.0");
        l14.setText("0.0");
        l15.setText("0.0");
        l16.setText("0.0");
        l17.setText("0.0");
        l18.setText("0.0");
        l19.setText("0.0");
        l20.setText("0.0");
        l21.setText("0.0");
        l22.setText("0.0");
        l23.setText("0.0");
        l24.setText("0.0");
        l25.setText("0.0");
        l26.setText("0.0");
        l27.setText("0.0");
        l28.setText("0.0");
        l29.setText("0.0");
        l30.setText("0.0");
        l31.setText("0.0");
        l32.setText("0.0");
        ls1.setText("0.0");
        lr1.setText("0.0");
        ls2.setText("0.0");
        lr2.setText("0.0");
        ls3.setText("0.0");
        lr3.setText("0.0");
        ls4.setText("0.0");
        lr4.setText("0.0");
        ltts.setText("0.0");
        lttr.setText("0.0");
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        double servicio1 = Double.parseDouble(t1.getText());
        double servicio2 = Double.parseDouble(t2.getText());
        double servicio3 = Double.parseDouble(t3.getText());
        double servicio4 = Double.parseDouble(t4.getText());

        acumulador15 +=servicio1;
        acumulador16 +=servicio2;
        acumulador17 +=servicio3;
        acumulador18 +=servicio4;
        acumuladorts1 += servicio1 + servicio2 + servicio3 + servicio4;
        ls1.setText(""+acumuladorts1);
        l5.setText(""+acumulador15);
        l6.setText(""+acumulador16);
        l7.setText(""+acumulador17);
        l8.setText(""+acumulador18);

        double resultado1 = pelu.calcularCorteCaballero(servicio1);
        double resultado2 = pelu.calcularCorteDama(servicio2);
        double resultado3 = pelu.calcularTintura(servicio3);
        double resultado4 = pelu.calcularPeinado(servicio4);

        acumulador11 += resultado1;
        acumulador12 += resultado2;
        acumulador13 += resultado3;
        acumulador14 += resultado4;
        acumuladortr1 += resultado1 + resultado2 + resultado3 + resultado4;
        lr1.setText(""+acumuladortr1);

        l1.setText(""+acumulador11);
        l2.setText(""+acumulador12);
        l3.setText(""+acumulador13);
        l4.setText(""+acumulador14);
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        double servicio1 = Double.parseDouble(t5.getText());
        double servicio2 = Double.parseDouble(t6.getText());
        double servicio3 = Double.parseDouble(t7.getText());
        double servicio4 = Double.parseDouble(t8.getText());

        acumulador25 +=servicio1;
        acumulador26 +=servicio2;
        acumulador27 +=servicio3;
        acumulador28 +=servicio4;
        acumuladorts2 += servicio1 + servicio2 + servicio3 + servicio4;
        ls2.setText(""+acumuladorts2);
        l9.setText(""+acumulador25);
        l10.setText(""+acumulador26);
        l11.setText(""+acumulador27);
        l12.setText(""+acumulador28);

        double resultado1 = pelu.calcularCorteCaballero(servicio1);
        double resultado2 = pelu.calcularCorteDama(servicio2);
        double resultado3 = pelu.calcularTintura(servicio3);
        double resultado4 = pelu.calcularPeinado(servicio4);

        acumulador21 += resultado1;
        acumulador22 += resultado2;
        acumulador23 += resultado3;
        acumulador24 += resultado4;
        acumuladortr2 += resultado1 + resultado2 + resultado3 + resultado4;
        lr2.setText(""+acumuladortr2);
        l13.setText(""+acumulador21);
        l14.setText(""+acumulador22);
        l15.setText(""+acumulador23);
        l16.setText(""+acumulador24);
    }//GEN-LAST:event_b3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

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
            java.util.logging.Logger.getLogger(PeluquerosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeluquerosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeluquerosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeluquerosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeluquerosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel lr1;
    private javax.swing.JLabel lr2;
    private javax.swing.JLabel lr3;
    private javax.swing.JLabel lr4;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JLabel ls3;
    private javax.swing.JLabel ls4;
    private javax.swing.JLabel lttr;
    private javax.swing.JLabel ltts;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JLabel tn1;
    private javax.swing.JLabel tn2;
    private javax.swing.JLabel tn3;
    private javax.swing.JLabel tn4;
    // End of variables declaration//GEN-END:variables
}
