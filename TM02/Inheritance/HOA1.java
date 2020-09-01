class Animal
{
   void eat()
   {
      System.out.println("eat Method of Animal class is called");
   }
   
   void sleep()
   {
      System.out.println("sleep method of Animal class is called");
   }
}

class Bird extends Animal
{
   @Override
   void eat()
   {
      System.out.println("eat Method of Bird class is called");
   }
   
   @Override
   void sleep()
   {
      System.out.println("sleep method of Bird class is called");
   }
   
   void fly()
   {
      System.out.println("fly method of Bird class is called");
   }
}

class HOA1
{
   public static void main(String[] args)
   {
      Animal animal = new Animal();
      animal.eat();
      animal.sleep();
      
      Bird bird = new Bird();
      bird.eat();
      bird.sleep();
      bird.fly();
   }
}