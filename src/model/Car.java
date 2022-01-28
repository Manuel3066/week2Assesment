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
public class Car {
	public String name;
	public boolean wheels;
	public int mileage;
	public Car() {
		super();
	}
	public Car(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWheels() {
		return wheels;
	}
	public void setWheels(boolean wheels) {
		this.wheels = wheels;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileAge(int mileAge) {
		this.mileage = mileAge;
	} 
	
	

}
