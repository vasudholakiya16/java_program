class One{
    public void greet(){
        System.out.println("Have a nice Day!....");
    }
    public void name(){
        System.out.println("My Name is Java in class One");
    }

}
class Two extends One{
    public void meet(){
        System.out.println("Have a Good Morning!..");
    }
    public void name(){
        System.out.println("My Name is Java in class two");
    }
}
public class vasu_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
    One obj = new One();   //allowed

    Two sumobj = new Two(); //allowed

//    obj.name();
//    obj.greet();

        One obj1 = new Two(); // is allowed or super class refrence is same as subclass object
        // Two boj2= new One(); // is not allowed  easy to understanding we use normal phone and smartphone example
        obj1.greet();
        obj1.name();
    }
}
