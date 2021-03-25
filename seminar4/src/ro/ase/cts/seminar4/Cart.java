package ro.ase.cts.seminar4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart{

	private static Map<String, Cart> instances = null;
	private String type;
	public ArrayList<String> products;
	
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
	
	public ArrayList<String> getProducts(){
		return products;
	}
}
