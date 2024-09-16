package cz.cvut.fel.pjv;

import java.util.Scanner;

public class Lab01 {
   public void start(String[] args) {
      homework();
   }

   public static void homework() {
      System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");

      Scanner input = new Scanner(System.in);

      switch (input.nextInt()) {
         case 1:
            System.out.println("Zadej scitanec: ");
            double scitanec1 = input.nextDouble();

            System.out.println("Zadej scitanec: ");
            double scitanec2 = input.nextDouble();

            System.out.println("Zadej pocet desetinnych mist: ");
            int misto1 = input.nextInt();
            if (misto1 < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               break;
            }

            double res1 = scitanec1 + scitanec2;

            String valS1 = String.format("%." + misto1 + "f", scitanec1);
            String valS2 = String.format("%." + misto1 + "f", scitanec2);
            String finalResult1 = String.format("%." + misto1 + "f", res1);
            System.out.println(valS1 + " + " + valS2 + " = " + finalResult1);
            break;
         case 2:
            System.out.println("Zadej mensenec: ");
            double mensenec = input.nextDouble();

            System.out.println("Zadej mensitel: ");
            double mensitel = input.nextDouble();

            System.out.println("Zadej pocet desetinnych mist: ");
            int misto2 = input.nextInt();
            if (misto2 < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               break;
            }

            double res2 = mensenec - mensitel;

            String valM1 = String.format("%." + misto2 + "f", mensenec);
            String valM2 = String.format("%." + misto2 + "f", mensitel);
            String finalResult2 = String.format("%." + misto2 + "f", res2);
            System.out.println(valM1 + " - " + valM2 + " = " + finalResult2);
            break;
         case 3:
            System.out.println("Zadej cinitel: ");
            double cinitel1 = input.nextDouble();

            System.out.println("Zadej cinitel: ");
            double cinitel2 = input.nextDouble();

            System.out.println("Zadej pocet desetinnych mist: ");
            int misto3 = input.nextInt();
            if (misto3 < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               break;
            }

            double res3 = cinitel1 * cinitel2;

            String valC1 = String.format("%." + misto3 + "f", cinitel1);
            String valC2 = String.format("%." + misto3 + "f", cinitel2);
            String finalResult3 = String.format("%." + misto3 + "f", res3);
            System.out.println(valC1 + " * " + valC2 + " = " + finalResult3);
            break;
         case 4:
            System.out.println("Zadej delenec: ");
            double delenec = input.nextDouble();

            System.out.println("Zadej delitel: ");
            double delitel = input.nextDouble();
            if (delitel == 0) {
               System.out.println("Pokus o deleni nulou!");
               break;
            }

            System.out.println("Zadej pocet desetinnych mist: ");
            int misto4 = input.nextInt();
            if (misto4 < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               break;
            }

            double res4 = delenec / delitel;

            String valD1 = String.format("%." + misto4 + "f", delenec);
            String valD2 = String.format("%." + misto4 + "f", delitel);
            String finalResult4 = String.format("%." + misto4 + "f", res4);
            System.out.println(valD1 + " / " + valD2 + " = " + finalResult4);
            break;
         default:
            System.out.println("Chybna volba!");
      }
   }
}