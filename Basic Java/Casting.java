public class Casting {
  public static void main(String[] args) {

    // implicit type casting (small into big)
    System.out.println("\nimplicit type casting \n");
    long num = 8;
    System.out.println("The Conersion of Intenger into long : " + num);
    System.out.println("Type Of variable of num is : " + ((Object) num).getClass().getSimpleName());
    float num1 = 3234L;
    System.out.println("The Conersion of Float into flaot : " + num1);
    double num3 = 2.34f;
    System.out.println("The Conersion of Double into flaot : " + num3 + "\n");

    // Explicit type casting (Big into samll)
    System.out.println("Explicit type casting \n");
    int a1 = (int) 123L;
    System.out.println("The Conversion Of Long into int : " + a1);
    long a2 = (long) 3.45f;
    System.out.println("The Conversion Of float into long : " + a2);
    int a3 = (int) 3.546f;
    System.out.println("The Conversion Of float into int : " + a3);
    System.out.println();

  }

}
