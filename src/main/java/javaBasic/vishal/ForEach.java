package javaBasic.vishal;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {

	
		ArrayList<Integer> values=new ArrayList<Integer>();
		values.add(1);
		values.add(5);
		values.add(3);
		
		
//	for(int i:values)
//		{
//			System.out.println(i);
//		}
	values.forEach(i ->System.out.println(i));
	}

}
