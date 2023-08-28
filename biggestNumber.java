import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double mayor;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        double num1 =input.nextDouble();
        System.out.println("ingrese el segundo numero:");
        double num2 =input.nextDouble();
        System.out.println("ingrese el tercer numero:");
        double num3 =input.nextDouble();
        if((num1>num2)&&(num1>num3)){
            mayor=num1;
        }else {
            if(num2>num3){
                mayor=num2;
            }else{
                mayor =num3;
        }};
         System.out.println("El mayor de los tres numeros ingresados es: "+mayor);
        input.close();
    }
}
