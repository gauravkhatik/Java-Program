
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter A Number :-");
        int n = in1.nextInt();
        p1(n);
        p2(n);
        p3(n);
        p4(n);
        p5(n);
        p6(n);
        p7(n);
        p8(n);
        p9(n);
        p10(n);
    }

    /*
*****
*****
*****
*****
*****
     */
    public static void p1(int n) {
        System.out.println("Pttern 1 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
*
**
***
****
     */
    public static void p2(int n) {
        System.out.println("Pttern 2 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
     */
    public static void p3(int n) {
        System.out.println("Pttern 3 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
     */
    public static void p4(int n) {
        System.out.println("Pttern 4 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
*****
****
***
**
*
     */
    public static void p5(int n) {
        System.out.println("Pttern 5 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
123456
12345
1234
123
12
1
     */
    public static void p6(int n) {
        System.out.println("Pttern 6 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *     
    ***    
   *****   
  *******  
 ********* 
***********
     */
    public static void p7(int n) {
        System.out.println("Pttern 7 : ");
        for (int i = 0; i < n; i++) {
            //space 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /*
*********
 ******* 
  *****  
   ***   
    * 
     */
    public static void p8(int n) {
        System.out.println("Pttern 8 : ");
        for (int i = 0; i < n; i++) {
            //space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /*
    *
   **
  ***
 ****
*****
     */
    public static void p9(int n) {
        System.out.println("Pattern 9");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
*
**
***
****
*****
****
***
**
*
     */
    public static void p10(int n) {
        System.out.println("Pattern 10");
        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
