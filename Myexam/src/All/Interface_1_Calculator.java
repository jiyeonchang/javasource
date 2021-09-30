package All;

public class Interface_1_Calculator implements Interface {
    int add(int num1 ,int num2) {
    
    int addednum = num1+ num2;
    return addednum;
    
    }

	@Override
	public void info() {
 		System.out.println("Calculator Info");
	}
 
}
