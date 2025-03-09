import java.util.LinkedList;
import java.util.Random;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            list.addLast(random.nextInt(50));
        }
        System.out.println(list);
        int len = list.size();
        System.out.println("No. of elements: " + len);
        for (int i = 0; i < len; i++) {
            if(list.get(i) > 25) {
                list.remove(i);
                i--;
                len--;
            }
        }
        System.out.println(list);
        len = list.size();
        System.out.println("No. of elements: " + len);
    }
}
