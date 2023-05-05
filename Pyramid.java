
public class Pyramid {

	public static void main(String args[])
	{
		
		//determines number of new lines
		for(int i =0; i <=9; i++ )
		{
			//get the value of i and add a space until j = 4 is met
			for(int j=i; j <=9; j++)
			{
				System.out.print(" ");
			}
			
			//for every i number of new lines we will add a star
			for(int k =0; k <=i*2; k++)
			{
				//your creating one half then mirroring it by duplicating by two
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
