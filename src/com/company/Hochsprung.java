package com.company;

/***Klasse Hochsprung
 * extends die abstracte Klasse Leichtathletik und implementiert seine Methode und
 * gibt zuruck die Dauer von dieser Sportart
 * @version
 *          18 Oct 2021
 * @author
 *          Denisa Dragota
 */
public class Hochsprung extends Leichtathletik{
    
    @Override
    public double kalkuliereZeit() {
        return 20;
    }
}
