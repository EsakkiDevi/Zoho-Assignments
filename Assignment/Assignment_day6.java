import arithmetic.addition;
import arithmetic.subtraction;
import arithmetic.multiplication;
import arithmetic.division;
import arithmetic.modulo;
import stringutils.concatenation;
import stringutils.reverse;
import stringutils.stringlength;
import travel.user.User;
import travel.booking.ticket;

import java.util.Scanner;


class payment
	{
	private int  transaction_Id;
	private String payer_name;
	private String payee_name;
	private float amount;
	private String payment_method;
	private String transaction_status;
  void setTransaction_Id(int transaction_Id)
	{
	this.transaction_Id=transaction_Id;

	}
 void setPayer_name(String payer_name)
	{
	this.payer_name=payer_name;

	}
 void setPayee_name(String payee_name)
	{
	this.payee_name=payee_name;

	}
 void setAmount(float amount)
	{
	this.amount=amount;

	}
 void setPayment_method(String payment_method)
	{
	this.payment_method=payment_method;

	}

 void setTransaction_status(String transaction_status)
	{
	this.transaction_status=transaction_status;

	}

  int getTransaction_Id()
	{
  	return transaction_Id;

	}
  String getPayer_name( )
	{
	return payer_name;

	}
 String  getPayee_name()
	{
	return payee_name;

	}
float getAmount()
	{
	return amount;

	}
String getPayment_method()
	{
	return payment_method;

	}

 String getTransaction_status()
	{
	return transaction_status;

	}
}

class PaymentGatewayTransaction
	{
	public static void main(String args[])
		{
		payment p=new payment();
		p.setTransaction_Id(123);
		p.setPayer_name("Devii");
		p.setPayee_name("Thangom");
		p.setAmount(2000);
		p.setPayment_method("UPI");
		p.setTransaction_status("SuccessFul");
         System.out.println("Transaction\tID\tPayer_Name\tPayee_Name\tAmount\tPayment_Method\tTransaction_Status");
	System.out.println("    "+p.getTransaction_Id()+"\t\t"+p.getPayer_name()+"\t\t"+p.getPayee_name()+"\t\t"+p.getAmount()+"\t\t"+p.getPayment_method()+"\t\t"+p.getTransaction_status());
		
		
			
		} 
	}
//----------------------------------------------------------------------------------------------------------------
class operations
	{
          public static void main(String args[])
	{
   System.out.println("Arithmetic Operations");
		int x=10;
		int y=5;
		addition a=new addition();
		subtraction s=new subtraction();
		multiplication m=new multiplication();
		division d=new division();
		modulo m1=new modulo();
                System.out.println("Addition:"+a.add(x,y));
		System.out.println("Subtraction:"+s.sub(x,y));
		System.out.println("Multiplication:"+m.multi(x,y));
		System.out.println("Division:"+d.divi(x,y));
		System.out.println("Modulo:"+m1.modu(x,y));
   System.out.println("\n\nString Operations");
		String s1="Tirunelveli";
		String s2="Junction";
                concatenation c=new concatenation();
		reverse r=new reverse();
		stringlength sl=new stringlength();
		System.out.println("String Concatenate:"+c.concat(s1,s2));
		System.out.println("String Reverse:"+r.rev(s1));
		System.out.println("String Length:"+sl.len(s1));
	}
	}

//-------------------------------------------------------------------------------------------------------------
class Employeesalary
{
    private int employee_Id;
    private String name;
    private String destination;
    private String department;
    private double monthly_salary;
    void setEmployee_Id(int employee_Id)
	{
		this.employee_Id=employee_Id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setDestination(String destination)
	{
		this.destination=destination;
	}
	void setDepartment(String department)
	{
		this.department=department;
	}
	void setMonthly_salary(double monthly_salary)
	{
		this.monthly_salary=monthly_salary;
	}

       int getEmployee_Id()
	{
          return employee_Id;
	}
	String getName()
	{
	  return name;
	}
	String getDestination()
	{
	  return destination;
	}
	String getDepartment()
	{
	 return department;
	}
	double getMonthly_salary()
	{
	 return monthly_salary;
	}

      double calculateAnnual()
	{
		return 12*monthly_salary;
	}

}
  
class Employeeannual
	{
	public static void main(String args[])
	{
	Employeesalary  e=new Employeesalary();
	e.setEmployee_Id(123);
	e.setName("Dhevii");
	e.setDestination("junior d");
	e.setDepartment("Designing");
	e.setMonthly_salary(20000);	
	System.out.println("Employee Id:"+e.getEmployee_Id());
	System.out.println("Name:"+e.getName());
	System.out.println("Destination:"+e.getDestination());
	System.out.println("Departmet:"+e.getDepartment());
	System.out.println("Monthly Salary:"+e.getMonthly_salary());
	System.out.println("Annual Salary:"+e.calculateAnnual());
	}
	}
//--------------------------------------------------------------------------------	  

class ticketBooking
	{
	public static void main(String args[])
		{
                         ticket t=new ticket();
			//ticket t=new ticket(12,"Coimbatore",450);
                        User u=new User("devi",21);
                        System.out.println("User ticket Booking Details");
			System.out.println("Passenger Name:"+u.getName());
			System.out.println("Passenger age:"+u.getAge());
			System.out.println("Ticket Id:"+t.getTicket_id());
			System.out.println("Destination:"+t.getDestination());
			System.out.println("Fare:"+t.getFare());
			System.out.println(t.status());
		}
	}

//----------------------------------------------------------------------------------------
class Banking
	{
          private String account_number;
	  private String account_holder_name; 
	  private double balance;
          
	void setAccount_number(String account_number)
	{
		this.account_number=account_number;

	}
	void setAccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;

	}
	void setBalance(double balance)
	{
		this.balance=balance;

	}
	String getAccount_holder_name()
	{
		return account_holder_name;
	}
	String getAccount_number()
	{
		return account_number;
	}
	double getBalance()
	{
		return balance;
	}

} 

class Bankingsystem
	{
		public static void main(String args[])
		{
 				Scanner s=new Scanner(System.in);
			Banking b=new Banking();
			b.setAccount_number("12345678");
			b.setAccount_holder_name("Dhevi");
			b.setBalance(1000);

			System.out.println("Your Account Details");
			System.out.println("Account Holder Name: "+b.getAccount_holder_name());
			System.out.println("Account Number:"+b.getAccount_number());
			System.out.println("Account Balance:"+b.getBalance());

			while(true)
			{

                        System.out.println("Choose your option:\n1.Deposit\n2.Withdraw\n3.Exit");
			int option=s.nextInt();
                        switch(option)
			{
			case 1:
				System.out.println("Enter the amonut to deposite:");
				int amount=s.nextInt();
                                b.setBalance(b.getBalance()+amount);
                                System.out.println("Current Balance:"+b.getBalance());
				break;
			case 2:
				System.out.println("Enter the amount to Withdraw:");
				amount=s.nextInt();
 				int minimum=500;
				if(b.getBalance()>minimum)
					{
						if(b.getBalance()-amount>=minimum)
								{
                                                                  b.setBalance(b.getBalance()-amount);
								  System.out.println("Current balance:"+b.getBalance());
								}
						else
								{
								System.out.println("Insufficient amount ");
					 			}   
					}
				else
					{
						System.out.println("Your Minimum Balance "+minimum);
					}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Option....Try again");
			}
		}

				
                        
		}
	}         