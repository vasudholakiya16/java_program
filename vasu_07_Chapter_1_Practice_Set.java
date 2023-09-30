
import java.util.Scanner;
public class vasu_07_Chapter_1_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q-1 sum of the three number
        System.out.println("The sum of three number ");
        System.out.println("Enter the  first number : ");
       float a = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float b = sc.nextFloat();
        System.out.println("Enter the third  number : ");
        float c = sc.nextFloat();
        float sum = a + b + c ;
        System.out.print("The sum is ");
        System.out.print(sum);

//        Q-2 calculate the cgpa

        System.out.println("CGPA calculate ");
        System.out.println("Enter the  first subject marks  : ");
       float a1 = sc.nextFloat();
        System.out.println("Enter the second subject marks : ");
        float b1 = sc.nextFloat();
        System.out.println("Enter the third  subject marks : ");
        float c1 = sc.nextFloat();
        float sum1 = (a1 + b1 + c1)/30 ;
        System.out.println(sum1);

//        Q-3

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc1.next();
        System.out.println("Hello " + name + " Have a good day!..");

//        Q-4
        System.out.println("Convert to KMS to miles ");
        double kilometers;
        System.out.println("Please enter kilometers:");

        Scanner in = new Scanner(System.in);
        kilometers = in.nextDouble();

        double miles = kilometers / 1.6;

        System.out.println(miles + " Miles");

//        Q-5
        System.out.println("Enter your number");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());

    }
}
