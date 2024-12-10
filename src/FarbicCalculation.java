import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class FarbicCalculation{
    Scanner scanner = new Scanner(System.in);
    Scanner dimensionScan = new Scanner(System.in);
    int pEndWidth;
    int i = 0;


    public void calculationFabric1_Pillow(){

        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wie breit ist der vorhandene Stoff in cm?" + ConsoleColors.RESET);
        int fabricMeterWidth = scanner.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Und wieviel Meter hast du von dem Stoff? (in cm)" + ConsoleColors.RESET);
        int fabricMeterLength = scanner.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Breite des Kissens in cm ein : " + ConsoleColors.RESET);
        int pWidth = dimensionScan.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Höhe des Kissens in cm ein : " + ConsoleColors.RESET);
        int pLength = dimensionScan.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Nahtzugabe in cm ein : " + ConsoleColors.RESET);
        int pPuffer = dimensionScan.nextInt();

        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Falls du einen Hotelverschluss nähen möchtest, hast du einen zusätzlichen Stoffverbrauch. Bitte gib ihn hier in cm ein: " + ConsoleColors.RESET);
        int pBonus = dimensionScan.nextInt(); //pBonus ist der Extrastoff der benötigt wird
        var pEndWidth = pWidth*2+pPuffer*2+pBonus;
        int pEndLength = pLength*2+pPuffer*2;
        System.out.println("Der Stoff verbrauch beträgt: " + (pEndWidth) + " cm in der Breite und " + (pEndLength) +  " cm in der Länge");
        System.out.println("Der Stoff hat noch einen Restbreite von " + (fabricMeterWidth - pEndWidth) + " cm " +
                "und eine Restlänge von " + (fabricMeterLength - pEndLength) + " cm");

        if (fabricMeterWidth < pEndWidth){
            System.out.println("Der Stoff wird nicht reichen. Er ist nicht breit genung");
        }
        if (fabricMeterLength < pEndLength){
            System.out.println("Der Stoff wird nicht reichen. Er ist nicht lang genung");
        }

    }

    public void calculationFabric1_Shirt(){

        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Wie breit ist der Stoff in cm?: " + ConsoleColors.RESET);
        int fabricMeterWidth = scanner.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Und wieviel Meter hast du von dem Stoff? (in cm)" + ConsoleColors.RESET);
        int fabricMeterLength = scanner.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Länge des Shirts in cm ein : " + ConsoleColors.RESET);
        int sLength = dimensionScan.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Ärmellänge in cm ein : " + ConsoleColors.RESET);
        int sArmsLength = dimensionScan.nextInt();
        System.out.println(ConsoleColors.BLACK + ConsoleColors.PURPLE_BACKGROUND + "Gib die Nahtzugabe in cm ein : " + ConsoleColors.RESET);
        int pPuffer = dimensionScan.nextInt();


        int sEndWidth = fabricMeterWidth;
        int sEndLength = sLength + sArmsLength + 10;
        System.out.println("Der Stoff verbrauch beträgt: " + (sEndWidth) + " cm in der Breite und " + (sEndLength) +  " cm in der Länge");
        System.out.println("Der Stoff hat noch einen Restbreite von " + (fabricMeterWidth - sEndWidth) + " cm " +
                "und eine Restlänge von " + (fabricMeterLength - sEndLength) + " cm");

        if (fabricMeterWidth < sEndWidth){
            System.out.println("Der Stoff wird nicht reichen. Er ist nicht breit genung");
        }
        if (fabricMeterLength < sEndLength){
            System.out.println("Der Stoff wird nicht reichen. Er ist nicht lang genung");
        }

    }




}
