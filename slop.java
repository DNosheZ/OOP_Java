public class slop {
    double A,B,x1,y1;
    slop(double A, double B,double x1,double y1){
        this.A=A;
        this.B=B;
        this.x1=x1;
        this.y1=y1;
    };
    double C(){
        return -A*x1-B*y1;
    }
}
