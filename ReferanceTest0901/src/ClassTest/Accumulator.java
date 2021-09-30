package ClassTest;

public class Accumulator {
static {
	try {
		Class.forName("");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}  //위에전부 초기화 블럭

int total = 0; 
static int grandTotal=0;
void accumulate (int amount	) {
	total +=amount;
	grandTotal +=amount;//static으로 생성된것 부름 가능 
}


}
