/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package deu.hms.reservation;

import deu.hms.report.reportFrame;
import deu.hms.roomservice.roomserviceFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;



/**
 * d
 *
 * @author adsd3
 */

/**
 * d
 *
 * @author adsd3
 */
public class reservationFrame extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private JTable dataTable;
    private javax.swing.JTable reservationTable;
    private static reservationFrame instance;
    private Registration registrationFrame;
private JLabel cardStatusLabel;  // 카드 등록 상태
    private JLabel reservationStatusLabel;  // 예약 상태
    private JLabel autoPaymentTimeLabel;  // 자동 결제 시간
private List<ReservationData> reservations = new ArrayList<>();

    
    public static reservationFrame getInstance() {
        if (instance == null) {
            instance = new reservationFrame();
        }
        return instance;
    }

    public JTable getMainTable() {
        return mainTable;
    }

    /**
     * Creates new form reservationFrame
     */
    public DefaultTableModel getReservationTableModel() {
        return tableModel;
    }

    private void openRegistrationFormButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Registration registrationForm = new Registration(this);  // 현재의 reservationFrame 객체를 전달
        registrationForm.setVisible(true);
    }

    public reservationFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        {

        }
    }//

    // 기본 생성자 추가
    public reservationFrame() {
        mainTable = new JTable();

        setTitle("Reservation Frame");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
            registrationFrame = new Registration(this);  // Registration 인스턴스를 초기화
            initializeStatusLabels();        
    }
    private void initializeStatusLabels() {
        cardStatusLabel = new JLabel("카드 미등록");

        reservationStatusLabel = new JLabel("예약 미완료");

        // 패널에 추가하는 코드
        this.add(cardStatusLabel);
        this.add(reservationStatusLabel);
    }
    private void updateTable() {
    DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
    model.setRowCount(0); // 기존의 행 삭제

    // 각 ReservationData 객체를 테이블에 추가
    for (ReservationData data : reservations) {
        model.addRow(new Object[]{
            data.getUniqueNumber(), data.getName(), data.getAddress(),
            data.getPhoneNumber(), data.getCheckInDate(), data.getCheckOutDate(),
            data.getRoomNumber(), data.getGuestCount(), data.getPaymentMethod(),
            data.getRoomSelection(), data.getStayCost(), data.getCardStatus()
        });
    }
}

    
    // 클래스의 나머지 내용들...
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goReservation = new javax.swing.JButton();
        goDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        goEitFom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        goReservation.setText("등록");
        goReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goReservationActionPerformed(evt);
            }
        });

        goDelete.setText("삭제");
        goDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goDeleteActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "고유번호", "이름", "주소", "전화번호", "예상 체크인 날짜", "예상 체크아웃 날짜", "방번호", "인원수", "결제수단", "평일/주말", "금액", "상태"
            }
        ));
        jScrollPane1.setViewportView(mainTable);

        goEitFom.setText("수정");
        goEitFom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goEitFomActionPerformed(evt);
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
                        .addComponent(goEitFom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goDelete)
                    .addComponent(goEitFom))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goReservation)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void goReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goReservationActionPerformed
        this.dispose();

        Registration registrationFrame = new Registration();
        registrationFrame.setSize(500, 450);  // 다이얼로그 크기 설정
        registrationFrame.setLocationRelativeTo(null);  // 부모 컴포넌트를 기준으로 중앙에 배치  
        registrationFrame.setTitle("정보등록");  // 다이얼로그 제목 설정 

        registrationFrame.toFront();
        registrationFrame.setVisible(true); // 프레임을 화면에 보이게 설정
    }//GEN-LAST:event_goReservationActionPerformed

    private void goEitFomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goEitFomActionPerformed
int selectedRow = mainTable.getSelectedRow();

    // 선택된 행이 있는지 확인
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "수정할 행을 선택하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // 선택된 행에 대한 ReservationData 객체 가져오기
ReservationData data = reservations.get(selectedRow);

// Registration 폼을 열고 데이터 설정
Registration registrationForm = new Registration();
registrationForm.setRegistrationData(data);
registrationForm.setSize(500, 450);
registrationForm.setVisible(true);


    // 수정 후, ReservationData 리스트 및 UI 테이블 업데이트
reservations.set(selectedRow, registrationForm.getReservationData());
updateTable();


    
        // 선택된 행이 있는지 확인
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "수정할 행을 선택하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        return;
    }
    else{
    for (int i = 0; i < mainTable.getColumnCount(); i++) {
                mainTable.setValueAt("", selectedRow, i);
            }
    }
}

// NullPointerException 방지용 유틸리티 메서드 추가
private String getStringValue(Object value) {
    return value == null ? "" : value.toString();
// 수정 후, ReservationData 리스트 및 UI 테이블 업데이트


    
    }//GEN-LAST:event_goEitFomActionPerformed

    private void goDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goDeleteActionPerformed
        // TODO add your handling code here:
        /*   int selectedRow = mainTable.getSelectedRow();
    if (selectedRow != -1) {
        // 선택된 행이 있는 경우 삭제
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.removeRow(selectedRow);
    } else {
        // 행이 선택되지 않았을 경우 경고 메시지
        JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요.");
    }*/    //테이블칸도 삭제   

        int selectedRow = mainTable.getSelectedRow();

        // 선택된 행이 있는지 확인
        if (selectedRow != -1) {
            // 선택된 행의 텍스트를 빈 값으로 설정하여 내용만 삭제
            for (int i = 0; i < mainTable.getColumnCount(); i++) {
                mainTable.setValueAt("", selectedRow, i);
            }
        } else {
            // 선택된 행이 없는 경우 경고 메시지 표시
            JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_goDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(roomserviceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomserviceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomserviceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomserviceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
          LocalDateTime now = LocalDateTime.now();
    String testCheckInDate = now.toLocalDate().toString(); // 오늘 날짜를 체크인 날짜로 설정
    int testRowIndex = 0; // 테스트할 테이블 행 인덱스


    // 테이블 모델 생성 및 데이터 삽입
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                reservationFrame dialog = new reservationFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goDelete;
    private javax.swing.JButton goEitFom;
    private javax.swing.JButton goReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    // End of variables declaration//GEN-END:variables
}
