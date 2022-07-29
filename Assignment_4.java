
public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=14;
		for(int i=0;i<n-6;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i || j>=(n-1-i) )
				
					System.out.print("*");				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
