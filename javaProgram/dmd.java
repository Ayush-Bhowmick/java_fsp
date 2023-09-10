 class parent{
	 void display(){
	System.out.println("this is aparent class method ");
	}
		}
	
class child1 extends parent{
		void display(){
 		System.out.println(" this is child class method" );
		}
	}
class child2 extends parent{
		void display(){
 		System.out.println(" this is child2 class method" );
			}

		}


	class DMD{
		public static void main(String args[]){
		parent p=new parent();
		p.display();
		child1 ob1=new child1();
		child2 ob2=new child2();
		ob1.display();
		ob2.display();
	p=ob1;//the object child1 has been refere by parent reference var ob
		p.display();
		p=ob2;
		p.display();
}
}