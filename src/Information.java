import java.util.Scanner;

public class Information extends Main {

    String infoSelection;
    String fabricSelection;
    String metricSelcetion;
    double meterSelection;
    Scanner infoScanner = new Scanner(System.in);
    double inchIs = 2.54;
    double feetIs = 0.31;
    double yardIs =  0.915;

    public void informationSelection(){

        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Worüber möchtest du mehr erfahren?" + ConsoleColors.RESET);
        System.out.println(
                "(1) Stoffe\n" +
                "(2) Maßrechner\n" +
                "(3) Coming Soon");
        infoSelection = infoScanner.nextLine();


        if (infoSelection.equals("1")){
            fabricInformation();
        } else if (infoSelection.equals("2")) {
            metricCalculator();
        } else {
            System.out.println("Falsche Eingabe oder noch nicht implementiert");
        }
        infoScanner.nextLine(); //Dadurch wurde das Buffer-Problem gelöst

    };

    public void fabricInformation(){
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wähle die Stoffart über die du mehr erfahren willst:" + ConsoleColors.RESET);
        System.out.println(
                "(1) Jersey\n" +
                "(2) Sweat\n" +
                "(3) Denim\n" +
                "(4) Samt\n" +
                "(5) Seide\n" +
                "(6) Plüsch\n");
        fabricSelection = infoScanner.nextLine();

        if (fabricSelection.equals("1")){
            System.out.println("Jersey ist ein weicher, elastischer Stoff.\n" +
                    " Es handelt sich um ein Gestrick bzw. Gewirk, dessen Name der bekannten Insel entlehnt wurde, auf der es zum ersten Mal hergestellt wurde.\n" +
                    " Aus Jerseystoffen lassen sich tolle Shirts und Kleider nähen, zum Beispiel das Schnittmuster „Ella“ für ein Damenkleid\n" +
                    " oder das Schnittmuster „Paul“ für ein Kindershirt.\n" +
                    " Interlock-Jerseys sind etwas fester und rollen sich an den Kanten weniger ein,\n" +
                    " daher sind sie ideal für Jersey-Nähanfänger geeignet. Hinweis: pattydoo-Schnittmuster\n" +
                    " für Jerseys sind der Dehnbarkeit angepasst, daher bitte nur elastische Stoffe verwenden!");
        } else if(fabricSelection.equals("2")){
            System.out.println("Sweatshirtstoff bzw. Sweat (-stoff) ist eine Maschenware mit zusätzlichem Futterfaden.\n" +
                    " Die linke Stoffseite ist angeraut, wodurch er voluminöser und wärmender ist als Sommersweat.\n" +
                    " Im Vergleich zu Jersey ist Sweat deutlich weniger dehnbar, daher ist er gut geeignet für lockere Kleidungsschnitte\n" +
                    " wie unseren Damen-Hoodie Lynn oder den Freestyle-Hoodie Luke für Männer.\n");
        } else if(fabricSelection.equals("3")){
            System.out.println("Denim oder Jeans ist ein kräftiges Gewebe aus Baumwolle.\n" +
                    " Helle, naturfarbene Fäden werden mit indigoblauen Fäden so verwebt, dass eine diagonale,\n" +
                    " fein gestreifte Stoffstruktur entsteht (Köperbindung). Die rechte Stoffseite erscheint überwiegend blau,\n" +
                    " die linke Stoffseite eher hell. Das robuste Material kommt bei Jacken und Hosen zum Einsatz, ist aber auch prima\n" +
                    " zum Nähen von Taschen geeignet. Tipp: Alte Jeans aufheben und daraus zu neue Taschen z.B. den Shopper „Wendy“ nähen.\n");
        } else if(fabricSelection.equals("4")){
            System.out.println("Samt ist ein sehr weiches Gewebe mit kurzem Flor.\n" +
                    " Pannesamt ist etwas dünner und glänzt stark, häufig aus Synthetikfasern hergestellt.\n");
        } else if (fabricSelection.equals("5")){
            System.out.println("Seide wirkt je nach Jahreszeit kühlend als auch wärmend,\n" +
                    " da sie die Hautfeuchtigkeit aufnimmt und langsam durch Verdunstung wieder abgibt. \n" +
                    "Sie ist ein Naturprodukt der Seidenraupe und deshalb eher hochpreisig. \n" +
                    "ähe dir doch ein Lieblingsteil für besondere Anlässe aus diesem hochwertigen Material,");
        } else if (fabricSelection.equals("6")){
            System.out.println("Plüsch ist ein Sammelbegriff für alle Web- und Maschenwaren mit einem Flor,\n" +
                    " der länger als 3 mm ist. Ein Beispiel für Plüsch sind die meisten Pelzimitate.\n");
        } else {
            System.out.println("Falsche Eingabe");
        }

    };
   public void metricCalculator(){
       //infoScanner.next();
       System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wähle die Maßeinheit von der du umrechnen möchtest" + ConsoleColors.RESET);
       System.out.println(
               "(1) von Inch in cm\n" +
               "(2) von Feet in m\n" +
               "(3) von Yard in m");
        metricSelcetion = infoScanner.nextLine();
        if (metricSelcetion.equals("1")){
            System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wieviel Inch möchtest du umrechnen?" + ConsoleColors.RESET);
            meterSelection= infoScanner.nextDouble();
            System.out.println("Umrechnung: "+ meterSelection * inchIs);
        } else if (metricSelcetion.equals("2")) {
            System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wieviel Feet möchtest du umrechnen?" + ConsoleColors.RESET);
            meterSelection= infoScanner.nextDouble();
            System.out.println("Umrechnung: "+ meterSelection * feetIs);
        } else if (metricSelcetion.equals("3")) {
            System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wieviel Yard möchtest du umrechnen?" + ConsoleColors.RESET);
            meterSelection= infoScanner.nextDouble();
            System.out.println("Umrechnung: "+ meterSelection * yardIs);
        }else {
            System.out.println("Falsche Eingabe");
        }
   }
}


