package Window;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable
{
    private String name;
    private String passcode;
    private int totalAmountPaid;
    private ArrayList<Integer> reservedSeatsInFirstClass = new ArrayList<>();    
    private ArrayList<Integer> reservedSeatsInSecondClass = new ArrayList<>();    
    private ArrayList<Integer> reservedSeatsInThirdClass = new ArrayList<>();    
    
    static int cnt = 0; // da 3shan a7l seats anha init mra w7da m3 awl user hwa hl m3fn bs mfesh w2t
    static char[] seatsFirstClass = new char[25]; // from 1 to 20 // wmzwd mn 3ndy al memory bt3ty f br7ty
    static char[] seatsSecondClass = new char[45]; // from 1 to 40
    static char[] seatsThirdClass = new char[55]; // from 1 to 50
    
    public User() {
    }
    public User(String name, String passcode) {
        this.name = name;
        this.passcode = passcode;
        
    }
    
    public void setName(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    } 
    public String getPasscode() {
        return passcode;
    }

    public int getTotalAmountPaid() {
        return totalAmountPaid;
    }
   
    
    public void reservedSeats(){
        System.out.print("Class 1: ");
        for(Integer i : reservedSeatsInFirstClass)
            System.out.print(i+" ");
        
        System.out.println();
        
        System.out.print("Class 2: ");
        for(Integer i : reservedSeatsInSecondClass)
        System.out.print(i+" ");
        
        System.out.println();
        
        System.out.print("Class 3: ");
        for(Integer i : reservedSeatsInThirdClass)
        System.out.print(i+" ");
        
        System.out.println();
    }
    
    public void ticketReservation(int idx, int Class){

        if (Class == 1)
        {
            //Ticket in First Class
            if(seatsFirstClass[idx] == 'O')
            {
                seatsFirstClass[idx] = 'X';
                totalAmountPaid += 50;   
                reservedSeatsInFirstClass.add(idx);
            }
            else
                System.out.println("This seat is already taken");
        }


        else if (Class == 2)
        {
          //Tickets in Second Class
            if(seatsSecondClass[idx] == 'O')
            {
                seatsSecondClass[idx] = 'X';
                totalAmountPaid += 15;   
                reservedSeatsInSecondClass.add(idx);
            }
            else
                System.out.println("This seat is already taken");   
        }
        else if (Class == 3)
        {
            //Tickets in Third Class
            if(seatsThirdClass[idx] == 'O')
            {
                seatsThirdClass[idx] = 'X';
                totalAmountPaid += 10;  
                reservedSeatsInThirdClass.add(idx);
            }
            else
                System.out.println("This seat is already taken");   
        }

    }
    public void ticketCancellation(Integer idx, Integer Class){
        if (Class == 1)
        {
            int flag = 0;
            int indexToBeRemoved = 0;
            for(int i = 0; i < reservedSeatsInFirstClass.size(); i++)
            {
                if (idx == reservedSeatsInFirstClass.get(i))
                    {
                        flag = 1;
                        indexToBeRemoved = i;
                    }
            }
            if(flag == 1)
            {
                seatsFirstClass[idx] = 'O';
                reservedSeatsInFirstClass.remove(indexToBeRemoved);
                totalAmountPaid-=50;
            }
            else
            {
                System.out.println("This Seat is not yours");
            }
        }
        else if (Class == 2)
        {
            int flag = 0;
            int indexToBeRemoved = 0;
            for(int i = 0; i < reservedSeatsInSecondClass.size(); i++)
            {
                if (idx == reservedSeatsInSecondClass.get(i))
                    {
                        flag = 1;
                        indexToBeRemoved = i;
                    }
            }
            if(flag == 1)
            {
                seatsSecondClass[idx] = 'O';
                reservedSeatsInSecondClass.remove(indexToBeRemoved);
                totalAmountPaid-=15;
            }
            else
            {
                System.out.println("This Seat is not yours");
            }
        }
        else if (Class == 3)
        {
            int flag = 0;
            int indexToBeRemoved = 0;
            for(int i = 0; i < reservedSeatsInThirdClass.size(); i++)
            {
                if (idx == reservedSeatsInThirdClass.get(i))
                    {
                        flag = 1;
                        indexToBeRemoved = i;
                    }
            }
            if(flag == 1)
            {
              seatsThirdClass[idx] = 'O';
              reservedSeatsInThirdClass.remove(indexToBeRemoved);
              totalAmountPaid -= 10;
            }
            else
            {
                System.out.println("This Seat is not yours");
            }

        }
    }

    public static void resetTheatreReservations(){
        for(int i = 0; i < 25; i++)
            seatsFirstClass[i] = 'O';
        for(int i = 0; i < 45; i++)
            seatsSecondClass[i] = 'O';
        for(int i = 0; i < 55; i++)
            seatsThirdClass[i] = 'O';
        
        try{
            FileWriter fw1 = new FileWriter(new File("storeSFC.txt")); // strore steats
            PrintWriter pw1 = new PrintWriter(fw1);
            
            for(char ch : seatsFirstClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
            for(char ch : seatsSecondClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
            for(char ch : seatsThirdClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static String printAvailableSeats(int Class){
        if (Class == 1)
        {
            String seats = printSeatsInFirstClass();
            return seats;
        }
        else if(Class == 2)
        {
            String seats = printSeatsInSecondClass();
            return seats;
        }
        else if (Class == 3)
        {
            String seats =  printSeatsInThirdClass();
            return seats;
        }
        else{
            return "Please write a valid number";
        }
    }
    public static String printSeatsInFirstClass(){
        String seats = "";
        for(int i = 0; i < 20; i++)
        {
            seats+= (i+1) + "-" + seatsFirstClass[i] + " ";
            if (i % 5 == 0 && i!=0)
                seats+="\n";
        }
        return seats;
    }
    public static String printSeatsInSecondClass(){
        String seats = "";
        for(int i = 0; i < 40; i++)
        {
            seats+= (i+1) + "-" + seatsSecondClass[i]+ " ";
            if (i % 8 == 0 && i!=0)
                seats+="\n";
        }
        return seats;
    }
    public static String printSeatsInThirdClass(){
        String seats = "";
        for(int i = 0; i < 50; i++)
        {
            seats+= (i+1) + "-" + seatsThirdClass[i]+ " ";
            if (i % 10 == 0 && i!=0)
                seats+="\n";
        }
        return seats;
    }
    public static void updateSeats(){
        try{
            FileWriter fw1 = new FileWriter(new File("storeSFC.txt"));
            PrintWriter pw1 = new PrintWriter(fw1);
            
            for(char ch : seatsFirstClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
            for(char ch : seatsSecondClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
            for(char ch : seatsThirdClass)
                {pw1.write(ch); pw1.flush();}
            pw1.println();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }


    @Override
    public String toString() {
        return "User [name=" + name + ", Password=" + passcode + ", totalAmountPaid=" + totalAmountPaid + "]";
    }
    
    
    
}