
/* Here, Box4 uses a parameterized constructor to
initialize the dimensions of a box4.
*/
	class Box4 {
		double width;
		double height;
		double depth;
		
	// This is the constructor for Box.
	Box4(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
