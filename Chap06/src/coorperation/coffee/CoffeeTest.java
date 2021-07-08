package coorperation.coffee;

public class CoffeeTest {
	public static void main(String[] args) {

		Person kim = new Person("Kim", 6000);
		StarCoffee starCoffee = new StarCoffee();
		kim.buyStarCoffee(starCoffee, 4000);
		kim.buyStarCoffee(starCoffee, kim.money);
		
		Person yoon = new Person("Yoon", 5500);
		BeanCoffee beanCoffee = new BeanCoffee();
		yoon.buyBeanCoffee(beanCoffee, 4500);
		yoon.buyBeanCoffee(beanCoffee, yoon.money);

	}
}
