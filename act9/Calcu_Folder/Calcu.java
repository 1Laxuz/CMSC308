import java.util.Scanner;

import com.java.rapirap.takers;

public class Calcu {
    takers takers = new takers();
    static double num1, num2;
    public static Scanner sc = new Scanner(System.in);
    public static void menu()
    {
        System.out.println("[1] Addition");
        System.out.println("[2] Subraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] Exponent");
        System.out.println("[6] Modulo");
        System.out.println("[7] Exit");
        System.out.print("\nEnter your choice: ");
    }
    
    public static void main(String[] args) throws Exception {
        boolean done = false;
        do{
            System.out.println();
            menu();
            char operation = sc.next().charAt(0);
            switch(operation){
                case '1':{
                    takers.takers();
                    System.out.println("\nThe sum of "+ num1 + " and "+ num2 +" is: " + (num1 + num2));
                    break;     
                }
                case '2':{
                    takers();
                    System.out.println("\nThe difference of "+ num1 + " and "+ num2 +" is: " +  (num1 - num2));
                    break;     
                }
                case '3':{
                    takers();
                    System.out.println("\nThe product of "+ num1 + " and "+ num2 +" is: " +  (num1 * num2));
                    break;     
                }
                case '4':{
                    takers();
                    System.out.println("\nThe quotient of "+ num1 + " and "+ num2 +" is: " +  (num1 / num2));
                    break;     
                }case '5':{
                    System.out.print("Enter the Base number:");
                      num1 = sc.nextDouble();
                     System.out.print("Enter the Exponent:");
                      num2 = sc.nextDouble();
                     sc.close();
                    double expo = Math.pow(num1, num2);
                    System.out.println("\nThe exponent of "+ num1 + " and "+ num2 +" is: " +  (expo));
                    break;     
                }case '6':{
                    takers();
                    System.out.println("\nThe modulo of "+ num1 + " and "+ num2 +" is: " +  (num1 % num2));
                    break;     
                }
                case '7':{
                    System.out.println("Exiting ...");
                    sc.close();
                    done = true;
                    break;
                }
                default:
                {System.out.println("Invalid Input!");
                break;
            }
        }
        }while(!done); 
}
}
