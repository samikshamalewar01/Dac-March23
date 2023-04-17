// int value into string
/*
 class Program {
    public static void main(String[] args)
    {
        int num = 400;
        String s = Integer.toString(num);
        System.out.println("String value ="+s);

    }

}
*/

// int value into integer instance
/*
class Program{
    public static void main(String[] args)
    {
        int num = 45;
        int num1 = Integer.valueOf(num);
        System.out.println("Integer instance ="+num1);

    }
}
*/

//String instance into integer instance
/*
class Program{
    public static void main(String[] args)
    {
        String str = "123";
        String str1 = new String(str);
        int num = Integer.valueOf(str1);
        System.out.println("Integer Instance = "+num);

    }
}
*/

// int value into binary string
/*
class Program{
    public static void main(String[] args)
    {
        int num1 = 20;
        String b = Integer.toBinaryString(num1);
        System.out.println("Binary value = "+b);
    }
}
*/

// intv value into octal string
/*
class Program{
    public static void main(String[] args)
    {
        int num1 = 7;
        String s = Integer.toOctalString(num1);
        System.out.println("Octal Value = "+s);

    }
}
*/

// int value into hexadecimal string
 
class Program{
    public static void main(String[] args)
    {
        int num1 = 50;
        String s = Integer.toHexString(num1);
        System.out.println("Hexadecimal Value ="+s);
    }
}





