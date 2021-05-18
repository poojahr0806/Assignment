import java.util.Scanner;
public class Assgn3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int a=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int b=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		int n=name.length();
		int n1=b-(n+2);
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				 if(i==a-1 && j==n1)
				{
					
					System.out.print(name+"  "+"|");
					break;
				
				}
				else if((i==1 && j==1)||(i==a && j==1)||(i==1 && j==b)||(i==a && j==b))
						System.out.print("+");
				else if(j==1 || j==b)
					System.out.print("|");
				else if(i==1||i==a)
					System.out.print("-");
				
				else
					System.out.print(" ");
			}
			System.out.println( );
		}
	}

}
