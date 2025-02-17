class Temp {
    int a, b;

    Temp() {}

    Temp(int x) {
        a = b = x;
    }
    Temp(int x, int y) {
        a = x;
        b = y;
    }
    Temp(Temp obj) {
        a = obj.a;
        b = obj.b;
    }
    boolean equalsto(Temp obj) {
        if (obj.a == a && obj.b == b) {
            return true;
        } else {
            return false;
        }
    }

}
public class various_constructors {
    public static void main(String args[]) {
        Temp t1, t2, t3, t4, t5;
        t1 = new Temp();
        t2 = new Temp(1);
        t3 = new Temp(5, 6);
        t4 = new Temp(5, 6);
        t5 = new Temp(t3);
        System.out.println("t1.a = " + t1.a + " " + "t1.b = " + t1.b);
        System.out.println("t2.a = " + t2.a + " " + "t2.b = " + t2.b);
        System.out.println("t3.a = " + t3.a + " " + "t3.b = " + t3.b);
        System.out.println(t5.equalsto(t3));
        System.out.println(t3.equalsto(t4));
    }
}