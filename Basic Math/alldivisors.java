
import java.util.Scanner;

public class alldivisors {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number To Check All Divisors: ");
        int num = inp.nextInt();
        int cout = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                cout = cout + 1;

            }

        }
        System.out.println("Total Number is :" + cout);
    }
}
