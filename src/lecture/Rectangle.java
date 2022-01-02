package lecture;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {//생성자 함수를 만든다
		System.out.println("사각형이 만들어 졌습니다.");
	}
	
	public int getArea() {
		return width*height;
	}
}
