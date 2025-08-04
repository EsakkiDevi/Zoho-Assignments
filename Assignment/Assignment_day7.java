import java.util.Scanner;
class Customer
	{
	private String name;
	private String address;
	private String Phn_no;
	
	
	Customer(String name,String address,String Phn_no)
	{
		this.name=name;
		this.address=address;
		this.Phn_no=Phn_no;
	}


        void setName(String name)
		{
			this.name=name;
		}

	void setAddress(String address)
		{
			this.address=address;
		}
	void setPhn_no(String Phn_no)
		{
			this.Phn_no=Phn_no;
		}
	
	String getName()
		{
			return name;
		}
	String getAddress()
		{
			return address;
		}
	String getPhn_no()
		{
			return Phn_no;
		}
	
      /*  void displaycustomerdetails()
		{
			System.out.println("Customer Name:"+name);
			System.out.println("Address:"+address);
			System.out.println("Phone Number:"+Phn_no);
			System.out.println("Age:"+age);
		}*/
        }
class Account
	{
	private Customer account_holder;
	private String account_number;
	private double balance;

	public Account(String account_number,double balance,Customer account_holder)
		{
			this.account_number=account_number;
			this.balance=balance;
			this.account_holder=account_holder;
		}
	void setAccount_holder(Customer account_holder)
		{
			this.account_holder=account_holder;
		}
	void setAccount_number(String account_number)
		{
			this.account_number=account_number;
		}
	
	void setBalance(double balance)
		{
			this.balance=balance;
		}
	public Customer getAccount_holder()
		{
			return account_holder;
		}
	public String getAccount_number()
		{
			return account_number;
		}
	
	public double getBalance()
		{
			return balance;
		}
	
        /* void displayaccountdetails()
		{
			System.out.println("Account Number:"+account_number);
			System.out.println("Account Holder Name:"+account_holder_name);
			System.out.println("Account Type:"+account_type);
			System.out.println("Account Balance:"+balance);
		}*/
	public void deposit(double amount)
		{
		if(amount>0)
		{
			this.balance+=amount;
			System.out.println("Current Balance:"+this.balance);
		}
		else
		{
			System.out.println("Invalid Amount to Deposite");
		}
		}
	
	public boolean withdraw(double amount,double maxWithdrawalLimit)
		{
			if(amount>0 && this.balance>=amount && amount  <= maxWithdrawalLimit)
			{
				this.balance-=amount;
				System.out.println("Current Balance:"+this.balance);
				return true;
			}
			else

			{
				System.out.println("Withdrawal Failed....Check Amount,Balance,Withdrawal Limit");
				return false;
			}
		}
	
}

class RBI
	{
	private double interestrate=0.04;
	private double  withdrawal_limit=50000;
	private double minimum_balance=1000;
		
	
    	private Customer customer;
    	private Account account;

	public RBI(Customer customer,Account account)
	{
		this.customer=customer;
		this.account=account;

	}

	void  setInterestrate(double interestrate)
	{
		this.interestrate=interestrate;
	}
	void setWithdrawal_limit(double withdrawal_limit)
	{
		this.withdrawal_limit=withdrawal_limit;
	}
	void setMinimumbalance(double minimum_balance)
	{
		this.minimum_balance=minimum_balance;
	}	
	double getInterestrate()
	{
		return interestrate;
	}
	double getWithdrawal_limit()
	{
		return withdrawal_limit;
	}
	double getMinimumbalance()
	{
		return minimum_balance;
	}
		
}
class SBI extends RBI
	{
		public SBI(Customer customer,Account account)
		{
			super(customer,account);
		}

		public double getInterestrate(Account account)
		{
			if(account.getBalance()>50000)
			{
				return 0.045;
			}
			else
			{
				return getInterestrate();
			}
		}

		public boolean withdrawalprocess(Account account,double amount)
		{
			return account.withdraw(amount,getWithdrawal_limit());
		}

	}

class ICICI extends RBI
	{
		public ICICI(Customer customer,Account account)
		{
			super(customer,account);
		}

		public double getWithdrawal_limit()		{
			return super.getWithdrawal_limit();
		}

	}




class Mainbank
	{
	public static void main(String args[])
		{
			Customer c1=new Customer("Dinesh","123,Mainroad,Nellai","6382787140");
			Account a1=new Account("SB001",15000,c1);
			SBI sbi1=new SBI(c1,a1);
			System.out.println("Customer Name:"+c1.getName());
			System.out.println("Account Number:"+a1.getAccount_number());
			System.out.println("Balance:"+a1.getBalance());
			
			a1.deposit(5000);
			sbi1.withdrawalprocess(a1,2000);
			sbi1.withdrawalprocess(a1,30000);
			System.out.println("SBI Interest Rate forAccount:"+(sbi1.getInterestrate(a1)*100)+"%");

		
			
	    
		}

	}


