import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Marks Between 1 To 100 : ");
    int mark = input.nextInt();

    if (mark > 90 && mark <= 100) {
      System.out.println("Grade A");
    } else if (mark > 75 && mark <= 90) {
      System.out.println("Grade B");
    } else if (mark > 60 && mark <= 75) {
      System.out.println("Grade C");
    } else if (mark > 30 && mark <= 60) {
      System.out.println("Grade D");
    } else if (mark < 30 && mark >= 0) {
      System.out.println("Grade F");
    } else {
      System.out.println("You ARE Enter A Wrong Number");
    }
  }

}
