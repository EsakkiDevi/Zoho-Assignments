package stringutils;
public class reverse
{
  public String rev(String s)
	{
		String result="";
		for(int i=s.length()-1;i>=0;i--)
		{
			result+=s.charAt(i);
		}
		return result;
	}
}
	