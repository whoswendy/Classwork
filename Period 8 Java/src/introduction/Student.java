package introduction;

public class Student {

	//fields
	private String name;//variables should be private
	
	//constructor returns class, must match class name (initialize fields)
	public Student(String name){
		this.name = name;	
	}
	
	public void talk(){
		System.out.println("Hello, my name is " + name);
	}
	
	public String getName(){
		return name;
	}
}
