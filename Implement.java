package junit;
public class Implement
{
	public String removeACharacter(String s)
	{
		char firstChar=s.charAt(0);
		char secondChar=s.charAt(1);
		if(firstChar=='a')
			if(secondChar=='a')
				return s.substring(2,s.length());
			else
				return s.substring(1,s.length());
		else
			if(secondChar=='a')
				return firstChar+""+s.substring(2,s.length());
		return s;
	}
}
