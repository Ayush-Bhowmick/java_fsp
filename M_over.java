
class parent{ //Parent Class
              int a=10;
              int b=30;            
 void disp() 
{
	int c=a+b;
System.out.println( "The value of  = "  +c );
	
}
}
  class child extends parent{
                  void disp(){
		super.disp();//calling the method display from parent class
		int d=a*b;
		
		System.out.println( "The value of d= "   +d );
	}
}
class si{
                public static void main (String a[]){
                   
                   child ob= new child();   
//CREating object to class C to call all values of func and variable from all parent
	ob.disp();
	
                }
  }