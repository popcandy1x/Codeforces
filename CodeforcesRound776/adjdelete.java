import java.util.Scanner;

public class adjdelete{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		xcn.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=xcn.nextLine();
			char c=xcn.nextLine().charAt(0);
			if(stringToLetterReductionPossiblityChecker(s,c))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		xcn.close();
	}
	public static boolean stringToLetterReductionPossiblityChecker(String s,char c){
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				if(i%2==0||((s.length()-1-i)%2)==0||i==s.length()-1)
				{
					return true;
				}
			}
		}
		return false;
	}
}