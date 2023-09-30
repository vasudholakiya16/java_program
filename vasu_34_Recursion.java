public class vasu_34_Recursion {
static int  factorial (int n ){
//    factorial(n)= n * factorial(n-1)
//    factorial(0)=1
    if (n==0 || n==1){
        return 1;
    }
    else {
        return n * factorial(n-1);
    }
}

    static int  factorial_iterative (int n ){
//    factorial(n)= n * factorial(n-1)
//    factorial(0)=1
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
    int n =5;
        System.out.println("The value of factorial is " + factorial(n));
        System.out.println("The value of factorial is " + factorial_iterative(n));


    }
}
