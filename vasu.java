import java.util.Scanner;
public class vasu {
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            String name[]=new String[30];
            int rollno[]=new int[30];
            int age[]=new int[30];
            int per[]=new int[30];
            int n,i,key;
            System.out.println("Enter the Number of records");
            n=sc.nextInt();
            System.out.println("Enter the Details");
            for(i=0;i<n;i++)
            {

                System.out.println("Enter the Name:");
                name[i]=sc.next();
                System.out.println("Enter the age:");
                age[i]=sc.nextInt();
                System.out.println("Enter the rollno");
                rollno[i]=sc.nextInt();
                System.out.println("Enter the percentage");
                per[i]=sc.nextInt();
            }
            System.out.println("Student Detail");
            do
            {
                System.out.println("Enter the roll number do you want to see again?");

                key=sc.nextInt();
                if(key==9)
                    break;
                for(i=0;i<n;i++)
                {

                    if(key!=rollno[i])
                    {
                        System.out.println("Enter valid roll number or 9 to exit");
                        break;
                    }
                }

                for(i=0;i<n;i++)
                {
                    if(key==rollno[i])
                    {
                        System.out.println("The name of the student:  "+name[i]);
                        System.out.println("The roll no  of the student:  "+rollno[i]);
                        System.out.println("The age of the student:  "+age[i]);
                        System.out.println("The percentage of the student:"+per[i]);
                    }
                }
            }while(true);
        }
    }





