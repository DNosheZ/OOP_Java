import java.util.Scanner;
class weightBallsDifference {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String dif="",pesaje="";
        System.out.println("Ingrese el peso de la pelota A: ");
        double pesoA=input.nextDouble();
        System.out.println("Ingrese el peso de la pelota B: ");
        double pesoB=input.nextDouble();
        System.out.println("Ingrese el peso de la pelota C: ");
        double pesoC=input.nextDouble();
        System.out.println("Ingrese el peso de la pelota D: ");
        double pesoD=input.nextDouble();
        if((pesoA==pesoB)&&(pesoB==pesoC)){
            pesaje="D";
            if(pesoA>pesoD){
                dif="El peso de la pelota D es menor";
            }else{
                dif="El peso de la pelota D es mayor";
            };
        }else if((pesoA==pesoB)&&(pesoB==pesoD)){
            pesaje="C";
            if(pesoA>pesoC){
                dif="El peso de la pelota C es menor";
            }else{
                dif="El peso de la pelota C es mayor";
            };
        }else if((pesoA==pesoC)&&(pesoC==pesoD)){
            pesaje="B";
            if(pesoA>pesoB){
                dif="El peso de la pelota B es menor";
            }else{
                dif="El peso de la pelota B es mayor";
            };
        }else if((pesoB==pesoC)&&(pesoD==pesoC)){
            pesaje="A";
            if(pesoB>pesoA){
                dif="El peso de la pelota A es menor";
            }else{
                dif="El peso de la pelota A es mayor";
            };
        };
        System.out.println("Entre las tres pelotas, la pelota "+pesaje+" es distinta el resto en peso");
        System.out.println(" ");
        System.out.println(dif);
    }
}
