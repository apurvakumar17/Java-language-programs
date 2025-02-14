public class string_comparison {
    public static void main(String[] args) {
        String firstname = "Apurva ";
        String lastname = "Kumar";
        String fullname = firstname + lastname;
        System.out.println(fullname);

        //-----------get length of a string---------------//
        System.out.println(fullname.length());

        //--------------string traversal-----------------//
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        //---------------string comparison-------------------//
        if (firstname.compareTo(lastname) == 0) {
            System.out.print("Strings are same: ");
            System.out.println(firstname.compareTo(lastname));
        } else if (firstname.compareTo(lastname) > 0) {
            System.out.print("String1 is larger: ");
            System.out.println(firstname.compareTo(lastname));
        } else {
            System.out.print("String2 is larger: ");
            System.out.println(firstname.compareTo(lastname));
        }

        //--------------------Substring---------------------//
        String shortname = firstname.substring(0,3) + lastname.substring(0,2);
        System.out.println(shortname);
    }
}
