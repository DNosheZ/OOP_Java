public class cross {
    double x1,x2,y1,y2;
    cross(double x1,double x2,double y1,double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    };
    double A(){
        return y1-y2;
    };
    double B(){
        return x1-x2;
    };
}
