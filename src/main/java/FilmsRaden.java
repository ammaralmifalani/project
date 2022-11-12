
import java.util.Scanner;

public class FilmsRaden {

    public static void main(String[] args) {
        Scanner ReaderInput = new Scanner(System.in);
        //De applicatie vraagt de gebruiker om een cijfer van 1 t/m 3 in te voeren.
        System.out.println("Enter a number from 1 to 3:");
        int input = Integer.parseInt(ReaderInput.nextLine());
        //Als de gebruikersinvoer het cijfer 1, wordt een korte beschrijving
        //van de film The Matrix weergegeven.
        if (input == 1) {
            System.out.println("Neo krijgt de keuze een rode pil te slikken en\n "
                    + "uit de matrix gewekt te worden, of een blauwe pil te slikken\n"
                    + " en alles van zijn ontmoeting te vergeten.");
            System.out.println("What film it is about?");
            String inputFilmNaamMatrix = ReaderInput.nextLine();

            if (inputFilmNaamMatrix.toLowerCase().equals("the matrix")) {
                System.out.println("Good done!");
                // Is het iets anders, dan wordt de juiste naam 
                //van de film weergegeven en stopt de applicatie.
            } else {
                System.out.println("The name of the film is: The Matrix");

            }
            //Als de gebruikersinvoer het cijfer 2, wordt een korte beschrijving
            //van de film The Wolf of Wall Street weergegeven.

        } else if (input == 2) {
            System.out.println("Jordan Belfort wil het op Wall Street maken\n"
                    + " als beursmakelaar. Nadat het bedrijf waarvoor hij werkt\n"
                    + "failliet is gegaan, werkt hij enige tijd bij een \n"
                    + "schimmige firma op Long Island gespecialiseerd in \n"
                    + "goedkope aandelen. Deze makelaars benaderen onwetende\n"
                    + " mensen met agressieve verkooppraatjes en proberen hen\n"
                    + " tegen hoge commissies over te halen tot het plaatsen \n"
                    + "van orders voor waardeloze aandelen.");
            System.out.println("What film it is about?");
            String inputFilmNaamTheWolf = ReaderInput.nextLine();
            if (inputFilmNaamTheWolf.toLowerCase().equals("the wolf of wall street")) {
                System.out.println("Good done!");
                // Is het iets anders, dan wordt de juiste naam
                //van de film weergegeven en stopt de applicatie.
            } else {
                System.out.println("The name of the film is: The Wolf of Wall Street");
            }
            //Als de gebruikersinvoer het cijfer 3, wordt een korte beschrijving
            //van de film Catch Me If You Can weergegeven.

        } else if (input == 3) {
            System.out.println("Het verhaal begint in de jaren 50 en 60.\n"
                    + " Wanneer de ouders van Frank Abagnale Jr. gaan scheiden,\n"
                    + " besluit hij de wereld in te trekken. Hij doet net alsof\n"
                    + " hij een co-piloot is zodat hij makkelijker vervalste\n"
                    + " cheques kan verzilveren bij banken en hotels.\n"
                    + "Ook kan hij gratis reizen met het vliegtuig.");
            System.out.println("What film it is about?");
            String inputFilmNaamCatchMe = ReaderInput.nextLine();
            if (inputFilmNaamCatchMe.toLowerCase().equals("catch me if you can")) {
                System.out.println("Good done!");
                // Is het iets anders, dan wordt de juiste naam 
                //van de film weergegeven en stopt de applicatie.
            } else {
                System.out.println("The name of the film is: Catch Me If You Can");
            }
        }

    }
}
