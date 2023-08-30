import java.util.Scanner;
class salaryForSellers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioA,salarioB,salarioC;
        System.out.println("Ingrese el importe de ventas del depto A");
        double ventasA=input.nextDouble();
        System.out.println("Ingrese el importe de ventas del depto B");
        double ventasB=input.nextDouble();
        System.out.println("Ingrese el importe de ventas del depto C");
        double ventasC=input.nextDouble();
        System.out.println("Ingrese el valor del salario general");
        double salario=input.nextDouble();
        double ventasTotales=ventasA+ventasB+ventasC;
        if(ventasA>=(ventasTotales*0.33)){
            salarioA=salario*1.2;
        }else{
            salarioA=salario;
        };
        if(ventasB>=(ventasTotales*0.33)){
            salarioB=salario*1.2;
        }else{
            salarioB=salario;
        };
        if(ventasC>=(ventasTotales*0.33)){
            salarioC=salario*1.2;
        }else{
            salarioC=salario;
        };
        System.out.println("El salario para todo el depto A es de $"+salarioA);
        System.out.println("El salario para todo el depto B es de $"+salarioB);
        System.out.println("El salario para todo el depto C es de $"+salarioC);
    }
}
