package ClassTest;

public class TVclass {

	public static void main(String[] args) {

		
		Tv tv =new Tv();
		System.out.println(tv);
		
		//객체 조작 
		tv.power= true ; //on
		tv.channel= 2; 
		
		tv.channelUp();//3번으로 올라감//메소드 호출 
		System.out.println("채널상태 : "+ tv.channel );
		
	}

}
