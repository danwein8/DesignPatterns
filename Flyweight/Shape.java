package Flyweight;
/**
 * Shape Interface made for the purpose of demonstrating
 * a Flyweight factory example
 */

import java.awt.Color;
import java.awt.Graphics;

/**
 * An example for the factory class
 *
 */
public interface Shape 
{

	public void draw(Graphics g, int x, int y, int width, int height, Color color);
	
}