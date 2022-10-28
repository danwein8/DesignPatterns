package Singelton;
/**
 * Singleton design pattern class example, only creates a single instance of the object when the constructor is
 * called then returns pointers(references) to that instance every time the constructor is called after that
 * @author Daniel Weiner
 *
 */
public class Singleton 
{
	
	private static Singleton single_instance = null;
	
	public Object one;
	
	private Singleton() 
	{
		one = new Object();
	}
	
	public static Singleton getInstance()
	{
		if (single_instance == null) single_instance = new Singleton();
		
		return single_instance;
	}
}
