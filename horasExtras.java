import java.util.Scanner;
public class Empleado {
    public static void main(String[] args) throws Exception {
        double salario;
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador");
        String nombre=input.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas por "+nombre);
        int horasTr=input.nextInt();
        System.out.println("Ingrese el valor de hora de trabajo");
        double valorHr=input.nextDouble();
        if(horasTr>40){
            double horasExtra=horasTr-40;
            if (horasExtra>8){
                salario=(40*valorHr)+(16*valorHr)+((horasExtra-8)*3*valorHr);
            }else{
                salario=(40*valorHr)+(horasExtra*2*valorHr);
            }
        }else{
            salario=horasTr*valorHr;
        };
        System.out.println("El trabajador "+nombre+" devengo $"+salario);
        input.close();              
    }   
}
