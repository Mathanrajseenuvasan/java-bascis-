
 


	 

class Mainclass {
	 private String name;

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     name = newName;
	   }

	 public static void main(String[ ] args) {
		 Mainclass myObj = new Mainclass();
		    myObj.setName("John");
		    System.out.println(myObj.getName());
		  }
		}