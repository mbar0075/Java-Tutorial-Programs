class OverloadCons2  {
	public static void main(String args[]) {
		// create Box7es using the various constructors
		Box7 myBox1 = new Box7(10, 20, 15);
		Box7 myBox2 = new Box7();
		Box7 mycube = new Box7(7);
		Box7 myclone = new Box7(myBox1);
		double vol;
	
	// get volume of first Box7
	vol = myBox1.volume();
		System.out.println("Volume of myBox1 is " + vol);
	
	// get volume of second Box7
	vol = myBox2.volume();
		System.out.println("Volume of myBox2 is " + vol);
	
	// get volume of cube
	vol = mycube.volume();
		System.out.println("Volume of cube is " + vol);
	
	// get volume of clone
	vol = myclone.volume();
		System.out.println("Volume of clone is " + vol);
	}
}
