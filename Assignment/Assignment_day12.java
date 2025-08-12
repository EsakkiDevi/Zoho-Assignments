import java.io.*;
import java.util.*;
class MyThread extends Thread
	{
		public void run()
		{	
				try
				{
				for(int i=0;i<5;i++)
				{
				System.out.println("Thread Name "+(i+1)+" :"+Thread.currentThread().getName());
				Thread.sleep(500);
				}
				}
				catch(Exception e)
				{
				}
				
		}
	}
class MainThread
	{
	public static void main(String args[])
		{
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		System.out.println("This is Main Thread");
	
		}
	}
//----------------------------------------------------------------------------------------
class TaskRunner implements Runnable
	{

		String task;
		public TaskRunner(String task) {
            		this.task = task;
      			 }
		public void run()
		{
			
			try
			{
				for(int i=0;i<10;i++)
				{
				System.out.println("Thread "+task+""+(i+1)+" Name "+Thread.currentThread().getName());
				Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
			}
			
		}
	}
class MainTaskrunner
	{
	public static void main(String args[])
		{
		 TaskRunner task1 = new TaskRunner("Task A");
            	 TaskRunner task2 = new TaskRunner("Task B");

           	//t1.setName("thread-A");
		//t2.setName("thread-B");
            Thread t1 = new Thread(task1);
            Thread t2 = new Thread(task2);
		
           	t1.setName("thread-A");
		t2.setName("thread-B");
		t1.start();
		t2.start();

		
		}
	}
//---------------------------------------------------------------------------------------
class prints
	{
		int n=20;
		int i=1;
		public synchronized void printodd()
		{
			while(i<=n)
			{
			if(i%2==1)
				{
					System.out.println("Odd:"+i);
					i++;
					notify();
				}
			else
				{
					try{
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}

			}
		}
		
		public synchronized void printeven()
		{
			while(i<=n)
			{
			if(i%2==0)
				{
					System.out.println("Even:"+i);
					i++;
					notify();
				}
			else
				{
					try{
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}

			}
		}

	}
class oddeven
	{
		public static void main(String args[])
		{
			prints p=new prints();
			thread1 t1=new thread1(p);
			thread2 t2=new thread2(p);
			t1.start();
			t2.start();
		
		}
	}
class thread1 extends Thread
{
	prints p;
	
	thread1(prints p)
	{
	this.p=p;
	}
	
	
	public void run()
		{
			p.printodd();
		}
}
class thread2 extends Thread
{
	prints p;
	
	thread2(prints p)
	{
	this.p=p;
	}
	public void run()
		{
			p.printeven();
		}
}
//--------------------------------------------------------------------------
class threadcount extends Thread
	{
		counting c;
		threadcount(counting c)
		{
			this.c=c;
		}
		public void run()
		{
			for(int i=0;i<1000;i++)
			{
			
			c.countincrement();
			}
		}	
	}
class counting
	{
		int count;
		public synchronized void countincrement()
		{
			count++;
		}
		public int getCount()
		{
			return count;
		}		
		
	}
class countMain
	{
		public static void main(String args[])
		{
			counting c=new counting();
			threadcount c1=new threadcount(c);
			c1.setName("T1");
			threadcount c2=new threadcount(c);
			c2.setName("T2");
			threadcount c3=new threadcount(c);
			c3.setName("T3");
			c1.start();
			
			c2.start();
			c3.start();
		
			try
			{
				c1.join();
				c2.join();
				c3.join();	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Total Count:"+c.getCount());
		}
	}
//--------------------------------------------------------------------------------------------------------
class ATM
	{
	private static int balance=5000;
	public synchronized boolean checkPin(int pin)
	{
		System.out.println("Checking Pin....!");
		if(pin==1234)		
		{
			System.out.println("Pin Correct...");
			return true;
		}
		else
		{
			System.out.println("Invalid Pin...");
			return false;
		}
	}
	
	public static void withdraw(int amount)
	{
		System.out.println("Processing Withdraw....!");
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("Withdrawal Successful.....!\nAmount: "+amount);
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
		
	}


	public synchronized void checkBalance()
	{
		System.out.println("Your Balance:"+balance);
	}
	public synchronized void printReceipt()
	{
		System.out.println("Printing Receipt Transaction Completed...!");
	}
		
	}
class Atmdemo
	{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		ATM atm=new ATM();
		System.out.println("Enter Your Pin:");
		int atmpin=s.nextInt();
		Thread t1=new Thread(()->{
			if(atm.checkPin(atmpin))
		{
			//System.out.println("1.Withdraw\n2.CheckBalance");
			//int option=s.nextInt();
			//if(option==1)
			//{
			//System.out.println("Enter the amount to withdraw:");
			//int amount=s.nextInt();
			Thread t2=new Thread(()->atm.withdraw(2000));
			//}
			//if(option==2)
			//{
			Thread t3=new Thread(()->atm.checkBalance());
			//}
			Thread t4=new Thread(()->atm.printReceipt());
			t2.start();
			try
			{
			t2.join();
			}
			
			catch(Exception e){}
			
			t3.start();
			try
			{
			t3.join();
			}
			catch(Exception e){}
			t4.start();
		}
	});

		t1.start();

		
	}
	}
//----------------------------------------------------------------------

class SharedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int maxSize = 5;

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == maxSize) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

 class ProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}