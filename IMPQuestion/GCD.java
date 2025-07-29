import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A First Number : ");
    int num1 = input.nextInt();

    System.out.print("Enter A Second Number : ");
    int num2 = input.nextInt();

    int res = gcdCal(num1, num2);
    System.out.println("The GCD is : " + res);

  }

  public static int gcdCal(int num1, int num2) {
    int min1 = Math.min(num1, num2);
    int i = 1;
    int gcd = 1;

    while (i <= min1) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
      }
      i++;
    }
    return gcd;

  }

}
