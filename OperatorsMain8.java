package HomeWork1;

public class OperatorsMain8 {
    public static void main(String[] args) {
        int a = 42; //101010
        a += 32; //74
        a -= 3; //71
        a *= 2; //142
        a /= 6; //23
        a <<= 4; //368
        a >>= 2; //92
        int b = 15; //1111
        b += 13; //28
        b -= 3; //25
        b *= 2; //50
        b /= 6; //8
        b <<= 4; //128
        b >>= 2; //32
        int c = -42; //11111111111111111111111111010110
        c += 32; //-10
        c -= 3; //-13
        c *= 2; //-26
        c /= 6; //-4
        c <<= 4; //-64
        c >>= 2; //-16
        int d = -15; //11111111111111111111111111110001
        d += 32; //17
        d -= 3; //14
        d *= 2; //28
        d /= 6; //4
        d <<= 4; //64
        d >>= 2; //16
        System.out.println(a); //1011100
        System.out.println(b); //100000
        System.out.println(c); //11111111111111111111111111110000
        System.out.println(d); //10000
    }
}
