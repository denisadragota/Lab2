package com.company;

/**
 *Klasse Fussball
 * extends die abstracte Klasse Mannschaftssport und implementiert seine Methode und
 * gibt zuruck die Dauer von dieser Sportart
 * @version
 *          18 Oct 2021
 * @author
 *          Denisa Dragota
 */
public class Fussball extends Mannschaftssport{
    /*implementieren die abstracte Methode aus Mannschaftssport*/
    @Override
    public double kalkuliereZeit() {
        return 65;
    }
}
