import java.util.Scanner;

public class FirstNonRepeatedChr {

	public static void nonRepChr(String s) {
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=i-1;j>=0;j--) {
				if(s.charAt(i)!=s.charAt(j)) {
					count++;
				}
			}
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					count++;
				}
			}
			if(count==s.length()-1) {
				System.out.println(s.charAt(i));
				return;
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		nonRepChr(s);
		sc.close();
		
	}
}
