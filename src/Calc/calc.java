package Calc;
import Desktop.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinivas
 */
public class calc extends javax.swing.JFrame {


    double n1;
    double n2;
    double result;
    String opr;
        
    /**
     * Creates new form NewJFrame
     */
    public calc() {
        setLocation(200, 200);
        initComponents();

    }
    int one = 0;
    int two = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shut = new javax.swing.JLabel();
        calc_date = new javax.swing.JLabel();
        amzon_label = new javax.swing.JLabel();
        amzon = new javax.swing.JLabel();
        calc = new javax.swing.JLabel();
        calc_label = new javax.swing.JLabel();
        top_bar = new javax.swing.JLabel();
        tictac_label = new javax.swing.JLabel();
        tictac = new javax.swing.JLabel();
        wallp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        bta = new javax.swing.JButton();
        btmi = new javax.swing.JButton();
        btm = new javax.swing.JButton();
        btd = new javax.swing.JButton();
        btc = new javax.swing.JButton();
        btp = new javax.swing.JButton();
        bte = new javax.swing.JButton();
        res = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        pay_label = new javax.swing.JLabel();
        wetrans = new javax.swing.JLabel();
        wetrans_label = new javax.swing.JLabel();
        calc_bg = new javax.swing.JLabel();
        dell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 572));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(null);

        shut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shut.png"))); // NOI18N
        shut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shutMouseClicked(evt);
            }
        });
        getContentPane().add(shut);
        shut.setBounds(860, 460, 70, 80);

        calc_date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        calc_date.setForeground(new java.awt.Color(153, 255, 255));
        getContentPane().add(calc_date);
        calc_date.setBounds(350, 20, 270, 20);

        amzon_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        amzon_label.setForeground(new java.awt.Color(153, 255, 255));
        amzon_label.setText("Amazon");
        getContentPane().add(amzon_label);
        amzon_label.setBounds(50, 230, 70, 40);

        amzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture2.png"))); // NOI18N
        amzon.setLabelFor(amzon_label);
        amzon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amzonMouseClicked(evt);
            }
        });
        getContentPane().add(amzon);
        amzon.setBounds(50, 150, 130, 110);

        calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculator.png"))); // NOI18N
        calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcMouseClicked(evt);
            }
        });
        getContentPane().add(calc);
        calc.setBounds(40, 260, 130, 110);

        calc_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        calc_label.setForeground(new java.awt.Color(153, 255, 255));
        calc_label.setText("Calculator");
        getContentPane().add(calc_label);
        calc_label.setBounds(50, 350, 90, 40);

        top_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desk_topbar.png"))); // NOI18N
        getContentPane().add(top_bar);
        top_bar.setBounds(20, 20, 920, 20);

        tictac_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tictac_label.setForeground(new java.awt.Color(153, 255, 255));
        tictac_label.setText("Tic Tac Toe");
        getContentPane().add(tictac_label);
        tictac_label.setBounds(50, 140, 90, 30);

        tictac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tictactoe.png"))); // NOI18N
        tictac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tictacMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tictacMousePressed(evt);
            }
        });
        getContentPane().add(tictac);
        tictac.setBounds(30, 40, 110, 150);

        wallp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-icon.png"))); // NOI18N
        wallp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallpMouseClicked(evt);
            }
        });
        getContentPane().add(wallp);
        wallp.setBounds(50, 380, 70, 60);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<HTML> <HEAD> </HEAD> <BODY>Change <BR> Wallpaper </BODY> </HTML>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 440, 80, 40);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Calculator : Basic");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseMoved(evt);
            }
        });
        jInternalFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseEntered(evt);
            }
        });

        jPanel1.setLayout(null);

        bt1.setBackground(new java.awt.Color(51, 51, 51));
        bt1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(153, 255, 255));
        bt1.setText("1");
        bt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt1.setContentAreaFilled(false);
        bt1.setDoubleBuffered(true);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);
        bt1.setBounds(20, 130, 70, 60);

        bt2.setBackground(new java.awt.Color(51, 51, 51));
        bt2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(153, 255, 255));
        bt2.setText("2");
        bt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt2.setContentAreaFilled(false);
        bt2.setDoubleBuffered(true);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);
        bt2.setBounds(110, 130, 70, 60);

        bt3.setBackground(new java.awt.Color(51, 51, 51));
        bt3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(153, 255, 255));
        bt3.setText("3");
        bt3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt3.setContentAreaFilled(false);
        bt3.setDoubleBuffered(true);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);
        bt3.setBounds(200, 130, 70, 60);

        bt4.setBackground(new java.awt.Color(51, 51, 51));
        bt4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(153, 255, 255));
        bt4.setText("4");
        bt4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt4.setContentAreaFilled(false);
        bt4.setDoubleBuffered(true);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);
        bt4.setBounds(20, 210, 70, 60);

        bt5.setBackground(new java.awt.Color(51, 51, 51));
        bt5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(153, 255, 255));
        bt5.setText("5");
        bt5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt5.setContentAreaFilled(false);
        bt5.setDoubleBuffered(true);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);
        bt5.setBounds(110, 210, 70, 60);

        bt6.setBackground(new java.awt.Color(51, 51, 51));
        bt6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(153, 255, 255));
        bt6.setText("6");
        bt6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt6.setContentAreaFilled(false);
        bt6.setDoubleBuffered(true);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);
        bt6.setBounds(200, 210, 70, 60);

        bt7.setBackground(new java.awt.Color(51, 51, 51));
        bt7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(153, 255, 255));
        bt7.setText("7");
        bt7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt7.setContentAreaFilled(false);
        bt7.setDoubleBuffered(true);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);
        bt7.setBounds(20, 290, 70, 60);

        bt8.setBackground(new java.awt.Color(51, 51, 51));
        bt8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(153, 255, 255));
        bt8.setText("8");
        bt8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt8.setContentAreaFilled(false);
        bt8.setDoubleBuffered(true);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);
        bt8.setBounds(110, 290, 70, 60);

        bt9.setBackground(new java.awt.Color(51, 51, 51));
        bt9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        bt9.setForeground(new java.awt.Color(153, 255, 255));
        bt9.setText("9");
        bt9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt9.setContentAreaFilled(false);
        bt9.setDoubleBuffered(true);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);
        bt9.setBounds(200, 290, 70, 60);

        bt0.setBackground(new java.awt.Color(51, 51, 51));
        bt0.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt0.setForeground(new java.awt.Color(153, 255, 255));
        bt0.setText("0");
        bt0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bt0.setContentAreaFilled(false);
        bt0.setDoubleBuffered(true);
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);
        bt0.setBounds(20, 370, 250, 60);

        bta.setBackground(new java.awt.Color(51, 51, 51));
        bta.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        bta.setForeground(new java.awt.Color(153, 255, 255));
        bta.setText("+");
        bta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bta.setContentAreaFilled(false);
        bta.setDoubleBuffered(true);
        bta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaActionPerformed(evt);
            }
        });
        jPanel1.add(bta);
        bta.setBounds(300, 130, 70, 60);

        btmi.setBackground(new java.awt.Color(51, 51, 51));
        btmi.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btmi.setForeground(new java.awt.Color(153, 255, 255));
        btmi.setText("-");
        btmi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        btmi.setContentAreaFilled(false);
        btmi.setDoubleBuffered(true);
        btmi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btmi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmiActionPerformed(evt);
            }
        });
        jPanel1.add(btmi);
        btmi.setBounds(390, 130, 70, 60);

        btm.setBackground(new java.awt.Color(51, 51, 51));
        btm.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btm.setForeground(new java.awt.Color(153, 255, 255));
        btm.setText("x");
        btm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        btm.setContentAreaFilled(false);
        btm.setDoubleBuffered(true);
        btm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActionPerformed(evt);
            }
        });
        jPanel1.add(btm);
        btm.setBounds(300, 210, 70, 60);

        btd.setBackground(new java.awt.Color(51, 51, 51));
        btd.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btd.setForeground(new java.awt.Color(153, 255, 255));
        btd.setText("/");
        btd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        btd.setContentAreaFilled(false);
        btd.setDoubleBuffered(true);
        btd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdActionPerformed(evt);
            }
        });
        jPanel1.add(btd);
        btd.setBounds(390, 210, 70, 60);

        btc.setBackground(new java.awt.Color(51, 51, 51));
        btc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btc.setForeground(new java.awt.Color(153, 255, 255));
        btc.setText("Clear");
        btc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        btc.setContentAreaFilled(false);
        btc.setDoubleBuffered(true);
        btc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcActionPerformed(evt);
            }
        });
        jPanel1.add(btc);
        btc.setBounds(300, 370, 160, 60);

        btp.setBackground(new java.awt.Color(51, 51, 51));
        btp.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btp.setForeground(new java.awt.Color(153, 255, 255));
        btp.setText(".");
        btp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        btp.setContentAreaFilled(false);
        btp.setDoubleBuffered(true);
        btp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpActionPerformed(evt);
            }
        });
        jPanel1.add(btp);
        btp.setBounds(300, 290, 70, 60);

        bte.setBackground(new java.awt.Color(51, 51, 51));
        bte.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        bte.setForeground(new java.awt.Color(153, 255, 255));
        bte.setText("=");
        bte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        bte.setContentAreaFilled(false);
        bte.setDoubleBuffered(true);
        bte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteActionPerformed(evt);
            }
        });
        jPanel1.add(bte);
        bte.setBounds(390, 290, 70, 60);

        res.setFont(new java.awt.Font("Ubuntu", 1, 72)); // NOI18N
        res.setForeground(new java.awt.Color(153, 255, 255));
        res.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        res.setToolTipText("");
        res.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        res.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        res.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        res.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(res);
        res.setBounds(20, 10, 440, 110);

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bg.setForeground(new java.awt.Color(153, 255, 255));
        bg.setOpaque(true);
        jPanel1.add(bg);
        bg.setBounds(-30, 0, 540, 460);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(210, 40, 500, 480);

        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ama_pay.png"))); // NOI18N
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payMouseClicked(evt);
            }
        });
        getContentPane().add(pay);
        pay.setBounds(190, 50, 100, 90);

        pay_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pay_label.setForeground(new java.awt.Color(153, 255, 255));
        pay_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pay_label.setText("Amazon Pay");
        getContentPane().add(pay_label);
        pay_label.setBounds(170, 120, 110, 40);

        wetrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WeTransfer_logo.png"))); // NOI18N
        wetrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetransMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans);
        wetrans.setBounds(160, 140, 110, 90);

        wetrans_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        wetrans_label.setForeground(new java.awt.Color(153, 255, 255));
        wetrans_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wetrans_label.setText("WeTransfer");
        wetrans_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetrans_labelMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans_label);
        wetrans_label.setBounds(170, 210, 110, 40);

        calc_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seola_wall.png"))); // NOI18N
        calc_bg.setText("jLabel2");
        getContentPane().add(calc_bg);
        calc_bg.setBounds(20, 20, 920, 520);

        dell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dellmonitor.png"))); // NOI18N
        getContentPane().add(dell);
        dell.setBounds(0, 0, 960, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void dt() {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
       LocalDateTime now = LocalDateTime.now();  
       calc_date.setText(dtf.format(now));  
      }
    private void shutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutMouseClicked
new shut().setVisible(true);
dispose();
    }//GEN-LAST:event_shutMouseClicked

    private void tictacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tictacMouseClicked
