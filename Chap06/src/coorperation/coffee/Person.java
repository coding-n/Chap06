package coorperation.coffee;

public class Person {
	String name;
	int money;

	Person(String name, int money) {	// 매개 변수 생성자
		this.name = name;
		this.money = money;
	}
	
	// 별다방 커피를 사는 행위의 메서드
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.buyingCoffee(money);	// 구입한 커피 결과 문장
		
		if (message != null && money >= 4000) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원으로 " + message);
		} else {
			this.money -= money;
			message = "돈이 부족하여 아메리카노를 마실 수가 없어요~ ㅠㅠ";
			System.out.println(name + "님이 " + money + "원으로 " + message);
		}
	}
	
	// 콩다방 커피를 사는 행위의 메서드
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.buyingCoffee(money);
		
		if (message != null && money >= 4500) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원으로 " + message);
		} else {
			this.money -= money;
			message = "돈이 부족하여 라테를 마실 수가 없어요~ ㅠㅠ";
			System.out.println(name + "님이 " + money + "원으로 " + message);
		}
	}	
}

