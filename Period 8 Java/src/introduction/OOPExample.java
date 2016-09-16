package introduction;

public class OOPExample {
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian","Harvard");//Senior is a subclass of student so its ok
		Student joseph = new Junior("Joseph","Media Major");
		Student jordan = new Sophomore("Jordan", 99);

		jillian.talk();
		//jillian.name = "BaloneyPants"; when name (variable) becomes public = changeable
		//jillian.talk();
		joseph.talk();
		((Junior)joseph).majorTalk(); //example of casting 
		jordan.talk();
	}

}
