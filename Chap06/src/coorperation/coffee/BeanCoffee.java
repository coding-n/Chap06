package coorperation.coffee;

public class BeanCoffee {
	int money; // �ݾ�

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == Menu.BEAN_AMERICANO) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if (money == Menu.BEAN_LATTE) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	}

}

