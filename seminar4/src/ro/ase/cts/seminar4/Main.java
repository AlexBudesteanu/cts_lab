package ro.ase.cts.seminar4;

public class Main {

	public static void main(String[] args) {
		Cart shoppingCart = Cart.getInstance("shoppingCart");
		Cart wishList = Cart.getInstance("wishList");

		shoppingCart.getProducts();
		wishList.getProducts();
		
		
		
		EagerShoppingCartExample example = EagerShoppingCartExample.INSTANCE;
		EagerShoppingCartExample example2 = EagerShoppingCartExample.INSTANCE;
		
		if(example == example2) {
			System.out.println("obiectele sunt identice");
		}
		
		SingletonEnum mySingleton = SingletonEnum.INSTANCE;
		mySingleton.getProducts();
	}

}
