/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
package Window;

public class UserOptions extends javax.swing.JFrame {

    User activeUser;
    public UserOptions(User activeUser) {
        this.activeUser = activeUser;
        initComponents();
    }  
                          
    private void initComponents() {

        makeReservationButton = new javax.swing.JButton();
        cancelReservationButton = new javax.swing.JButton();
        resetSeatsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        makeReservationButton.setText("Make Reservation");
        makeReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationButtonActionPerformed(evt);
            }
        });

        cancelReservationButton.setText("Cancel Reservation");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        resetSeatsButton.setText("Reset All Seats");
        resetSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSeatsButtonActionPerformed(evt);
            }
        });


        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Go back ");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makeReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetSeatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(makeReservationButton)
                .addGap(18, 18, 18)
                .addComponent(cancelReservationButton)
                .addGap(18, 18, 18)
                .addComponent(resetSeatsButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(18, 18, 18)
                .addComponent(goBackButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void makeReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        MakeReservation makeReservation = new MakeReservation(activeUser);
        setVisible(false);
        dispose();
        makeReservation.setVisible(true);
    }                                        

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TicketCancellation ticketCancellation = new TicketCancellation(activeUser);
        setVisible(false);
        dispose();
        ticketCancellation.setVisible(true);
    }                                        

    private void resetSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        User.resetTheatreReservations();        
    }  
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        LoginApplication.updateUserFile();
        User.updateSeats();
        System.exit(0);
    }                                        
    
    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         

        LoginApplication loginApplication = new LoginApplication();
        setVisible(false);
        dispose();
        loginApplication.setVisible(true);
    } 
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton makeReservationButton; // Make Reservation
    private javax.swing.JButton cancelReservationButton; // Cancel Reservation
    private javax.swing.JButton resetSeatsButton; // Reset All Seats 
    private javax.swing.JButton exitButton; // Exit 
    private javax.swing.JButton goBackButton; // Go back 
    // End of variables declaration                   
}
