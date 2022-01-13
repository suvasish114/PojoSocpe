package com.example.PojoScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    public static void main( String[] args ){
    	context.scan("com.example.PojoScope");
    	context.refresh();
        
    	String item1 = context.getBean("item1", String.class);
    	String item2 = context.getBean("item2", String.class);
    	String item3 = context.getBean("item3", String.class);
    	
    	Cart cart1 = context.getBean("cart", Cart.class);
    	Cart cart2 = context.getBean("cart", Cart.class);
    	
    	cart1.setItem(item1);
    	cart1.setItem(item2);
    	
    	cart2.setItem(item3);
    	
    	System.out.println("Cart1 items: "+cart1.getItem());
    	System.out.println("Cart2 items: "+cart2.getItem());
    }
}
