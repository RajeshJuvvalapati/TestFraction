import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTestJunit {
	Math m=	 new Math();;
	@BeforeClass
	public void getMathFactory() {
	
	}

	@Test
	public void getresultWithArgumentZero(){
		assertEquals(0, m.getFraction(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenArgumentIsOne(){
		m.getFraction(-4);
	}
	
	@Test
	public void whenArgumentIsGreaterThanOneReturnException(){
		
	}
	
}
