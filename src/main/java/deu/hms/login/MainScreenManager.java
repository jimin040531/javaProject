/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.hms.login;
import javax.swing.JFrame;

/**
 *
 * @author yunhe
 */
public class MainScreenManager extends javax.swing.JFrame {
    
    private UserAuthentication auth;
    private Object deu;
    
        public MainScreenManager() {
        setTitle("Manager Main Screen");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    /**
     * Creates new form MainScreenManager
     */
    public MainScreenManager(UserAuthentication auth) {
        this.auth = auth;  // 로그인 인증 객체를 생성자로 전달받음
        initComponents();
        
    }
    
     @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goRestaurantManager = new javax.swing.JButton();
        goReservationManager = new javax.swing.JButton();
        goCheckoutManager = new javax.swing.JButton();
        goRoomserviceManager = new javax.swing.JButton();
        goManagement = new javax.swing.JButton();
        goReport = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        goCheckinManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goRestaurantManager.setText("레스토랑");
        goRestaurantManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRestaurantManagerActionPerformed(evt);
            }
        });

        goReservationManager.setText("예약 관리");
        goReservationManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goReservationManagerActionPerformed(evt);
            }
        });

        goCheckoutManager.setText("체크아웃");
        goCheckoutManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCheckoutManagerActionPerformed(evt);
            }
        });

        goRoomserviceManager.setText("룸서비스");
        goRoomserviceManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRoomserviceManagerActionPerformed(evt);
            }
        });

        goManagement.setText("호텔 관리");
        goManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goManagementActionPerformed(evt);
            }
        });

        goReport.setText("보고서");
        goReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goReportActionPerformed(evt);
            }
        });

        logoutButton.setText("out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        goCheckinManager.setText("체크인");
        goCheckinManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCheckinManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(goReservationManager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(goRoomserviceManager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(goRestaurantManager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goCheckinManager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goCheckoutManager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(goReport, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(goManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goReservationManager, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goCheckoutManager, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goCheckinManager, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goRoomserviceManager, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goRestaurantManager, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goReport, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goRestaurantManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRestaurantManagerActionPerformed
        deu.hms.restaurant.restaurantFrame restaurantFrame = new deu.hms.restaurant.restaurantFrame(new java.awt.Frame(), true);
        restaurantFrame.setLocationRelativeTo(null);  // 화면 가운데 배치
        restaurantFrame.setVisible(true);
    }//GEN-LAST:event_goRestaurantManagerActionPerformed

    private void goReservationManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goReservationManagerActionPerformed
        deu.hms.reservation.reservationFrame reservationFrame = new deu.hms.reservation.reservationFrame(new java.awt.Frame(), true);
        reservationFrame.setLocationRelativeTo(null);  // 화면 가운데 배치
        reservationFrame.setVisible(true);
    }//GEN-LAST:event_goReservationManagerActionPerformed
                                            
    private void goCheckoutManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCheckoutManagerActionPerformed
    //checkout  checkoutFrame = new checkout(this);
    deu.hms.checkout.checkout checkoutFrame = new deu.hms.checkout.checkout();
    checkoutFrame.setLocationRelativeTo(null);  // 화면 가운데 배치
    checkoutFrame.setVisible(true);
        
    }//GEN-LAST:event_goCheckoutManagerActionPerformed

    private void goRoomserviceManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRoomserviceManagerActionPerformed
        deu.hms.roomservice.roomserviceFrame roomserviceFrame = new deu.hms.roomservice.roomserviceFrame(new java.awt.Frame(), true);
        roomserviceFrame.setLocationRelativeTo(null);  // 화면 가운데 배치
        roomserviceFrame.setVisible(true);
    }//GEN-LAST:event_goRoomserviceManagerActionPerformed

    private void goManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goManagementActionPerformed
        // management 패키지 내 managementFrame을 생성하여 화면에 띄움
        deu.hms.management.managementFrame managementScreen = new deu.hms.management.managementFrame(this, true);
        managementScreen.setLocationRelativeTo(null); // 중앙에 띄우기
        managementScreen.setVisible(true); // 화면에 표시
        this.dispose(); // 현재 화면을 닫음 (이동 후 현재 화면을 숨기고 싶다면)
    }//GEN-LAST:event_goManagementActionPerformed

    private void goReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goReportActionPerformed
        // report 패키지 내 reportFrame을 생성하여 화면에 띄움
         deu.hms.report.reportFrame reportScreen = new deu.hms.report.reportFrame(this, true);
        reportScreen.setLocationRelativeTo(null); // 중앙에 띄우기
        reportScreen.setVisible(true); // 화면에 표시
        //this.dispose(); // 현재 화면을 닫음 (이동 후 현재 화면을 숨기고 싶다면)
    }//GEN-LAST:event_goReportActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // 로그아웃 처리
        auth.logout();  // UserAuthentication 객체에서 로그아웃 처리
        
        // MainScreenManager 창 닫기
        this.dispose();  // 현재 창 (MainScreenManager) 닫기
        
        // 로그인 창으로 돌아가기
        loginFrame loginScreen = new loginFrame(auth); // 로그인 화면 생성
        loginScreen.setLocationRelativeTo(null);  // 화면 중앙에 배치
        loginScreen.setVisible(true);  // 로그인 화면 표시
        
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void goCheckinManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCheckinManagerActionPerformed
        // CheckInUI 인스턴스를 기본 생성자를 사용해 생성합니다.
        deu.hms.checkin.CheckInUI checkinFrame = new deu.hms.checkin.CheckInUI();

        checkinFrame.setLocationRelativeTo(null);  // 화면 가운데 배치
        checkinFrame.setVisible(true);
    }//GEN-LAST:event_goCheckinManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goCheckinManager;
    private javax.swing.JButton goCheckoutManager;
    private javax.swing.JButton goManagement;
    private javax.swing.JButton goReport;
    private javax.swing.JButton goReservationManager;
    private javax.swing.JButton goRestaurantManager;
    private javax.swing.JButton goRoomserviceManager;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
