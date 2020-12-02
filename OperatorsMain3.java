package HomeWork1;

public class OperatorsMain3 {
    public static void main(String[] args) {
        int a = 42; //101010
        int b = 15; //1111
        int c = -42; //11111111111111111111111111010110
        int d = -15; //11111111111111111111111111110001
        int x = a ^ b; //100101
        int y = c ^ d; //100111
        System.out.println(x);
        System.out.println(y);
    }
}
