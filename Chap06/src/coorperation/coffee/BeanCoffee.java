package coorperation.coffee;

public class BeanCoffee {
	int money; // 금액

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == Menu.BEAN_AMERICANO) {
			return "콩다방 아메리카노를 구입했습니다.";
		} else if (money == Menu.BEAN_LATTE) {
			return "콩다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	}

}

