package HomeWork1;

public class OperatorsMain2 {
    public static void main (String[] arg){
        int a = 42; //101010
        int b = 15; //1111
        int c = -42; //11111111111111111111111111010110
        int d = -15; //11111111111111111111111111110001
        int x = a & b;
        int y = c & d;
        System.out.println(x); //1010
        System.out.println(y); //11111111111111111111111111010000
    }
}
