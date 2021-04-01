package ro.ase.cts.seminar6.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.seminar6.builder.Product;

public class Cart{

	private static Map<String, Cart> instances = null;
	private String type;
	public ArrayList<Product> products;
	
	private Cart() {
		products = new ArrayList<>();
	}

	public static synchronized Cart getInstance(String type) {
		if (instances == null) {
			instances = new HashMap<>();
		}
		if(!instances.containsKey(type)) {
			Cart myCart = new Cart();
			myCart.type = type;
			instances.put(type, myCart);
		}
		return instances.get(type);
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
}
