package inheritance;

public class BonusPointAccount extends Account2{
private int bonusPoint;


public BonusPointAccount(String accountNo, int balance, String name,int bonusPoint) {
	super(accountNo, balance, name);
this. bonusPoint= bonusPoint;

}


@Override
	void deposit(int amount) {//예금하다 + 에금액의 보너스 포인트 0.1%

		super.deposit(amount);
	
	bonusPoint += amount *0.001;
	}
public int getBounusPoint() {
	return bonusPoint;
}
}
