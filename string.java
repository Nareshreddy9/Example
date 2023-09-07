
public class string {

	public static void main(String[] args) {
		String s1="naresh";
		System.out.println(s1);
		String s2=new String("naresh");
		System.out.println(s2);
		char[]ch= {'a','b','c','d','e'};
		String s3=new String(ch);
		System.out.println(s3);
		String s4=new String(ch,2,2);
		System.out.println(s4);
		byte[]b= {66,67,68,69,70};
		String s5=new String(b);
		System.out.println(s5);
		
		String s="hi How ARE you Naresh";
		String ss=s.toLowerCase();//lowercase
		System.out.println(ss);
		
		String ss1 = s.toUpperCase();
		System.out.println(ss1);
		
		String l="hi How ARE you Naresh";
		int ss2 = l.length();
		System.out.println(ss2);
		
		

	}

}
