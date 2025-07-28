import java.util.Scanner;

public class PosNeg {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Number : ");
    int num = input.nextInt();

    if (num > 0) {
      System.out.println("Number is Positive : " + num);
    } else if (num == 0) {
      System.out.println("Number is Zero : " + num);

    } else if (num < 0) {
      System.out.println("Number is Negative : " + num);

    }

  }

}
