package MiniRpg;

abstract class Enemy {
    public static String charclass;
    public static int lifePoints;
    public static int armor;
    public static int weaponDamage;



    private static void Boss() {
        charclass = "boss";
        lifePoints = 15;
        armor = 2;
        weaponDamage = 3;
    }

    private static void BasicEnemy() {
        charclass = "basicEnemy";
        lifePoints = 7;
        armor = 0;
        weaponDamage = 2;
    }
}




