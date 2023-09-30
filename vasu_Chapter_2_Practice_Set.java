import java.util.Scanner;
public class vasu_Chapter_2_Practice_Set {
    public static void main(String[] args) {

//        Q-1
        float a2 = 7/4.0f * 9/2.0f ;
        System.out.println(a2);
//      Q-2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
//        Decrypting grade
        grade = (char)(grade - 8);
        System.out.println(grade);

//            Q-3
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println(a1>8);

//        Q-4
         float v = 5 ;
         float u =4;
         float a = 8;
         float s = 6;

       float  w = (v*v) - (u*u) / (2*a*s);
        System.out.println(w);
//        Q-5

        System.out.println(7*49/7+35/7);
    }
}
