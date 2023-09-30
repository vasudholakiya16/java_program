class A{
    public int a ;
    public int harry(){
        return 85;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }

}
class C extends B{
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class vasu_48_Method_Overriding {
    public static void main(String[] args) {
// A a = new A();
// a.meth2(); //   I am method 2 of class A
B b = new B();
// b.meth2();  //I am method 2 of class B
b.meth3(); // I am method 3 of class B

    }
}
