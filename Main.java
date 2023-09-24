package p1;

public class Main {

	public static void main(String[] args) {
//		Pizza basePizza = new Pizza(true);
//		
//		//basePizza.getPizzaPrice();
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.takeAway();
//		basePizza.getBill();
		
		
		DeluxPizza dp = new DeluxPizza(true);
//		dp.addExtraCheese();
//		dp.addExtraToppings();
		dp.takeAway();
		dp.getBill();

	}

}
