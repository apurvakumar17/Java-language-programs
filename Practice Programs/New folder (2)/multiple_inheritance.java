interface A {
    int Ano = 1;
    int Amarks();
}

interface B {
    int Bno = 2;
    int Bmarks();
}

interface AB extends A, B {
    String ABno = "A+B";
    void Total();
}

abstract class school implements AB {
    double avg = (Ano + Bno) / 2.0;
    public void Total() {
        System.out.println("Total");
    }
    abstract int showAVG();
}

class students extends school {
    public int Amarks() {
        System.out.println(Ano);
        return 0;
    }
    public int Bmarks() {
        System.out.println(Bno);
        return 0;
    }
    void total() {
        System.out.println(Ano + Bno);
    }
    public int showAVG() {
        System.out.println(avg);
        return 0;
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        students s = new students();
        s.total();
        s.Amarks();
        s.Bmarks();
        s.showAVG();
    }
}
