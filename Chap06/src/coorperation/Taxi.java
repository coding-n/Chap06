package coorperation;

public class Taxi {
	int taxiId;			// �ý� ������ȣ
	String companyName; // ȸ�� �̸�
	int money; 			// �ý� ����

	//�ý� ������ȣ�� ȸ�� �̸��� �Ű� ������ ���� ������
	public Taxi(int taxiId, String companyName) {
		this.taxiId = taxiId;
		this.companyName = companyName;
	}

	public void take(int money) {	//�ý� ����� ���� ź��.
		this.money += money;		//�ý� ���� ����
	}

	public void printTaxiInfo() {
		System.out.println(companyName + taxiId +" �ý� ������ " + money + "�Դϴ�.");
	}
}
