import java.util.Scanner;

public class RectanglePeriMeter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Perimeter Of Rectangle \n");

    System.out.print("Enter All Sides of Rectangle :\n");
    System.out.print("Side 1 : ");
    double s1 = input.nextDouble();
    System.out.print("Side 2 : ");
    double s2 = input.nextDouble();
    System.out.print("Side 3 : ");
    double s3 = input.nextDouble();
    System.out.print("Side 4 : ");
    double s4 = input.nextDouble();

    double peri = s1 + s2 + s3 + s4;
    System.out.println("Perimeter Of Rectangle : " + peri);

  }

}
