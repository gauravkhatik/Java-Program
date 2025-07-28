import java.util.Scanner;

class Input {
  public static void main(String args[]) {
    System.out.println("\nGaurav Khatik\n");

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Name :");
    String str = input.nextLine();
    System.out.print("\nEnter Your Age :");
    int age = input.nextInt();
    System.out.print("\nEnter Your Div : ");
    char div = input.next().charAt(0);
    System.out.print("\nEnter Your CGPA : ");
    float per = input.nextFloat();

    System.out.println("\n Student Information");
    System.out.println("Student Name: " + str);
    System.out.println("Student Age: " + age);
    System.out.println("Student Div: " + div);
    System.out.println("Student CGPA: " + per);

  }
}