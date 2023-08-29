import java.util.Scanner;
public class discountBalls {
    public static void main(String[] args) {
        double dcto = 0.0;
        double pago=0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto de compra: ");
         double compra=input.nextDouble();
        System.out.println("Ingrese en MAYUSCULAS el color de la bola tomada por el comprador: ");
        input.nextLine();
        String color = input.nextLine();
        
        if (color.equalsIgnoreCase("BLANCO")) {
            dcto = 0;
        } else if (color.equalsIgnoreCase("VERDE")) {
            dcto = 0.1;
        } else if (color.equalsIgnoreCase("AMARILLO")) {
            dcto = 0.25;
        } else if (color.equalsIgnoreCase("AZUL")) {
            dcto = 0.5;
        } else if (color.equalsIgnoreCase("ROJO")) {
            dcto = 1;
        } else {
            System.out.println("Seleccion invalida de color");
        };
        pago =compra-(compra*dcto);
        
        System.out.println("El comprador ha de pagar " + pago);
    }
}
