// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.File;
// import java.io.FileInputStream;
// import java.util.ArrayList;
// import java.util.Scanner;
// import javax.swing.*;

// import Window.*;

// public class Main extends JFrame
// {

//     // doul ana awl mshghl al program 3ayz ykoun mtkhzn fehom koul alm3lomat alfatt
//     // fna hakoun mkhznhom fee files awl malprogram yshtghl ana hgebhom mn alfile m3aya 3shan
//     // lw 3ayz a3ml ai haga 3lehom a3ml br7ty w arg3 tany al updates in file    

//     // static char[] seatsFirstClass = new char[25]; // from 1 to 20 // wmzwd mn 3ndy al memory bt3ty f br7ty
//     // static char[] seatsSecondClass = new char[45]; // from 1 to 40
//     // static char[] seatsThirdClass = new char[55]; // from 1 to 50

//     static ArrayList<User> allUsers = new ArrayList<>();
    
//     // fana h3ml fucntion asmha init() de htkhzn alhgat al file alh7tgha fal variable
//     public static void init()
//     {
//         // User.resetTheatreReservations();  
//         try{
//             File file = new File("UserData.txt");
//             FileInputStream fis = new FileInputStream(file);
//             ObjectInputStream ois = new ObjectInputStream(fis);

//             allUsers = (ArrayList<User>)ois.readObject();
//             ois.close();
            
//         }catch(FileNotFoundException e){
//             System.out.println(e);
//         }catch(IOException e){
//             System.out.println(e);
//         }catch(ClassNotFoundException e){
//             System.out.println(e);
//         }   
    
//     }
    
//     public static void release()
//     {
//         try{
//             File file = new File("UserData.txt");
//             FileOutputStream fos = new FileOutputStream(file);
//             ObjectOutputStream oos = new ObjectOutputStream(fos);

//             oos.writeObject(allUsers);
//             oos.flush();
//             oos.close();
            
//         }catch(FileNotFoundException e){
//             System.out.println(e);
//         }catch(IOException e){
//             System.out.println(e);
//         }
//     }


    

//     public static void main(String args[])
//     {
//         // funciton init-> initialize koul alna 3yzo wktbo foo2 al funciton foo2
//         init();
        
//         // signUp();
        
//         // for( User u : allUsers)
//         //     System.out.println(u);
        
//         // String name, pass;
//         // Scanner in = new Scanner(System.in);
//         // // System.out.println();
//         // name = in.nextLine();
//         // pass = in.nextLine();
        
//         // User curr = new User();
//         // try
//         // {
//         //     curr = login(name, pass);
//         // }catch(NullPointerException e)
//         // {
//         //     System.out.println(e);
//         // }

//         // curr.ticketReservation(4, 1);

//         // for(User u : allUsers)
//         // {
//         //     System.out.println(u);
//         //     u.reservedSeats();
//         // }
        
//         // in.close();
//         release();
//     }
// }
