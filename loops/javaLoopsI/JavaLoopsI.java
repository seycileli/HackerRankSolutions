package loops;

import java.util.Scanner;

public class JavaLoopsI {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        solution();
        
    }

    public static void solution() {
        System.out.println("Enter a number to multiply by i");
        int n = sc.nextInt();

        int result;

        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
