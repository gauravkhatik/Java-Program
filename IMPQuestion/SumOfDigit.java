import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter A Number : ");
    int num = input.nextInt();
    int res = Sum1(num);
    System.out.println("The Sum Of Digit Is: " + res);

  }

  public static int Sum1(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

}
