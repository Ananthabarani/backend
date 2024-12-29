package Day2;

public class Car {
     String brand;
     String model;
      double price;
 void Display(){
     System.out.println("Brand :"+ brand +" "+ "Model : "+ model +" " + "Price :"+price);
 }
 void discount(int discount){
     double finalprice=price-(price*discount/100);
     System.out.println(finalprice);
 }

    public static void main(String[] args) {
        Car car=new Car();
        car.brand="BMW";
        car.model="B6";
        car.price= 400000.00;
       car.Display();
       int discount=10;
       car.discount( discount);
    }
}