//------------------------------------------------------------------------------------------------------------------------------
interface Paymentmethod
	{
		void pay(double amount);
		
	}
class Creditcardpayment implements Paymentmethod
	{
		private String account_holder_name;
		private String card_number;
		

		Creditcardpayment(String account_holder_name,String card_number)
		{	
                   this.account_holder_name=account_holder_name;
		   this.card_number=card_number;
		}
		public void pay(double amount)
		{	
			System.out.println("Payment Method-->Credit Card");
			System.out.println("----------------------------");
			System.out.println("Account Holder Name:"+account_holder_name);
			System.out.println("Accoount Card Number:"+card_number);
			System.out.println("Amount:"+amount);
		}
	}

class Debitcardpayment implements Paymentmethod
	{	
		private String account_holder_name;
		private String account_number;
		private String bank_name;
		
		Debitcardpayment(String account_holder_name,String account_number,String bank_name)
		{
			this.account_holder_name=account_holder_name;
			this.account_number=account_number;
			this.bank_name=bank_name;
		}

		public void pay(double amount)
		{
			System.out.println("Payment Method-->Debi Card");
			System.out.println("----------------------------");
			System.out.println("Account Holder Name:"+account_holder_name);
			System.out.println("Account Number:"+account_number);
			System.out.println("Bank Name:"+bank_name);
			System.out.println("Amount:"+amount);
			
		}
	}

class Upiidpayment  implements Paymentmethod
	{
		private String upi_id;
		Upiidpayment(String upi_id)
		{
			this.upi_id=upi_id;
		}
		
		public void pay(double amount)
		{
			System.out.println("Payment Method-->UPI id");
			System.out.println("----------------------------");
			System.out.println("UPI id:"+upi_id);
			System.out.println("Amount:"+amount);
			
		}

		
	}

class MainPayment
	{
	public static void main(String args[])
		{
			 Creditcardpayment  cp=new  Creditcardpayment("Devi","8976 7654 0987");
				cp.pay(1000);
			 Debitcardpayment  dp=new Debitcardpayment("Thangam","100097363","IOB");
				dp.pay(500);
			Upiidpayment up=new Upiidpayment("TNS12345789706543987");
				up.pay(5500);
		}
	}
			
//-------------------------------------------------------------------------------------------------------------------------------
abstract class Employ
	{
		Scanner s=new Scanner(System.in);
		
		String emp_name;
		String emp_id;
		int id=1;
		void Empdetails(char c)
		{
			System.out.println("Enter the Name:");
			emp_name=s.nextLine();
			if(c=='f')
				emp_id ="FTE001";
			else
				emp_id ="PTE001";
			
		}
		abstract  double calculateSalary();
		void showdetails()
		{
			System.out.println("Employee Name:"+emp_name);
			System.out.println("Employee Id:"+emp_id);

		}
		
	}
class FullTimeEmployee extends Employ
	{
		double monthly_salary=30000;
		char c='f';
		void Empdetails()
		{
			super.Empdetails(c);
			
		}

		double calculateSalary()
		{	
			return monthly_salary;
		}
		
		void showdetails()
		{
			System.out.println("Full Time  Work Employee Details");
			System.out.println("--------------------------------");
			super.showdetails();
			System.out.println("Salary per Month:"+calculateSalary());
		}
		
		
		
	}
class PartTimeEmployee extends Employ
	{
		int workhour;
		double salaryperhour=150;
		char c='p';
		Scanner s=new Scanner(System.in);
		void Empdetails()
		{
			super.Empdetails(c);
			System.out.println("Working Hour per Day:");
			workhour=s.nextInt();
		}
		double calculateSalary()
		{	
			return (double)workhour*salaryperhour;
		}

		void showdetails()
		{
			System.out.println("Part Time  Work Employee Details");
			System.out.println("--------------------------------");
			super.showdetails();
			System.out.println("Salary per day:"+calculateSalary());
		}
		
	
	}

class MainEmploy
	{
		public static void main(String args[])
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Choose 1 for Full Time Job");
				System.out.println("Choose 2 for Part Time Job");
				
				int choice=s.nextInt();
				
				if(choice==1)
				{
				FullTimeEmployee f1=new FullTimeEmployee();
				f1.Empdetails();
				f1.showdetails();
				}
				else
				{
				PartTimeEmployee p1=new PartTimeEmployee();
				
				p1.Empdetails();
				
				p1.showdetails();
				}
			}
	}

