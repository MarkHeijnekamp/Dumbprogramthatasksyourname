import java.util.Scanner;
public class Index {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name ? ");
        System.out.println();
        String Fn = scanner.nextLine();

        System.out.println("What is your last name ?");

        String Ln= scanner.nextLine();
        System.out.println("Hello: " + Fn + " " + Ln);


    }
}