package problem1a;

 class Cube extends Shape3{
	 double a;

	 public Cube(double a) {
		 this.a = a;
	 }
 
	   @Override
	    public double volume() {
	        return a * a * a;
	    }

	    @Override
	    public double surfaceArea() {
	        return 6 * a * a;
	    }

	    @Override
	    public String getShapeType() {
	        return "Cube";
	    }
 
 
 }
 
 
