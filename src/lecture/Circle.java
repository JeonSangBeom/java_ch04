package lecture;

public class Circle {
	int radius;  // �Ӽ�, properties, field, member field
	String name;
	
	public Circle() {//������ �Լ�
		System.out.println("���� �����Ǿ����ϴ�.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() { //double = �Ҽ����� �־� ���
		return radius*radius*3.14;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle(); //��ü ����->�޸𸮿� �ø��ڴٴ� ��(heap���� (�޸��� ������ ������ �ִ� static heap stack ��)
		pizza.name ="��������";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("������ �̸��� "+pizza.name+"�̰� �������� "+pizza.radius+"�̰� ������ "+area+"�̴�");
	}
}






