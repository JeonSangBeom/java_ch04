package lecture;

public class Circle02 {
	int radius;
	String name;
	//constructor === ������
	//�����ڴ� ���� Ÿ���� ���� - �ڱ� �ڽ��� �����̴�
	//�������Լ� (�޼���� Ŭ������ �̸��� ���ƾ� �Ѵ�.)
	//������ �ۼ��� �����ϴ�. (�����ε�)
	//new �� ���� ��ü�� �����ɶ� �ѹ� ȣ�� ����(�ʱ�ȭ)
	//���� �Ʒ�ó�� ������ ���� ������ �����Ϸ��� �ڵ����� �ϳ� ���� ���� �ִ´�. (default ������)
	public Circle02() { //�����ڴ� Ŭ���� ���Ӱ� ���ƾ��Ѵ�
		radius = 1;
	}

	public Circle02(int r, String n) {
		radius= r;
		name = n;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
