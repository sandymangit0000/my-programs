package hw;

import java.util.Scanner;
//gokul and reka are fond of the "Delicious" restaurant. 
//Sam will have his dinner in that restaurant on every 'i'th day. 
//Riya will have her dinner on every 'j'th day. 
//Find the day on which Sam and  Riya will have their dinner together in that restaurant.
// When a day is less than or equal to zero, then display "<'i'th> to <'j'th> is not a valid interval".
//super project
public class samriya {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sca=new Scanner(System.in);
System.out.println("enter a number");
		int sam=sca.nextInt();
		System.out.println("enter a number");
		int riya=sca.nextInt();
		int count = 0 ;
		int samcount=0;
		int riyacount=0;
		System.out.println(" sam is going to hotel in a month");
		
		for(int i=1;i<=30;i++)
		{
if(i%sam==0)
{
	samcount++;
		System.out.print(i+" ");  //finding which day sam visiting hotel
	}
		}
		System.out.println(" ");
		if(samcount>0)
		{
System.out.println(" he visiting hotels "+samcount+" time in a month ");//finding how many day sam visiting in month	
}
		System.out.println(" ");
		
System.out.println("riya is going to hotel in a month");
for(int i=1;i<=30;i++)
{

	if(i%riya==0)
	{
		riyacount++;		
		System.out.print(i+" "); //finding which day riya visiting hotel
	}
}
System.out.println(" ");
if(riyacount>0)
{
System.out.println(" she visiting hotels "+riyacount+" time in a month ");	//finding how many day riya visiting in month
}
		System.out.println(" ");
		
		
		
		for(int i=1;i<=30;i++)
		{
			if(sam<=0||riya<=0)
			{
				System.out.println( "sam to riya is not a valid interval ");
				break;
			}
			else if(i%sam==0&&i%riya==0)
			{
				count++;
				System.out.println(" Sam and  Riya will have their dinner together on"+i);//which Sam and  Riya will have their dinner together in that restaurant.
			}
		}
		if(count>0) {
			System.out.print("sam and riya dinner together in a month is "+count+" times");	//Find the day on which Sam and  Riya will have their dinner together in that restaurant.
		}
		if (count==0)
		{
			System.out.println("their not dinner together in that restaurant");//if the both not coming together in that restaurant
		}
	}

}
