
class parent{ //Parent Class
              int a=10;
b=30;
	
                }
 void display() 
{
	int c=a+b;
System.out.println( "The value of  = "  +c );
	
}
  class child extends parents{
void disp(){
		super.disp();//calling the method display from parent class
		int d=a*b;
		
		System.out.println( "The value of a= "   +d );
	}
}
class si{
                public static void main (String a[]){
                   
                   child ob= new child();   
//CREating object to class C to call all values of func and variable from all parent
	ob.disp();
	
                }
  }