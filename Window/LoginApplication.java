package Window;
 
import javax.swing.*; 
import java.io.*;
import java.util.*;

public class LoginApplication extends javax.swing.JFrame {

    public LoginApplication() {
        initComponents();
    }

    private void initComponents() {
        // Function to initialize all components will used in this window

        jLabel1 = new JLabel();
        loginButton = new JButton(); 
        signUpButton = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        nameField = new JTextField();
        passwordField = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login/SignUp");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt); // de alfunction al ht run 3shan t3ml al action
            }
        });

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jLabel3.setText("Password");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(loginButton)
                .addGap(74, 74, 74)
                .addComponent(signUpButton)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(signUpButton))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>                        

    // doul ahm atneen 3ndna
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /* 
         * tmm al login button hya htakhoud mn al user name wal password wtnady function al login
         * 
         */
        String name = nameField.getText();
        char[] pass = passwordField.getPassword();
        String password = new String(pass);

        User currUser = login(name, password);

        if(currUser == null)
        {
            try
            {
                JOptionPane.showMessageDialog(null,"This user does not exist!");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else
        {
            UserOptions UserOptions = new UserOptions();
            setVisible(false);
            dispose();
            UserOptions.setVisible(true);
        }
    }     
    
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
        String name = nameField.getText();
        char[] pass = passwordField.getPassword();
        String password = new String(pass);

        System.out.println(name + " " + password);

        boolean ok = signUp(name, password);

        if(ok)
        {
            try
            {
                JOptionPane.showMessageDialog(null,"This User Has Been Added Successfully");
                nameField.setText("");
                passwordField.setText("");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else
        {
            try
            {
                JOptionPane.showMessageDialog(null,"This User Already Exists");
                nameField.setText("");
                passwordField.setText("");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }      
        
    }                                     
                                                
    // Variables declaration - do not modify                     
    private JButton loginButton; // ok button
    private JButton signUpButton; // cancel button
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField passwordField;
    private JTextField nameField;
    // End of variables declaration  
    
    // variables decleration out of gui
    private static ArrayList<User> allUsers = new ArrayList<>();

                    // function will used in this window //    
    
    public static boolean readUserFile()
    {
        // function to read all user from file and put it in array allUsers
        User user = null;
        try{
            File file = new File("Window\\UsersData.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
                        
            allUsers.clear();
            try{
                while(true)
                {
                    user = (User)ois.readObject();
                    allUsers.add(user);
                }
            }catch(EOFException e){
                // hna khlas reached end of file f2ra koul al objects
            }

            ois.close();
 
            return true;
            
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,e + "x");
            return false;
        }catch(EOFException e){
            return true;
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,e + "y");
            return false;
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e + "z");
            return false;
        }
    }
    public User login(String name, String passcode)
    {
        if(readUserFile())
        {
            for(User user : allUsers)
            {
                System.out.println(user);
                if(user.getName().equals(name) && user.getPasscode().equals(passcode))
                {
                    System.out.println("User mwgood 3ady");
                    return user;
                }
            }
        }
        System.out.println("fe haga ghlt");
        return null;
    }    
    public static boolean writeUserInFile(User addUser)
    {
        allUsers.add(addUser);
        try{
            File file = new File("Window\\UsersData.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(User user : allUsers)
                oos.writeObject(user);
            
            oos.flush();
            oos.close();

        }catch(FileNotFoundException e){
            System.out.println(e + "AA");
        }catch(IOException e){
            System.out.println(e + "BB");
        }
            
        return true;
    }
    public static boolean signUp(String name, String passcode)
    {
        if(readUserFile())
        {
            for(User user : allUsers)
                System.out.println(user);
            try
            {
                for(User user : allUsers)
                    if(user.getName() == name && user.getPasscode() == passcode)
                        return false;
                
                writeUserInFile(new User(name, passcode)); // lma arg3 mn alsala hkmlo
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            
            return true;
        }
        else
           System.out.println("Have a problem bs msh 3arf eh");
        
        return false;
    }
}
