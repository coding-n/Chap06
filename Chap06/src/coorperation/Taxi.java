package coorperation;

public class Taxi {
	int taxiId;			// 택시 고유번호
	String companyName; // 회사 이름
	int money; 			// 택시 수입

	//택시 고유번호와 회사 이름을 매개 변수로 갖는 생성자
	public Taxi(int taxiId, String companyName) {
		this.taxiId = taxiId;
		this.companyName = companyName;
	}

	public void take(int money) {	//택시 요금을 내고 탄다.
		this.money += money;		//택시 수입 증가
	}

	public void printTaxiInfo() {
		System.out.println(companyName + taxiId +" 택시 수입은 " + money + "입니다.");
	}
}
