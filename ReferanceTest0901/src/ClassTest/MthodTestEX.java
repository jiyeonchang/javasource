package ClassTest;

public class MthodTestEX {

	public static void main(String[] args) {
		MthodTest1 obj = new MthodTest1();

		
		//메소드 호출-메소드 호출시 리턴되는값이 있는경우 
		//print()
		//리턴되는 값 받기 
		
		System.out.println(obj.isRedirect());
		
		//리턴되는 값 받기 
		boolean result = obj.isRedirect();
		//result를 이용해서코드 작성 
		int var1= obj.sum();
        System.out.println( obj.add(25,35));	

	
	
	}

}
