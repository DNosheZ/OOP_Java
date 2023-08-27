import java.util.Scanner;
public class TrianguloEquilatero {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la longitud del lado del triangulo: ");
        double lado = input.nextDouble();
        Perimetro perim=new Perimetro(lado);
        Altura alt= new Altura(lado);
        Area ar=new Area(lado);

        System.out.println("Perimetro: " + perim.calPerimetro());
        System.out.println("Altura: " + alt.calAlt());
        System.out.println("Area: " + ar.calAr());
        input.close();
    }
}
