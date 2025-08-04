import java.io.*;
import java.util.*;
	
//------------------------------------------------------------------------------------
class ArrayOutOfIndexException extends Exception
	{
	 ArrayOutOfIndexException (String message)
	{
	super(message);
	}
	}
class Quotient
	{
	public static void checkArrayElement (int diviser,int dividend,int[] arr) throws ArrayOutOfIndexException
		{
			if(arr[diviser]==0)
			{
				throw new ArrayOutOfIndexException("divide by zero is not possible");
			}
			if(dividend>arr.length-1)
			{
				throw new ArrayOutOfIndexException ("Index Value is Not found in Array");
			}
			System.out.println("Ans:"+arr[dividend]/arr[diviser]);
		}

	public static void main(String args[])
		{
			int[] arr = {2, 5, 1, 4, 0, 7};
			try{
				checkArrayElement(4,7,arr);
			}
			catch(ArrayOutOfIndexException e)
			{
				System.out.println("Caught :"+e.getMessage());
			}
		} 
	}	
//-------------------------------------------------------------------------
class  MultipleCatch
	{
		public static void addStrings(String s1,String s2)
		{
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				System.out.println("Answer:"+n1/n2);
		}
		
		
	public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		
		try{

			System.out.println("Enter the Value1:");
		
			String s1=s.nextLine();
			System.out.println("Enter the Value2:");
			String s2=s.nextLine();

			addStrings(s1,s2);
				
			}
			catch(InputMismatchException e)
			{
			System.out.println("Error:InputMismatchException");

			}
  			catch(NumberFormatException e)
			{
			System.out.println("Error:NumberFormatException");
			}
			catch(ArithmeticException e)
			{
			System.out.println("Error:ArithmeticException");
			}
			catch(Exception e)
			{
			System.out.println("Error:Exception error");
			}

		}
	}	

//----------------------------------------------------------------------------
class ClassNotFoundDemo
	{
	public static void main(String args[])
		{
		try
		{
			Class.forName("DEvi");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error...!");
		}
	
		}

	}
//---------------------------------------------------------------------------------
class NotAValidNumber extends Exception
	{
		NotAValidNumber(String message)
		{	
		super(message);
		}	
	}
class ValidNumber 
	{
		public static void checkValid(String s)throws NotAValidNumber
		{
		int n=Integer.parseInt(s);
			System.out.println("Answer:"+n);
		}
 
		
	public static void main(String args[])
		{
			try
			{
				String s="1w3";
				checkValid(s);
			}
			catch(NotAValidNumber e)
			{
				System.out.println("Error:This is Not a Valid number");
			}
			
		}
	}
//----------------------------------------------------------------------------------------------
class finallybeforereturn
	{
		public static String ReturnMethod()
			{
				try{
				//System.out.println("Try....Block");
				return "Return Statement After Finally";
				}
				finally{
				System.out.println("Finally Statement Before return Statement");
				}
			}
		public static void main(String args[])
			{
				String result=ReturnMethod();
				System.out.println(result);
		
			}
	}
//-------------------------------------------------------------------------------------------------
class AtmPinCheckException extends Exception
	{
		AtmPinCheckException(String message)
			{
				super(message);
			}
	}
	
class Atmpin
	{
		public static void pinCheck(String s)throws AtmPinCheckException
		{
			if(s.length()!=4 || s.charAt(0)=='0')
				throw new AtmPinCheckException("Not A Vaild length of Atm Pin or First digit is zero");
			for(char c:s.toCharArray())
				{
					if(c>='0' && c<='9')
					{
						continue;
					}
					else
					{
						throw new AtmPinCheckException("Not a Valid Atm Pin");
					}
				}
			System.out.println(s+" is valid Atm pin");
		}


		public static void main(String args[])
		{
			String s="12rs3";
			try
			{
				pinCheck(s);
			}
			catch(AtmPinCheckException e)
			{
				System.out.println("Error:"+e.getMessage());
			}
		}
	}
