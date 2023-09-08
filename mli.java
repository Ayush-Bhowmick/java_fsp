
class A{ //Parent Class
              int a=50;
                }
 class B extends A //inheritence of class A
{
	int b=a*a;
}
  class C extends B //C IS GRAND CHILD
{
	void disp(){
	System.out.println( "The value of a = "  +a );
	System.out.println( "The value of b= "   +b );
	}
}
class si{
                public static void main (String a[]){
                   
                   C ob= new C();
//CREating object to vlass C to call all values of func and variable from all parent
	ob.disp();
                }
  }