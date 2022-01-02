package lecture;
//private 설명
public class SampleTest {

	public static void main(String[] args) {
		System.out.println(Sample.d);//클래스로 접근한 생성자는 위에서도 사용 가능하다
		Sample sample = new Sample(); //static을 선언한 함수를 불러올땐 클래스 처럼 생성자가 필요하다
	}

}
