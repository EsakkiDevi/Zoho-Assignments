import java.util.*;
import java.util.ListIterator;
class colors
	{
	public static void main(String args[])
		{
		ArrayList<String> color=new ArrayList<>();
		color.add("red");
		color.add("yellow");
		color.add("green");
		color.add("violet");
		color.add("black");
		color.add("white");
		
				

		System.out.println("iterate elements");			//iterate elements
		System.out.println("----------------");
		Iterator itr=color.iterator();
		while(itr.hasNext())
		{
		System.out.print(itr.next()+" ");
                }
		
		color.add(0,"blue");					//add element in first position
		System.out.println("\nAdd Element in first position"+color);
		
		 
		
		int i=3;
		System.out.println("\nRetrive element by index");		//retrive element
		System.out.println(i+" th position element is "+color.get(i));
		
		color.set(3,"Orange");	
		System.out.println("\nUpdate Element"+color);
		
		color.remove(4);
		System.out.println("\n\nRemove Element"+color);
		
		String search="violet";
		if(color.contains(search))
		System.out.println("\nSearched element: "+search+"  is found in the list");
		else
		System.out.println("\nSearched element: "+search+" not found in the list");

		Collections.sort(color);
		System.out.println("\nSorted List"+color);

		ArrayList<String> copy=new ArrayList<>(color);
		System.out.println("\nCopied List:"+copy);
		
		Collections.shuffle(color);
		System.out.println("\nShuffled List:"+color);

	}	
		
		


}
//-----------------------------------------------------------------------------------------------
class linkedlist
	{
	public static void main(String args[])
		{
		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("jack");	
		fruits.add("guava");

	    Iterator it=fruits.iterator();
		System.out.println("Iteration list Elemnts");
		System.out.println("----------------------");
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}


		ListIterator<String> listIterator=fruits.listIterator(2);
		System.out.println("\nIteration list Elements by specified position");
		System.out.println("------------------------------------------------");
		while(listIterator.hasNext())
		{
		System.out.print(listIterator.next()+" ");
		}

		Collections.reverse(fruits);
		System.out.println("\nReverse Order:"+fruits);

		fruits.add(3,"mango");
		System.out.println("\nInsert the specified element at the specified position:"+fruits);

		fruits.addFirst("Sapota");
		fruits.addLast("red banana");
		System.out.println("\nInsert elements into first and last position:"+fruits);
            	
		fruits.offerFirst("Water melon");
		System.out.println("\nInsert into front of a linked list:"+fruits);

		fruits.offerLast("stawberry");
		System.out.println("\nInsert into end of a linked list:"+fruits);
		
		List<String> extrafruits=new LinkedList<>();
		extrafruits.add("orange");
		extrafruits.add("grapes");
		fruits.addAll(2,extrafruits);
		System.out.println("\nExtra elements add Specific Position:"+fruits);
	
		fruits.add(7,"Sapota");
		System.out.println("\n"+fruits);
		System.out.println("\nFirst Occurence of Sapota:"+fruits.indexOf("Sapota"));
		System.out.println("\nLast Occurence of Sapota:"+fruits.lastIndexOf("Sapota"));

		}
	
	}

//----------------------------------------------------------------------------------------------------
class hashset
	{
		public static void main(String args[])
		{
			HashSet<String> set=new HashSet<>();
			set.add("devi");
			set.add("thangam");
			set.add("sindu");
			set.add("jeya");
			set.add("nachiyar");
			
		System.out.println("Iterate Elements:"+set);
		System.out.println("\nNumber of Elements:"+set.size());

		set.clear();
		System.out.println("\nEmpty the set:"+set);
		
		System.out.print("\nSet empty or not Check:");
		if(set.isEmpty())
		System.out.println("Set is Empty");
		else
		System.out.println("Set is not Empty");

		
			set.add("devi");
			set.add("thangam");
			set.add("sindu");
			set.add("jeya");
			set.add("nachiyar");
			
		HashSet<String> setcopy=new HashSet<>(set);
		System.out.println("\nCopied set:"+setcopy);
			
			
		String arr[]=new String[set.size()];
		int i=0;
		for(String s:set)
		{
		arr[i++]=s;
		}
		
		System.out.print("\nArray  Elements: ");
		for(String s:arr)
		{
			System.out.print(s+" ");
		}
		
		TreeSet<String> tree=new TreeSet<>(set);
		System.out.println("\n\nTreeSet:"+tree);

		ArrayList<String>  arraylist=new ArrayList<>(set);
		System.out.println("\nArrayList:"+arraylist);


		HashSet<String> set2=new HashSet<>();
		set2.add("thangam");
		set2.add("devi");
		set2.add("jeya");
		set2.add("sindu");
		set2.add("nachiyar");
		
		System.out.println("\nSet1 and Set2 Are Equal:"+set.equals(set2));

		
		}
	}
