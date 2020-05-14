package loops;

import java.util.Scanner;

public class JavaLoopsI {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        solution();
        solutionTwo();
        solutionThree();
    }

    public static void solution() {
        System.out.println("Enter a number to multiply by i"); //not needed, make sure to delete
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        sc.close();
    }

    public static void solutionTwo() {
        System.out.println("Enter a number to multiply by i"); //not needed, make sure to delete

        int N = sc.nextInt();
        int i = 1;

        //exit i when it becomes greater than or equaled to 10
        while (i <= 10) {
            //print i in new line every time
            System.out.println(N + " x " + i + " = " + (N * i));
            i++; //increment i every time
        }
        sc.close();
    }

    public static void solutionThree() {
        System.out.println("Enter a number to multiply by i"); //not needed, make sure to delete
        int n = sc.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        sc.close();
    }
}
