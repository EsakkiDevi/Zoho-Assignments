class vari
{
	
		static int x=500;  
                int y;         
	public static void main(String  args[])
	{
             int z=10;
	     final int a=6;
		{
                  int b=100; //block variable
		  System.out.println("block variable "+b);
  		}
              vari v=new vari();
	      System.out.println("static variable: "+x);
	      System.out.println("final variable: "+a);
              System.out.println("instance variable: "+v.y);
              System.out.println("local variable: "+z);
              v.show();
	}
    void show()
	{

		System.out.println("static variable: "+x);  //static varible
	}
}

//---------------------------------------------------------------------------
class datatype
{
	public static void main(String args[])
	{
	int a=10;
 	double b=20;
	float c=2.56789f;
	long d=5512840;
	char e='q';
	byte f=1;
       
		System.out.println("Integer: "+a);
		System.out.println("Double: "+b);
		System.out.printf("Float: %.2f%n",c);
		System.out.println("Long Integer: "+d);
		System.out.println("Character: "+e);
		System.out.println("Byte: "+f);
	}
}
//-------------------------------------------------------------------------------
class maximum
{
	public static void main(String args[])
	{
	 int x=25;
	 int y=52;
    	System.out.println("Maximum Number:"+(x>y?x:y));
	}
}
//-------------------------------------------------------------------------------
class  numberEqual
{
	public static void main(String args[])
	{
		int x=15;
		int y=45;
		if((x^y)==0)
		System.out.println("Numbers Are Equal");
		else
		System.out.println("Numbers Are Not Equal");
                
	}
}
//--------------------------------------------------------------------------------
class blocks
{
	static int num;
	static
	{
		System.out.println("static block :"+num);

	}

       blocks() //constructor
	{
           System.out.println("Initialize block:"+num);//initialize block
	}
        
    
        {
	num=88;
	}

        

	public static void main(String args[])
	{
	blocks b=new blocks();
           
	}
}
//---------------------------------------------------------------------------------

class typecasting  //Explicit typecasting
{
	public static void main(String args[])
	{
		int x=68;
                System.out.println("Integer to Character: "+(char)x);//integer to character

                int y=10;
		System.out.println("Integer to Double: "+(double)y);//Wideening
		
		double z=12.345;
		System.out.println("Double to Integer: "+(int)z);//Narrowing
	}
}
//------------------------------------------------------------------------------------
class poweroftwo
{
	public static void main(String args[])
	{
		int n=30;
		int num=n;
                while(n>1 && n%2==0)

		{
			n=n/2;

                }
	if(n==1) 
		System.out.println(num+" is Power of 2");
        else
		System.out.println(num+" is not Power of 2");
		
	}
}
//--------------------------------------------------------------------------------------
class firstbit
{
	public static void main(String args[])
		{
  			int n=18;
			int binary=0,i=1;
			while(n>0)	
			{
				binary+=(n%2)*i;
				n=n/2;
				i=i*10;

			}
//System.out.println(binary);
		String s=String.valueOf(binary);
//System.out.println(s);
                  int count=-1;
                for(i=s.length()-1;i>=0;i--)
                 {
                    count++;
                   if(s.charAt(i)=='1')	
			{
			
                        break;
                 	}
		 }
                    System.out.println("First set bit of a number:(in position from right) "+count);
	}
}
//-------------------------------------------------------------------------------------
class Employee
{
        int emp_id;
	String emp_name;
	String dept;
	double salary;


         Employee(int emp_id,String emp_name,String dept,double salary)
       { 
                this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.dept=dept;
		this.salary=salary;
                show();
       }
 	void show()
 	{
		 System.out.println("Employee Id: "+emp_id);
		 System.out.println("Employee Name: "+emp_name);
		 System.out.println("Employee Department: "+dept);
		 System.out.println("Employee Salary: "+salary);
		System.out.println("");
	}

 	   	
		
 

	public static void main(String args[])
	{
            Employee e=new Employee(102,"Ddhevi","Testing",40000);	
	    Employee e1=new Employee(108,"Thangom","Developing",43000);

		
	}
}

		


			
//---------------------------------------------------------------------------------
class objectcheck
{
            int vari;
	public static void main(String args[])
	{
          objectcheck obj=new objectcheck();
		System.out.println(obj instanceof objectcheck);
	}
}
