package _7ForLoop_LaB;
import java.util.Scanner;

public class _04EvenPowersOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = 1;

        for(int i = 0; i <= n; i += 2) {
            System.out.println(result);
            result = result * 2 * 2;
        }




    }
}
