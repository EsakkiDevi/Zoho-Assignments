import java.util.ArrayList;
class Student
{
	String name="john";
	int roll_no=2;
      public static void main(String args[])
	{
		Student s=new Student();
		System.out.println("Student name: "+s.name);
		System.out.println("Student rollNo: "+s.roll_no);
	}
}
//-------------------------------------------------------------------
class Studentdetails
{
	String name;
	int roll_no;
	String phn_no;
	String address;
	Studentdetails(String name,int roll_no,String phn_no,String address)
	{
		this.name=name;
		this.roll_no=roll_no;
		this.phn_no=phn_no;
		this.address=address;
                print();
	}
	void print()
	{
	System.out.println("Student Name: "+name+"\nroll no: "+roll_no+"\nPhone Number: "+phn_no+"\nAddress: "+address);
	}
	public static void main(String args[])
	{
		Studentdetails s1=new Studentdetails("Sam",112,"9876543321","town");
		Studentdetails s2=new Studentdetails("John",117,"7654321098","tharuvai");
	}
	
}
//----------------------------------------------------------------------------------------------------------------------
class Employee
{
	static String emp_name;
	static int emp_id;
	static String des;
	static double salary;
	
	Employee()
	{
		
		this.emp_name=null;
		this.emp_id=0;
		this.des=null;
		this.salary=0;
	}
        Employee(String emp_name,int emp_id,String des,double salary)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.des=des;
		this.salary=salary;
	}
	Employee(Employee emp)
	{
		this.emp_name=emp.emp_name;
		this.emp_id=emp.emp_id;
		this.des=emp.des;
		this.salary=emp.salary;
	}
	public static void show()
	{
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Destination: "+des);
		System.out.println("Employee Salary: "+salary+"\n\n");

	} 
  
	public static void main(String args[])
	{
           Employee e1=new Employee();
   		e1.show();
	   Employee e2=new Employee("Devi",102,"testing",23000);
		e2.show();	
	   Employee e3=new Employee(e2);
	   e3.emp_name="Thangoom";
	   e3.emp_id=105;
        
	   
	   e3.show();
	
	}		
}
//-------------------------------------------------------------------------------------
class Vehicle
{
	static int vehiclecount;
	static int id;
	static String brand;
	static String name;
	static double price;
	
	Vehicle(int id,String brand,String name,double price)
	{

	this.id=id;
	this.brand=brand;
	this.name=name;
	this.price=price;
		vehiclecount++;
	}
        public static void show()
	{
	System.out.println("Vehicle id:"+id);
	System.out.println("Vehicle brand:" +brand);
	System.out.println("Vehicle name: "+name);
	System.out.println("Price: "+price+"\n\n");
        }
     public static void count()
	{
		System.out.println("Vehicle Count:"+vehiclecount);
	}

	public static void main(String ...a)
	{
		Vehicle v1=new Vehicle(1234,"TVS","Two-Wheeler",120000);
			v1.show();
		Vehicle v2=new Vehicle(2341,"Raider","Two-Wheeler",20000);
			v2.show();


		Vehicle v3=new Vehicle(3421,"Splender","Two-Wheeler",180000);
			v3.show();
		Vehicle v4=new Vehicle(4321,"TVS","Two-Wheeler",220000);
			v4.show();
		v4.count();
		 
	}




}
//-----------------------------------------------------------------------------------------------------------------------------
 class store
{

	static String storename;
	static String location;
		
        ArrayList<product> products;
       store()	
	{
		this.products=new ArrayList<>();
	}
	void setStoreDetails(String storename, String location)
	{
		this.storename=storename;
		this.location=location;
	}

	 void displayStoreDetails()
	{
		System.out.println("      Store Name: "+storename+"             Location: "+location);
	}
		
	
	void addProduct(product pro)
	{
          products.add(pro);
	} 


	
	
	 void displayAllProducts() 
	{
		if(products.isEmpty())
			{
			System.out.println("NO product in the Store");
                         return;

			}
                for(product pro:products)
			{
			pro.displayProduct();
			}
		

	}
	

}
 class product
{
	int productid;
	String name;
	double price;
	int quantity;

		product(int productid,String name,double price,int quantity)
		{
			this.productid=productid;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
		}
		
		 void displayProduct()
		{
			System.out.println("Product Id: "+productid+"\t\tProduct Name: "+name+"\tPrice: "+price+"\tQuantity: "+quantity);

		} 
}
class inventory
{
	public static void main(String args[])
{
		System.out.println();
		store s=new store();
		System.out.println("----------------------------------------------------------------------------------");
                s.setStoreDetails("Thangam Stationary","Pirancheri");
		s.displayStoreDetails();

		System.out.println("----------------------------------------------------------------------------------");
		product p=new product(101,"Pen",20,500);
                p.displayProduct();
		s.addProduct(p);
		product p1=new product(102,"Pencil",15,100);
                p1.displayProduct();
		s.addProduct(p1);
		product p2=new product(103,"Notebook",50,50);
                p2.displayProduct();
		s.addProduct(p2);
		product p3=new product(104,"paints",35,200);
                p3.displayProduct();
		s.addProduct(p3);
 		System.out.println("\n\n");
		
              // s.displayAllProducts();
	}
}

//----------------------------------------------------------------------------------
class Employeedetails
{
	String name;
	int  year;
	String address;
 
	Employeedetails(String name,int year,String address)
	{

	this.name=name;
	this.year=year;
	this.address=address;

	}
	void showDetails()
	{
	System.out.println(name+"\t\t"+year+"\t\t"+ address);
	}

	public static void main(String ...a)
	{
		Employeedetails e1=new Employeedetails("Devi",2003,"Tirunelveli");
		Employeedetails e2=new Employeedetails("Manju",2004,"Selam");
		Employeedetails e3=new Employeedetails("Thangam",2004,"Tirunelveli");
                System.out.println("Name\t\tYear\t\tAddress");
		e1.showDetails();
                e2.showDetails();
		e3.showDetails();
	}
}





