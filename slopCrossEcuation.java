import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese x1");
        double x1 = input.nextDouble();
        System.out.println("Ingrese y1");
        double y1 = input.nextDouble();

        System.out.println("Ingrese x2");
        double x2 = input.nextDouble();
        System.out.println("Ingrese y2");
        double y2 = input.nextDouble();

        cross crs=new cross(x1, x2, y1, y2);
        slop slp=new slop(crs.A(),crs.B(),x1,y1);
        System.out.println("El valor de A es: "+crs.A());
        System.out.println("El valor de B es: "+crs.B());
        System.out.println("El valor de C es: "+slp.C());
        input.close();
    }
}
