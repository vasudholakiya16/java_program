
interface Camara{
    void takeSnap();
    void recordvideo();
}
interface Wifi{
    String [] getNetwork();
    void connectTotheNetwork(String network);
}
class MycellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling........." + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting........." );
    }

//
}
abstract class SmartPhone extends MycellPhone implements Wifi,Camara{
   public void takesnap(){
        System.out.println("Take Snap");
    }
    public void recordvideo(){
        System.out.println("Record Video");
    }
    public void connectTotheNetwork(){
        System.out.println("Connect to the Network ");
    }
}
public class vasu_57_Java_Interfaces_Example {
    public static void main(String[] args) {

    }
}
