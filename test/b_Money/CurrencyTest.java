package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;

    Double rate_SEK = 0.15;
    Double rate_DKK = 0.20;
    Double rate_EUR = 1.5;
	String nameSEK = "SEK";
	String nameDKK = "DKK";
	String nameEUR = "EUR";

	@Before
	public void setUp() throws Exception {
		/* Setup currencies with exchange rates */
		SEK = new Currency(nameSEK, rate_SEK);
		DKK = new Currency(nameDKK, rate_DKK);
		EUR = new Currency(nameEUR, rate_EUR);
	}

	@Test
	public void testGetName() {
		//fail("Write test case here");
        String msg = "wrong currency name";
		//	Act
		String gottenNameFromSek = SEK.getName();

		//	Assert
        assertEquals(msg,  nameSEK, gottenNameFromSek);
	}

	//ok
	@Test
	public void testGetRate() {
		//fail("Write test case here");
        String msg = "wrong currency rate";

		//	Act
		Double gottenRateFromSEK = SEK.getRate();

		//	Assert
		assertEquals(msg, rate_SEK, gottenRateFromSEK);
    }

	//ok
	@Test
	public void testSetRate() {
        String msg = "wrong currency set rate";
		//	Arrange
        Double newRate = 0.77;

		//	Act
        SEK.setRate(newRate);

		//	Assert
		Double gottenRateFromSEK = SEK.getRate();
        assertEquals(msg, newRate, gottenRateFromSEK);

    }
	
	@Test
	public void testGlobalValue() {
        //fail("Write test case here");
        String msg = "wrong test of GlobalValue";
		//	Act
		Integer universalValueFromSek = SEK.universalValue(100);

		//	Assert
        assertTrue(msg, universalValueFromSek.equals(15));
	}
	
	@Test
	public void testValueInThisCurrency() {
        //fail("Write test case here");
        String msg = "wrong ValueInThisCurrency";

		//	Act
		Integer valueInEurFromSek = EUR.valueInThisCurrency(100, SEK);

		//	Assert
        assertTrue(msg, valueInEurFromSek.equals(10));
	}

}
