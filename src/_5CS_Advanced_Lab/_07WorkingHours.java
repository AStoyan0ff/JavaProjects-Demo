package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _07WorkingHours {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.next();

        if ((hour >= 10 && hour <= 18) && (day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday")
                || day.equals("Saturday"))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
