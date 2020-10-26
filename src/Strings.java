
public class Strings {

	public static void main(String[] args) {

		String s2="$4,123";
		StringBuilder s=new StringBuilder(s2);
		String s1=s.toString().replaceAll("$","");
		System.out.println(s1);
		
	}

}
