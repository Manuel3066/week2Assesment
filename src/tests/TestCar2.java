/**
 * @author theaw - mcorralledezma@dmacc.edu
 * CIS175 - Spring 2022
 * Jan 28, 2022
 */
package tests;
import model.*;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author theaw
 *
 */
public class TestCar2 {
	CarLogic  carL = new CarLogic();
	Car car = new Car("Mazda");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCarIsHighMileage() {
		car.setMileAge(100000);
		
		assertEquals(true,carL.isHighMileAge(car));
	}

}
