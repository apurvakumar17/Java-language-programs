class A {
    String data = "DATA of class A";
}

class B extends A {
    String data2 = "DATA of class B";
}

public class ObjAToB {
    public static void main(String[] args) {
        A objA;  // Declare variable of type A
        B objB = new B(); // Create an object of B
        objA = objB;  // Assign B's object to A reference

        System.out.println(objA.data); // Output: DATA of class A
    }
}
