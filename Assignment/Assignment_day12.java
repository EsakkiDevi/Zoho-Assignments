import java.io.*;
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

class oddeven implements Runnable
	{
		public void run()
		{
			try
			{
				for(int i=1;i<=20;i++)
				{
					if(i%2==1)
					{
					System.out.println("Thread "+name+" print odd number "
			}
	}
class MainOddEven
	{
		
	}