class test{
    int a,b,c;//instance variable
         void input(){
            a=10;
           b=20;
}
           void calc(){
                   c=a+b;
}
             void display(){
                 System.out.println("the values are " + c);
                  }
}
class test2{
                public static void main (String[] args){
                    test ob= new test();
                         ob.input();
                         ob.calc();
                         ob.display();
          }
  }
