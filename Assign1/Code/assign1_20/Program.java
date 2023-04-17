
// long value into string
/*
class Program{
    public static void main(String[] args)
    {
        long l1 = 4567;
        String str = Long.toString(l1);
        System.out.println("String value= "+str);
    }

}
*/

// long value into long instance
/*
class Program{
    public static void main(String[] args)
    {
        long l = 2345667;
        long l1 = Long.valueOf(l);
        System.out.println("Long Instance = "+l1);
    }
}
*/

//String instance into long instance
/*
class Program 
{
    public static void main(String[] args)
    {
        String str = "4567";
        String str1 = String.valueOf(str);
        long l = Long.valueOf(str1);
        System.out.println("Long value = "+l);

    }
}
*/

// long value into binary string
/*
class Program {
    public static void main(String[] args)
    {
        long l = 7;
        String s = Long.toBinaryString(l);
        System.out.println("Binary Value = "+s);
    }
     
}
*/

// long value into octal string
/*
class Program {
    public static void main(String[] args)
    {
        long l = 7;
        String s = Long.toOctalString(l);
        System.out.println("Octal Value = "+s);
    }
     
}
*/

// long value into hexadecimal String

class Program {
    public static void main(String[] args)
    {
        long l = 7;
        String s = Long.toHexString(l);
        System.out.println("Hexadecimal Value = "+s);
    }
     
}
