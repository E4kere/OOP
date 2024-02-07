package problem1a;

import java.util.*;


public class Test {
	public static void main(String [] args) {
		Vector<Shape3> shapes = new Vector<>();

		shapes.add(new Cylinder(4, 7));
		shapes.add(new Sphere(3));
		shapes.add(new Cube(7));
	
		for (Shape3 shape : shapes) {
			System.out.println(shape.volume());
			System.out.println(shape.surfaceArea());
			System.out.println(shape.getShapeType() + "\n");
		}
		
		
	}
}
