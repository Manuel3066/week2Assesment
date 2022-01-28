/**
 * @author theaw - mcorralledezma@dmacc.edu
 * CIS175 - Spring 2022
 * Jan 28, 2022
 */
package model;

/**
 * @author theaw
 *
 */
public class CarLogic {
	
	
	
	public boolean hasWheels(Car car) {
		
		if(car.isWheels()==true) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isHighMileAge(Car car) {
		if(car.getMileage()>=100000) {
			return true;
		}
		else {
			return false;
		}
	}

}
