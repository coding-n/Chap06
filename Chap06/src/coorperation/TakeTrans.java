package coorperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas", 5000);
		Bus bus1004 = new Bus(1004);	//1004�� ������ ����
		tomasStudent.takeBus(bus1004);	//1004�� ������ �丶�� �л��� ź��.
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenLine = new Subway("2ȣ��");
		Student jameStudent = new Student("James", 10000);
		jameStudent.takeSubway(greenLine);//2ȣ�� ����ö�� ���ӽ� �л��� ź��.		
		jameStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Student edwardStudent = new Student("Edward", 20000);
		Taxi lightTaxi = new Taxi(2000, "�������");
		edwardStudent.takeTaxi(lightTaxi, 10000);
		edwardStudent.printStudentInfo();
		lightTaxi.printTaxiInfo();
	}
}



