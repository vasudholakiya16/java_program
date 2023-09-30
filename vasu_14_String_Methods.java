public class vasu_14_String_Methods {
    public static void main(String[] args) {
    String name = "Vasu";
        System.out.println(name);

        String lover_string = name.toLowerCase();
        System.out.println(lover_string);

        String upper_string = name.toUpperCase();
        System.out.println(upper_string );

        String nontrimmedString = "   Vasu is a good boy    ";
        System.out.println(nontrimmedString);
        System.out.println(nontrimmedString.trim());


        System.out.println( name.substring(2));
        System.out.println( name.substring(0));
        System.out.println( name.substring(1,3));   //index starts for zero

        System.out.println(name.replace('V','B'));
        System.out.println(name.replace("Va","Da"));

        System.out.println(name.startsWith("Va"));
        System.out.println(name.endsWith("r"));

        System.out.println(name.charAt(2)); //char start with zero

        String modifieName = "vassussussu";
        System.out.println(modifieName.indexOf("u"));
        System.out.println(modifieName.indexOf("u",5));
        System.out.println(modifieName.indexOf("uewrng",5)); //number is not defind then output is  -1

        System.out.println(modifieName.lastIndexOf("ssu"));
        System.out.println(modifieName.lastIndexOf("ssu",7));

        System.out.println(name.equals("Vasu"));
        System.out.println(name.equals("vasu"));

        System.out.println(name.equalsIgnoreCase("vasu")); // output is true because char is match
        System.out.println(name.equalsIgnoreCase("Basu")); //output is flase because char is not match


        System.out.println("Good Morning  \t have a nice day");
        System.out.println("Good Morning \b have a nice day");




    }
}
