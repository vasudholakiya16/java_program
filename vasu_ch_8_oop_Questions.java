//Q-1
    class Employee_1{
    int salary;
    String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
//    Q-2
    class cellPhone{
    public void ringing(){
        System.out.println("Ringing....");
        }
        public void vibrating(){
            System.out.println("Vibrating....");
        }
    public void calling(){
        System.out.println("Calling....");
    }
    }

//    Q-3
class square{

    int side;
    public int area(){
        return side * side;
    }
     public int perimeter(){
        return 4*side;
     }
}

//Q-4
class rectangle{
    int Width;
    int Length;
    public int area(){
        return Width * Length;
    }
    public int 	perimeter(){
        return 2*(Length * Width);
    }
}
//Q-5

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

//Q-6
class circle{
    int Radius;
    public int area(){
        return (int) (3.14 * Radius * Radius);
    }
    public int perimeter(){
        return (int) (2*3.14*Radius);
    }

}
public class vasu_ch_8_oop_Questions {
    public static void main(String[] args) {
        /*
//        Q-1
        Employee_1 vasu = new Employee_1();
        vasu.setName("Dholakiya Vasu");
        vasu.salary = 34;
        System.out.println(vasu.getSalary());
        System.out.println(vasu.getName());

         */

//        Q-2
        /*
        cellPhone samsumg = new cellPhone();
        samsumg.ringing();
        samsumg.calling();
        samsumg.vibrating();

         */

//        Q-3
        /*
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         */


//        Q-4
        /*
        rectangle sq_1 = new rectangle();
        sq_1.Width = 4;
        sq_1.Length =5;
        System.out.println(sq_1.area());
        System.out.println(sq_1.perimeter());

         */

//        Q-5
        /*
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

         */
//        Q-6
        circle sq_2 = new circle();
        sq_2.Radius = 2;
        System.out.println(sq_2.area());
        System.out.println(sq_2.perimeter());


    }
}
