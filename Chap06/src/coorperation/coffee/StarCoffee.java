package coorperation.coffee;

public class StarCoffee {
	int money; // �ݾ�

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == Menu.STAR_AMERICANO) {
			return "���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if (money == Menu.BEAN_LATTE) {
			return "���ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	}

}

