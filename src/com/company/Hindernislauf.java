package com.company;

/**
 *Klasse Hindernislauf
 * extends die abstracte Klasse Leichtathletik und implementiert seine Methode und
 * gibt zuruck die Dauer von dieser Sportart
 * @version
 *          18 Oct 2021
 * @author
 *          Denisa Dragota
 */
public class Hindernislauf extends Leichtathletik{
    /*implementieren die abstracte Methode aus Leichtathletik*/
    @Override
    public double kalkuliereZeit() {
        return 30;
    }
}
