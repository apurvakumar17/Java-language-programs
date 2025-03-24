class outer {
    int ot = 2;
    class inner {
        int in = ot - 1;
    }
}

public class nested_class {
    public static void main(String args[]) {
        outer oi = new outer();
        System.out.println(oi.ot);
    }
}
