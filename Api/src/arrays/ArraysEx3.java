package arrays;

import java.util.Arrays;
import java.util.Comparator;
//찾는 변수 자리 조회 Arrays
public class ArraysEx3 {
public static void main(String[] args) {

int arr3 []= {15,21,15,32,54,87,12,};
//54숫자가 몇번째에 있는지 조회 for문으로  

for (int i = 0; i < arr3.length; i++) {
	if(arr3[i]==54) {
		System.out.println(i+1+"번째 찾았음");
		break;
	} 
}
System.out.println();
//Arrays로 찾기 
Arrays.sort(arr3);
System.out.println(Arrays.toString(arr3));
int pos = Arrays.binarySearch(arr3, 54);//binarySearch:이진검색(정렬이 되어있는걸 전제로사용가능) 
System.out.println(pos+1+"번째 찾았음");






}
}

