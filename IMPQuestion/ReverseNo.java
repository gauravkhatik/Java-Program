import java.util.Scanner;

public class ReverseNo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Digit :");
    int num = input.nextInt();
    int res = reverse(num);
    System.out.println("Reverse Digit is: " + res);

  }

  public static int reverse(int num) {
    int newnum = 0;
    while (0 < num) {
      int digit = num % 10;
      newnum = newnum * 10 + digit;
      num /= 10;

    }
    return newnum;
  }

}
