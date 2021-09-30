package ClassTest;

public class Card {
	//멤버변수
   private String kind; //카드모양지정
   private int number ; //카드 숫자 지정 
    
//    int width=10;
//    int height=7;
    
   //클래스 변수
    static int width =10;
    static int height = 7 ;
    //static (정적):클래스에 고정된 멤버,객체들을 생성하지않고 사용     
// heap에 저장하면 값이 다를수있는데 아에 빼내고 static에 만들면 전부 동일한 값가능 
//		클래스가 메모리에 로드될때 생성 
    public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
		//static 메소드 : 객체를 생성하지 않고 사용 
//		클래스가 메모리에 로드될때 생성 
	//static 메서드 안에서 (일반 멤버변수)인스턴스 멤버 사용 불가 
		//같은 static은 가능 
		//Static 사용되는곳 : 멤버변수 ,메서드 ,초기화블럭
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

//	public static int getWidth() {
//		return width;
//	}
//
//	public static int getHeight() {
//		return height;
//	}
    
    
}
