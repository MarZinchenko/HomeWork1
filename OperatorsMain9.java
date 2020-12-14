package homeWork1;

public class OperatorsMain9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        boolean h = true;
        boolean i = false;
        double j = 5 + 2 / 8.;
        double k = (a + b) / (double) c; // b=2
        double q = (a + b++) / (double) c; // b=2
        double r = (a + b++) / (double) --c;  // b=3, c=7
        double l = (a * b >> b++) /(double) --c;  //  b=4, c=6
        double m = (a + d > e ? f : g * b >> b++) / (double) --c; // b=5, c=5; первый операнд - false, значит выводим третий операнд (и делим его на --c)
        //boolean n = (a + d > e ? f >= f : g * b >> b++) / --c;  // b=6, c=5; тут будет ошибка, т.к. второй операнд должен быть любым выражением, возвращающим некоторое ЗНАЧЕНИЕ (у нас же - оператор сравнения с результатом true)
        boolean o = 6 - 2 > 3 && 12 * 12 <= 119; // в одной части результат - true, в другой - false, следовательно будет false
        boolean p = h && i; // в одной части результат - true, в другой - false, следовательно будет false
        System.out.println(j);
        System.out.println(k);
        System.out.println(q);
        System.out.println(r);
        System.out.println(l);
        System.out.println(m);
        //System.out.println(n);
        System.out.println(o);
        System.out.println(p);
    }
}
