import javax.xml.transform.Result;
import java.sql.SQLOutput;

public class ArithmetischerOperationen {
    public static void main(String[] args) {
        int a = 152;
        int b = 150;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int f = 3;
        int c = ++f;
        System.out.println(c);

        printResult(2+3);
        int Zahl = 2+4;
        printResult(Zahl);
        System.out.println(add(3, 7));
        printResult(add(73452345,1341234));

    }
    public static void printResult(int Result)
    {
        System.out.println(Result);
    }

    public static int add(int a, int b )
    {
        return a+b;
    }
}

