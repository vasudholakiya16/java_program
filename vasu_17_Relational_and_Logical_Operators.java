import java.sql.SQLOutput;

public class vasu_17_Relational_and_Logical_Operators {
    public static void main(String[] args) {
        System.out.println("For logical AND....");
    boolean a = true;
    boolean b = false;

//    logicel And (&&)
//            T && T  VALUE IS TRUE
//            T && F  VALUE IS FALSE
//            F && T  VALUE IS FALSE
//            F && F  VALUE IS FALSE

        if ( a && b){
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }

        System.out.println("For logical OR....");
        boolean a1 = false;
        boolean b1 = false;

//    logicel And (||)
//            T && T  VALUE IS TRUE
//            T && F  VALUE IS TRUE
//            F && T  VALUE IS TRUE
//            F && F  VALUE IS FALSE

        if ( a1 || b1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("For logical NOT....");
        System.out.print("!A is ");
        System.out.println(!a);
        System.out.print("!B is ");
        System.out.println(!b);

    }
}
