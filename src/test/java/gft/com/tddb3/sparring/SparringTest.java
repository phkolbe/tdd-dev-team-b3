package gft.com.tddb3.sparring;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SparringTest {

	private Sparring sparring;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
		sparring = Sparring.builder().nome("Sparring 1")
                                     .xp(50)
                                     .build();
	}	
	
	@Test
	public void whenRecebeGolpe_thenDiminuiXp() {
		int xp = sparring.getXp();

		sparring.recebeGolpe();
		
		Assertions.assertTrue(sparring.getXp() < xp);
	}
	
	@AfterEach
	public void tearDown() throws Exception {
	}	
	
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}



}
