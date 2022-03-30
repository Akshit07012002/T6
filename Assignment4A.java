package trimester6;

import java.io.*;

abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin tin");
	}
}

public class Assignment4A 
{
	public static void main(String []args)
	{
		Piano p = new Piano(); Flute f = new Flute(); Guitar g = new Guitar();
		p.play();
		f.play();
		g.play();
	}
}
