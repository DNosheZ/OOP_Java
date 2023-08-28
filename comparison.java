import java.util.Scanner;
public class comparison {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el valor de A");
        double A =input.nextDouble();
        System.out.println("ingrese el valor de B");
        double B=input.nextDouble();
        if(A < B){
            System.out.println(B+" es mayor que "+A);
        }else if( A>B ){
            System.out.println(A+" es mayor que "+B);
        }else{
            System.out.println(A+" es igual a "+B);
        };
        input.close();
    }
}
