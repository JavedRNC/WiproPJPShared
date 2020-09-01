class Fruit
{
	String name;
	String taste;
	int size;
	void setSize(int size)
	{
		this.size = size;
	}
	
   void setTaste(String taste)
   {
      this.taste = taste;
   }
   	
   void setName(String name)
   {
      this.name = name;
   }   
   
	void eat()
	{
	System.out.println("Name of fruit: " + name + " and taste: " + taste +  " and size is: " + size);
	}
}

class Apple extends Fruit
{
   
	@Override
	void eat()
	{
		System.out.println("Name of fruit: Apple and taste: sweet and size is: " + size);
	}
}

class Orange extends Fruit
{	
	@Override
	void eat()
	{
	System.out.println("Name of fruit: Orange and taste: sour and size is: " + size);
	}
}

class HOA1
{
	public static void main(String[] args)
	{
		Fruit f = new Fruit();
      f.setName("Guava");
      f.setTaste("Sour");
      f.setSize(95);
		f.eat();
		Apple apple = new Apple();
		apple.setSize(90);
		apple.eat();
		Orange orange = new Orange();
		orange.setSize(99);
		orange.eat();
	}
}