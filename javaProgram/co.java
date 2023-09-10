


class co{
  int a, b;


	co(){
	   a=20;
	b=40;
	}
	co(int x){
	    a=x;
	b=180;
	}
	 co(int x,int y){
	  a=x;
	b=y;
	}                  
	
	
	void display(){
                 System.out.println("the values are  " +a+"  " + b);
        
                  }

}
class test2{
                public static void main (String[] args){
                     co ob1= new co(50,80);      
	 co ob2= new co(50);      
	 co ob3= new co();     
	ob1.display();
                   ob2.display();
                    ob3.display();
	
          }
  }
