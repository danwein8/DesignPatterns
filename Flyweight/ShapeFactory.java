package Flyweight;
/**
 * ShapeFactory Class made for the purpose of demonstrating
 * a Flyweight factory example
 */

import java.util.HashMap;

/**
 * An example of the fly weight factory design pattern, instantiates random shape and line objects then draws them
 *
 */
public class ShapeFactory 
{

	private static final HashMap<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape>();

	public static Shape getShape(ShapeType type) 
	{
		Shape shapeImpl = shapes.get(type);

		if (shapeImpl == null) {
			if (type.equals(ShapeType.OVAL_FILL)) 
			{
				shapeImpl = new Oval(true);
			} 
			else if (type.equals(ShapeType.OVAL_NOFILL)) 
			{
				shapeImpl = new Oval(false);
			} 
			else if (type.equals(ShapeType.LINE)) 
			{
				shapeImpl = new Line();
			}
			shapes.put(type, shapeImpl);
		}
		return shapeImpl;
	}
	
	public static enum ShapeType
	{
		OVAL_FILL,OVAL_NOFILL,LINE;
	}
}