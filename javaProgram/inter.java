interface i1{
	 void display1();
		}
interface i2{
	 void display2();	
		} 

		 class Inter implements i1 , i2{
	public void display1(){
	 System.out.println(" display for interface");
	}
		
	
	public void display2(){
	 System.out.println(" display for interface2");
	}
		
}		
	class Interx{
		public static void main(String args[]){
		i1 ob1 = new Inter(); //craeting abj fr class inter and assignning  it to interfacei1
		ob1.display1();
		i2 ob2 = new Inter();//craeting abj fr class inter and assignning  it to interfacei1
		ob2.display2();		
}
}