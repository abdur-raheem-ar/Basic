package eve;

public class AbstractDemo1 {
	public static void main(String[] args) {
		DominoPizza dominos = new IndianDominoPizza();
		dominos.makePizza();
		dominos.deliverPizza();
		dominos.collectMoney();
	}
}

abstract class DominoPizza {
	final private void makeDough() {
		System.out.println("Making dough...");
	}
	final private void addIngredients() {
		System.out.println("Adding ingredients...");
	}
	final private void bakePizza() {
		System.out.println("Baking pizza...");
	}
	final public void makePizza() {
		System.out.println("Started making pizza...");
		makeDough();
		addIngredients();
		bakePizza();
		System.out.println("Pizza ready...");
	}
	abstract public void deliverPizza();
	abstract public void collectMoney();
}

class IndianDominoPizza extends DominoPizza {
	@Override
	public void deliverPizza() {
		System.out.println("Deliver pizza...");
	}
	@Override
	public void collectMoney() {
		System.out.println("Collect money...");
	}
}