//--------------------------------------------------------------------------------------
class treeset
	{
	public static void main(String args[])
		{
			TreeSet<String> col=new TreeSet<>();
			col.add("violet");
			col.add("indico");
			col.add("blue");
			col.add("green");
			col.add("yellow");
			col.add("orange");
			col.add("red");

			System.out.println("TreeSet:"+col);
			
			TreeSet<String> copytree=new TreeSet<>(col);
			System.out.println("\nCopied TreeSet:"+copytree);

			NavigableSet<String> reverseset=col.descendingSet();
			System.out.println("\nReversed Set:"+reverseset);
		
			String firstelement="";
			for(String s:col)
			{
			firstelement=s;
			break;
			}
			System.out.println("\nFirst Element in the set:"+firstelement);
			
			String lastelement="";
			for(String s:col)
			{
			lastelement=s;
			}

			System.out.println("\nLast Element in the set:"+lastelement);


			   @SuppressWarnings("unchecked") //it tells to complier it safe casting method
			TreeSet<String> ClonedTreeSet=(TreeSet<String>) col.clone();
			
			System.out.println("\nCloned TreeSet:"+ClonedTreeSet);
			
			System.out.println("\nNumber Of Elements in Set:"+col.size());
		
			System.out.println("\nTreeSet col & TreeSet reverseset Are Equal:"+col.equals(reverseset));

			TreeSet<Integer> nums=new TreeSet<>();
			nums.add(1);
			nums.add(2);
			nums.add(4);
			nums.add(7);
			nums.add(90);
			nums.add(65);
			nums.add(5);
			nums.add(31);
			

			System.out.println("\nNumbers Less than 7 in the Set");
			for(int n:nums)
			{
			if(n<7)
			System.out.print(n+" ");

			}

			int greater=nums.ceiling(9);
			System.out.println("\nGreater and equal value of given value:"+greater);
			
			int less=nums.floor(40);
			System.out.println("\nLess and equal value of given value:"+less);
			
			
			int sgreat=nums.higher(17);
			System.out.println("\nStrictly  Greater and equal value of given value:"+sgreat);
			
			int sless=nums.lower(27);
			System.out.println("\nStrictly  less and equal value of given value:"+sless);
		
		        System.out.println("\nRemove and Retrive first element:"+nums.pollFirst());
			
			System.out.println("\nRemove and Retrive last element:"+nums.pollLast());
			
			int given=5;
			System.out.println("\nRemove given Element:"+nums.remove(given));
			System.out.println("After Removing TreeSet:"+nums);
			
		}
	}

//---------------------------------------------------------------------------------------------------------------------
class priority
	{
		public static void main(String args[])
		{
			PriorityQueue<String> pq=new PriorityQueue<>();
			pq.add("violet");
			pq.add("indico");
			pq.add("blue");
			pq.add("green");
			pq.add("yellow");
			pq.add("orange");
			pq.add("red");
			System.out.print("Iterating the PriorityQueue : ");
		for(String s:pq)
			{
			System.out.print(s+" ,");
			}
		PriorityQueue<String> pq2=new PriorityQueue<>(pq);
		System.out.println("\n\nanother copied queue:"+pq2);

		pq2.add("maron");
		System.out.println("\nInsert Element:"+pq2);

		pq2.clear();
		System.out.println("\nRemoving All Elements from queue:"+pq2);
		
		System.out.println("\nSize of the queue:"+pq.size());

		System.out.println("\nQueue pq & pq2 are Equal:"+pq.equals(pq2));

		System.out.println("\nFirst Element in the queue:"+pq.peek());
		
		System.out.println("\nRetrieve & remove first element:"+pq.poll());
		System.out.println("\nAfter Removing first element:"+pq);
		
		String[] arr=new String[pq.size()];
		int i=0;
		for(String s:pq)
		{
			arr[i++]=s;
		}
		System.out.print("\nQueue converts to array: ");
		for(String s:arr)
		{
			System.out.print(s+" ,");

		}

		
		}
	}
