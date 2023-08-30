import java.util.Scanner;
import java.lang.Math;
class studentEcuation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double A=input.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double B=input.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double C=input.nextDouble();
        if((Math.pow(B,2)-4*A*C)>0){
            double discriminant=Math.sqrt(Math.pow(B,2)-4*A*C);
            double root1=(-B-discriminant)/(2*A);
            double root2=(-B+discriminant)/(2*A);
            System.out.println("La primera posible solucion es x1= "+root1);
            System.out.println("La segunda posible solucion es x2= "+root2);
        }else{
            System.out.println(" ");
            System.out.println("Con los valores ingresados se obtendra soluciones complejas, dificiles de procesar por este programa");
        };
    }
}
