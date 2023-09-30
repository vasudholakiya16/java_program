
public class vasu_ch_5_Loops {
    public static void main(String[] args) {

        // While loops

      /*  int i = 1;
        while (i<=3){
            System.out.println(i);
            i++;
        }
        */

        // Do-while Loops

      /*  int b = 0;
        do {
            System.out.println(b);
            b++;
        }while (b<5);



        int c = 100;   //        if condition is false but one time exicute
        do {
            System.out.println(c);
            c++;

        }while (c<50);

*/

        //for loops

        for (int i = 0 ; i<=10 ; i++){
            System.out.println(i);
        }
    int n = 5;
        for (int i =0; i<5;i++){
            System.out.println(2 * i + 1);
        }
        System.out.println("The new code is ");
        for (int i = 5 ; i>0; i--){
            System.out.println(i);
        }



//        Break and continue statement in java


//                                            use break statement

        /*
        System.out.println("Using for loop");
        for( int i = 0;i<5;i++){
            System.out.println(i);
            System.out.println("Good Morning");
            if (i==2){
                System.out.println("End of the loop");
                break;
            }
        }

        System.out.println("Using while loop is");
        int i=0 ;
        while(i<5){
            System.out.println(i);
            System.out.println("Good Morning");
            if (i==2){
                System.out.println("End of the while loop");
                break;
            }
            i++;
        }

        System.out.println("Using do-while loop");
        int j=0 ;
        do {
            System.out.println(j);
            System.out.println("Good Morning");
            if (j==2){
                System.out.println("End of the do-while loop");
                break;
            }
            j++;
        }while(j<5);
        */

        //                              use continue statement


//        System.out.println("Using for loop");
//        for( int i = 0;i<5;i++){
//
//            if (i==2){
//                System.out.println("End of the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Good Morning");
//        }
//
//        System.out.println("Using do-while loop");
//        int j=0 ;
//        do {
//            j++;
//            if (j==2){
//                System.out.println("End of the do-while loop");
//                continue;
//            }
//            System.out.println(j);
//            System.out.println("Good Morning");
//
//        }while(j<5);
//
//        System.out.println("Using while loop is");
//        int i=0 ;
//        while(i<5){
//            i++;
//            if (i==2){
//                System.out.println("End of the while loop");
//              continue;
//            }
//            System.out.println(i);
//            System.out.println("Good Morning");
//
//        }



    }

}
