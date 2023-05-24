package Window;
import java.util.StringTokenizer;

public class MakeReservation extends javax.swing.JFrame {
    
    User activeUser;
    public MakeReservation(User activeUser) {
        this.activeUser = activeUser;
        initComponents();
    }
                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ClassNumbertf = new javax.swing.JTextField();
        numberOfSeatstf = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SeatsAvailable = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDsOfSeatstf = new javax.swing.JTextField();
        MakeReservationButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        SeatsAvailable.setEditable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("How many seats do you want to reserve");

        jLabel2.setText("What class do you want to reserve in");
        ClassNumbertf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassNumbertfActionPerformed(evt);
            }
        });
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        MakeReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeReservationButtonActionPerformed(evt);
            }
        });
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });
        OkButton.setText("Ok");

        SeatsAvailable.setColumns(20);
        SeatsAvailable.setRows(5);
        jScrollPane1.setViewportView(SeatsAvailable);

        jLabel3.setText("Seats");

        jLabel4.setText("Enter The ID(s) of the seats that you want separated by comma");

        MakeReservationButton.setText("Make Reservation");

        GoBackButton.setText("Go back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(ClassNumbertf, 50, 70, 90)
                        .addGap(35, 35, 35)
                        .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numberOfSeatstf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDsOfSeatstf, 50, 100, 140)
                        .addGap(72, 72, 72)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(MakeReservationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoBackButton)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassNumbertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfSeatstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDsOfSeatstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MakeReservationButton)
                    .addComponent(GoBackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ClassNumbertfActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        // Integer Class = Integer.parseInt(ClassNumbertf.getText());
        // User.resetTheatreReservations();
        // System.out.println(Class);

        // System.out.print(User.printactiveUserentSeats(Class)); // 3mltlha comment 3shan kant gyba error
        // User.printactiveUserentSeats(Class);
        // ;

        // System.out.println(User.printactiveUserentSeats(Class));
        // SeatsAvailable.setText("User.printactiveUserentSeats(Class)");
    }
    private void MakeReservationButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        User.resetTheatreReservations();
        StringTokenizer tokenizer = new StringTokenizer(IDsOfSeatstf.getText(), ",");
        while(tokenizer.hasMoreTokens())
        {
            activeUser.ticketReservation(Integer.parseInt(tokenizer.nextToken()), 
                                Integer.parseInt(ClassNumbertf.getText()));
        }
    }
    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        UserOptions userOptions = new UserOptions(activeUser);
        setVisible(false);
        dispose();
        userOptions.setVisible(true);
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton OkButton;
    private javax.swing.JButton MakeReservationButton;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea SeatsAvailable;
    private javax.swing.JTextField ClassNumbertf;
    private javax.swing.JTextField numberOfSeatstf;
    private javax.swing.JTextField IDsOfSeatstf;
    // End of variables declaration                   
}