package looping;

public class div7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum =1;
		   int count =0;
		  for(int i=1;i<=1000;i++)
			{
				sum = sum+i;								
					if(sum%7==0)
							{
									count++;
									 System.out.println(i);
							}
			}
		 
		 

	}
}
