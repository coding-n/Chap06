package coorperation.q5;

public class StarCoffee {
	int money; // 수입 금액

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == 4000) {
			return "별다방 아메리카노를 구입했습니다.";
		} else if (money == 4400) {
			return "별다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	}

}

