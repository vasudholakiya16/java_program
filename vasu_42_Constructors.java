class MyMainEmploye {
    private int id;
    private String name;
    public MyMainEmploye(){
        id = 589;
        name = "VASU DHOLAKIYA";
    }

    public MyMainEmploye(String Myname , int  Myid){
        id = Myid;
        name = Myname;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class vasu_42_Constructors {
    public static void main(String[] args) {
MyMainEmploye sc = new MyMainEmploye("Vasu", 56); // if we comment this line then run MYMainEmployee class
//        MyMainEmploye sc = new MyMainEmploye();
//sc.setName("VasuDholakiya");
//sc.getName();
//sc.setId(478);
//sc.getId();
        System.out.println(sc.getId());
        System.out.println(sc.getName());
    }
}
