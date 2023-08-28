import java.util.Scanner;
public class pagoMatricula {
    public static void main(String[] args) throws Exception {
        double pago;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su numero de inscripcion:");
        int inscripcion =input.nextInt();
        System.out.println("ingrese el nombre del estudiante:");
        input.nextLine();
        String nombre=input.nextLine();
        System.out.println("ingrese su patrimonio:");
        double patrimonio=input.nextDouble();
        System.out.println("ingrese el estrato social al que pertenece:");
        int estrato=input.nextInt();
        if(estrato>3 && patrimonio>2000000){
            pago=50000+(patrimonio*0.03);
        }else{
            pago=50000;
        };
        System.out.println("Numero de inscripcion: "+inscripcion);
        System.out.println("Nombres: "+nombre);
        System.out.println("Pago de matricula: $"+pago);
        input.close();
    }
}
