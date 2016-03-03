package Logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

	public class ForskydningskraftTest {

		

		

		public class TyngdekraftStub implements Tyngdekraft {

			@Override
			public double getTyngdekraft() {
				
				return 9.816;
			}

			@Override
			public void setTyngdekraft(double tyngdekraft) {
				fail();

			}

			@Override
			public void nulstil() {
			fail();

			}

		}

		@Test
		public void testDimensionerendeKraftTiKg() {
			Tyngdekraft tyngdekraft = new TyngdekraftStub();
			Vaegt vaegt = new VaegtStubTiKg();
			DimensionerendeKraft dk = new DimensionerendeKraftImpl(vaegt, tyngdekraft);
			
			assertEquals(98.16,dk.getDimensionerendeKraft(),0.001);
			
			 
		}
		public class VaegtStubTiKg implements Vaegt {

			@Override
			public double getVaegt() {
			
				return 10;
			}

			@Override
			public void setVaegt(double vaegt) {
				fail();

			}

			@Override
			public void nulstil() {
				fail();

			}

		}
		
		@Test
		public void testDimensionerendeKraftHalvKg() {
			Tyngdekraft tyngdekraft = new TyngdekraftStub();
			Vaegt vaegt = new VaegtStubHalvKg();
			DimensionerendeKraft dk = new DimensionerendeKraftImpl(vaegt, tyngdekraft);
			
			assertEquals(4.908,dk.getDimensionerendeKraft(),0.001);
			
			
		}
		public class VaegtStubHalvKg implements Vaegt {

			@Override
			public double getVaegt() {
				
				return 0.5;
			}

			@Override
			public void setVaegt(double vaegt) {
				fail();
			}

			@Override
			public void nulstil() {
				fail();

			}
	}
	
	
}
