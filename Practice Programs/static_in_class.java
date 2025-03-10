class Student {
    static String who = "I am Student";
    int marks = 99;
    static {
        System.out.println("Hello from external static 1(Student)");
    }
}
class Teacher {
    static String who = "I am Teacher";
    int marks = 100;
    static {
        System.out.println("Hello from external static 2(Teacher)");
    }
}
public class static_in_class {
    static {
        System.out.println("Hello from internal static");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student Marks: " + s1.marks);
        System.out.println(Teacher.who);
        System.out.println(Student.who);
        System.out.println("Hello from main");
    }
}
