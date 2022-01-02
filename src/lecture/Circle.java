package lecture;

public class Circle {
	int radius;  // 속성, properties, field, member field
	String name;
	
	public Circle() {//생성자 함수
		System.out.println("원이 생성되었습니다.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() { //double = 소수점이 있어 사용
		return radius*radius*3.14;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle(); //객체 생성->메모리에 올리겠다는 뜻(heap영역 (메모리의 영역은 세개가 있다 static heap stack 등)
		pizza.name ="새우피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은 "+pizza.name+"이고 반지름은 "+pizza.radius+"이고 면적은 "+area+"이다");
	}
}






