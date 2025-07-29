import java.util.Scanner;

public class OddNoSum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Number : ");
    int num = input.nextInt();
    long res = Sumall(num);
    System.out.println("Addition Of Till Odd Number : " + res);

  }

  public static long Sumall(int num) {
    int sum = 0;
    int i = 1;
    while (i <= num) {
      sum += i;
      i += 2;
    }
    return sum;
  }
}
