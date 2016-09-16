package introduction;

public class Sophomore extends Student {
	
	int examScore;

	public Sophomore(String name, int score) {
		super(name);
		this.examScore = score;
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		//super.talk(); calls the talk method from superclass Student
		System.out.println("My name is " + getName() + " and I am a sophomore!");
		System.out.println("My score is " + examScore);
		
		
	}

}
