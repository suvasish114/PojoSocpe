package com.example.PojoScope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cart")
@Scope("prototype")
public class Cart {
	private List<String> item = new ArrayList<String>();
	
	// getter and setters
	public List<String> getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item.add(item);
	}
}
