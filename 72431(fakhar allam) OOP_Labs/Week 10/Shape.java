import java.util.Scanner;
class Shap{
    void draw(){
        System.out.println("Drawing Shape");
    }
    double calculateArea(double h, double r){
        System.out.println("Area is calclating");
        return 0;
    }
}
class Circle extends Shap{
    void draw(){
        super.draw();
        System.out.println("Shape of the Circle");
    }
}

class Cylinder extends Shap{
    double calculateArea(double h, double r){
        return 2*3.14*r*(h+r);
    }
}

class Exe{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Shap s;
        
        s= new Circle();
        s.draw();
        
        s= new Cylinder();
        System.out.print("Enter radius : ");
        double r= in.nextDouble();
        System.out.print("Enter height: ");
        double h=in.nextDouble();
        System.out.println("Area of the cylinder: "+s.calculateArea(h,r));
        in.close();
    }
}