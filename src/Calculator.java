import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {
        int a= 500;
        System.out.println(a);
        int b = 600;
        System.out.println(b);
        boolean c = true;
        System.out.println(c);
        char d = 'r';
        System.out.println(d);
        String e = "Bier";
        System.out.println(e);
        out(add(a,b));
        out(sub(a,b));
        out(mul(a,b));
        out(div(a,b));
        out(mod(a,b));



    }
    public static int add(int a, int b )
    {

        return a + b;
    }
    public static int sub(int a, int b )
    {

        return a - b;
    }
    public static int div(int a, int b )
    {

        return a / b;
    }
    public static int mul(int a, int b )
    {

        return a * b;
    }
    public static int mod(int a, int b )
    {

        return a % b;
    }
    public static void out(int n)
    {
        System.out.println(n);
    }
}

