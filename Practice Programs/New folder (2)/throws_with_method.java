class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class VoterSytem {
    void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Access Denied");
        } else {
            System.out.println("You are welcome");
        }
    }
}

public class throws_with_method {
    public static void main(String[] args) {
        int Age = 12;
        VoterSytem vs = new VoterSytem();
        try {
            vs.checkAge(Age);
        } catch (AgeException ae) {
            System.out.println(ae.getMessage());
        } finally {
            System.out.println("I will always get executed");
        }
    }

}
