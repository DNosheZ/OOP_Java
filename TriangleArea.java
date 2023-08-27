import java.lang.Math;
public class TriangleArea {
    double ladoA, ladoB, ladoC, SemPer;
    Area(double ladoA, double ladoB, double ladoC, double SemPer){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        this.SemPer=SemPer;
    };
    double Ar(){
        return Math.sqrt(SemPer*(SemPer-ladoA)*(SemPer-ladoB)*(SemPer-ladoC));
    }
}
