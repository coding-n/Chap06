package coorperation.q5;

public class BeanCoffee {
	int money; // ���� �ݾ�

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == 4100) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if (money == 4500) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	}

}

