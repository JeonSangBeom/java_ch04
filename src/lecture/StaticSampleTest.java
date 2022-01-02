package lecture;
//static 설명
public class StaticSampleTest {

	public static void main(String[] args) {
		StaticSample st01;
		StaticSample st02;
		st01 = new StaticSample();
		st01.n = 5;
		st01.g();
		//static = 전역 변수, 전역 메서드
		System.out.println("st01 m=="+StaticSample.m);
		st02 = new StaticSample();
		st02.n= 1000;
		st02.f();
		System.out.println("st01 m=="+StaticSample.m);
		System.out.println("st02 m=="+StaticSample.m);
	}
}
