import org.w3c.dom.ls.LSOutput;

class base1{
    base1(){
        System.out.println("I am a base class constructor");
    }
    base1(int x ){
        System.out.println("I am an overloading  base class constructor with the value of x is :" + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends base1{
    Derived1(){
        super(0); //if we run the base1 (int a) then we can use this
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x ,int y ){
        super(x);
        System.out.println("I am an overloading  Derived class constructor with the value of x and y  is :"  + y );
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloading  Derived class constructor with the value of x,y and z  is :"  + z );

    }
}
public class vasu_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
//base1 b = new base1();
//Derived1 d = new Derived1();
// Derived1 d = new Derived1(7,9);
        childOfDerived a = new childOfDerived();
        childOfDerived a1 = new childOfDerived(7,6,9);

    }
}
