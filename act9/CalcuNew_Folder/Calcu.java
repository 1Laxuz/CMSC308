import java.util.Scanner;

import com.java.rapirap.*;
class Calcu {
    public static double num1, num2;
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
        Boolean Continue = true;
        do{
            System.out.println();
            menu();
            char operation = sc.next().charAt(0);
            switch(operation){
                case '1':{
                    takers.taker();
                    System.out.println("\nThe sum of "+ takers.num1 + " and "+ takers.num2 +" is: " + (takers.num1 + takers.num2));
                    break;     
                }
                case '2':{
                    takers.taker();
                    
                    System.out.println("\nThe difference of "+ takers.num1  + " and "+ takers.num2 +" is: " +  (takers.num1  - takers.num2 ));
                    break;     
                }
                case '3':{
                    takers.taker();
                    
                    System.out.println("\nThe product of "+ takers.num1  + " and "+ takers.num2  +" is: " +  (takers.num1  * takers.num2 ));
                    break;     
                }
                case '4':{
                    takers.taker();
                    
                    System.out.println("\nThe quotient of "+ takers.num1  + " and "+ takers.num2  +" is: " +  (takers.num1  / takers.num2 ));
                    break;     
                }case '5':{
                    System.out.print("Enter the Base number:");
                    num1  = sc.nextDouble();
                    System.out.print("Enter the Exponent:");
                    num2  = sc.nextDouble();
                    double expo = Math.pow(num1 , num2 );
                    System.out.println("\nThe exponent of "+ num1  + " and "+ num2 +" is: " +  (expo));
                    break;     
                }case '6':{
                    takers.taker();
                    System.out.println("\nThe modulo of "+ takers.num1  + " and "+ takers.num2  +" is: " +  (takers.num1  % takers.num2 ));
                    break;     
                }
                case '7':{
                    System.out.println("Exiting ...");
                    Continue = false;
                    break;
                }
                default:
                {System.out.println("Invalid Input!");
                Continue = false;
                break;
            }
        }
        }while(Continue); 
}
}
