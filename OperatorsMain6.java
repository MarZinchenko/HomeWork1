package HomeWork1;

public class OperatorsMain6 {
    public static void main(String[] args) {
        int a = 42; //101010
        a = a << 2;
        int b = 15; //1111
        b = b << 2;
        int c = -42; //11111111111111111111111111010110
        c = c << 2;
        int d = -15; //11111111111111111111111111110001
        d = d << 2;
        System.out.println(a); //10101000
        System.out.println(b); //111100
        System.out.println(c); //11111111111111111111111101011000
        System.out.println(d); //11111111111111111111111111000100
    }
}
