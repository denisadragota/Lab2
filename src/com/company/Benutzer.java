package com.company;

import java.util.ArrayList;//collection framework

/**
 *Klasse Benutzer
 * berechnet fur einen Benutzer: totale Zeit Dauer von Sport, Zeit Dauer per Sportart,
 * Durchschnittszeit per alle Sporten, fugt Sportart hinzu
 * @version
 *          18 Oct 2021
 * @author
 *          Denisa Dragota
 */

public class Benutzer {
    private String vorName;
    private String nachName;
    private ArrayList<Sport> sport;


    /**
     * @param vorName : String
     * @param nachName : String
     * @param sport : ArrayList<Sport>
     * Konstruktor
     */
    Benutzer(String vorName,String nachName,ArrayList<Sport> sport ){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;
    }


    /**
     * desc: Summe der Zeit Dauer aller seiner Sporten aus seiner Liste
     * @return double, die Summe der Zeit Dauer aller seiner Sportarten aus seiner Liste,
     *                  oder 0 wenn Liste=leer
     */
    public double kalkuliereZeit(){
        double sum=0;
        for (Sport x :sport) {/*durchlauft seine Liste mit Sportarten*/
            sum+=x.kalkuliereZeit(); /*fugt zur Summe, die Zeit der Sportart*/
        }
        return sum;
    }

    /**
     * desc: die totale Zeit Dauer der gegebenen Sportart
     * (zahlt Summe von allen Instanzen der Sportart in der Liste)
     * @param x : Sport
     * @return : double, die totale Zeit Dauer der gegebenen Sportart
     */
    public double kalkuliereZeit(Sport x){
        double sum=0;
        for(Sport s:sport) /*durchlauft seine Liste mit Sportarten*/
            if(s.getClass()==x.getClass()) /*check welche Objekte aus der Liste die gegebene Sportart sind*/
                sum+=s.kalkuliereZeit(); /*fugt zur Summe die dauer fur jede Instanz der gegebenen Sportart*/
        return sum;
    }

    /**
     * desc: Durchschnitt = Summe aller Zeit Dauer der Sporten aus der Liste geteilt durch ihre Anzahl
     * @return : double, Durchschnitt der Zeit oder 0 wenn die Liste leer ist
     * exception handled:  keine SportArt in der Liste (Division by 0) -> gibt zuruck 0
     */

    public double kalkuliereDurchschnittszeit(){
        if (sport.size()>0) /*check ob die Liste Elemente hat*/
            /*rufen die Methode die die Summe aller Sportarten berechnet und teilen durch ihre Anzahl*/
            return kalkuliereZeit()/sport.size();
        else
            return 0; /*wenn keine Sportart in der Liste existiert*/
    }

    /**
     * desc: fugt ein Sport zur Sport Liste hinzu
     * @param newSport : Sport
     * post: sport Liste enthalt auch Sport newSport
     */
    public void addSportart(Sport newSport){
            sport.add(newSport);
    }

    /*getters and setters*/

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public ArrayList<Sport> getSport() {
        return sport;
    }

    public void setSport(ArrayList<Sport> sport) {
        this.sport = sport;
    }
}
