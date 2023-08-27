import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese cada lado del triangulo, de click en enter y escriba el siguinte hasta tener los 3");
        double ladoA = input.nextDouble();
        double ladoB = input.nextDouble();
        double ladoC = input.nextDouble();
        Perimetro perim = new Perimetro(ladoA, ladoB, ladoC);
        Semiperimetro semiPerim = new Semiperimetro(perim.per());
        Area area = new Area(ladoA, ladoB, ladoC, semiPerim.SemiPer());
        System.out.println("El perimetro del triangulo es: "+perim.per());
        System.out.println("El semiperimetro del triangulo es: "+semiPerim.SemiPer());
        System.out.println("El area del triangulo es: "+area.Ar());
        input.close();
    }
}
