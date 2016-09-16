package introduction;

public class Junior extends Student {
	
	String yrMajor;

	public Junior(String name, String major) {
		super(name);
		this.yrMajor = major;
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		//super.talk();calls the talk method from superclass Student
		System.out.println("My name is " + getName() + " and I am a junior!");
	}
	
	public void majorTalk(){
		System.out.println("I am in the " + yrMajor);
	}

}
