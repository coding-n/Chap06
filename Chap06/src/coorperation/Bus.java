package coorperation;

public class Bus {
	int busNumber;		//버스 번호
	int money;			//수입
	int passengerCount;	//승객 수
	
	//버스 번호를 매개 변수로 갖는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//버스가 승객(학생)을 태우는 메서드
	public void take(int money) {
		this.money += 1000;		//학생이 낸 요금을 수입으로 증가
		this.passengerCount++;	//승객 수 증가
	}
	
	
	public void printBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, "
				+ "수입은 " + money + "원입니다.");
	}
}
