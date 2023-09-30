public class vasu_Chapter_7_Practice_Questions {

    static void multipliction(int n ){
        for (int i=0;i<=10;i++){
            System.out.format("%d X %d = %d\n ",n,i,n*i);
        }
    }

    static void patten_1(int n ){
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumRec(int n ){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void patten_2(int n ){
        for (int i=0;i>n;i++){
            for(int j=0;j>i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
        }
    public static void main(String[] args) {
//        Q-1 multiplication table of n number
//        multipliction(5);

        // Q-2 write a mathod to print the bellow pattern
//        *
//        **
//        ***
//        ****
//        patten_1(5);

//        Q-3 using recursion function print the sum of n natural numbers
//     int c =sumRec(2);
//        System.out.println(c);
//        Q-4 write a mathod to print the bellow pattern
////      ****
//        ***
//        **
//        *
//        patten_2(3);

//        Q-5 n terms of fibonacci series using recursion
        int result = fib(5);
        System.out.println(result);


    }
}
