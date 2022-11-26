
public class LongestPalindromeSubString {

	public static String longestPalind(String s) {
		String longPal="";
		String crrPal="";
		int max=0;
		int crr=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(ifPalind(s.substring(i, j+1))) {
					crrPal=s.substring(i, j+1);
					crr=s.substring(i, j+1).length();
				}
				if(max<crr) {
					max=crr;
					longPal=crrPal;
				}
			}
		}
		return longPal;
	}
	public static boolean ifPalind(String s) {
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalind("abccbaa"));
	}

}
