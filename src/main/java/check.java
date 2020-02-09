
public class check {
	public static int check(String s) {
		int i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') return 1;
		}
			return 0;
	}
}
