import java.util.Scanner;

public class Swapping {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // swapping
    System.out.print("Enter Value of A : ");
    int a = input.nextInt();

    System.out.print("Enter Value of B : ");
    int b = input.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("Value of A : " + a);
    System.out.println("Value of B : " + b);
  }

}