//-------------------------------------------------------------------------------------------------
interface interfaceEmployee
	{
		
		
		
		 double calculateSalary();
		
		
	}

class FEmployee implements interfaceEmployee
	{
		double monthly_salary=30000;
		Scanner s=new Scanner(System.in);
		String name;
		void Empdetails()
		{
			System.out.println("Enter the Name:");
			name=s.nextLine();
		}

		public double calculateSalary()
		{	
			return monthly_salary;
		}
		
		void showdetails()
		{
			System.out.println("Full Time  Work Employee Details");
			System.out.println("--------------------------------");
			System.out.println("Employee Name:"+name);
			System.out.println("Salary per Month:"+calculateSalary());
		}
		
		
		
	}
class PEmployee implements interfaceEmployee
	{
		int workhour;
		double salaryperhour=150;
		String name;
		Scanner s=new Scanner(System.in);
		void Empdetails()
		{
			System.out.println("Enter the Name:");
			name=s.nextLine();
			System.out.println("Working Hour per Day:");
			workhour=s.nextInt();
		}
		public double calculateSalary()
		{	
			return (double)workhour*salaryperhour;
		}

		void showdetails()
		{
			System.out.println("Part Time  Work Employee Details");
			System.out.println("--------------------------------");
			System.out.println("Employee Name:"+name);

			System.out.println("Salary per day:"+calculateSalary());
		}
		
	
	}

class Employyee
	{
		public static void main(String args[])
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Choose 1 for Full Time Job");
				System.out.println("Choose 2 for Part Time Job");
				
				int choice=s.nextInt();
				
				if(choice==1)
				{
				FEmployee f1=new FEmployee();
				f1.Empdetails();
				f1.showdetails();
				}
				else
				{
				PEmployee p1=new PEmployee();
				
				p1.Empdetails();
				
				p1.showdetails();
				}
			}
	}

//-----------------------------------------------------------------------------
interface ticket
	{
		
		void bookticket();
		
	}	
class trainticket implements ticket
	{
		Scanner s=new Scanner(System.in);
		String source;
		String destination;
		int fare=200;
		void details()
		{
			System.out.println("Enter the Source Station:");
			source=s.nextLine();
			System.out.println("Enter the Destination Station:");
			destination=s.nextLine();
			
		}
		public void bookticket()
		{
			System.out.println("Train Ticket Booking");
			System.out.println("--------------------");
			System.out.println("Source Station:"+source);
			System.out.println("Destination Station:"+destination);
			System.out.println("Fare of Travelling:"+fare);
		}
		
		
	}
class flightticket implements ticket
	{
		Scanner s=new Scanner(System.in);
		String source;
		String destination;
		int fare=5000;
		void details()
		{
			System.out.println("Enter the Source Station:");
			source=s.nextLine();
			System.out.println("Enter the Destination Station:");
			destination=s.nextLine();
			
		}
		public void bookticket()
		{
			System.out.println("Flight Ticket Booking");
			System.out.println("--------------------");
			System.out.println("Source Station:"+source);
			System.out.println("Destination Station:"+destination);
			System.out.println("Fare of Travelling:"+fare);
		}
		
		
	}	
class busticket implements ticket
	{
		Scanner s=new Scanner(System.in);
		String source;
		String destination;
		int fare=70;
		void details()
		{
			System.out.println("Enter the Source Station:");
			source=s.nextLine();
			System.out.println("Enter the Destination Station:");
			destination=s.nextLine();
			
		}
		public void bookticket()
		{
			System.out.println("Bus Ticket Booking");
			System.out.println("--------------------");
			System.out.println("Source Station:"+source);
			System.out.println("Destination Station:"+destination);
			System.out.println("Fare of Travelling:"+fare);
		}
		
		
	}	
class Mainticketbooking
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Choose ticket booking");
			System.out.println("1 for trainticket booking");
			System.out.println("2 for flightticket booking");
			System.out.println("3 for busticket booking");
			int choose=s.nextInt();
			if(choose==1)
			{
			trainticket tt=new trainticket();
			tt.details();
			tt.bookticket();
			}
			if(choose==2)
			{
			flightticket ft=new flightticket();
			ft.details();
			ft.bookticket();
			}
			if(choose==3)
			{
			busticket bt=new busticket();
			bt.details();
			bt.bookticket();
			}
			
			
			

			
		}
	}