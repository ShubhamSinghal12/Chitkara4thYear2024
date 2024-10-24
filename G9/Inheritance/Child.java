package Inheritance;

public class Child extends Parent{
	
	public void fun()
	{
		System.out.println("In Child");
	}
	
	@Override
	public String toString()
	{
		return "Hello, I am a Child";
	}

}
