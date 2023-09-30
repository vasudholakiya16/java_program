class ek{
    int x;

    public int getX() {
        return x;
    }

    ek (int v){
        this.x=v;
    }
    public int returnone(){
        return 1;
    }
}
public class vasu_47_this_and_super_keyword {
    public static void main(String[] args) {
 ek a = new ek(8);
        System.out.println(a.getX());
    }
}
