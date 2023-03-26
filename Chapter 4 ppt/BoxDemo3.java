// this class uses the Box3 class
class BoxDemo3 {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box3 mybox1 = new Box3(); // new Box3() Box3 is calling the
                                 // constructor of Box3   
        
        Box3 mybox2 = new Box3();
        double vol;
    
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        System.out.println("Volume is " + mybox1.volume());
        
        
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
        }
    }

