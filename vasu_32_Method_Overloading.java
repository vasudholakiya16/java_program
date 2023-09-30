public class vasu_32_Method_Overloading {

    static void boo(){
        System.out.println("Have a nice day!...");
    }

    static void boo(int a ){
        System.out.println("Have a nice day!..." + a + " sir");
    }

    static void boo(int a , int b){
        System.out.println("Have a nice day!..." + a + " sir");
        System.out.println("Have a nice day!..." + b + " sir");

    }

static void change(int a){
        a =55;
}

    static void change_2(int [] arr){
        arr [0] = 85;
    }

    static  void  joke(){
        System.out.println("Good morning ");
    }

    public static void main(String[] args) {
       joke();
       int [] marks = {45,66,77,88,78,89 };

       //Changing the integer case-1
//               int x = 60;
//               change(x);
//        System.out.println("The value of x is " + x);
//        OP is no change

//        //Changing the Array case-2
//        change_2(marks);
//        System.out.println("The value of x is " + marks[0]);
////        OP is change the value

//        Method overloding
        boo();
        boo(14);  //argument are actual
        boo(1, 3);
    }
}
