
public class A {
	public void show() {
	System.out.println("this show not have any parametres");
	}
	public void show(String name) {
		System.out.println("this show as one parameter name" + " " +name);
	} 
	public static void main(String [] args) {
		A obj = new A();
		obj.show("mathan");
	}

}
