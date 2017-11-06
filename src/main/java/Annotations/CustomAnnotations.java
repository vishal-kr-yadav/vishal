package Annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;

//Creating annotation  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotations{
	int value();
}
//Applying annotation  
class Hello{
	@MyAnnotations(value=10)
	public void sayHello() {
		System.out.println("in class Hello");
	}
}

//Accessing annotation  
public class CustomAnnotations {

	public static void main(String[] args) throws Exception {
		Hello h=new Hello();
		Method m=h.getClass().getMethod("sayHello");  
		MyAnnotations manno=m.getAnnotation(MyAnnotations.class); 
		System.out.println("value is ="+manno.value());
		
	}

}


//marker Annotation(no value)
//single value Annotations
//multi valued Annotations

