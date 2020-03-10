package item;
import entity.Enemy;

import java.util.ArrayList;
import java.util.List;
// This class is a database of all items, spells, and entities that can be used in the game
public class database {
	//method will be moved to boss event
	public void BossList() { //List of possible bosses
		List<Enemy> bossList = new ArrayList<>();
		
		bossList.add(SQUIRREL_QUEEN);
	}
	//Regular Weapons
	public static final Weapon LONGSWORD = new Weapon("Longsword", 20, 90);
	public static final Weapon DAGGER = new Weapon("Dagger", 10, 95);
	public static final Weapon SPEAR = new Weapon("Spear", 25, 90);
	public static final Weapon BATTLEAXE = new Weapon("Battleaxe", 40, 70);
	public static final Weapon RUSTY_KNIFE = new Weapon("Rusty Knife", 5, 100);
	public static final Weapon GREATSWORD = new Weapon("Greatsword", 30, 80);
	public static final Weapon SHORTSWORD = new Weapon("Shortsword", 15, 95);
	public static final Weapon CLUB = new Weapon("Club", 35, 70);
	//Regular Enemies
	public static final Enemy GOBLIN = new Enemy("Goblin", 20, database.DAGGER);
	public static final Enemy OGRE = new Enemy("Ogre", 80, database.CLUB);
	public static final Enemy SKELETON_SPEARMAN = new Enemy("Skeleton Spearman", 25, database.SPEAR);
	public static final Enemy SKELETON_SWORDSMAN = new Enemy ("Skeleton Swordsman", 25, database.LONGSWORD);
	public static final Enemy CRAZED_BARBARIAN = new Enemy ("Crazed Barbarian", 65, database.BATTLEAXE);
	//Boss Weapons
	public static final Weapon ACORN_STAFF = new Weapon("Acorn Staff", 35, 95);
	//Bosses
	public static final Enemy SQUIRREL_QUEEN = new Enemy("Squirrel Queen", 125, database.ACORN_STAFF);
}
