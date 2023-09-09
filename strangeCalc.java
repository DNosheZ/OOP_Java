public class App {
    public static void main(String[] args) throws Exception {
        double Suma=0;
        double X=20;
        Suma= Suma+X;
        double Y=40;
        X=X+Math.pow(X,2);
        Suma=Suma + X/Y;
        System.out.println("El valor de la suma es: "+Suma);
    }
}
