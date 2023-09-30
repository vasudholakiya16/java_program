public class vasu_31_Methods {

    static int logic( int x , int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;

    }

//    if we dont decler the static keyword  then
//  int logic( int x , int y){
//    int z;
//    if (x>y){
//        z = x+y;
//    }
//    else {
//        z = (x+y)*5;
//    }
//    return z;

//}
    static int logic_1(int x1 , int y1){
        int z1;
        if (x1<y1){
           z1 = x1 * y1;
       }
       else {
           z1 = (x1 * y1)/2;
       }
        return z1;

        //    if we dont decler the static keyword  then
//        int logic_1(int x1 , int y1){
//            int z1;
//            if (x1<y1){
//                z1 = x1 * y1;
//            }
//            else {
//                z1 = (x1 * y1)/2;
//            }
//            return z1;
    }
    public static void main(String[] args) {


       int a = 5;
       int b = 2;
       int c;
        c = logic(a,b);

//       if we dont decler static word  then use this method
//       vasu_31_Methods obj = new vasu_31_Methods();
//       c = obj.logic(a,b);  // mathod-2

//       if (a>b){  mathod-1
//            c = a+b;
//       }
//       else {
//            c = (a+b)*5;
//       }
       int a1 = 2;
       int b1 = 1;
       int c1;
       c1 = logic_1(a1,b1);
//       if we dont decler static word  then use this method
//       c1 = obj.logic_1(a1,b1); //method-2
//       if (a<b){ //mathid-1
//           c1 = a1 * b1;
//       }
//       else {
//           c1 = (a1 * b1)/2;
//       }

       System.out.println(c);
        System.out.println(c1);

    }
}
