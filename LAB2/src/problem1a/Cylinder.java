package problem1a;

 class Cylinder extends Shape3 {
	double  height;
	double  radius;
	
	public Cylinder(int height, int radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double volume() {
		return Math.PI *  height * radius * radius;
		
	}
	public double surfaceArea() {
		return 2 * Math.PI * radius * (height + radius);
	}
	
	public String getShapeType() {
		return "Cylinder";
	}
}
