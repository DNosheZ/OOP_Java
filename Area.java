import java.lang.Math;
public class Area {
    double lado;
    Area(double lado){
        this.lado=lado;
    };
    double calAr(){
        return (Math.sqrt(3) / 4) * Math.pow(lado,2);
    };
}
