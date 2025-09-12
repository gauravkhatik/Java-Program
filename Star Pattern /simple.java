
import java.util.Scanner;

public class simple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number To Print Pattern:- ");
        int a = input.nextInt();
        pa1(a);
        pa2(a);

    }

    public static void pa1(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    public static void pa2(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * a - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