//-----------------------------------------------------------------------------------------------------------------------------
class PropagationCheckException extends Exception
	{
		PropagationCheckException(String message)
			{
				super(message);
			}
	}
class methodPropagation 
	{
		public static void method3(int n,int m)throws PropagationCheckException
			{
                        if(m==0)
				throw new PropagationCheckException("Divide by zero  is not possible");
			System.out.println("Answer:"+n/m);
			}
		public static void method2(int n,int m)throws PropagationCheckException
			{
			if(m<0)
				throw new PropagationCheckException("Negative number is Not divide");
			 System.out.println(m+" is not a negative number");
			 method3(n,m);
			
			}
		public static void method1(String s,int m)throws PropagationCheckException
			{	
				for(char c:s.toCharArray())
				{
				if(c>='0' && c<='9')
				{
					continue;
				}
				else{
				throw new PropagationCheckException("Given value is not a numeric value");
				}
				}
				int n=Integer.parseInt(s);
				System.out.println(s+" is a Valid Numeric Value");
				method2(n,m);
			}
		public static void main(String args[])
			{
				String s="12";
				int m=3;
				try
				{
					method1(s,m);
				}
				catch(PropagationCheckException e)
				{
				System.out.println("Error:"+e.getMessage());
				}

			}
	}
//-----------------------------------------------------------------------------------------------------------------------
class AuthenticationException extends Exception
		{
			AuthenticationException(String message)
			{
				super(message);
			}
		}
class loginSystem
		{
			public static void usernameCheck(String username,String password)throws AuthenticationException
			{
				if(username.length()<0 || username.length()>12)
					{
					
		        	       throw new AuthenticationException("Username is Invalid ");
					}
				else
					{
				     System.out.println("Username is Valid");  	
					passwordCheck(password);
					}
			}
			public static void passwordCheck(String pass)throws AuthenticationException
					{
						boolean small=false,caps=false,digit=false;
						for(char c:pass.toCharArray())
						{
							if(c>='a' && c<='z')
							{	
								small=true;
							}
							if(c>='A' && c<='Z')
							{	
								caps=true;
							}
							if(c>='0' && c<='9')
							{
								digit=true;
							}
			
			
						}
					    if(small && caps && digit)
						{
							System.out.println("Password is also Valid");
						}
					   else
						{
							throw new AuthenticationException("Password is Invalid");
						}
					}
			public static void main(String args[])
					{
						String user="asdfghj";
						String pass="Devi2003";
						try
						{	
							usernameCheck(user,pass);
						}	
						catch(AuthenticationException e)
						{
						System.out.println("Error:"+e.getMessage());
						}
					}

		}
//-----------------------------------------------------------------------------------------------------------------------
class FileCheck
	{

		public static void main(String args[])throws IOException
		{
			FileReader fr=null;
			try
			{
				 fr=new FileReader("test.txt");
				 int ch = fr.read();
            			while (ch != -1) {
               				 System.out.print((char) ch);
               				 ch = fr.read();
				}
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Error:"+e);
			}
			finally
			{
			 System.out.println("\nFile is Found or Not  Checked");
			
			}
		}
	}	
//------------------------------------------------------------------------------------------------------------------------
class ageEligibleException extends Exception{
		ageEligibleException(String message)
		{
			super(message);
		}

	}
class Ageeligible
	{
	 public static void agevalidate(String name,int age)throws ageEligibleException 
		{
			if(age<18)
			{
			throw new ageEligibleException(name+" your age just "+age+" so Not Eligible for Voting"); 
			}
                  System.out.println(name+" Congratulation...!you are Eliglible for Voting");
		}
       public static void main(String args[])
	{
		try
		{
		
		agevalidate("devi",21);
		agevalidate("mani",17);
		}
		catch(ageEligibleException e)
		{
		System.out.println("Caught Error:"+e.getMessage());
		}
	}
	}
		