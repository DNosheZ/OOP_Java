import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Cual es la edad de Juan?");
        double juan=input.nextDouble();
        double alberto=(2*juan)/3;
        double ana=(4*juan)/3;
        double mama=(ana+alberto+juan);
        System.out.println("La edad de juan es: "+juan);
        System.out.println("La edad de Ana es: "+ana);
        System.out.println("La edad de Alberto es: "+alberto);
        System.out.println("La edad de la mama de los tres es: "+mama);
        input.close();
    }
}
