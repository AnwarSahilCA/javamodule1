package userdefined;

public class reverse {

	public static void main(String[] args) {
		double a=131.131;
		String str=a+"";
		System.out.println(str);
		String str1=str.replaceAll("\\.","");
		StringBuilder st=new StringBuilder(str1);
		st.reverse();
		System.out.println(st);
		boolean bool=str1.equals(st.toString());
		System.out.println(bool);
		int b=10; 
		String s=new String("10");
		Integer integer=new Integer("10");
		int m=Integer.parseInt(s);
		//from integer to string
		String s2=integer.toString();
		integer=s2.intValue();
		
		
		
		// TODO Auto-generated method stub

	}

}