//-------------------------------------------------------------------------------------
class treemap
	{
	public static void main(String args[])
		{
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1,"devi");
		tm.put(2,"thangam");
		tm.put(3,"sindu");
		tm.put(4,"shree");
		System.out.println("TreeMap ");
		for(Map.Entry<Integer,String> en:tm.entrySet())
		{
		System.out.println("Key:"+en.getKey()+" Value:"+en.getValue());

		}
		

		TreeMap<Integer,String> copytm=new TreeMap<>();
		copytm.putAll(tm);

		System.out.println("\nCopied  TreeMap ");
		for(Map.Entry<Integer,String> en:copytm.entrySet())
		{
		System.out.println("Key:"+en.getKey()+" Value:"+en.getValue());

		}

		int key=3;
		System.out.println("\nSearch the Given key :"+tm.containsKey(key));
		
		tm.clear();
		System.out.println("\nAfter Removing all elements:");
		for(Map.Entry<Integer,String> en:tm.entrySet())
		{
		System.out.println("Key:"+en.getKey()+" Value:"+en.getValue());

		}

		System.out.println("\nAll the key values:"+copytm.keySet());

		TreeMap<Integer,String>  nums=new TreeMap<>(Comparator.naturalOrder());
		nums.put(5,"Five");
		nums.put(1,"One");
		nums.put(7,"Seven");
		nums.put(2,"two");
		System.out.println("\nIn SortedOrder:");
		for(Map.Entry<Integer,String> en:nums.entrySet())
		{
		System.out.println("Key:"+en.getKey()+" Value:"+en.getValue());

		}

		System.out.println("Lowest key :"+nums.firstKey());
		System.out.println("Greatest Key:"+nums.lastKey());
		
		NavigableSet<Integer> revorder=nums.descendingKeySet();
		System.out.println("\nIn Reverse Order:"+revorder);
		
		
				
		}

}

//---------------------------------------------------------------------------------------	
class hashmap
	{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"devi");
		hm.put(2,"thangam");
		hm.put(3,"sindu");
		hm.put(4,"shree");
		System.out.println("HashMap "+hm);
		


		System.out.println("\nSize of the Hashmap:"+hm.size());

		HashMap<Integer,String>  copiedhm=new HashMap<>(hm);
		System.out.println("\nCopied HashMap "+copiedhm);
		

		copiedhm.clear();
		System.out.println("After deleting All elements:"+copiedhm);
		
		

		System.out.println("\nHashMap id Empty:"+hm.isEmpty());
		@SuppressWarnings("unchecked") 
		HashMap<Integer,String> clonedhm=(HashMap<Integer,String>)hm.clone();
		System.out.println("\nCloned HashMap:"+clonedhm);


		
		int checkKey=4;
		System.out.println("\nMap Contains given key:"+hm.containsKey(checkKey));
		
		String checkValue="devi";
		System.out.println("\nMap Contains given Value:"+hm.containsValue(checkValue));
		

		System.out.println("\nEntry set of hashmap");
		for(Map.Entry<Integer,String> es:hm.entrySet())
		{
		System.out.println("key:"+es.getKey()+"\tValue:"+es.getValue());
		}

		
		int key=2;
		System.out.println("\nGet Value by key:"+hm.get(key));
		
	}
	}
//----------------------------------------------------------------------------------------------
class bankAccount
	{
		String acno;
		String ac_holder_name;
		double balance;
		
		bankAccount(String acno,String ac_holder-name,String balance);
		{
		this.acno=a/cno;
		this.ac_holder_name=ac_holder_name;
		this.balance=Double.parseDouble(balance);

		}
		double calculateinterest()
		{
			return this.balance*0.05;
		}
		void  display()
		{
			System.out.println("AccountHolder Name:"+this.ac_holder_name);
			System.out.println("Account Number:"+this.acno);
			System.out.println("Balance:"+this.balance);
			System.out.println("Interest of the balance:"+calculateinterest());
			System.out.println("Total Account balance with interest:"+(calculateinterest()+this.balance);
		}

	}
class MainBankinterest
		{
		public static void main(String args[])
			{
			ArrayList<List<String>> account=new ArrayList<>();
			account.add(new bankAccount("100000098","devi","1000");
			account.add(new bankAccount("100000099","thangam","2000");
			account.add(new bankAccount("100000100","dinesh","5600");
			}
		}