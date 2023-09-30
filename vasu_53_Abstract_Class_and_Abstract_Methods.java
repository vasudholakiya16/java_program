abstract class base20{
    public base20(){
        System.out.println("I am a constructor of base class");
    }
    public void hi(){
        System.out.println("Hi.....");
    }
    abstract public void greet();
}
class derived extends base20{
    public void greet(){
        System.out.println("Good morning");
    }
}
  abstract class derived1 extends base20{
    public void vp(){
        System.out.println("Have a nice day!...");
    }
}
public class vasu_53_Abstract_Class_and_Abstract_Methods {
    public static void main(String[] args) {
derived d = new derived();
//base20 b = new base20(); /// show the error because of base20 is a abstract class

    }

}
