package interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.misc.FirstRecurringCharacter;

public class FirstRecurringCharacterTest {

	//https://javarevisited.blogspot.com/2021/10/how-to-find-first-recurring-character.html#ixzz7ALKsGJP4
	@Test
	public void firstRecurring() {
		assertEquals("A", FirstRecurringCharacter.get("ABCDA")); 
		assertEquals("A", FirstRecurringCharacter.get("ABCDAB")); 
		assertEquals("B", FirstRecurringCharacter.get("ABBCDA")); 
		assertEquals(null, FirstRecurringCharacter.get("ABCD"));

		assertEquals("P", FirstRecurringCharacter.get("PQRPT"));
		assertEquals("C", FirstRecurringCharacter.get("ABCCA"));
		assertEquals("O", FirstRecurringCharacter.get("GOOGL"));
	}

}
