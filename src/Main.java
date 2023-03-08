import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int sum = 1;
        for (int i = 1; i < a1; i++) {
            sum += i * sum;
        }
        System.out.print(sum);
    }
}