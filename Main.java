class FourWheelers
{
   public void display()
   {
    System.out.println("FourWheelers displayed");
   }
   public void get()
  {
  System.out.println("Get FourWheelers");
  display();
  }
}
class Car extends FourWheelers
{
  public void display()
  {
  System.out.println("Cars displayed");
  super.display();
  }
 /* public void get(){
    System.out.println("Get Car");

  }*/
}
class Main{
  public static void main(String [] args)
 {
  FourWheelers f=new Car();
 // FourWheelers f1=new FourWheelers();
  f.get();
 // f1.get();
 }
 
}