import java.io.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Singleton
	{
		private static Singleton instance;
		private Singleton()
		{
			
		}
		public static Singleton getInstance()
		{
			if(instance==null)
			{
				instance=new Singleton();
			}
                      return instance;
		}
	}

class  Mainsingleton
	{
	public static void main(String args[])
		{
			Singleton s1=Singleton.getInstance();
			Singleton s2=Singleton.getInstance();

			System.out.println(s1==s2);
			//System.out.println(s1.getInstance()+"\n"+s2.getInstance());
		}
	}
//----------------------------------------------------------------------------------------------
class Students
	{
	public String name;
	public int rollno;
	
	Students(String name,int rollno)
		{
			this.name=name;
			this.rollno=rollno;
		}
	String getName(){
			return name;
	}
	int getRollno(){
			return rollno;
	}

	

	}
class NameComparator implements Comparator<Students>

		{
                     public int compare(Students a ,Students b)
			{
			return a.getName().compareTo(b.getName());
			}
		}
class Studentcomparator
	{
		public static void main(String args[])
		{
		ArrayList<Students> stu=new ArrayList<>();
		stu.add(new Students("thangam",108));
		stu.add(new Students("Devi",101));
		stu.add(new Students("Jayasree",102));
		stu.add(new Students("Sindhu",110));
		stu.add(new Students("Nachiyar",104));

   
     Collections.sort(stu,new NameComparator());
     
		for(Students s:stu)
			{
				System.out.println("Name:"+s.getName()+"\tRollno:"+s.getRollno());
			}
		}
	}
//--------------------------------------------------------------------------------------------------------
 class Agelist implements Comparable<Agelist>
	{
		public String name;
		public int age;
		Agelist(String name,int age)
		{
			this.name=name;
			this.age=age;

		}
		String getName()
		{
			return name;
		}
		int getAge()
		{
			return age;
		}
	   public int compareTo(Agelist p)
		{
			return Integer.compare(this.age,p.age);
		}
	}
class comparableAge
	{
		public static void main(String args[])
		{
			ArrayList<Agelist> ages=new ArrayList<>();
			ages.add(new Agelist("thangam",21));
			ages.add(new Agelist("Devi",20));
			ages.add(new Agelist("Sindhu",25));
			ages.add(new Agelist("Nachiyar",24));
		
			Collections.sort(ages);
			for(Agelist a:ages)
			{
				System.out.println("Name:"+a.getName()+"\tAge:"+a.getAge());
		}
	}
	}
//-------------------------------------------------------------------------------------------------------------------
class commandLineArgument
	{
	public static void main(String args[])
		{
			String[] names=new String[5];
			
			for(int i=0;i<names.length;i++)
			{
			names[i]=args[i];
			}
			for(int i=0;i<names.length;i++)
			{
			System.out.println(names[i]);
			}
			

		}
	}
//--------------------------------------------------------------------------------------------------------------------------
 class cloning implements Cloneable
	{
		int x;
		int y;
		cloning(int x,int y)
			{
			this.x=x;
			this.y=y;
			}
	public Object clone() throws CloneNotSupportedException
			{
			return super.clone();
			}

			
	}
class Mainclone
	{
	public static void main(String args[]) throws CloneNotSupportedException
		{
		cloning c1=new cloning(10,8);
		cloning c2=(cloning) c1.clone();
			System.out.println("x:"+c1.x+"\ty:"+c1.y);
			System.out.println("x:"+c2.x+"\ty:"+c2.y);
		}
	}
//----------------------------------------------------------------------------------------------------------------------------
class passbyvalue
	{
		int calculateSquare(int a)
		{
		return a*a;
		}
	}
		
	
class Mainpassbyvalue
	{
		public static void main(String args[])
		{
			int x=10;
			passbyvalue pbv=new passbyvalue();
			pbv.calculateSquare(x);//copy of the x value is passing
			System.out.println(x);
		}
	}
//-----------------------------------------------------------------------------------------------------------------------------------

class Stud1
	{
		String name;
		int rollno;
		String dept;
		
		Stud1(String name,int rollno,String dept)
		{
		this.name=name;
		this.rollno=rollno;
		this.dept=dept;
		

		}

	public String toString()
		{
		return "[Name :"+name+"   Rollno:"+rollno+"  Department:"+dept+"]";
		}
	}

class MaintoString
	{
		public static void main(String args[])
		{
			Stud1 s=new Stud1("Devi",101,"Computer Science");
			System.out.println(s);
		}
	}

//----------------------------------------------------------------------------------
class Studdent implements Cloneable

	{
		String name;
		int rollno;
		String dept;
		
		Studdent(String name,int rollno,String dept)
			{
				this.name=name;
				this.rollno=rollno;
				this.dept=dept;
			}

		public String toString()
			{	
				return "[Name:"+name+"  Rollno:"+rollno+"  Department:"+dept+"]";
			}


		protected Object clone() throws CloneNotSupportedException
			{
				return super.clone();
			}
	}
class Clonenotsupport
		{
			public static void main(String args[])
			{
				Studdent s1=new Studdent("Devi",101,"Cs");
				try
				{
					Studdent s2=(Studdent) s1.clone();
					System.out.println("Original :"+s1);
					System.out.println("Cloning :"+s2);
				}
				catch(CloneNotSupportedException e)
				{
					System.out.println("Error:"+e);
				}
			}
		}
