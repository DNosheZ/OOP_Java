public class TrianglePerimetro {
    double ladoA, ladoB, ladoC;
    TrianglePerimetro(double ladoA, double ladoB, double ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    };
    double per(){
        return ladoA+ladoB+ladoC;
    }
}
