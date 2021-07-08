package coorperation.q5;

public class Person {
	String name;	// �̸�
	int money;		// ���� ��

	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// ���ٹ� Ŀ�Ǹ� ��� ������ �޼���
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.buyingCoffee(money);	// Ŀ�Ǹ� ������ ���		
		if (message != null && money >= 4000) {
			this.money -= money;
			System.out.println(name + "���� " + money + "������ " + message);
		} else {
			this.money -= money;
			message = "���� �����Ͽ� �Ƹ޸�ī�븦 ���� ���� �����~ �Ф�";
			System.out.println(name + "���� " + money + "������ " + message);
		}
	}
	
	// ��ٹ� Ŀ�Ǹ� ��� ������ �޼���
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.buyingCoffee(money);		
		if (message != null && money >= 4500) {
			this.money -= money;
			System.out.println(name + "���� " + money + "������ " + message);
		} else {
			this.money -= money;
			message = "���� �����Ͽ� ���׸� ���� ���� �����~ �Ф�";
			System.out.println(name + "���� " + money + "������ " + message);
		}
	}	
}

