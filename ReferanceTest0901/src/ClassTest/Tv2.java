package ClassTest;

public class Tv2 {
	//속성 -생성자 -매소드 순으로 하는게 암묵적 룰 
	String color; //red ,blue, black 
	boolean power; //on ,off
	int channel;
	
	//생성자 :목적 객체 생성시 사용 ,멤버변수 초기화 ,객체 생성할 때 필요한 사전 작업 처리  
	Tv2(){
		//괄호 안에 아무것도 없는것을 default(기본) 생성자 
		//명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러가 자동으로 만들어냄 
	}
	Tv2(String color, int channel  ){
		
		this.color = color ;//this는 객체 자신을 말한다 (내가 가지고 있는 속성) 
		this.channel = channel ;
		//두개부터는 오버로딩 (여러 생성자를 만드는것) 
	}
	
	
	
	
	//속성(필드,멤버변수,프로퍼티) =>색상,전원상태 ,채널
//	String color; //red ,blue, black 
//	boolean power; //on ,off
//	int channel;
	
	//동작(메소드) =>채널변경하다/전원을 켜다 /끄다 
//	(==함수 )특정작업을 수행하는 여러 줄의 문장을 하나로 묶은것 
	//메소드의 목적 : 재사용성, 중복된 코드제거 , 프로그램 구조화 
	
	
	void channelUp () {
			//ChannelU가 해야하는 작업 작성 
		//현재 채널이 7번이=>8,9로 가야함 
		channel++;
		
		
	}
	void ChannelDown() {
		channel--;
	}
	void power () {
		//power 가 해야하는 작업 on => off
		power = !power;
		
	}
}
