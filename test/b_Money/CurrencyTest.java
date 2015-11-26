package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;

    Double rate_SEK = 0.15;
    Double rate_DKK = 0.20;
    Double rate_EUR = 1.5;

	@Before
	public void setUp() throws Exception {
		/* Setup currencies with exchange rates */
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
	}

	@Test
	public void testGetName() {
		//fail("Write test case here");
        String msg = "wrong currency name";
        assertEquals(msg, "SEK", SEK.getName());
	}
	
	@Test
	public void testGetRate() {
		//fail("Write test case here");
        String msg = "wrong currency rate";
        assertEquals(msg, rate_SEK, SEK.getRate());

    }
	
	@Test
	public void testSetRate() {
        String msg = "wrong currency set rate";
        Double newRate = 0.77;

        SEK.setRate(newRate);
        assertEquals(msg, newRate, SEK.getRate());

    }
	
	@Test
	public void testGlobalValue() {
		//TODO
        //fail("Write test case here");
        String msg = "wrong test of GlobalValue";
        assertTrue(msg, SEK.universalValue(100).equals(15.0));
	}
	
	@Test
	public void testValueInThisCurrency() {

        //fail("Write test case here");
        String msg = "wrong ValueInThisCurrency"; //TODO
        assertTrue(msg, EUR.valueInThisCurrency(100, SEK).equals(10));
	}

}
