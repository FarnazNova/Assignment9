package chapter9;
public class Fan{
	public static void main(String[] args) {
		FanTest fanOn = new FanTest();
		fanOn.setOn(true);
		fanOn.setColor("yellow");
		fanOn.setSpeed(FanTest.FAST);
		fanOn.setRadius(10);
		System.out.println(fanOn.toString());
		
		FanTest fanOff = new FanTest();
		fanOff.setOn(false);
		fanOff.setColor("blue");
		fanOff.setSpeed(FanTest.MEDIUM);
		fanOff.setRadius(5);
		
		System.out.println(fanOff.toString());
		
		
	}
}

class FanTest {
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;

	private int speed = SLOW;
	private boolean on ;
	private double radius = 5;
	private String color = "blue";
		
	public FanTest(){

}

public int getSpeed() {
	return speed;
}

public void setSpeed(int newSpeed) {
	this.speed = newSpeed;
}

public boolean getOn() {
	
	return on;
}

public void setOn(boolean on) {

	this.on = on;
}

public double getRadius() {
	return radius;
}

public void setRadius(double r) {
	this.radius = r;
}

public String getColor() {
	return color;
}

public void setColor(String newColor) {
	this.color = newColor;
}
public String toString() {
	
	String print = "";
		
	print = "This is a " + color + " fan which is the on key is " + on + " and the speed is " + speed + " with the radius " + radius;
	
	return print;
}

	
}


