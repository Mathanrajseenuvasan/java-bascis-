
import java.io.*;
public class Vehicle {
	
	public String brand = "ford"  ;
	public static void main(String[] args) {
		Cars obj = new Cars();
		System.out.println(obj.brand + " " + obj.model);
	}
	
	
}
class Cars extends Vehicle {
	public String model = "mustang";
	
}
