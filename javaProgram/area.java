


class func_overloaded{
  int area;



	void area(int x){
	    area= x*x;
	}
	void area(int x,int y){
	    area= x*y;
	}                  
	
	
	void display(){
                 System.out.println("the values are  " +area);
        
                  }

}
class test2{
                public static void main (String[] args){
                func_overloaded ob1= new func_overloaded();      
	  func_overloaded ob2= new func_overloaded();      
	 
	ob1.area(5);
                   ob2.area(5,4);
                    ob1.display();
	 ob2.display();
          }
  }
