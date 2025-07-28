import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Area of Traiangle
    System.out.print("Enter The Height Of Traiangle. : ");
    double h = input.nextDouble();
    System.out.print("Enter The Base Of Traiangle. : ");
    double b = input.nextDouble();

    double are = 3.14 * b * h;
    System.out.println("Area Of Triangle : " + are);

  }

}
