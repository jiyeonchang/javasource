
public class ColorTV extends TV {
	
	
    private int color;
		
		

	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
		
		
	}

	
	public int getColor() {
		return color;
	}
	

	
	
	public void printproperty ( ) {
		System.out.printf("%d 인치 %d 컬러", getSize(),color);
	}

	
//private void printProperty(ColorTV my) {
//	System.out.println("%d 인치 %d 컬러"myTV.getSize());
//	}
}

