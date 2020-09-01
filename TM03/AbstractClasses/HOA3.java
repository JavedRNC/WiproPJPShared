abstract class Instrument
{
	abstract String play();
}

class Piano extends Instrument
{
	String play()
	{
		return "Piano is playing tan tan tan tan";
	}
}

class Flute extends Instrument
{
	String play()
	{
		return "Flute is playing toot toot toot toot";
	}
}

class Guitar extends Instrument
{
	String play()
	{
		return "Guitar is playing tin tin tin";
	}
}

class HOA3
{
	public static void main(String[] args)
	{
		Instrument[] instrument = new Instrument[10];
		for(int i=0;i<10;i++)
		{
			int x = (int)((Math.random()*((3-1)+1))+1);
			if(x==1)
				instrument[i] = new Piano();
			else if(x==2)
				instrument[i] = new Guitar();
			else if(x==3)
				instrument[i] = new Flute();
			else
				System.exit(0);
		}
		
		for(Instrument ins:instrument)
		{
			System.out.println(ins.play());
		}
      
      for(int i=0;i<instrument.length;i++)
      {
         if(instrument[i] instanceof Flute)
			{  
				System.out.println("instrument["+i+ "] is instance of Flute");
			}				
			else if(instrument[i] instanceof Guitar)
			{
				System.out.println("instrument["+i+ "] is instance of Guitar");
			}
			
			else if(instrument[i] instanceof Piano)
			{
				System.out.println("instrument["+i+ "] is instance of Piano");
			}
         System.out.println();
      }
	}


}