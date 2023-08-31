package edu.disease.asn1;


	
	import static org.junit.Assert.assertFalse;
	import static org.junit.Assert.assertNotNull;
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertEquals;
	import java.time.LocalDateTime;
	import java.util.UUID;
	import org.junit.Before;
	import org.junit.Test;
	import edu.disease.asn1.Exposure;
	
	
public class ExposureTest {
		private Exposure exposure;
		
		@Before
		public void setUp() {
			final UUID uuid = UUID.randomUUID();
			exposure = new Exposure(uuid);
			exposure.setTime(LocalDateTime.now());
			exposure.setExposure("D");
       }
		
		@Test
		public void testExposurePostiveScenario()
		{
			assertNotNull(exposure.toString());
			assertNotNull(exposure.getTime());
			assertNotNull(exposure.getPatientId());
			
			assertEquals("D", exposure.getExposure());
			assertNotNull(exposure.hashCode());
			
			final Exposure exposureObj = exposure;
			assertTrue(exposure.equals(exposureObj));
			assertTrue(exposure.equals(exposure));
			assertFalse(exposure.equals(null));
			
			final Exposure exposureObjEquals = new Exposure(exposure.getPatientId());
			exposureObjEquals.setExposure("I");
			exposureObjEquals.setTime(exposure.getTime());
			assertTrue(exposure.equals(exposureObjEquals));
			assertFalse(exposure.equals(null));
			exposureObjEquals.setTime(null);
			assertFalse(exposure.equals(exposureObjEquals));
			exposure.setPatientId(null);
			exposureObjEquals.setTime(exposure.getTime());
			assertFalse(exposure.equals(exposureObjEquals));
			exposure.setPatientId(null);
			exposureObjEquals.setTime(null);
			assertFalse(exposure.equals(exposureObjEquals));
			
		}
		
		
		@Test(expected = IllegalArgumentException.class)
		public void testException()
		{
			exposure.setExposure(null);
		}
		
	}

