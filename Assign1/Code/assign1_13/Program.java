// short value into String
/* 
class Program {
    public static void main(String[] args)
    {
        short s1 = 12;
        String str = Short.toString(s1);
        System.out.println("String = "+str);

    }

}
*/

// short value into short instance
/* 
class Program {
    public static void main(String[] args)
    {
        short s1 = 45;
        short s2 = Short.valueOf(s1);
        System.out.println("Short Instance = "+s2);
    }

}
*/

// String instance into short instance
class Program{

    public static void main(String[] args)
    {
       String str = "234";
       String str1 = new String(str);
       short s = Short.valueOf(str1);
       System.out.println("Short Instance = "+s);

    }
}