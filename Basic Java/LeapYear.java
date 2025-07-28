import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter A year : ");
    int year = input.nextInt();

    if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
      System.out.println("Year Is Leap Year : " + year);
    } else {
      System.out.println("Year is Not Leap year");
    }
  }
}
