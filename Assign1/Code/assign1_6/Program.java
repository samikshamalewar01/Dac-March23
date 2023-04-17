/*      //Boolean value into String
 class Program
 {
     public static void main(String args[])
     {
         boolean b = true;
         String str = Boolean.toString(b);
         System.out.println("String = "+str);
     }
 }
*/

 // Boolean value into boolean instance
 /* 
 class Program {
    public static void main(String[] args)
    {
        //boolean b1 = true;
        Boolean b1 = new Boolean(true);
        boolean b2 = Boolean.valueOf(b1);
        System.out.println("Boolean value = "+b2);
    }


}
*/

//String value into boolean value
/* 
class Program {

    public static void main(String[] args)
    {
        String str = "True";
        boolean b1 = Boolean.parseBoolean(str);
        System.out.println("Boolean value = "+b1);
    }
}
*/

//String value into boolean instance
public class Program {
    public static void main(String[] args)
    {
        String str = "true";
        boolean b1= Boolean.valueOf(str);
        System.out.println("Boolean value = "+b1);

    }

}