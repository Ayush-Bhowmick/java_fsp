class test{
    int a,b;//instance variable
         void input(){
            a=10;
           b=20;
}
             void display(){
                 System.out.println("the values are " + a + " " + b);
                  }
}
class test2{
                public static void main (String[] args){
                    test ob= new test();
                         ob.input();
                         ob.display();
          }
  }
