package MyPractice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
//  다음은 - do - while 과 switch문을 써서 작성해보기 
		// 질문 하기 : ????
		
		
		
//		논리형 결합연산자 문제 만들어서 풀어보자 !
//	조건은 상대에게 입력값을 랜덤으로 받아서 입장 할수 있는 티켓을 만들어보겠습니다 ㅏㅏ
//		배운거 다써봐야징 
//		3번까지 예제쓰기 
//스캐너 받음
		Scanner sc = new Scanner(System.in);
// 랜덤 주사위 1~3까지 받음 
		int a = (int) (Math.random() * 4) + 1;
		//  int 맞네  
		// 안내 멘트침

// 손님한테 번호 받고 주사위 돌려서 맞으면 출력 , 아니면 재가동 기회는 3번 
	// 당첨되면 뽑기 멈추기 하고싶은데 안됨 출력도 잘 안됨 
	for (int i = 1; i < 4; i++) {
		
		System.out.println("어서오세요 랜덤뽑기 입니다.");
		System.out.println("행운의 숫자 1,2,3번중에서 하나를 입력해 주세요 ");
		int b = sc.nextInt();
			if (b == 1 && b == a) {
				System.out.printf("당첨입니다 !\n 뽑은번호 :%d %d\n",b,a);
			} else if (b == 2 && b == a) {
				System.out.printf("꽝입니다 !\n 뽑은번호 :%d %d\n",b,a);
			} else if (b == 3 && b == a|| a!=b) {

				System.out.printf("꽝입니다 !\n 뽑은번호 :%d %d\n",b,a);

			}

		}System.out.println( );
	}
}

// 정상 구동 하네요!! 좀더 예쁘게 꾸미고 마무리 짓겠습니다.
//혼자서 문제 만드는것도 어려어여 






