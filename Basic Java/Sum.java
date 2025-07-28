import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First No: ");
    float a = input.nextFloat();
    System.out.print("Enter Second No: ");
    float b = input.nextFloat();
    float sum = a + b;
    System.out.println("The Sum is : " + sum);

  }

}
