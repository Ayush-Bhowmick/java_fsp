
//write a prog to display passing of val btw classes and sum and avg

class Test1{
    int a,b;//instance variable
         Test1(int x, int y){ /parameterised constructor
            a=x;
           b=y;
     
}

             void display(){
                 System.out.println("the values are " + a + " " + b+" ");
        
                  }
}
class Test2{
                public static void main (String[] args){
                    Constructor1 ob= new Constructor1(40,50);                      
                    //is called automatically
                         ob.display();
 
          }
  }
