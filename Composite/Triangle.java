package Composite;

/**
 * Triangle Class made for the purpose of demonstrating the
 * Composite design pattern, this is the Leaf, there can be 
 * multiple Leaf objects. It's job is to be the building blocks
 * for the composites, and it implements the base component.
 *
 */
public class Triangle implements Shape
{

	@Override
	public void draw(String fillColor) 
	{
		System.out.println("Drawing Triangle with color " + fillColor);
	}
	
}
