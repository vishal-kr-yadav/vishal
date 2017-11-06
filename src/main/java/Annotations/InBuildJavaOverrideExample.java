package Annotations;

class A
{
	@Deprecated
	public void method1()
	{
		System.out.println("A in m1");
	}
}
class B extends A{
	//@Override
	public void method1()
	{
		System.out.println("B in m2");
	}
}
	public class InBuildJavaOverrideExample {
		public static void main(String args[])
		{

	A obj=new A();
	obj.method1();
		}
	}

	
//By giving @Override annotation ,it means if you forget to override the same method it will throw some error.
	//@SuppressWarnings
	//Deprecated will show cut in the method .But it will execute that the method