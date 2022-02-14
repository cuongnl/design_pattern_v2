package _1_eagerInitialization;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test {
	public static void main(String[] args) {
//		ClassssA classsa = new ClassssA();
//		classsa.setA1("aaaaaaaaaa1");
//		classsa.setA2("aaaaaaaaaa2");
//		classsa.setA3("aaaaaaaaaa3");
//		Class myClass = classsa.getClass();
//		List<Field> privateFields = new ArrayList<>();
//		Field[] allFields = ClassssA.class.getDeclaredFields();
//		for (Field field : allFields) {
//		    if (!Modifier.isPrivate(field.getModifiers())) {
//		        continue;
//		    }
//		    field.setAccessible(true);
//		    System.out.println(field.getName());
//		  
//	            // get value of the fields
//	            Object value;
//				try {
//					value = field.get(classsa);
//		            System.out.println("Value of Field "
//		                               + " is " + value);
//				} catch (IllegalArgumentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	  
	            String item = "974993063";
	            System.out.println(item.substring(2, item.length()));
	        
		    
//		}
		
	}
}
