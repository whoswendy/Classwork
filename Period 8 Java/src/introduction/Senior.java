package introduction;

public class Senior extends Student {
	
	String reachCollege;

	public Senior(String name, String college) {
		super(name);//constructs a Student first
		this.reachCollege = college;
	}
	
	public void talk(){
		//super.talk(); calls the talk method from superclass Student
		System.out.println("My name is " + getName() + " and I am a senior!");
		System.out.println("I want to goto " + reachCollege);
	}
	

}
