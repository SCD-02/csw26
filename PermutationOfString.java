import java.util.HashSet;
import java.util.Scanner;

public class PermutationOfString {

	public static void permOfString(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			HashSet<String> hs=new HashSet<>();
			hs.add(ans);
		}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			String r=s.substring(0, i)+s.substring(i+1);
			permOfString(r,ans+c);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		permOfString(s,"");
		sc.close();
		
	}
}
