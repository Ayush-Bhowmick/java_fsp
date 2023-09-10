
class A{ //Parent Class
              int a=50;
	int b=40;
                }
 class B extends A //inheritence of class A
{
	int c=a+b;
	void disp(){
		System.out.println( "The value of a = "  +a );
		System.out.println( "The value of b= "   +b );
		System.out.println( "The value of c= "   +c );
	}
}
  class C extends B //C IS GRAND CHILD
{
int d=a*b;
	void disp(){
	System.out.println( "The value of d= "   +d );
	}
}
class si{
                public static void main (String a[]){
                   
                   B ob= new B();   C ob2= new C();
//CREating object to vlass C to call all values of func and variable from all parent
	ob.disp();
	ob2.disp();
                }
  }