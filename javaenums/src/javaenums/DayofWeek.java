package javaenums;

public enum DayofWeek {
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURDSAY("Thursday"),
	FRIDAY("Friday");
	 private String a;

	 DayofWeek(String a) {
		 this.a=a;
	 }
	 public String getName() {
	 return a;
	 }

}
