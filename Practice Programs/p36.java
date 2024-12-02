public class p36 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Apurva"); //Using string builder is more memory efficient
        System.out.println(name);
        System.out.println(name.charAt(0)); //get single character
        name.setCharAt(0, 'a');  //change a charater in string
        System.out.println(name);
        name.insert(name.length(),"7k");
        System.out.println(name);
        name.delete(6, 8);
        System.out.println(name);
        name.append("7k");
        System.out.println(name);
        name.reverse();
        System.out.println(name);
    }
}
