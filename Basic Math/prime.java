
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter A Number to check Number is Prime ");
        int num = inp.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }

    }

}
