import java.util.Base64;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting X now");
        this.x = x;
    }

    public void Base(){
        System.out.println("I am constructor");
    }
}
class Derived extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class vasu_45_Inheritance {
    public static void main(String[] args) {
        //code for base class
base b = new base();
b.setX(78);
        System.out.println(b.getX());
        //code for derive class
        Derived d= new Derived();
        d.setX(78);
        System.out.println(d.getX());
        d.setY(147);
        System.out.println(d.getY());
    }
}
