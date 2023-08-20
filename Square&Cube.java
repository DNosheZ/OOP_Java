import java.lang.Math;
import java.util.Scanner;
public class sqCb {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number, sq, cb, square=2, cube=3;
        System.out.println("Ingrese el numero a operar: ");
        number =input.nextInt();
        sq=Math.pow( number,square);
        cb=Math.pow(number, cube);
        System.out.println("El cuadrado de "+(int) number+" es: "+(int) sq);
        System.out.println("El cubo de "+(int) number+" es: "+(int) cb);
        input.close();
    }
}
