package junit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class Verify
{
	Implement imp;
	@Before
	public void set()
	{
		imp=new Implement();
	}
	@Test
	public void firstChar()
	{
		assertEquals("BCD",imp.removeACharacter("ABCD"));
	}
	@Test
	public void firstTwoChars()
	{
		assertEquals("CD",imp.removeACharacter("AACD"));
	}
	@Test
	public void secondChar()
	{
		assertEquals("BCD",imp.removeACharacter("BACD"));
	}
	@Test
	public void noChar()
	{
		assertEquals("BBAA",imp.removeACharacter("BBAA"));
	}
	@Test
	public void nextChar()
	{
		assertEquals("BAA",imp.removeACharacter("AABAA"));
	}

}
