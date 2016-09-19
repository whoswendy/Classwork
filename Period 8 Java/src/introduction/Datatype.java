package introduction;

public class Datatype {

	public static void main(String[] args) {
		System.out.println(5.0/2);//Exercise 1
		System.out.println((double)5.0/2);//Exercise 2
		System.out.println(5/2);//Exercise 3
		//Exercise 4: Number 3 returns a different answer 
		//than 1 and 2 because 1 and 2 indicates that the answer 
		//would have a decimal (have more space) while number 3 indicates the answer as a int
		System.out.println(3+5.0/2+5*2);//Exercise 5
		System.out.println(3.0+5/2+5*2);//Exercise 6
		//Exercise 7: Changing the double changes the answer 
		//because when 5.0/2 = 2.5 whereas 5/2 the decimal and what follows it are erased
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));//Exercise 8
		//Exercise 9: Number 8 returns different value because the (int)
		//rounds the answer down. 
		if(42 == 42.0) System.out.println("42 equals 42.0");//Exercise 10
		//In exercise 10 because the data type is not indicated 
		//the computer assumes that 42 = 42.0
		
		
		//Test Precision
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		//FOr d1 - d2 the computer goes to a long decimal place, it does not round
	}

}

