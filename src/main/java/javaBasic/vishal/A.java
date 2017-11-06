package javaBasic.vishal;

//static method in interface
 interface Istatic {
	static void show() {
		System.out.println("hi");
	}
}

interface ByUsingDefaultKeyword{
	default void print()
	{
		System.out.println("in default method");
	}
	default void print2()
	{
		System.out.println("java");
	}
}
class Test implements ByUsingDefaultKeyword {
	@Override
	public void print() {
		System.out.println("hiiiii");
	}
	
 }
 class A extends Test implements Istatic,ByUsingDefaultKeyword{
	 public static void main(String args[]) {
		 //calling a static method from the interface
		 //Istatic.show();
		 
		 //class has more power than interface
		 ByUsingDefaultKeyword test=new Test();
		 //test.print();
		 test.print2();
		 //obj=new ByUsingDefaultKeyword();
		 
		 
		 
	 }
 }
 