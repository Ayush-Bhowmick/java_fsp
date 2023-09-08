
class A{ //Parent Class
              int x,y;            
               A(int a, int b) {
	x=a;
	y=b;	
	}

 	 void disp1(){
	System.out.println( "The value of x & y=  "  +x + "  " + y );
	}
}
  class B extends A{
	int c,d;      
                  B(int p, int q,int r, int s){
		super(p,q);
		c=r;
		d=s;
	}
	  void disp2(){
		System.out.println( "The value of c & d=  "  +c + "  " + d );
		}

}
class si{
                public static void main (String a[]){
                   
               B ob= new B(10, 20, 30, 40);   
//CREating object to class C to call all values of func and variable from all parent
	ob.disp1();
	ob.disp2();
                }
  }
