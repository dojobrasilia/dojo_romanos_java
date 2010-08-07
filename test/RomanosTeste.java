import org.junit.Assert;
import org.junit.Test;


public class RomanosTeste {

	@Test
	public void deveTraduzirDigitosSiples() {
		Assert.assertEquals(1, 
				Romanos.traduzir("I"));
		Assert.assertEquals(5,
				Romanos.traduzir("V"));
		Assert.assertEquals(10,
				Romanos.traduzir("X"));
		Assert.assertEquals(50,
				Romanos.traduzir("L"));
	}
	
	@Test
	public void deveResolverOsCasosDeSoma() {
		Assert.assertEquals(3, 
				Romanos.traduzir("III"));
		Assert.assertEquals(2, 
				Romanos.traduzir("II"));
		Assert.assertEquals(6,
				Romanos.traduzir("VI"));
		Assert.assertEquals(7,
				Romanos.traduzir("VII"));
		Assert.assertEquals(8,
				Romanos.traduzir("VIII"));
		Assert.assertEquals(18,
				Romanos.traduzir("XVIII"));
		
	}
	
	@Test
	public void deveTratarASubtracao() {
		Assert.assertEquals(4,
				Romanos.traduzir("IV"));
		Assert.assertEquals(9,
				Romanos.traduzir("IX"));
		Assert.assertEquals(14,
				Romanos.traduzir("XIV"));
	}
	
	@Test
	public void deveTratarCasosEstranhos() {
		Assert.assertEquals(44,
				Romanos.traduzir("XLIV"));
		Assert.assertEquals(47,
				Romanos.traduzir("XLVII"));
	}

	@Test
	public void deveTratarMaisDe3Is() {
		try {
			Romanos.traduzir("IIII");
			Assert.fail("Não deu exceção");
		} catch (Exception e) {
		}		
	}

	@Test
	public void deveTratarMaisDe3Xs() {
		try {
			Romanos.traduzir("XXXX");
			Assert.fail("Não deu exceção");
		} catch (Exception e) {
		}		
	}
	
}

