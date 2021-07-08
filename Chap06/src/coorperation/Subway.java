package coorperation;

public class Subway {
	String lineNumber;		//호선
	int money;				//수입
	int passengerCount;		//승객 수
	
	//호선을 매개 변수로 갖는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += 1500;
		this.passengerCount++;
	}
	
	public void printSubwayInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount 
				+ "명 이고, 수입 금액은 " + money + "원입니다.");
	}
}
