import java.util.Scanner;

public class TempConverter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Fehrenheit Temp : ");
    float feh = input.nextFloat();

    double cel = (feh - 32) * 5 / 9;

    System.out.println("Your Temperature in celsius : " + cel + "`C");

  }
}