new tic().setVisible(true);
dispose();
    }//GEN-LAST:event_tictacMouseClicked

    private void amzonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amzonMouseClicked
new Amazon.Amazn().setVisible(true);        
    }//GEN-LAST:event_amzonMouseClicked

    private void tictacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tictacMousePressed
      
    }//GEN-LAST:event_tictacMousePressed

    private void calcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcMouseClicked
new Calc.calc().setVisible(true);
    }//GEN-LAST:event_calcMouseClicked

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
String n3 = res.getText() + bt4.getText();
        res.setText(n3);        // res.setText("4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
String n3 = res.getText() + bt0.getText();
        res.setText(n3);        // res.setText("0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
String n3 = res.getText() + bt2.getText();
        res.setText(n3);        // res.setText("2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void btaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaActionPerformed
 n1 = Double.parseDouble(res.getText());
        res.setText("");
        opr = "+";       // res.setText("+");
    }//GEN-LAST:event_btaActionPerformed

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
res.setText("");       // Clear res
    }//GEN-LAST:event_btcActionPerformed

    private void bteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteActionPerformed
String answer;
        n2 = Double.parseDouble(res.getText());
        if (opr != null) {
            switch (opr) {
                case "+":
                    result = n1 + n2;
                    res.setText("" + result);
                    break;
                case "-":
                    result = n1 - n2;
                    res.setText("" + result);
                    break;
                case "*":
                    result = n1 * n2;
                    res.setText("" + result);
                    break;
                case "/":
                    result = n1 / n2;
                    res.setText("" + result);
                    break;
                default:
                    break;
            }
        }        
    }//GEN-LAST:event_bteActionPerformed

    private void btpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpActionPerformed
