abstract class parent{
	abstract void display1();
		
	void display2( ){//normal method
 		System.out.println(" Testing for abstract class ");
	}
}
class child extends parent{
		void display1(){
 		System.out.println(" this body is provide by child class" );
}
void display3(){
 		System.out.println("  child " );
}
}

	class abst{
		public static void main(String args[]){
		child ob=new child();
		ob.display1();
		ob.display2();
		ob.display3();
}
}