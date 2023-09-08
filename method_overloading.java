


class func_overloaded{
  

                     void display(){
                 System.out.println("no arguement" );
        
                  }
	void display(int x){
                 System.out.println("the values are  " + x+" ");
        
                  }
	void display(int x,int y){
                 System.out.println("the values are  " + x + " " + y);
        
                  }
}
class m_overloaded{
                public static void main (String[] args){
                func_overloaded ob1= new func_overloaded();      
	 
	
                    ob1.display(50,60);
 	ob1.display(50);
	 ob1.display();
          }
  }
