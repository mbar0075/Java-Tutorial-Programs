
   class Box3 {
	double width;
	double height;
	double depth;
	
	// This is the constructor for Box.
	Box3() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
