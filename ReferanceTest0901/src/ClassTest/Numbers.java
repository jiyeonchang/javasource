package ClassTest;

public class Numbers {
	private int num [];

	public Numbers(int[] num) {
		super();//{5,6,7,8,9};
		this.num = num;
	}
	//합계-> 반환값은 int,입력값은 없음 
	// 멤버 변수 num 배열에 들어있는 값의 합계리턴 
int getTotal () {
	
	int sum=0;
	for (int i = 0; i < num.length; i++) {
	sum+=num[i];
	}
	return sum;
	
}
double getAverage() {
	return getTotal()/num.length;
}


	
//평균
}
