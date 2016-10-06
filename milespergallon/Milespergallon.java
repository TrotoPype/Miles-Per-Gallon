package milespergallon;
import java.util.Scanner;

public class Milespergallon {

     public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in); //allows for user input
        
        float miles_driven, gallons_used, miles_per_gallon; //declares variables
        
        System.out.print("How many miles did you drive? "); //displays message
        miles_driven = user_input.nextFloat(); //user inputs miles driven
        
        System.out.print("How many gallons did you use? "); //displays message
        gallons_used = user_input.nextFloat(); //user inputs gallones used
        
        miles_per_gallon = miles_driven / gallons_used;
        
        System.out.print("Your mpg is: " + miles_per_gallon + 
                         " miles per gallon."); //displays miles per gallon
        
        
    }
    
}
