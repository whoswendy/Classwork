package Sort;

public class MainBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon squirtle = new Pokemon("Squirtle",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Squirle is preparing to attack with water blast");
		squirtle.attack(bulbasaur, new Attack() {//(Anonymous- no handle) (Inner- passed to some other object) Type
			
			public void attack(Pokemon target) {
				int newHP = target.getHp()/2;//cuts target's health by half
				target.setHP(newHP);
			}
		});
		bulbasaur.attack(squirtle, new Attack() {

			public void attack(Pokemon target) {
				// TODO Auto-generated method stub
				target.setPoisoned(true);
			}
			
		});
		
		squirtle.lapse();
		bulbasaur.lapse();
		printScore(squirtle,bulbasaur);
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		// TODO Auto-generated method stub
		System.out.println(p1.getName()+ "HP=" + p1.getHp());
		System.out.println(p2.getName()+ "HP=" + p2.getHp());
	}
	

}
