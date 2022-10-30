package WeekendER;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeekEndCounter {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            List<Integer> calendar1 = new ArrayList<>(Arrays.asList(6, 13, 14, 20, 21, 27, 28));
            List<Integer> calendar2 = new ArrayList<>(Arrays.asList(7, 13, 14, 20, 21, 27, 28 ));
            List<Integer> calendar3 = new ArrayList<>(Arrays.asList (6, 7, 14, 20, 21, 27, 28 ));

            System.out.println("Enter test case, up to 3 ONLY!");
            int answer = sc.nextInt();
            int adder;

            switch (answer)
            {
                case 3:
                    {
                        System.out.print("Insert date of holiday for calendar 1\n");
                        for (int i = 1; i <= 2; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar1.add(adder);
                        }
                        Collections.sort(calendar1);
                        System.out.print("Insert date of holiday for calendar 2\n");
                        for (int i = 1; i <= 3; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar2.add(adder);
                        }
                        Collections.sort(calendar2);
                        System.out.print("Insert date of holiday for calendar 3\n");
                        for (int i = 1; i <= 1; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar3.add(adder);
                        }
                        Collections.sort(calendar3);
                        System.out.println("\nCalendar 1: " + calendar1.size() + " : "); for (Integer item : calendar1) { System.out.print(item + ","); }
                        System.out.println("\nCalendar 1: " + calendar2.size() + " : "); for (Integer item : calendar2) { System.out.print(item + ","); }
                        System.out.println("\nCalendar 1: " + calendar3.size() + " : "); for (Integer item : calendar3) { System.out.print(item + ","); }
                        System.in.read();
                        break;
                    }

                case 2:
                    {
                        System.out.print("Insert date of holiday for calendar 1\n");
                        for (int i = 1; i <= 2; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar1.add(adder);
                        }
                        Collections.sort(calendar1);
                        System.out.print("Insert date of holiday for calendar 2\n");
                        for (int i = 1; i <= 3; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar2.add(adder);
                        }
                        Collections.sort(calendar2);
                        System.out.println("\nCalendar 1: " + calendar1.size() + " : "); for (Integer item : calendar1) { System.out.print(item + ","); }
                        System.out.println("\nCalendar 1: " + calendar2.size() + " : "); for (Integer item : calendar2) { System.out.print(item + ","); }
                        
                        System.in.read();
                        break;

                    }
                case 1:
                    {
                        System.out.print("Insert date of holiday for calendar 1\n");
                        for (int i = 1; i <= 2; i++)
                        {
                            System.out.print("Num " + i + ":");
                            adder = sc.nextInt();
                            calendar1.add(adder);
                        }
                        Collections.sort(calendar1);
                        System.out.println("\nCalendar 1: " + calendar1.size() + " : "); for (Integer item : calendar1) { System.out.print(item + ","); }
                        System.in.read();
                        break;
                    }
                default:
                    {
                        System.out.print("Invalid Input! ");
                        System.in.read();
                        break;
                    }
             }   
        }
    
}
