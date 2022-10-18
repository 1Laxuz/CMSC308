import java.util.Scanner;

class takers
{
double num1, num2;

public void takers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number[1]:");
        num1 = sc.nextDouble();
        System.out.print("Enter a number[2]:");
        num2 = sc.nextDouble();
        sc.close(); 
    }
}