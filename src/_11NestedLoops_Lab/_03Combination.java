package _11NestedLoops_Lab;
import java.util.Scanner;

public class _03Combination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {

                int c = n - a - b;
                if (c >= 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
