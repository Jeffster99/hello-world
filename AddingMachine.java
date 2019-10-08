package cse360assign2;

public class AddingMachine 
{

	private int total;
	//private int x = 5, y = 10;
	String history = "0";
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	public int getTotal () 
	{
		return 0;
	}
	public void add (int value) 
	{
		total += value;
		history = history + " + " + value ;
	}
	public void subtract (int value) 
	{
		total -= value;
		history = history + " - " + value;
	}
	public String toString () 
	{
		return history;
	}
	public void clear() 
	{
		return ;
	}
}

