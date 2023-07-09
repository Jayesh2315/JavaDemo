import java.util.Random;
   
public class RanNum
{
	public static void main(String[] args) 
	{
		Random r=new Random(); 
		int num=r.nextInt(1000); //Random number between 1 and 1000 is stored in the variable num.
		System.out.println(num);
	}
}
