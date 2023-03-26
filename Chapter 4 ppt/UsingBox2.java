
// this class uses class Box
class UsingBox2 {
public static void main(String args[]) {
	Box2 mybox1 = new Box2();
	Box2 mybox2 = new Box2();
	double vol;

	// initialize each box
	mybox1.setDim(10, 20, 15);
	mybox2.setDim(3, 6, 9);

	// get volume of first box
	vol = mybox1.volume();
	System.out.println("Volume is " + vol);
    System.out.println("Volume is " + mybox1.volume());
	// get volume of second box
	vol = mybox2.volume();

	System.out.println("Volume is " + vol);
	}
}

