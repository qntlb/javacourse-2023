package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * The main method class shows the difference between overriding and overloading,
 * along with another example of class inheritance
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {

	public static void main(String[] args) {

		Warrior warrior = new Warrior();
		Warrior enemyWarrior = new Warrior();

		System.out.println();
		
		System.out.println("The enemy has first " + enemyWarrior.getHealthPoints() + " health points");

		warrior.damage(enemyWarrior);

		System.out.println("The enemy has now " + enemyWarrior.getHealthPoints() + " health points");

		System.out.println();

		MorePowerfulWarrior morePowerfulWarrior = new MorePowerfulWarrior();

		morePowerfulWarrior.damage(enemyWarrior);
		
		//you will see that now the damages are higher: the overridden version is called
		System.out.println("And now, " + enemyWarrior.getHealthPoints() + " health points");
		System.out.println();
		
		System.out.println("The more powerful warrior can also damage buildings:");

		Building newBuilding = new Building();

		System.out.println("The building has first " + newBuilding.getSolidityPoints() + " health points");

		morePowerfulWarrior.damage(newBuilding);

		System.out.println("And now " + newBuilding.getSolidityPoints() + " health points");
		
		System.out.println();
		
		morePowerfulWarrior.move(10, 20);//this gets directly inherited

	}
}
