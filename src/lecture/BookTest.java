package lecture;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		//Book slamdunk = new Book(); -> 오류 발생 클래스 안에 생성자를 하나라도 정의를 해둔상태에서는 디폴트로 생성이 안된다
		//생성자 오버로딩 
		Book noTitleBook = new Book(); // 아무것도 호출않을 시 북에 공백으로 처리한 값이 호출된다
		
		System.out.println(noTitleBook.author);
		Book littlePrince = new Book("어린왕자","생떽쥐베리");
		//littlePrince.author = "Sang DDaggi"; / 나중에 속성을 밑에서 바꿔서 쓸수 있다
		System.out.println(littlePrince.title+"==="+littlePrince.author);
		Book chunHyangJun = new Book("춘향전");
		System.out.println(chunHyangJun.title+"==="+chunHyangJun.author);
		
		Book bookList[] = new Book[3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<bookList.length;i++) {
			System.out.println("제목을 쓰세요.");
			String title = scanner.nextLine(); //nextLine 띄어쓰기 가능한 줄 단위로 받을 떄 사용
			System.out.println("저자를 입력하세요.");
			String author = scanner.nextLine();
			bookList[i] = new Book(title,author);
		}
		for(int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n = 10;
		bookList[2].methodTest(n);
		System.out.println("n값은 11로 바뀌었을까요?==="+n); // 답은 10으로 나온다
		scanner.close();
	}

}





