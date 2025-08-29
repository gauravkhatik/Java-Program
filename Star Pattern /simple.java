
import java.util.Scanner;

public class simple{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.print("Enter A Number To Print Pattern:- ");
   int  a = input.nextInt();
    pa1(a);
    pa2(a);
    pa3(a);
    pa4(a);
  
  }  
  public static void pa1(int a) {
    System.out.println("Pattern 1 ");
       for(int i = 1; i<= a; i++){
      for(int j = 1; j<=a; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    }

  public static void pa2(int a){
     System.out.println("Pattern 1 ");
    for(int i = 1; i<= a; i++){
      for(int j = 1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    }
  public static void pa3(int a){
     System.out.println("Pattern 3 ");
    for(int i = 1; i<= a; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
    }
    public static void pa4(int a){
     System.out.println("Pattern 3 ");
    for(int i = 1; i<= a; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
    }

  
}
