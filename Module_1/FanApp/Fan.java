/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Fan class that determines the Fan properties.
    Created by Srilakshmi Kota
*/ 
public class Fan {
	
	static final int STOPPED = 0; 
	static final int SLOW = 1; 
	static final int MEDIUM = 2; 
	static final int FAST = 3;
	
	private int speed = STOPPED;
	private boolean isFanOn;
	private double radius = 6.0;
	private String color = "White";
	
	// Arguments Constructor
	public Fan(int speed, boolean isFanOn, double radius, String color) {
		this.speed = speed;
		this.isFanOn = isFanOn;
		this.radius = radius;
		this.color = color;
	}
	
	// Default Constructor
	public Fan() {
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isFanOn() {
		return isFanOn;
	}
	public void setFanOn(boolean isFanOn) {
		this.isFanOn = isFanOn;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// Overriding toString() method to display the results based on fan is on or off
    public String toString() {
    	if(isFanOn) {
    		return "The fan speed is set to " + speed + " with a color of " + color+ " and a radius of "+ radius;
    	} else {
    		return "The fan is " + color + " with a radius of " + radius+ " and the fan is off";
    	}
        
    }

}
