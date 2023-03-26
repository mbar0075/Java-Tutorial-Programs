
class Box7 {
	double width;
	double height;
	double depth;
	
	// construct clone of an object
	Box7(Box7 ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	Box7(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box7() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}

	// constructor used when cube is created
	Box7(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
