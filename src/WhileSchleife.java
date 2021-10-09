public class WhileSchleife {
    public static void main(String[] args) {

        int count = 0;
        int input=10;
        while (count<input)
        {
            count += 2;
            System.out.println("count = " + count);
        }
        for(int i = 0; i<=input;i+=2)
        {
            System.out.println("i = " + i);
        }
    }
}
