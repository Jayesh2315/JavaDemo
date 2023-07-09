import java.util.*;
public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number for which you wanna create the pattern: ");
		int n=scan.nextInt();
		
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
//				if(i==0||j==0||i==(n-1)||j==(n-1))
//				if(j==0||i==(n-1)/2||j==n-1) //H
//				if(i==0||i==(n-1)||j==(n-1)/2) //I
//				if(i==0||j==(n-1)/2||i==(n-1)&&j<=(n-1)/2||j==0&&i>=(n-1)/2) //J
//				if(j==0||i==0||j==(n-1)||i==(n-1)/2) //A
				if(j==0||i==0&&j<=(n-1)/2||j==(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||i==(n-1)&&j<=(n-1)/2)
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		
	}
}
