import java.util.ArrayList;
import java.util.Collections;
class ArrayFuncs {
    static void displayList(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Element " + i + " is: " + l.get(i));
        }
    }
}

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        System.out.println(list1.get(2));
        list1.add(1, 6);
        System.out.println(list1);
        list1.set(2, 6);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        list1.add(4);
        list1.add(8);
        System.out.println("Size of array: " + list1.size());
        ArrayFuncs.displayList(list1);
        Collections.sort(list1);
        System.out.println();
        ArrayFuncs.displayList(list1);
    }
}
