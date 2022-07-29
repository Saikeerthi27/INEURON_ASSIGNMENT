
public class MY_NAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			//S
			for(int j=0;j<n;j++)
			{
				if((i==0) || (i==(n-1)) || (i==(n-1)/2) || (j==(n-1) && i>(n-1)/2) || ((j==0) && i<(n-1)/2))
				System.out.print("*");
				
				else
					System.out.print(" ");
				
			}
			System.out.print(" ");
		//	System.out.println();
			//A
			for(int j=0;j<n;j++)
			{
			
				if((i==(n-1)/2) || (j==0) && (i!=0) || (i==0) && j!=0 && j!=(n-1) || (j==(n-1)) && (i!=0))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++)
			{
			
				if((i==0) || (i==(n-1)) || (j==(n-1)/2))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("        ");
			//System.out.println();
			//K
			
			for(int j=0;j<n;j++)
			{
				
				if((j==0) || (i+j)==(n-1)/2 || (i-j)==(n-1)/2 )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			//E
			for(int j=0;j<n;j++)
			{
				
				if((i==0)||(i==(n-1))||(i==(n-1)/2)||(j==0))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//System.out.println();
			for(int j=0;j<n;j++)
			{
				
				if((i==0)||(i==(n-1))||(i==(n-1)/2)||(j==0))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//R
		//	System.out.println();
			for(int j=0;j<n;j++)
			{
				
				if((i==0)||(i==(n-1)/2)||(j==0) || (j==(n-1) && (i<n/2) || (i-j)==(n-1)/2) )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			//T
			for(int j=0;j<n;j++)
			{
				
				if((i==0)||(j==(n-1)/2) )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//H
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==((n-1)/2))

					System.out.print("*");
				else
			
					System.out.print(" ");
			}
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++)
			{
			
				if((i==0) || (i==(n-1)) || (j==(n-1)/2))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();		
			
		}
		
		
		


		
		
	}

}
