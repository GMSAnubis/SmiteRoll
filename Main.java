package gmsanubis.com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String restart = "y";
        while (restart.equals("y")) {
            System.out.println("Choisissez le type de roll (m)age, (a)ssassins, (w)arrior, (g)ardien, (h)unter ou (all)");
            Scanner sc = new Scanner(System.in);
            String choixuser = sc.nextLine();
            System.out.println("");

            while (!choixuser.equals("m") && !choixuser.equals("a") && !choixuser.equals("w") && !choixuser.equals("g") && !choixuser.equals("h") && !choixuser.equals("all")) {
                System.out.println("Choisissez le type de roll (m)age, (a)ssassins, (w)arrior, (g)ardien, (h)unter ou (all)");
                choixuser = sc.nextLine();
            }

            System.out.println("Combien de dieux générer?: ");
            int godsGenerated = sc.nextInt();
            System.out.println("");

            int gods;

            if (!choixuser.equals("all")) {
                for (int i = 1; i <= godsGenerated; i++) {
                    gods = new Random().nextInt(GodsList.values().length);
                    while (!GodsList.values()[gods].getClasse().equals(choixuser)) {
                        gods = new Random().nextInt(GodsList.values().length);
                    }
                    System.out.println("Votre dieux est: " + GodsList.values()[gods]);
                }
                System.out.println("");
            } else {
                for (int j = 1; j <= godsGenerated; j++) {
                    gods = new Random().nextInt(GodsList.values().length);
                    System.out.println("Votre dieux est: " + GodsList.values()[gods]);

                }
                System.out.println("");
            }

            System.out.println("Voulez vous relancer? y/n");
            sc.nextLine();
            restart = sc.nextLine();
        }
        System.out.println("");
        System.out.println("Merci et bon Feed");

    }
}
