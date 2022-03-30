package trimester6;
import java.io.*;

abstract class Animal
{
	Animal()
	{
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal
{
	Dog()
	{
		System.out.println("Dog Constructor");
	}
}

public class Abstraction2
{
	public static void main(String []args)throws IOException
	{
		Dog d = new Dog();
	}
}
