package de.weller;

public class Osterformel {


  public static void main(String[] args) {

    //ignoriere erstmal alles, was hier drüber steht

    //basis-Syntax von java:
    // - Alles, was in einer Zeile hinter einem "//" steht, ist ein Kommentar
    // - Kommentare werden vom compiler ignoriert, hier kannst du schreiben was du willst
    // - Es geht um https://de.wikipedia.org/wiki/Gau%C3%9Fsche_Osterformel#Eine_erg%C3%A4nzte_Osterformel
    // - Algorithmen arbeiten Anweisungen der Reihe nach ab, also von oben nach unten

    // Fangen wir an, das Jahr festzulegen, für das wir das Osterdatum herausfinden wollen.
    // das ist in diesem Fall der einzige "Input" für den Algorithmus, der Rest wird daraus berechnet

    // Wir bestimmen, dass es eine Variable mit Namen "x" gibt. Das nennt man Deklaration.
    // "x" hat einen Datentypen. Es gibt viele Datentypen, wir brauchen einen für "ganze Zahl".
    // Auf Englisch heißt das "integer", wird in vielen Sprachen mit "int" abgekürzt.
    // "x" soll direkt einen Wert bekommen, nämlich das Jahr.
    // Wenn wir x also auf 2020 setzen wollen, sieht das so aus:

    int x = 2020;

    System.out.println("Berechne das Osterdatum für das Jahr " + x);

    int k = x / 100;
    int m = 15 + ((3*k + 3) / 4) - ((8*k + 13) / 25);
    //int s =
    int a = x % 19; // "mod" wird in java durch "%" ausgedrückt

    // hier die weiteren Schritte des Alorithmus von wikipedia klauen

    // TODO: os richtig berechnen
    int os = 0;

    System.out.println("Ostern " + x + " ist am " + os + ". März");

  }


}
