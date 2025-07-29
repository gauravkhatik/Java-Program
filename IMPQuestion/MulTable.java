import java.util.Scanner;

public class MulTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter A Table Number : ");
    int num = input.nextInt();
    Multiplication(num);

  }

  public static void Multiplication(int num) {
    int i = 1;
    while (i <= 10) {
      System.out.println(num + " X " + i + " = " + (num * i));
      i++;

    }
  }
}
