
//write a prog to display passing of val btw classes and sum and avg

class test{
    int a,b,c,sum,avg;//instance variable
         void input(int x, int  y,int z){
            a=x;
           b=y;
     c=z;
}
void calc(){
       sum=a+b+c;
avg=(a+b+c)/3;
}
             void display(){
                 System.out.println("the values are " + a + " " + b+" "+ c);
               System.out.println("the sum value is  " + sum);
               System.out.println("the avg value is " + avg);
             
                  }
}
class test2{
                public static void main (String[] args){
                    test ob= new test();
 
                         ob.input(20,40,30);
                     ob.calc();
                         ob.display();
 
          }
  }
