
import java.util.Scanner;

public class countdigit {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number To Count digit: ");
        int num = inp.nextInt();
        count(num);
    }

    public static void count(int num) {
        int co = 0;
        while (num > 0) {
            co = co + 1;
            num = num / 10;
        }
        System.out.println("Count is: " + co);

    }

}
