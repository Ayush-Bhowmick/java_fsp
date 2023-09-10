
//write a prog to display passing of val btw classes and sum and avg

class Test1{
    int a,b;//instance variable
         void input(int x, int y){ //parameterised constructor
            a=x;
           b=y;
     
}

             void display(){
                 System.out.println("the values are " + a + " " + b+" ");
        
                  }
}
class Test2{
                public static void main (String[] args){
                    Test1 ob1= new Test1();      
	Test1 ob2= new Test1();  
	ob1.input(20,40);            
	ob2.input(120,400);     
	ob2=ob1;
                    //is called automatically
                    ob1.display();
 	ob2.display();
 
          }
  }
