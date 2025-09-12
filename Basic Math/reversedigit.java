
import java.util.Scanner;

public class reversedigit {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ENter A Number To want Reverse: ");
        int num = inp.nextInt();
        reverse(num);
    }

    public static void reverse(int num) {
        int reverseno = 0;
        while (num > 0) {
            int ld = num % 10;
            reverseno = (reverseno * 10) + ld;
            num = num / 10;
        }
        System.out.println("Reverse Number : " + reverseno);
    }
}
