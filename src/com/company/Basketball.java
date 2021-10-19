package com.company;

/**
 *Klasse Basketball
 * extends die abstracte Klasse Mannschaftssport und implementiert seine Methode und
 * gibt zuruck die Dauer von dieser Sportart
 * @version
 *          18 Oct 2021
 * @author
 *          Denisa Dragota
 */
public class Basketball extends Mannschaftssport{
    /*implementieren die abstracte Methode aus Mannschaftssport*/
    @Override
    public double kalkuliereZeit() {
        return 55;
    }
}
