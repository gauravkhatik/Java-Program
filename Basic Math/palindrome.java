
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter A Number to check Number is Palindrome: ");
        int num = inp.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            rev = (rev * 10) + ld;
            num = num / 10;

        }
        if (original == rev) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is Not Palindrome");
        }
    }

}
