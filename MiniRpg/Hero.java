package MiniRpg;
import java.util.List;

abstract class Hero extends Game {
    public static String charclass;
    public static int lifePoints;
    public static int armor;
    public static int weaponDamage;
    public static int arow;
    public static int mana;
    public List<Potion> potions;
    public List<Food> lembas;


    //___________________________Classe de Héro_____________
    private static void Hunter(){
        charclass = "hunter";
        lifePoints = 8;
        armor = 1;
        weaponDamage = 4;
        arow = 10;
    }
    private static void Warrior(){
        charclass = "warrior";
        lifePoints = 12;
        armor = 2;
        weaponDamage = 3;
    }
    private static void Mage(){
        charclass = "mage";
        lifePoints = 6;
        armor = 0;
        weaponDamage = 4;
        mana = 11;
    }
    private static void Healer(){
        charclass = "healer";
        lifePoints = 7;
        armor = 1;
        weaponDamage = 2;
        mana = 8;
    }


}







