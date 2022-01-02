package lecture;

public class CurrentConverter {
	private static double rate = 1100; // 고정환율
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKRWon(double dollar) {
		return dollar*rate;
	}
	
	//get or set를 이용하여 환률로 정해둔 private를 변경 할수 있게 해준다
	public static double getRate() {  //읽기 전용
		return rate;  
	}
	public static void setRate(double rate) {//읽기 쓰기 다 가능
		CurrentConverter.rate = rate;
	}
}
