package Test;//126교재

import java.io.IOException;

public class WhileTest3 {

	public static void main(String[] args) throws IOException {

boolean run = true ;
 int keycode = 0 ,speed = 0 ;

 while(run) {//()안에 true 를 넣고 진행해도 돌아간다 결국 안에값이 true인지 false인지 판단하기 때문
	 if (keycode!=13&& keycode !=10 ) {//13-> CR은 복귀, 가장 맨 처음으로 돌아가는 역할을 하며
//		 && ->LF :엔터 
	 System.out.println("=============");
	 System.out.println("1. 종속 | 2. 감속 | 3. 중지 ");
	 System.out.println("=============");
	 System.out.println("선택");
	 }
	 keycode =System.in.read();//1번누르면 나에게 49가 돌아옴(고정값임)
	 if(keycode ==49) {//아스키코드표
		 speed++;
		 System.out.println("현재속도 ="+speed);
		 }else if (keycode ==50) {
			 speed--;
			 System.out.println("현재속도 ="+speed);
		 }else if (keycode==51) {
			 run = false; 
		 }
 } 
 System.out.println("프로그램 종료");
		 
		 
		 
	 
run =false; 

}

}
