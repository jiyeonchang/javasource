package shopexample;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String seluser;

	private Product[] carts = new Product[10];

	private User user[] = new User[2];

	private Product[] product = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		user[0] = new User("홍길동", PayType.CARD);
		user[1] = new User("이롱이", PayType.CASH);

	}

	@Override
	public void genproduct() {
		product[0] = new SmartTv("삼성", 1000, " 10");
		product[1] = new SmartTv("해동", 2000, " 20");
		product[2] = new SmartTv("강성", 3000, " 30");
		product[3] = new CellPhone("동해", 1000, "kt");
		product[4] = new CellPhone("인해", 2000, "ky");
	}

	@Override
	public void Start() {
		System.out.println("====================");
		System.out.println(title + " Myshop : 메인화면 - 계정 선택 ");
		System.out.println("====================");

		for (int i = 0; i < user.length; i++) {
			System.out.printf("[%d] %s (%s)\n", i, user[i].getname(), user[i].getPaytype());
		}
		System.out.println("[x]종료 ");
		System.out.println("선택 :");
		
		String input = sc.next();
		System.out.println("###" + input + "###");
		
		
		switch (input) {
		case "x":
			System.exit(0);
			break;

		default:
			seluser = input;
			productList();
			break;
		}

	}

	private void productList() {
		System.out.println(title + "상품 목록 - 상품선택");
		System.out.println("=========================");

		for (int i = 0; i < product.length; i++) {
			System.out.printf("[%d]", i);
			product[i].printDetail();
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택: ");

		String input = sc.next();

			switch (input) {
			case "h": Start();
			

				break;
			case "c": checkOut();

				break;

			default:
				for (int i = 0; i < carts.length; i++) {
					if(carts[i]==null) {
						carts[i] =product[Integer.parseInt(input)];
					}
				}
				productList();
				break;
			}
		}
	

	private void checkOut() {
		System.out.println("##c선택##");
		System.out.println(title+": 체크아웃");
		System.out.println("=================");
		int total = 0;
for (int i = 0; i < carts.length; i++) {
	if(carts[i]!=null) {
		System.out.printf("[d] %s (%d)\n",i , carts[i].getPname(),carts[i].getPrice());
	total+=carts[i].getPrice()	;
	
	
	}
	
	System.out.println("========================");
	System.out.println("결제방법"+user[Integer.parseInt(seluser)].getPaytype());
	System.out.println("합계 :"+total);
	System.out.println("[p]이전[q]결제 완료");
	System.out.println("선택:");
	
	String input = sc.next()	;
	switch (input) {
	case "p":
		productList();
		break;

	default:System.out.println("시스템종료 합니다");
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}		
	}
}
