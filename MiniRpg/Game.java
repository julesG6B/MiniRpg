package MiniRpg;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Game {

    private static int vie =1;


    public static void game() {
        playGame();
        generateCombat();
        generateCombat();
        generateCombat();
        generateCombat();
        generateCombat();



        Scanner scanner = new Scanner(System.in);
        List<String> heroes = new ArrayList<String>();
        heroes.add("hunter");
        heroes.add("warrior");
        heroes.add("mage");
        heroes.add("healer");
        int playerTurn;
        //InputParser inputParser;



    }

    public static void playGame () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans l'aventure, choisissez votre Héro! ");
        System.out.println("Hunter");
        System.out.println("Warrior");
        System.out.println("Mage");
        System.out.println("Healer");
        System.out.println("Entré le nom de votre Héro:");
        String classHero = scanner.next();
        if (classHero == "Hunter"){
            System.out.println("Vous commencez l'aventure en t'en que "+classHero);
        } else if (classHero == "Warrior"){
            System.out.println("Vous commencez l'aventure en t'en que "+classHero);
        } else if (classHero == "Mage"){
            System.out.println("Vous commencez l'aventure en t'en que "+classHero);
        } else if (classHero == "Healer"){
            System.out.println("Vous commencez l'aventure en t'en que "+classHero);
        } /*else {
            System.out.println(classHero+" n'est pas une classe de héro, ne tente pas de casser mon code s'il te plait, et prend une vrai classe déjà écrite la prochaine fois. Bey");
            System.exit(0);
        }*/

    }
    public static void generateCombat () {
        Scanner scanner = new Scanner(System.in);
        if (vie == 0){
            System.out.println("Game over");
            System.exit(0);
        }
        System.out.println("Vous entrez dans le donjons ゴゴゴゴ");
        System.out.println("Un énemi vous fait face!");
        System.out.println("Lancement du combat!");
        System.out.println("Option de combat:");
        System.out.println("-attack = 1");
        System.out.println("-defend = 2");
        System.out.println("-use-consumable = 3");
        System.out.println("entré une option:");
        int optioncombat = scanner.nextInt();
        if (optioncombat == 1){
            System.out.println("Vous attaquer l'enemie, il meur");
            System.out.println("");
            System.out.println("");
        } else if (optioncombat == 2){
            System.out.println("Vous parer le coup et contre attaquer");
            System.out.println("L'enemie meur");
            System.out.println("");
            System.out.println("");
        } else if (optioncombat == 3){
            System.out.println("Vous manger une miche pain");
            System.out.println("L'énemie vous attaque!");
            System.out.println("Vous tombez au sol, une miche de pain à la main tout en vous vidant de votre sang.");
            vie =0;
        }

    }

}


