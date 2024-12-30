package Day3;

abstract class Shape {
abstract double calculateArea(double r);
    abstract double calculateArea(int a,int b);

}
class Circle extends Shape{
    @Override
    double calculateArea(double r){
      return r*r;
    }

    @Override
    double calculateArea(int a, int b) {
        return 0;
    }
}
class Rectangle extends Shape{
    @Override
    double calculateArea(int l,int b){
        return l*b;
    }

    @Override
    double calculateArea(double r) {
        return 0;
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        System.out.println(circle.calculateArea(3.3));
        System.out.println(rectangle.calculateArea(2,6));
    }
}


