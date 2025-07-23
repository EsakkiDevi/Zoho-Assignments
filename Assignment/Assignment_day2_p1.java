import java.util.Scanner;
class minimum //find the minimum of three numbers
{
	public static void main(String args[])
	{
		int x=5;
		int y=2;
		int z=7;
	if(x<y && x<z)
		System.out.println("Minimum number: "+x);
	else if(y<z && y<x)
		System.out.println("Minimum number: "+y);
	else
		System.out.println("Minimum number: "+z);
	}
}
//-----------------------------------------------------------------------
class pattern1 //X-pattern & R=Pattern with for loop
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{

			for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						System.out.print("1");
					}
					
					else if((i+j)==(n-1))
					{
						System.out.print("1");
					}
					else { System.out.print(" "); }
					
				}
			System.out.println();
		}
		System.out.println("\n\n\n");

               //R-Pattern
		 n=5;
                int m=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==1 && j!=0 && j<m-1)
					System.out.print(" ");
				else if(i==2 && j==m-1) System.out.print(" ");
				else if(i==3 && j!=0 && (j==1 || j<m-2 || j==m-1)) System.out.print(" ");
                                else if(i==4 && j!=0 && j<m-1) System.out.print(" ");
				else System.out.print("R");
			}
		System.out.println();
   		}
	}
}
//------------------------------------------------------------------------------
class pattern2//patterns with while loop
{
	public static void main(String args[])
	{
     	  pattern2 p=new pattern2();
		
          p.numberdiamond();
		System.out.println("\n\n");
	  p.wpattern();
	}
   public static void numberdiamond()
	{
		
	int n=3;
	int x=1;
	int i=0;
	
	while(i<(2*n)-1)
		{
 		if(i>=n)
 		 {	
			int s=0;
  			
			while(s<=i-n)
  			 {
   			   System.out.print(" ");
				s++;
   			 }
				int j=0;
   			
			while(j<=n-i+1)
 			 {
   			    System.out.print(x+" ");
				x++;
				j++;
   			 }
  		System.out.println();
  		}


 		else
  		{
			int s=1;
  			
			while(s<n-i)
  			{
   			   System.out.print(" ");
				s++;
  			}
			int j=0;
  			
			while(j<=i)
 			{
   			   System.out.print (x+" ");
				x++;
				j++;
 			 } 
  		System.out.println();
  		}  
		i++;
		}		
	}

	
	public static void wpattern()
	{
		
	int n=3;
	int x=1;
        int i=0;

	while(i<(2*n)-1)
	{
 	if(i>=n)
  		{
   
		int j=0;
  	 
		while(j<=n-i+1)
  		{
    			System.out.print("w ");
			x++;
			j++;
   		}
  		System.out.println();
  		}


 	else
 	 	{
  		int j=0;
  	
		while(j<=i)
  		{
   			System.out.print ("w ");
			x++;
			j++;
 	 	} 
 	 	System.out.println();
  		}  
		i++;
	}		
   }


}

//-------------------------------------------------------------------------------
class pattern3//pattern with do..while loop
{
	public static void main(String args[])
	{
		pattern3 p1=new pattern3();
		p1.zohopattern();
		System.out.println("\n\n");
		p1.pascalpattern();
        }
 public static void zohopattern()
	{
	String s="ZohoCorporations";
	int a=0;
	int i=0;
	do
	{	int j=0;
		
		do
		{
			System.out.print(s.charAt(a));
			a++;
			j++;
		}while(j<4);
	System.out.println();
		i++;

	}while(i<4);
	}
  public static void pascalpattern()
	{
		 int n=5;
		int i=0;
                
		do
		{ 
			int num=1;
			int j=0;
			int s=0;
			
			do
			{
				System.out.print(" ");
				s++;
			}while(s<=n-i);
				
				do
				{
					System.out.print(num+" ");
					num=num*(i-j)/(j+1);
					j++;
				}while(j<=i);
			System.out.println();
			i++;

			
		}while(i<n);
}

}
//------------------------------------------------------------------------------------------
class sumofeven
{
	public static void main(String args[])
	{
              int n=25;
              int sum=0;
		for(int i=1;i<=n;i++)
		{
                  if(i%2==1)
			{
				continue;
			}
		  else
			{
    				sum+=i;
			}	

		
		}
		System.out.println("Sum of Even Numbers: "+sum);

 
         }     
}
//--------------------------------------------------------------------------------------------
class decitobin//converts decimal to binary
{
	public static void main(String args[])
	{
		int n=15;
                int binary=0;
		int i=1;
		while(n>0)
		{
		binary+=n%2*i;
		n=n/2;
		i=i*10;
		}
		System.out.println("Decimal to Binary: "+binary);
	}
}



//------------------------------------------------------------------------------------------------
class grade //switch case using
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mark: ");
		int mark=s.nextInt();
		int input=0;
		if(mark>=85 && mark<=100)
			{
			input=1;
			}
		else if(mark>=70)
			{
			input=2;

			}
		else if(mark>=50)
			{
			input=3;
			}

		switch(input)
		{
		case 1:
			System.out.println("Grade A");
			break;
		
		case 2:
			System.out.println("Grade B");
			break;
		
		case 3:
			System.out.println("Grade C");
			break;
			
		default:
                         System.out.println("Fail");

		}
	}
}
//------------------------------------------------------------------------------
