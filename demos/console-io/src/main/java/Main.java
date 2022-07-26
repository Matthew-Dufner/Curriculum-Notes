import com.revature.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            user.setFirstName(sc.nextLine());
            System.out.print("Enter last name: ");
            user.setLastName(sc.nextLine());
            System.out.print("Enter age: ");
            user.setAge(sc.nextInt());

            System.out.println("Common pitfall when using scanner, consuming the newline char");
            System.out.print("Enter an integer: ");
            int i = sc.nextInt();
            sc.nextLine();
            //Integer.parseInt(sc.nextLine());
            System.out.print("Enter a string: ");
            String temp = sc.nextLine();
            System.out.println("Your string: " + temp);



        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(user);

    }
}
