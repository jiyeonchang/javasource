package b0913;

public class Dropship extends Unit {
 void load() {}
 void upload() {}
 
	@Override
	void move(int x, int y) {
		   System.out.printf("%d,%d지점으로 이동",x,y);
	}

}
