import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired Password: ");
        String password = sc.nextLine();
        sc.close();


        PasswordStrengthChecker psc = new PasswordStrengthChecker();
        String strengthFeedback = psc.checkPasswordStrength(password);
        System.out.println(strengthFeedback);





    }
}
