import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el peso de la pelota A: ");
    int A = input.nextInt();
    System.out.print("Ingrese el peso de la pelota B: ");
    int C = input.nextInt();
    System.out.print("Ingrese el peso de la pelota C: ");
    int C = input.nextInt();
    int max = A;
    if (B > max) {
      max = b;
    }else if (C > max) {
      max = c;
    }
    System.out.println("La pelota de mayor peso es: " + max);
  }
}
