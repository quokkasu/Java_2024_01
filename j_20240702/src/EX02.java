import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EX02 {
	public static void main(String[] args) {
		 
		//336 page
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss E a");
		System.out.println(sf.format(now));
		
		//339 page
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해 년도 : " + today.get(Calendar.YEAR));
		System.out.println("이번 달 : " + (today.get(Calendar.MONTH)+1));
		System.out.println("년도 기준 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자 : " + today.get(Calendar.DATE));
		System.out.println("일자 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도 기준 날짜 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 (일:1) ~ (토:7) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//400 page
		Calendar today2 = Calendar.getInstance();
		System.out.println("오전(0) 오후(1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간 (0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간 (0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초 (0~59) : " + today.get(Calendar.SECOND));
		System.out.println("밀리초 (0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TIMEZONE (12~12) : " + today.get(Calendar.ZONE_OFFSET) / ( 60*60*1000));
		System.out.println("이 달의 마지막 날짜 : " + today.get(Calendar.DATE));
		
		Calendar cal = Calendar.getInstance();
		//달을 출력할 때는 ((today.get(Calendar.MONTH)+1)와 같이 MONTH+1 해주고
		// setting 할 때는 cal.set(2024, (7-1  ), 2)에서 (7-1) 과 같이 1을 빼 줌
		cal.set(2024, (7-1), 12);
		System.out.println("날짜 : " + cal.get(Calendar.YEAR) + "년 " +
																	 (cal.get(Calendar.MONTH)+1) + "월 " +
																	 cal.get(Calendar.DATE) + "일 ");
		
		System.out.println("=============================================");
		
		//현재 일
		int cYear = 2024;
		int cMonth = 7;
		int cDay = 2;
		
		//이전 일
		int pYear = 2024;
		int pMonth = 6;
		int pDay =  21;
		
		Date cd = new Date();
		Date pd = new Date();
		
		cd.setYear(cYear);
		cd.setMonth(cMonth-1);
		cd.setDate(cDay);
		
		pd.setYear(pYear);
		pd.setMonth(pMonth-1);
		pd.setDate(pDay);
		
		System.out.println("cd.getTime() : " + cd.getTime());
		System.out.println("pd.getTime() : " + pd.getTime());
		
		long temp = (cd.getTime() - pd.getTime()) / (1000L * 60 * 60 * 24);
		int differentDay = (int)temp;
		
		System.out.println("경과한 날짜 : " + differentDay + " 일");
		
		System.out.println("=============================================");
		
		Calendar currentDay = new GregorianCalendar(cYear, cMonth+1, cDay);
		Calendar pastDay = new GregorianCalendar(pYear, pMonth+1, pDay);
		
		long differentSecond = (currentDay.getTimeInMillis() - pastDay.getTimeInMillis()) / 1000;
		long differentDay2 = differentSecond / (60*60*24);
		
		System.out.println(differentDay2 + " 일이 지났습니다");
	}
}
