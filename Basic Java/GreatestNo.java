import java.util.Scanner;

public class GreatestNo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter A First Number : ");
    int num1 = input.nextInt();
    System.out.print("Enter A Second Number : ");
    int num2 = input.nextInt();
    System.out.print("Enter A Third Number : ");
    int num3 = input.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      System.out.println("The First Number is Bigger : " + num1);

    } else if (num2 >= num1 && num2 >= num3) {
      System.out.println("The second Number is Bigger : " + num2);

    } else if (num3 >= num1 && num3 >= num2) {
      System.out.println("The Third Number is Bigger : " + num3);

    }

  }

}
