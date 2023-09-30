public class vasu_33_Variable_Arguments {
//    static int sum(int a , int b){
//return  a+b;
//    }
//
//    static int sum(int a , int b, int c){
//        return  a+b+c;
//    }
//    static int sum(int a , int b, int c,int d){
//        return  a+b+c+d;
//    }
    static int sum(int ...arr){
//        Available is int[]arr
        int result = 0;
        for (int a: arr){
            result +=a;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome!....");
        System.out.println("The sum of Nothing is : " + sum());
        System.out.println("The sum of 4 and 5 is : "+ sum(4,5));
        System.out.println("The sum of 3 , 4 amd 5 is :  " + sum(3,4,5));
        System.out.println("The sum of 2,3 , 4 amd 5 is : " + sum(2,3,4,5));

    }
}
