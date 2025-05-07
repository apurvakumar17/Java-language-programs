public class P9 {
    public static void main(String[] args) {
        // Create a StringBuffer object with an initial string
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("--- StringBuffer Methods Demonstration ---");

        // append()
        sb.append(" Java");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(6, 15, "Awesome");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());
        System.out.println("\nPractical 9, 04814902024, Apurva Kumar\n");
    }
}