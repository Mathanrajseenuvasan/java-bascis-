
public class Car {

	public void fullthrottle(){ 
		System.out.println("car is going as fast as it can");
	}
	public void maxspeed(int speed){
		System.out.println("maxspeed is :"+speed);
	}
	public static void main (String[] args) {
		Car mycar = new Car();
		mycar.fullthrottle();
		mycar.maxspeed(200);		
	  	
	}
}
