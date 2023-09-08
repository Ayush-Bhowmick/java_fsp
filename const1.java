
//write a prog to display passing of val btw classes and sum and avg

class Constructor1{
    int a,b;//instance variable
         Constructor1(){
            a=10;
           b=20;
     
}

             void display(){
                 System.out.println("the values are " + a + " " + b+" ");
        
                  }
}
class Main_Num{
                public static void main (String[] args){
                    Constructor1 ob= new Constructor1();                      
                    //is called automatically
                         ob.display();
 
          }
  }
