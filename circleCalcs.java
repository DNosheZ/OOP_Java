import java.lang.Math;
import java.util.Scanner;
public class circleCalcs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double ratio, area, circ;
        System.out.println("Ingrese el radio del circulo a analizar: ");
        ratio=input.nextInt();
        area=Math.PI *Math.pow(ratio, 2);
        circ=2*Math.PI*ratio;        
        System.out.println("El area de su circulo es de: "+area);
        System.out.println("La circunferencia de su circulo es de: "+circ);
        input.close();
    }
}
