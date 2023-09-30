
class MyEmploye {
   private int id;
    private String name;
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
public class vasu_40_Access_modifiers_getters_setters {
    public static void main(String[] args) {
MyEmploye vasu = new MyEmploye();
//vasu.id = 45; show error due to private access modifier
//vasu.name = "Dholakiya Vasu"; // show error due to private access modifier
        vasu.setName("Dholakiya Vasu");
        System.out.println(vasu.getName());
        vasu.setId(45);
        System.out.println(vasu.getId());
    }
}
