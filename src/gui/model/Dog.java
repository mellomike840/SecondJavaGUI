package gui.model;

public class Dog
{
	private String sound;
	
	public Dog()
	{
		
	}
	
	public Dog(String sound)
	{
		this.sound = "woof";
	}
	
	public String getSounda()
	{
		return sound;
	}
	
	public String toString()
	{
		String description = "I am a dog ";
		return description;
	}
	
	

}
