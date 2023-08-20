import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hrs, salBruto,salNeto, sal=5000;
        System.out.println("Ingrese el total de horas trabajadas:");
        hrs=input.nextInt();
        salBruto= (hrs*sal);
        double reten=(12.5*salBruto)/100;
        salNeto= salBruto-(int)reten;
        System.out.println("Su salario es: $"+salBruto);
        System.out.println("la retencion de fuente sera de: $"+(int)reten);
        System.out.println("por lo que su salario neto sera de: $"+salNeto);
    }
}
