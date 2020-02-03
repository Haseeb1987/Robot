
public class Robot {
	
	private String myname = "nobody";
	
	public void setName(String name){
		myname = name;
	}
	
	public void sayHelloTo(String name){
		System.out.println("Hello " + name + "!!!");
		System.out.println("I am Robot " + myname + "!!!");
	}
}
