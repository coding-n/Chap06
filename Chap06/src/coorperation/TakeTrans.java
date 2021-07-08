package coorperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas", 5000);
		Bus bus1004 = new Bus(1004);	//1004번 버스가 생성
		tomasStudent.takeBus(bus1004);	//1004번 버스를 토마스 학생이 탄다.
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenLine = new Subway("2호선");
		Student jameStudent = new Student("James", 10000);
		jameStudent.takeSubway(greenLine);//2호선 지하철을 제임스 학생이 탄다.		
		jameStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Student edwardStudent = new Student("Edward", 20000);
		Taxi lightTaxi = new Taxi(2000, "번개운수");
		edwardStudent.takeTaxi(lightTaxi, 10000);
		edwardStudent.printStudentInfo();
		lightTaxi.printTaxiInfo();
	}
}



