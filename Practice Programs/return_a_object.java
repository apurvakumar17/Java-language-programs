class Test {
    int a;
    Test (int i) {
        a = i;
    }
    Test incTest() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

public class return_a_object {
    public static void main(String args[]) {
        Test obj1 = new Test(2);
        System.out.println(obj1.a);

        Test obj2;
        obj2 = obj1.incTest();
        System.out.println(obj2.a);
    }
}
