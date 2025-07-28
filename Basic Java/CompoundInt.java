import java.util.Scanner;

public class CompoundInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter The Amount:  ");
    int amo = input.nextInt();

    System.out.print("Enter The Rate of Intrest:  ");
    double ra = input.nextDouble();

    System.out.print("Enter The Year :  ");
    float y = input.nextFloat();

    double comp = amo * Math.pow((1 + ra / 100), y);

    System.out.println("Compount Interest : " + comp);

  }

}
