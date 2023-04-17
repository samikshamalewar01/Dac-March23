
// float valur into String
/*
public class Program {
    public static void main(String[] args)
    {
        float f = 12.30f;
        String s = Float.toString(f);
        System.out.println("String value = "+s);
    }

}
*/

// float value into float instance

/*
class Program{
    public static void main(String[] args)
    {
        float f = 22.18f;
        float f1 = Float.valueOf(f);
        System.out.println("Float Instance = "+f1);
    }
}
*/

// string instance into float instance
/*
class Program{
    public static void main(String[] args)
    {
        String str = "234";
        String str1 = new String(str);
        float f = Float.valueOf(str1);
        System.out.println("Float Instance = "+f);
    }
}
*/



// float value into hexadecimal string

class Program {
    public static void main(String[] args)
    {
        float f = 18.50f;
        String s = Float.toHexString(f);
        System.out.println("Hexadecimal value = "+s);
    }
}