String n3 = res.getText() + btp.getText();
        res.setText(n3);       
        // res.setText(".");   Decimal
    }//GEN-LAST:event_btpActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
String n3 = res.getText() + bt1.getText();
        res.setText(n3);        
// res.setText("1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
String n3 = res.getText() + bt3.getText();
        res.setText(n3);       
        // res.setText("3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
String n3 = res.getText() + bt5.getText();
        res.setText(n3);       
        // res.setText("5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
String n3 = res.getText() + bt6.getText();
        res.setText(n3);       
// res.setText("6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
String n3 = res.getText() + bt7.getText();
        res.setText(n3);        
// res.setText("7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
String n3 = res.getText() + bt8.getText();
        res.setText(n3);        
// res.setText("8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
String n3 = res.getText() + bt9.getText();
        res.setText(n3);        
// res.setText("9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void btmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmiActionPerformed
n1 = Double.parseDouble(res.getText());
        res.setText("");
        opr = "-";        
// res.setText("-");    Subtract
    }//GEN-LAST:event_btmiActionPerformed

    private void btmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActionPerformed
n1 = Double.parseDouble(res.getText());
        res.setText("");
        opr = "*";         
// res.setText("x");   Multiply
    }//GEN-LAST:event_btmActionPerformed

    private void btdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdActionPerformed
