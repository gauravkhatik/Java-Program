import java.util.Scanner;

public class ArithmeticOp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n  Arithmetic Operator\n");
    System.out.print("Enter A First Number : ");
    double num1 = input.nextDouble();

    System.out.print("Enter A Second Number : ");
    double num2 = input.nextDouble();

    System.out.println("Addition : " + (num1 + num2));
    System.out.println("Subtraction : " + (num1 - num2));
    System.out.println("Multiplication : " + (num1 * num2));
    System.out.println("Division : " + (num1 / num2));
    System.out.println("Modulas : " + (num1 % num2));

  }

}
