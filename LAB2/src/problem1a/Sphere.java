package problem1a;

class Sphere extends Shape3 {
	double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String getShapeType() {
        return "Sphere";
    }

}
