//write a prog to display passing of val btw classes

class test{
    int a,b;//instance variable
         void input(int x, int  y){
            a=x;
           b=y;
}
             void display(){
                 System.out.println("the values are " + a + " " + b);
                  }
}
class test2{
                public static void main (String[] args){
                    test ob= new test();
 test ob2= new test();
                         ob.input(20,40);
                     ob2.input(120,400);
                         ob.display();
 ob2.display();
          }
  }
