
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number To Count digit: ");
        long num = inp.nextInt();
        long original = num;
        int digits = String.valueOf(num).length();

        long sum = 0;

        while (num > 0) {
            long ld = num % 10;
            sum += Math.pow(ld, digits);
            num = num / 10;
        }
        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
