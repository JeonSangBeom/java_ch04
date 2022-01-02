package lecture;

public class Book {
	//제목과 작가
	String title;
	String author; //속성 두개 생성(정의한 변수)
	
	
	private String  name;
	private int age;
	private String address; //외부에서 공유해서 쓸 수 없다 (자기 자신만 사용) //alt+shift+s -> getter and setter을 이용하여 따로 생성해 주어야 사용 가능
	
	//public (전체 공유 가능)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {//메서드 형식 접근지정자-리턴타입-이름-매개변수
		this.name = name; //this는 제일 상단에 배치(규칙)
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book() { // 디폴트 생성자 생성
		this("notitle","noname"); // 안에 아무것도 없다는 뜻
		System.out.println("생성자 호출됨...");
	}
	
	public Book(String title) {  //생성자 세개 생성 (앞에 접근제어자는 의무)
		this.title = title;
		author = "작자미상";
	}
	public Book(String title, String author) { //매개변수의 타입이 같으면 에러 발생 
		this.title = title; //this.-클래스 자신을 가리킨다 / 또는 title앞에 '_'를 붙여 둔다(매개변수와 정의한 변수를 헷갈리지 않게 하기 위해 사용)
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("책제목은 "+title+"이고 작가는 "+author+"입니다.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
	} 
}









