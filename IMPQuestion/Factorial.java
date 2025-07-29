import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Factorial Number : ");
    int num = input.nextInt();

    BigInteger res = FactNo(num);

    System.out.println("Factorial is : " + res);

  }

  public static BigInteger FactNo(int num) {
    BigInteger mul = BigInteger.ONE;
    for (int i = 2; i <= num; i++) {
      mul = mul.multiply(BigInteger.valueOf(i));
    }
    return mul;
  }
}
