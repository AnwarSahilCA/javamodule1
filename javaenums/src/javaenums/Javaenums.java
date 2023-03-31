package javaenums;

public class Javaenums {
	public static void main(String[] args) {
		DayofWeek day=DayofWeek.TUESDAY;
		System.out.println(day.getName());
		switch(day)
		{
		case MONDAY:System.out.println("work hard");
					break;
		case TUESDAY:System.out.println("work HARD MORE");
		break;
		case WEDNESDAY:System.out.println("work work little more");
		break;
		case THURDSAY:System.out.println("work more weekend is coming");
		break;
		case FRIDAY:System.out.println("weekend arrived");
		break;
		}
		
	}

}
