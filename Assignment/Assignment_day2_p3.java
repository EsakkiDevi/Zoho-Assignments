class binarysum//Sum of two binary strings
{
	public static void main(String args[])
	{
		String s1="11";
		String s2="1";
		String result="";
		int i=s1.length()-1;
		int j=s2.length()-1;
			int sum=0,carry=0;
		while(i>=0 || j>=0|| carry==1)
		{
                             sum=carry;
			if(i>=0)	
			{
                          
                                
				sum+=s1.charAt(i)-'0';
				i--;
                                
			}
                        if(j>=0)
			{
				sum+=s2.charAt(j)-'0';
          			j--;
                                
			}
 			result=String.valueOf(sum%2)+result;
			carry=sum/2;
			
		}
               System.out.println(result);
		
}
}
			
                   
//--------------------------------------------------------------------------------
class coltitle//Corresponding Column title
{
	public static void main(String args[])
	{
		int n=28;
          	String ans=alpha(n);
		System.out.println(ans);
             
   	}
 public static String alpha(int n)
	{
	String result="";
        if(n<=26)
	{
		int x=65+n-1;
               result=(char)x+result;
        }
	else
	{
		return alpha(n/26)+alpha(n%26);
        }
	return result;
	}
}

//----------------------------------------------------------
class reversevowel// Reverse the vowels in a string
{
	public static void main(String args[])
	{
	String s="letcod";
         char str[]=s.toCharArray();
	int l=0;
	int r=s.length()-1;
      while(l<r)
	{
	  if(isVowel(str[l]) && isVowel(str[r]))
		{
			char temp=s.charAt(l);
                        str[l]=str[r];
			str[r]=temp;
			l++;
                        r--;
		}
	else if(!isVowel(str[r]))
		{
			r--;
		}
        else
		{
			l++;
		}
       }
	s="";
	for(char c:str)
	{
		s+=c;
	}

	System.out.println(s);
      }

	
public static boolean isVowel(char c)
{
 return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
}
}	



//---------------------------------------------------------------------------------------------------------------
class extraletter// find the Extra character
{
	public static void main(String args[])
	{
		String s="abcd";
		String t="abcde";
 		char letter='a';
                int fre[]=new int[26];
		
		for(char c:s.toCharArray())
		{
		fre[c-'a']++;
		}
		for(char c:t.toCharArray())
		{
		fre[c-'a']--;
                if(fre[c-'a']<0)
			letter=c;
		}
		System.out.println("Extra Character:"+letter);
	}
}
//------------------------------------------------------------------------------------------------------------------------
class subsequence//Subsequence or not
{
	public static void main(String args[])
	{
		String s="abc";
		
		String t="abjhblc";
		
		int i=0;int j=0;
		while(j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
                                i++;
			}
			j++;
		}
 		System.out.println(i==s.length()-1);

	
	}
}
//--------------------------------------------------------------------------
class stringadd//Add two string numeric
{
	public static void main(String args[])
	{
		String s1="123";
		String s2="11";
                int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		System.out.println(n1+n2);
	}
}
	
//-----------------------------------------------------------------------------
class segmentcount// Count the words in the string
{
	public static void main(String args[])
	{
		String s="Hello, My name is John";
		String[] s1=s.split("!@#$%^&*()_+-=',.:");
		System.out.println(s1.length);
	}
}	
	
//-------------------------------------------------------------------------------------
class wordformat//Word is Correct format or not
{
	public static void main(String args[])
	{
		String s="LEEtcode";
		int n=s.length();
                int capscount=0;
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				capscount++;
			}
		}

      if(capscount==n) 
		{
			System.out.println("true");
			return;
		}
     else if(capscount==1 && Character.isUpperCase(s.charAt(0)))
		{
			System.out.println("true");
			return;
		}
     else	{
		System.out.println("false");
		}
	}
}
//---------------------------------------------------------------------------------------------	