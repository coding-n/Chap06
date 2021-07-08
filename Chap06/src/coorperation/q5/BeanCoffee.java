package coorperation.q5;

public class BeanCoffee {
	int money; // 수입 금액

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == 4100) {
			return "콩다방 아메리카노를 구입했습니다.";
		} else if (money == 4500) {
			return "콩다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	}

}

