import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stopMenu = false;
        Database db = new Database();

        while (!stopMenu) {
            System.out.println("velkommen til superheltedatabasen");
            System.out.println("1: Tilføj en superhelt til databasen");
            System.out.println("2: Søg efter en Superhelt");
            System.out.println("3: Vis alle helte i databasen");
            System.out.println("4: Slet en helt fra databasen");
            System.out.println("5: Rediger en helt fra databasen");
            System.out.println("9: for at afslutte programmet");


            int valg = scanner.nextInt();
            switch (valg) {
                case 1:
                    System.out.println("Indtast superheltens navn");
                    scanner.nextLine();
                    String navn = scanner.nextLine();
                    System.out.println("indtast superheltens heltenavn");
                    String superheltenavn = scanner.nextLine();
                    System.out.println("Indtast superheltens superkræft");
                    String superkræft = scanner.nextLine();
                    System.out.println("Indtast superheltens kreationsår");
                    int kreationsår = scanner.nextInt();
                    System.out.println("Indtast superheltens styrke");
                    int styrke = scanner.nextInt();
                    Superhero hero = new Superhero(navn, superheltenavn, superkræft, kreationsår, styrke);
                    db.addSuperHero(hero);
                    break;
                case 2:
                    System.out.println("Skriv navnet, eller en del af det navn på den/de superhelte du vil finde");
                    scanner.nextLine();
                    String søgning = scanner.nextLine();
                    db.søg(søgning);
                    break;


                case 3:
                    db.showHeroList();
                    break;

                case 4:
                    db.showHeroList();
                    System.out.println("Skriv tallet på den helt du vil slette fra databasen");
                    scanner.nextLine();
                    try {
                        int nummer = scanner.nextInt();
                        db.slet(nummer);
                    } catch (InputMismatchException e) {
                        System.err.println("Indtast venligst et tal, ikke bogstaver");
                        scanner.nextLine();
                    }


                    break;

                case 5:
                    db.showHeroList();
                    System.out.println("Skriv tallet på den helt du vil redigere");
                    scanner.nextLine();
                    int nummer = scanner.nextInt();
                    System.out.println("Skriv nu det nye navn til superhelten" + " " + db.superheroList.get(0).getName());
                    scanner.nextLine();
                    String naben = scanner.nextLine();
                    //System.out.println(nummer);
                    //System.out.println(naben);
                    db.rediger(nummer, naben);
                    System.out.println("Det nye navn er nu" + " " + db.superheroList.get(0).getName());
                    break;


                case 9:
                    stopMenu = true;
                    break;


            }
        }
    }
}
