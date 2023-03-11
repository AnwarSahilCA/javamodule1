package Strings;


public class TestStrings {

	public static void main(String[] args) {
		/*
		byte bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="Welcome to ust GLobal";
		bytes=str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
		char c[]= {'u','a','e','i','o'};
		str=new String(c);
		System.out.println(str);
		str.getChars(0, 4, c, 0);
		for(char ca:c) {
			System.out.println(ca);/*
			}
		*/
		/*
		String str=new String("she, sells, sea, shells, in sea shore");
		String str1=str.toLowerCase();
		int count=0;
		*/

		
		/*for(int i=0;i<str.length();i++)
		{
			if(str1.charAt(i)=='s') {
				count++;
			}
		}
		System.out.println(count);
		String words[]=str.split("[ ] ");
		System.out.println(words.length);
		for(String s:words) {
			System.out.println(s);
			System.out.println();
		}
		String string =new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.startsWith("toon"));
		int apos=string.indexOf('a');
		int tpos=string.indexOf('t');
		String subs=string.substring(apos, tpos+1);
		System.out.println(subs);
		subs=string.substring(tpos);
		System.out.println(subs);
		
		String string=new String("madamdam");
		int dpos=string.lastIndexOf('d');
		String subs=string.substring(dpos,string.length()+1);
		System.out.println(subs);
		*/
		/*
		String str= new String("aneeta.roy@ust.com");
		int pos=str.lastIndexOf('.');
		String substr=str.substring(pos+1,str.length());
		System.out.println(substr);
		String str1=new String("welcome");
		String str2=new String("welCOME");
		String str3= str2.toLowerCase();
		Boolean flag=str1.equalsIgnoreCase(str2);
		System.out.println(flag);
		int val =str1.compareTo(str3);
		System.out.println(val);
		System.out.println(str2.toLowerCase());
		*/
		//16-11-477/6/A/3 Hyderabad 500036
		int digit=0;
		int alp=0;
		int noda=0;
		int neith=0;
		String str1=new String("16-11-477/6/A/3 Hyderabad   500036");
		for(int i=0;i<str1.length();i++) {
			if(Character.isDigit(str1.charAt(i))){
					digit++;
			}
			else
			if(Character.isAlphabetic(str1.charAt(i))) {
				alp++;
			}
			else
				if(Character.isSpaceChar(str1.charAt(i))) {
					noda++;
				}
				else 
					 neith++;
				}
		System.out.println("Digit count="+digit);
		System.out.println("Alphabet count="+alp);
		System.out.println("Space count="+noda);
		System.out.println("not alphabet/digit/space ="+neith);
		
		}
}
		
		
		
		
		
		
		

			

			
				
