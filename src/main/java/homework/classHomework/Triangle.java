package homework.classHomework;

public class Triangle {

    int a;
    int b;
    int c;
    double area;

    Triangle(){
        System.out.println("Veidoju trīsstūri!" );
    }

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double Area(){
        System.out.println("Trīsstūra laumums: ");
        return (Math.sqrt(((a*a+b*b+c*c)*(a*a+b*b+c*c)) - 2*(a*a*a*a+b*b*b*b+c*c*c*c)))/4;
    }

    public boolean isEquilateral(){

        if (a == b && b == c & c == a){
            return true;
        }else {
            return false;
        }
    }

    public boolean isIsosceles (){

        if (a == b && b != c){
            return true;
        }else {
            return false;
        }
    }

}
