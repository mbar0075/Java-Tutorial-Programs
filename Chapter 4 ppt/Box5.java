
class Box5 {
		double width;
		double height;
		double depth;
		
	// This is the constructor for Box.
	Box5(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
