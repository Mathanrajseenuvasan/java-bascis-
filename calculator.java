package modifiers;

 class Inheritancedemo {
	
	public int add(int i , int j) {
	return i + j ;
}
}
 class calc extends Inheritancedemo{
	public int sub(int i , int j) {
		return i-j;
	}
}

 class advance extends calc{
	public int mul(int i , int j) {
		return i*j;
}
}
 class division extends advance{
	 public int div(int i, int j) {
		 return i/j;
	 }
 }
 class modulas extends division{
	 public int mod(int i, int j) {
		 return i%j;
	 }
 }
public class calculator
{
	public static void main (String[] args) {
	
		modulas c1 = new modulas();
				int result = c1.add(5, 4);
				int result1 = c1.sub(6 ,  3);
				int result2 = c1.mul(6 ,  3);
				int result3 = c1.div(6 ,  3);
				int result4 = c1.mod(6 ,  3);
				
						
						System.out.println(result);
						System.out.println(result1);
						System.out.println(result2);
						System.out.println(result3);
						System.out.println(result4);
}
}