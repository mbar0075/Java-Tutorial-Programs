// Objects are passed by reference.
class By_Ref {
	int a, b;
	
	By_Ref(int i, int j) {
		a = i;
		b = j;
  }
  
  // pass an object
void meth(By_Ref o) {
	o.a *= 2;
	o.b /= 2;
	}
}
