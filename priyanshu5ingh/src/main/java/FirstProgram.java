package priyanshu5ingh;

import java.util.Scanner; // Required to use Scanner

public class FirstProgram {

    public static void main(String[] args) {
        //SACHIN HAS EDITTTED
        Scanner sc = new Scanner(System.in);
        
        // Removed the "x:"
        System.out.println("Enter the number of kms"); 
        
        // Capitalized the F in nextFloat
        float kms = sc.nextFloat(); 
        
        // Renamed variable so it doesn't start with a number
        float conversionRate = 0.62137119F; 
        float miles = conversionRate * kms;
        
        System.out.println(miles);
            
        // Moved this statement INSIDE the main method
        System.out.println("Conflict arise"); 
        
        // TODO Auto-generated method stub
        sc.close(); // It's good practice to close your scanner!
    }
}