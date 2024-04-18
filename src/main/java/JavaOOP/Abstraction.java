package JavaOOP;

public class Abstraction {
    public static void main(String[] args){
        Circles circle = new Circles(5);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: "+ circle.perimeter());

        Rectangles rectangle = new Rectangles(4,6);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangles:  "+ rectangle.perimeter());
    }
}

abstract class Shapes{
    abstract double area();
    abstract double perimeter();
}
class Circles extends Shapes{
    double radius;

    Circles(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
    @Override
    double perimeter(){
        return 2* Math.PI * radius;
    }
}

class Rectangles extends Shapes{
    double length;
    double width;

    Rectangles(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
    @Override
    double perimeter(){
        return 2*(length + width);
    }
}
