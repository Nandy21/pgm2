import java.util.Scanner;


public class tar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int[] a=new int[10];
		int t=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(a[i]+a[j]==t)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
	}

}
