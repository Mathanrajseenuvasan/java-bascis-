package modifiers;
 class person {

	public String fname = "mathan";
	public void name() {
		System.out.println("this is your full name");
	}
	
	
}
class child extends person{
	 public String lname ="raj";
	public static void main(String[] args)
	{
		child obj = new child();
		obj.name();
		System.out.println(obj.fname + " " + obj.lname);
	}
	
}