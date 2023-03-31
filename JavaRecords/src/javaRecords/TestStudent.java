package javaRecords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Integer> johnGrades=new ArrayList<>();
		johnGrades.add(80);
		johnGrades.add(90);
		johnGrades.add(70);
		Student john=new Student("john",123,johnGrades);
		List<Integer> sarahGrades=new ArrayList<>();
		sarahGrades.add(50);
		sarahGrades.add(55);
		sarahGrades.add(62);
		Student sarah=new Student("sarah",456,sarahGrades);
		System.out.println(john.getAverageGrade());
		System.out.println(sarah.hasPassingGrade());
		HashMap map=new HashMap();
		add();
		
		// TODO Auto-generated method stub

	}

	private static void add() {
		int a=10;
		int b=25;
		if(a==10)
			
		System.out.println("a is 10");
	}

}
