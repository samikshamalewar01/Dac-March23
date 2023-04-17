// double value into string
/*
class Program {
    public static void main(String[] args)
    {
        double d = 234.5;
        String s = Double.toString(d);
        System.out.println("String = "+s);
    }

}
*/

// double value into double instance
/*
class Program{
    public static void main(String[] args)
    {
        double d = 18.10;
        Double d1 = new Double(d);
        double d2 = d1.doubleValue();
         System.out.println("Double Instance = "+d2);
    }
}
*/

// string instance into double instance
/*
class Program{
    public static void main(String[] args)
    {
        String str = "888";
        String str1 = new String(str);
        double d = Double.valueOf(str1);
         System.out.println("Double Instance = "+d);
    }
}
*/

// double value into hexa decimal string
/*
class Program{
    public static void main(String[] args)
    {
        double d = 23.15;
        String s = Double.toHexString(d);
        System.out.println("Hexadecimal Value = "+s);

    }
}
*/

//double to binary long

class Program{
    public static void main(String[] args)
    {
        double d = 18.10;
        long l = Double.doubleToLongBits(d);
         System.out.println("Long value = "+l);
    }
}
