import java.util.Scanner;

public class Main extends FarbicCalculation{
    public static void main(String[] args) {

        //Membervariablen
        Scanner scanner = new Scanner(System.in);
        String sectionChoose;
        System.out.println("");
        System.out.println("Willkommen bei Fox - Fabric Organize Xpert v1.3");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠙⠻⢶⣄⡀⠀⠀⠀⢀⣤⠶⠛⠛⡇⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⣙⣿⣦⣤⣴⣿⣁⠀⠀⣸⠇⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣡⣾⣿⣿⣿⣿⣿⣿⣿⣷⣌⠋⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣷⣄⡈⢻⣿⡟⢁⣠⣾⣿⣦⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⠘⣿⠃⣿⣿⣿⣿⡏⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠈⠛⣰⠿⣆⠛⠁⠀⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣦⠀⠘⠛⠋⠀⣴⣿⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⣿⣿⣿⣿⡇⠀⠀⠀⢸⣿⣏⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠀⠀⠀⠾⢿⣿⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⡿⠟⠋⣁⣠⣤⣤⡶⠶⠶⣤⣄⠈⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢰⣿⣿⣮⣉⣉⣉⣤⣴⣶⣿⣿⣋⡥⠄⠀⠀⠀⠀⠉⢻⣄⠀⠀⠀⠀⠀\n" +
                
                "⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣋⣁⣤⣀⣀⣤⣤⣤⣤⣄⣿⡄⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⠁⠀⠀⠀⠀⠈⠛⠃⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        System.out.println("");
        UserInterface interfaceFrame = new UserInterface(); //TODO Interface ausarbeiten
        Sections chooseSection = new Sections();
        Information chooseInformation = new Information();
        Profile chooseProfile = new Profile();
        String whilechoose;

        //interfaceFrame.interfaceFrame(); //TODO Interface ausarbeiten

        do {


            System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wo möchtest du hin?" +ConsoleColors.RESET);
            System.out.println(
                    "(1) Stoffe berechnen\n" +
                    "(2) Infobereich\n" +
                    "(3) Profil");

            sectionChoose = scanner.nextLine();

            if (sectionChoose.equals("1")) {
                chooseSection.sectionCalculate();
            } else if (sectionChoose.equals("2")) {
                chooseInformation.informationSelection();
            } else if (sectionChoose.equals("3")) {
                chooseProfile.profileSection();
            } else {
                System.out.println("Falsche Eingabe");
            }
            System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Möchtest du den Vorgang Wiederholen? (j)a oder (n)ein?" + ConsoleColors.RESET);
            //System.out.println("Möchtest du den Vorgang Wiederholen? (j)a oder (n)ein?");
            whilechoose = scanner.nextLine();
        } while (whilechoose.equals ("j"));


            // Versionenhinweis
            // 1.0 Erste Berechnungen des Stoffverbrauchs
            // 1.1 Berechnung gibt auch an ob der vorhandene Stoff ausreichend ist. Und viele wurde in Klassen auseglagert
            // 1.2 Infobereich mit Stoffinformationen
            // 1.3 Maßrechner
            // 1.4 Interface

            /* IDEEN
                Datenbank mit Userinformationen wie Projekten,Stoffvorrat usw
                API für Läden
                Kamerafeatures wie Schnittmuster
             */





    }


}

