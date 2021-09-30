
public class school14 {

	public static void main(String[] args) {
//2중 arr
//	행과열을 길이 출력하는법 
	
	int arr[][]={
		{45,55},
		{65,95,85},
		{78,88,88},
	};
	
	System.out.println("행의길이"+arr.length);
	System.out.println("열의길이"+arr[0].length);
	System.out.println("열의길이"+arr[1].length);
	System.out.println("열의길이"+arr[2].length);


	for(int i= 0; i<arr.length;i++) {//행의 길이 
		for(int j= 0; j<arr[i].length;j++) {//열의길의 
			System.out.printf("%d",arr[i][i]);
		
	}
	System.out.println();
	}
	}
}

