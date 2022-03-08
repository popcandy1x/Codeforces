import java.util.*;
import java.io.*;

public class landandwater{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xcn.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=xcn.nextInt();
			}
			int costofjumping=0;
			int b=0;
			int k=0;
			int l=0;
			if(a.length==2)
			{
			    System.out.println(0);
			}
			else
			{
			    for(int i=1;i<a.length;i++)
			    {
				    if(a[i]==0)
				    {
					    k=i;
					    break;
				    }
			    }
			    for(int i=a.length-1;i>0;i--)
			    {
				    if(a[i]==1)
				    {
					    l=i;
				    }
				    else
				    {
				        break;
				    }
			    }
			    if(k==0)
			    {
			        System.out.println(0);
			    }
			    else
			    System.out.println(l-k+1);
			}
		}
		xcn.close();
	}
}