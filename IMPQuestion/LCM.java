import java.util.Scanner;

public class LCM {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A First Number : ");
    int num1 = input.nextInt();

    System.out.print("Enter A Second Number : ");
    int num2 = input.nextInt();

    int res = lcmcal(num1, num2);
    System.out.println("The LCM is :" + res);

  }

  public static int lcmcal(int num1, int num2) {
    int i = 1;
    while (true) {
      int fact = num1 * i;
      if (fact % num2 == 0) {
        return fact;
      }
      i++;
    }

  }
}