package arrays;

import java.util.Arrays;
import java.util.Comparator;
//쉽게 배열 구별하는법 Arrays 사용
//배열 정렬 해줌 sort //여기꺼 새로 다운받아야함 
public class ArraysEx2 {
public static void main(String[] args) {

int arr1[]=  {10,73,2,5,42};
int arr2[]=  {10,73,2,5,41};

System.out.println(Arrays.equals(arr1, arr2)? "같음 ": "다름 ");

System.out.println();

int arr3 []= {13,5,15,32,54,87,12,};
 Arrays.sort(arr3);//오름 차순 Comparator.naturalOrder()
System.out.println(Arrays.toString(arr3));

// Arrays.sort(null, null); //내림차순 sort(T[]a,Comparator<?super?>c)선택해야됨
Integer arr4[]= {45,78,1,23,54,68,55};
Arrays.sort(arr4, Comparator.reverseOrder());//reverseOrder내림차순 
System.out.println(Arrays.toString(arr4));

String strArr[]= {"apple","good","very","height","zero","zoo"};

Arrays.sort(strArr);
System.out.println(Arrays.toString(strArr));//오름 차순 

Arrays.sort(strArr,Comparator.reverseOrder());
System.out.println(Arrays.toString(strArr));//내림  차순 

Character chArr[]= {'ぞ','さ','ぁ','ぇ','け','げ','ず'};
Arrays.sort(chArr);
System.out.println(Arrays.toString(chArr));






}
}

