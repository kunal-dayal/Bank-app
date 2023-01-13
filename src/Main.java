import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dear user");

        Scanner sc = new Scanner(System.in);

        System.out.println("Name");
        String name = sc.next();

        System.out.println("Password");
        String pass = sc.next();

        System.out.println("balance");
        double bala = sc.nextDouble();

        SBI user = new SBI(name,bala,pass);

        String message = user.addmonet(9999);

        System.out.println("Give the amount you want to withdrawl");
        int mon = sc.nextInt();

        System.out.println("Type the password of your account");
        String password = sc.next();

        System.out.println(user.withdrawlmoney(mon,password));

        System.out.println("change");
    }
}