package array;

public class TestMain02 {

	public static void main(String[] args) {
//중간에 수를 추가 하고 싶어지면 ?
		
		int oldArr[] = {10,20,30};
		int newArr[] = new int[4];
		
		//기존값을 새로운 곳으로 복사 
//-----------		
//		for (int i = 0; i < newArr.length; i++) {
//			newArr[i]=oldArr[i];
//		}
		//------------
		
		//자바가 정해준 소스 
		System.arraycopy(oldArr,0,newArr,0,oldArr.length);
		//뭘옮길지 /몇번부터 / 뭐를 / 어디까지 
		
		newArr[3]=40;
		for(int i : newArr) {
			
			System.out.println(i+" ");
			
		}
	}

}
