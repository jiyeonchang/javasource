package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
   //현재 날짜 알아보기 
		Date date = new Date();
		System.out.println(date);
		
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currtime = LocalTime.now();
		System.out.println(currtime);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 E dd일 hh시 mm분 ss초 ");
		System.out.println(sdf.format(date));
		

	}

}
