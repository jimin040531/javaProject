/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package deu.hms.reservation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jimin
 */
public class reservationFrame extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private JTable dataTable;

    /**
     * Creates new form reservationFrame
     */
    public reservationFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        {

        }
    }//

    // 기본 생성자 추가
    public reservationFrame() {
        setTitle("Reservation Frame");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();  // 

// setTitle("Reservation Frame");
        //   setSize(500, 500);
        //  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //  setLocationRelativeTo(null);
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

        goEitFom = new javax.swing.JButton();
        goDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        goreservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        goEitFom.setText("수정");
        goEitFom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goEitFomActionPerformed(evt);
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
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "고유번호", "이름", "주소", "전화번호", "예상 체크인 날짜", "예상 체크아웃 날짜", "방번호", "인원수", "숙박비", "결제수단", "상태"
            }
        ));
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(9).setResizable(false);
            mainTable.getColumnModel().getColumn(10).setResizable(false);
        }

        goreservation.setText("등록");
        goreservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goreservationActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goreservation, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goDelete)
                    .addComponent(goEitFom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goreservation)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void goEitFomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goEitFomActionPerformed
        this.dispose();

        Registration registrationFrame = new Registration();
        registrationFrame.setSize(500, 450);  // 다이얼로그 크기 설정
        registrationFrame.setLocationRelativeTo(null);  // 부모 컴포넌트를 기준으로 중앙에 배치  
        registrationFrame.setTitle("정보등록");  // 다이얼로그 제목 설정 

        registrationFrame.toFront();
        registrationFrame.setVisible(true); // 프레임을 화면에 보이게 설정
    }//GEN-LAST:event_goEitFomActionPerformed

    private void goreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goreservationActionPerformed

        this.dispose();

        Registration registrationFrame = new Registration(); // Registration 프레임 생성

        registrationFrame.setSize(500, 450);  // 다이얼로그 크기 설정
        registrationFrame.setLocationRelativeTo(null);  // 부모 컴포넌트를 기준으로 중앙에 배치  
        registrationFrame.setTitle("정보등록");  // 다이얼로그 제목 설정 

        registrationFrame.toFront();
        registrationFrame.setVisible(true); // 프레임을 화면에 보이게 설정

// TODO add your handling code here:
    }//GEN-LAST:event_goreservationActionPerformed

    private void goDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goDeleteActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(reservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JButton goreservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    // End of variables declaration//GEN-END:variables
}
