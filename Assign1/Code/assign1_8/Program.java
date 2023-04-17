 // byte value into String
 /* 
 class Program {
    public static void main(String[] args)
    {
        byte b1 = 123;
        String str = Byte.toString(b1);
        System.out.println("String = "+str);
    }

}
*/

// byte value into byte instance
/* 
class Program {
    public static void main(String[] args)
    {
        byte b1 = 12;
        byte b2 = Byte.valueOf(b1);
        System.out.println("Byte value = "+b1);
    }

}
 */

 //String instance into byte instance
  
 class Program8 {
    public static void main(String[] args)
    {
        String str = new String("123");
        byte b1 = Byte.valueOf(str);
        System.out.println("Byte Instance= "+str);

    }

}

