package coorperation.q5;

public class StarCoffee {
	int money; // ���� �ݾ�

	public String buyingCoffee(int money) {
		this.money += money;

		if (money == 4000) {
			return "���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if (money == 4400) {
			return "���ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	}

}

