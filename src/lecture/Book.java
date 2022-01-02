package lecture;

public class Book {
	//����� �۰�
	String title;
	String author; //�Ӽ� �ΰ� ����(������ ����)
	
	
	private String  name;
	private int age;
	private String address; //�ܺο��� �����ؼ� �� �� ���� (�ڱ� �ڽŸ� ���) //alt+shift+s -> getter and setter�� �̿��Ͽ� ���� ������ �־�� ��� ����
	
	//public (��ü ���� ����)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {//�޼��� ���� ����������-����Ÿ��-�̸�-�Ű�����
		this.name = name; //this�� ���� ��ܿ� ��ġ(��Ģ)
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

	public Book() { // ����Ʈ ������ ����
		this("notitle","noname"); // �ȿ� �ƹ��͵� ���ٴ� ��
		System.out.println("������ ȣ���...");
	}
	
	public Book(String title) {  //������ ���� ���� (�տ� ���������ڴ� �ǹ�)
		this.title = title;
		author = "���ڹ̻�";
	}
	public Book(String title, String author) { //�Ű������� Ÿ���� ������ ���� �߻� 
		this.title = title; //this.-Ŭ���� �ڽ��� ����Ų�� / �Ǵ� title�տ� '_'�� �ٿ� �д�(�Ű������� ������ ������ �򰥸��� �ʰ� �ϱ� ���� ���)
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("å������ "+title+"�̰� �۰��� "+author+"�Դϴ�.");
	}
	public void methodTest(int m) {
		System.out.println(++m);
	} 
}









