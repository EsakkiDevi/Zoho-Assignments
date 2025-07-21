import java.util.Scanner;
class sumofodd// sum of all odd number in array
{
	public static void main(String args[])
	{
		int sum=0;
		int arr[]={3,5,6,4,2,1,2,3,4,9};
		for(int n:arr)
		{
			if(n%2==1)
			{
				sum+=n;
			}
		}
		System.out.println("Sum of odd Number in array: "+sum);
	}
}

//----------------------------------------------------------------------------
class printprime//print prime numbers
{	public static void main(String args[])
	{
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		int prime[]=new int[nums.length];
		int k=0;
  		boolean t=true;
		for(int n:nums)
		{
			for(int i=2;i<=Math.sqrt(n);i++)
				{
					if(n%i==0)
					{
						t=false;
						break;
 					}
                                        else
					{
						t=true;
					}
                                 }
			if(t){
				prime[k++]=n;
			     }
		}
			System.out.println("Prime numbers in the Array");
      		for(int i=0;i<k;i++)
		{
			System.out.print(prime[i]+" ");
		}
	}
}	

//-------------------------------------------------------------------------------
class fibonacci//generate fibonacci series
{
	public static void main(String args[])
	{
                int n=30;
		int t1=0;
		int t2=1;
               for(int i=0;i<n;i++)
		{
			System.out.print(t1+" ");
                        int next=t1+t2;
			t1=t2;
			t2=next;
		}
	}
}
//---------------------------------------------------------------------------------------
class sumofdigit//sum of Digit of double digit number
{
	public static void main(String args[])
	{
	 int array[]={1,22,3,4,55,12,89};
         Print(array);
	}
     public static void Print(int[] x)
  {
        int sum=0;
	for(int n:x)
	{
		int num=n;
 		if(num>=10)
		{
			while(num!=0)
			{
				int digit=num%10;
				sum+=digit;
				num=num/10;
			}
		}
	}
	System.out.println("Sum Of Double digit's single digits: "+sum);
  }
}	
//-----------------------------------------------------------------------------------
class checkidentical//Check identical of two arrays
{
	public static void main(String args[])
	{
		char[] arr1={'a','b','c','d'};
		char[] arr2={'a','b','d'};
		  	if(arr1.length!=arr2.length)
				{
				System.out.println("False");
				return;
				}
				
           		for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
				{
					continue;
				}
				else
				{
					System.out.println("False");
                                         break;
				}
                        }
			System.out.println("True");
	}
}
//------------------------------------------------------------------------------------
class yearofgraduate//Exist or Not Exist 
{
	public static void main(String args[])
	{
		int[] years={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
                Scanner s=new Scanner(System.in);
		System.out.println("Enter the Graduate Year: ");
		int input=s.nextInt();
		for(int i=0;i<years.length;i++)
		{
		 if(years[i]==input)
			{
				System.out.println("Record Exists");
				return;
			}
		}
	System.out.println("Record Doesn't Exist");
	}
}
//----------------------------------------------------------------------------------------
class sorting//Sorting the weights in descending order 
{
	public static void main(String args[])
		{
		int weights[]={34,37,56,87,21,45,50,67,33};
		for(int i=0;i<weights.length;i++)
		{
			for(int j=i+1;j<weights.length;j++)
			{
                          if(weights[i]<weights[j])
				{
					int temp=weights[i];
					weights[i]=weights[j];
					weights[j]=temp;
				}
			}
		}
           System.out.println("Selection Sorting (Decending order)");
	for(int n:weights)
		{
			System.out.print(n+" ");
		}
	}
}
	
//------------------------------------------------------------------------------------------
class agecount //Count the Ages-wise
{
	public static void main(String args[])
	{
      		int[] ages={12,23,45,67,18,24,30,55,19,80};
		int count1=0;
		int count2=0;
		int count3=0;
		for(int n:ages)
		{
			if(n<18)
				count1++;
                        else if(n>=18 && n<=60)
				count2++;
			else
				count3++;
		}
       System.out.println("Number of people Below 18years old: "+count1);
       System.out.println("Number of people ( 18-60)years old: "+count2);
       System.out.println("Number of people Above 60years old: "+count3);
	}
}
//-----------------------------------------------------------------------------------
class studentmarks// Student Mark total and avg print in table format
{
	public static void main(String args[])
		{
		int[] rollno={1,2,3,4,5,6,7,8,9,10};
		int sub1[]={89,88,67,90,87,50,90,91,79,80};
		int sub2[]={80,87,85,81,79,90,78,86,67,99};
		int sub3[]={98,97,96,99,90,89,87,89,88,90};
                System.out.println("Roll No | Total Mark | Average");
		System.out.println("------  | ---------- | -------");
		for(int i=0;i<rollno.length;i++)
		{
                   int total=sub1[i]+sub2[i]+sub3[i];
		   int avg=total/3;
                   System.out.println("  "+rollno[i]+"     |   "+total+"      |   "+avg+"  ");
		}
	}
}
//---------------------------------------------------------------------------------------
class twodimension//2Darray Operations
{
	public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			
                        int m=3;
			int n=3;
			int[][] A=new int[m][n];
			System.out.println("Enter the array Elements:");
                        for(int i=0;i<m;i++)
			{
			for(int j=0;j<n;j++)
			{
				A[i][j]=s.nextInt();
			}
			}
System.out.println("Display Matrix");
                    display(A);
System.out.println("--------------------");
System.out.println("Sum of Matrix Element");
		    sumOfmatrix(A);
System.out.println("--------------------");
System.out.println("Row-wise Sum");
		    sumOfRow(A);
System.out.println("--------------------");
System.out.println("Column-wise Sum");
		    sumOfCol(A);
System.out.println("--------------------");
System.out.println("Transpose of Matrix");
		    transpose(A);

                }
    public static void display(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}
   public static void sumOfmatrix(int[][] mat)
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				sum+=mat[i][j];
			}
			
		}
		System.out.println("Sum of the Matrix A: "+sum);
	}
  public static void sumOfRow(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			int rowsum=0;
			for(int j=0;j<mat[0].length;j++)
			{
				rowsum+=mat[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+" "+rowsum);
			
		} 
 		
          }
  public static void sumOfCol(int[][] mat) 
	{
		for(int i=0;i<mat.length;i++)
		{
			int colsum=0;
			for(int j=0;j<mat[0].length;j++)
			{
				colsum+=mat[j][i];
			}
			System.out.println("Sum of Col "+(i+1)+" "+colsum);
		}            
        }
  public static void transpose(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}                  
	}
}
               



//---------------------------------------------------------------------------------