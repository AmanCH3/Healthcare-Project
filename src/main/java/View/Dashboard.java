/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.UserController1;
import DAO.UserDao;
import Model.LoginModel;
import Model.User;
import Model.UserData;
import javax.swing.JOptionPane;

//import Model.PatientData;




/**
 *
 * @author Dell
 */
public class Dashboard extends javax.swing.JFrame {
    
//    private PatientData PatientData;


    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        mainPanel();
     
        
        
    }
//    public Dashboard(PatientData patient){
//        initComponents();
//        this.patient = patient;
//        firstLabel.setText(patient.getFname());
//        lastLabel.setText(patient.getLname());
//    }
//        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameLabelDash = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ScheduleBtn = new javax.swing.JLabel();
        PrescriptionBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DetailsBtn = new javax.swing.JLabel();
        AnalyticsBtn = new javax.swing.JLabel();
        FeedbackBtn = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JLabel();
        Layer = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workflowLogo.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/R 16.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/38-385643_notification-icon-png 2.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Profile-Avatar-PNG-Picture 7.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        nameLabelDash.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 904, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabelDash, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nameLabelDash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardIcon.png"))); // NOI18N
        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("my profile");

        ScheduleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ScheduleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myScheduleIcon.png"))); // NOI18N
        ScheduleBtn.setText("My Schedule");
        ScheduleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScheduleBtnMouseClicked(evt);
            }
        });

        PrescriptionBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrescriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prescriptionIcon.png"))); // NOI18N
        PrescriptionBtn.setText("Prescription");
        PrescriptionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrescriptionBtnMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("others");

        DetailsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/detailsIcons.png"))); // NOI18N
        DetailsBtn.setText("Patients Details\n");
        DetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailsBtnMouseClicked(evt);
            }
        });

        AnalyticsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AnalyticsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analyticsIcon.png"))); // NOI18N
        AnalyticsBtn.setText("Analytics");
        AnalyticsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalyticsBtnMouseClicked(evt);
            }
        });

        FeedbackBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FeedbackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedbackIcon.png"))); // NOI18N
        FeedbackBtn.setText("Feedbacks");
        FeedbackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackBtnMouseClicked(evt);
            }
        });

        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logOutIcon.png"))); // NOI18N
        LogOutBtn.setText("Log Out");
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrescriptionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnalyticsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FeedbackBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DetailsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(PrescriptionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(AnalyticsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(FeedbackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        Layer.setBackground(new java.awt.Color(102, 102, 0));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Layer.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer.setLayer(firstLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer.setLayer(lastLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layer.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerLayout = new javax.swing.GroupLayout(Layer);
        Layer.setLayout(LayerLayout);
        LayerLayout.setHorizontalGroup(
            LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerLayout.createSequentialGroup()
                .addGroup(LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LayerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LayerLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(firstLabel)
                        .addGap(67, 67, 67)
                        .addComponent(lastLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LayerLayout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        LayerLayout.setVerticalGroup(
            LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstLabel)
                    .addComponent(lastLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Layer)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Layer)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void switchToPanel(javax.swing.JPanel panel) {
        Layer.removeAll();
        Layer.add(panel);
//        panel.setBounds(0, 0, Layer.getWidth(), Layer.getHeight());
        panel.setBounds(0, 0, 1158, 631);
        panel.setVisible(true);
        Layer.repaint();
        Layer.revalidate();
                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
   
    private void ScheduleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleBtnMouseClicked
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 255)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));

        MySchedulePanel mySchedulePanel = new MySchedulePanel();
        switchToPanel(mySchedulePanel);
        
    }//GEN-LAST:event_ScheduleBtnMouseClicked

    private void PrescriptionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrescriptionBtnMouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 255));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));

        PrescriptionPanel prescriptionPanel = new PrescriptionPanel();
        switchToPanel(prescriptionPanel);
    }//GEN-LAST:event_PrescriptionBtnMouseClicked

    private void DetailsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsBtnMouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 255));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));

        PatientsDetailsPanel detailsPanel = new PatientsDetailsPanel();
        switchToPanel(detailsPanel);
       
    }//GEN-LAST:event_DetailsBtnMouseClicked

    private void AnalyticsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyticsBtnMouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 255));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsPanel analyticsPanel = new AnalyticsPanel();
        switchToPanel(analyticsPanel);
    }//GEN-LAST:event_AnalyticsBtnMouseClicked

    private void FeedbackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackBtnMouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 255));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));

        FeedbacksPanel feedbacksPanel = new FeedbacksPanel();
        switchToPanel(feedbacksPanel);
        
    }//GEN-LAST:event_FeedbackBtnMouseClicked

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 255));
        LogOutPanel logOutPanel = new LogOutPanel();
        switchToPanel(logOutPanel);
        
        int choice = JOptionPane.showConfirmDialog(rootPane, "Do you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            LoginPage login = new LoginPage();
            login.setVisible(true);
            this.dispose();
        }
           else if(choice == JOptionPane.NO_OPTION){
                   mainPanel();
                   }
        
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        mainPanel();
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        SettingPanel settingPanel = new SettingPanel();
        switchToPanel(settingPanel);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        ScheduleBtn.setForeground(new java.awt.Color(0, 0, 0)); 
        PrescriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        DetailsBtn.setForeground(new java.awt.Color(0, 0, 0));
        AnalyticsBtn.setForeground(new java.awt.Color(0, 0, 0));
        FeedbackBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        UserProfilePanel userProfilePanel = new UserProfilePanel();
        
        String userEmail =UserData.getUserEmail(); // Retrieve the entered email
        UserController1 userController1= new UserController1(new UserDao(), new UserProfilePanel());
        userController1.displayUserInfo(userEmail);
//        switchToPanel(userProfilePanel); 
    }//GEN-LAST:event_jLabel11MouseClicked
    public void setUserName() {
        UserDao userDao = new UserDao();
        User user = userDao.getUserByEmail(UserData.getUserEmail());
        nameLabelDash.setText(user.getName());
    }
    public void mainPanel(){
  
     InitialPanel initialPanel = new InitialPanel();
      switchToPanel(initialPanel);
        switchToPanel(initialPanel);
  }
    public void closeDashboard(){
        this.dispose();
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Dashboard().setVisible(true);
         
            
            }
        });
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnalyticsBtn;
    private javax.swing.JLabel DetailsBtn;
    private javax.swing.JLabel FeedbackBtn;
    private javax.swing.JLayeredPane Layer;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JLabel PrescriptionBtn;
    private javax.swing.JLabel ScheduleBtn;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JLabel nameLabelDash;
    // End of variables declaration//GEN-END:variables
}
