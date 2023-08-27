import java.lang.Math;
public class Altura {
    double lado;
    Altura(double lado){
        this.lado=lado;
    };
    double calAlt(){
        return Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2)) ;
    }
}
