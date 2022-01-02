package lecture;

public class CircleTest { //보통 클래스와 실행 함수를 이렇게 따로 만들어 사용한다
	
	static void increase(Circle circle) { // static은 stack의 값을 받아 쓸 수 없기 때문에 미리 static이라는 것을 정의 해 두어야 한다
		circle.radius++;
	}
	// 객체를 할당하면 레펀런스 참조, 기본타입의 변수는 복사된다.
	public static void main(String[] args) {
		Circle pizza = new Circle();  //객체 생성  (memory)  heap
		pizza.name="새우피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은 "+pizza.name+"이고 반지름은 "+pizza.radius+"이고 면적은 "+area+"이다");
		
		increase(pizza); // static이 stack값을 받아 올때 위에 따로 static를 거론 하여야 하고 그렇게 됐을때 이텔릭체로 표현이 된다
		System.out.println("pizza.radius==="+pizza.radius);
		
		
		
		Circle donut = new Circle();
		donut.name = "던킨";
		donut.radius = 10;
		double area02 = donut.getArea();
		System.out.println("도넛의 이름은 "+donut.name+"이고 반지름은 "+donut.radius+"이고 면적은 "+area+"이다");
		
		Circle02 circle02 = new Circle02();
		//circle02.radius= 20; / circle 클래스에 따로 값이 정의가 되어 있지 않을 경우 따로 값을 정해 두어야만 작동한다
		double area03 = circle02.getArea();
		System.out.println(area03);
		
		Circle02 circle03 = new Circle02(50,"바퀴"); // 50, "바퀴"중요 클래스에 정의한 매개변수와 위치가 같아야한다
		double area04 = circle03.getArea();
		System.out.println(area04+"==="+circle03.name);
		
		
		Circle won ; //객체는 복사가 아닌 참조(ex)값의 링크를 가져온다/하나의 정의만 되어 있다)를 하기 때문에 아래 값을 하나를 바꾸면 모든게 따라 같이 바뀌어 진다 
		won = pizza;
		won.name = "동그라미";
		System.out.println(won.name+"===="+pizza.name);
		
		int num = 3; //기본 타입(인트 더블 스트링 등)은 복사가 되어 값을 도출한다
		int copyNum = num;
		copyNum=4;
		System.out.println(num+"==="+copyNum);
		
		
		Circle circleArray[] = new Circle[5]; //Circle(또는 int같은)타입은 앞뒤 맞춰줘야 한다
		
		for(int i=0;i<5;i++) {
			circleArray[i] =  new Circle(i+1);// Circle(i+1) radious가 1부터 시작
			System.out.println(circleArray[i].getArea());
		}
	}
}
