
// this class uses Box4
class BoxDemo4 {
	public static void main(String args[]) {
	
	// declare, allocate, and initialize Box4 objects
		Box4 mybox1 = new Box4(10, 20, 15);
		Box4 mybox2 = new Box4(3, 6, 9);
		double vol;
	
	// get volume of first box
	vol = mybox1.volume();
	System.out.println("Volume is " + vol);
	
	// get volume of second box
	vol = mybox2.volume();
	System.out.println("Volume is " + vol);
	}
}
