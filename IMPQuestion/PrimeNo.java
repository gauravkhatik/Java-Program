import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Number To check is Prime or Not  :");
    int num = input.nextInt();
    // int res = checkprime(num);
    System.out.println(checkprime(num));

  }

  public static boolean checkprime(int num) {
    int i = 2;
    while (i < num) {
      if (num % i == 0) {
        return false;
      }

      i++;
    }
    return true;

  }

}
