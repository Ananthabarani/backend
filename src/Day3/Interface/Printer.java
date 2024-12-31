//Create two interfaces Printer with a method print() and Scanner with a method scan().
//Create a class AllInOne that implements both interfaces.
package Day3.Interface;

  interface Printer {
    void print();
}
interface Scanner1  {
    void scan1();
}
class AllInOne implements Printer,Scanner1{
  public   void print(){
        System.out.println("hi");
    }
    public  void scan1(){
        System.out.println("bye");
    }
      public static void main(String[] args) {
      AllInOne allInOne=new AllInOne();
      allInOne.print();
      allInOne.scan1();
    }
}