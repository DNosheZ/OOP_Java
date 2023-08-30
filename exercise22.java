import java.util.Scanner;
class exercise22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre=input.nextLine();
        System.out.println("Ingrese el salario basico por hora del empleado: ");
        double salBasico=input.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas por el empleado en el mes: ");
        int horas=input.nextInt();
        System.out.println("Empleado: "+nombre);
        if((salBasico*horas)>450000){
            System.out.println("Salario mensual: $"+salBasico*horas);
        };
    }
}