n1 = Double.parseDouble(res.getText());
        res.setText("");
        opr = "/";        
// res.setText("/);   Divide
    }//GEN-LAST:event_btdActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jInternalFrame1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame1MouseEntered
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1MouseEntered

    private void jInternalFrame1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame1MouseMoved
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1MouseMoved

    private void wallpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallpMouseClicked
        new wallp().setVisible(true);
        dispose();
    }//GEN-LAST:event_wallpMouseClicked

    private void payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseClicked
        new Amazon_Pay.Pay_sign().setVisible(true);
        dispose();
    }//GEN-LAST:event_payMouseClicked

    private void wetransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetransMouseClicked
new WeTransfer.WeTransfer().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_wetransMouseClicked

    private void wetrans_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetrans_labelMouseClicked
new WeTransfer.WeTransfer().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_wetrans_labelMouseClicked

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
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amzon;
    private javax.swing.JLabel amzon_label;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton bta;
    private javax.swing.JButton btc;
    private javax.swing.JButton btd;
    private javax.swing.JButton bte;
    private javax.swing.JButton btm;
    private javax.swing.JButton btmi;
    private javax.swing.JButton btp;
    private javax.swing.JLabel calc;
    public static transient javax.swing.JLabel calc_bg;
    private static javax.swing.JLabel calc_date;
    private javax.swing.JLabel calc_label;
    private javax.swing.JLabel dell;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel pay_label;
    private javax.swing.JLabel res;
    private javax.swing.JLabel shut;
    private javax.swing.JLabel tictac;
    private javax.swing.JLabel tictac_label;
    private javax.swing.JLabel top_bar;
    private javax.swing.JLabel wallp;
    private javax.swing.JLabel wetrans;
    private javax.swing.JLabel wetrans_label;
    // End of variables declaration//GEN-END:variables
}