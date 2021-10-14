package com.company;

import java.util.ArrayList;//collection framework

//Klasse Benutzer
public class Benutzer {
    private String vorName;
    private String nachName;
    private ArrayList<Sport> sport;

    //Konstruktor
    Benutzer(String vorName,String nachName,ArrayList<Sport> sport ){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;
    }
    //gibt zuruck die Summe der Zeit aller seiner Sportarten aus seiner Liste
    public double kalkuliereZeit(){
        double sum=0;
        for (Sport x :sport) {//durchlauft seine Liste mit Sportarten
            sum+=x.kalkuliereZeit(); //fugt zur Summe, die Zeit der Sportart
        }
        return sum;
    }

    //Strategy Muster
    //gibt zuruck die Zeit der gegebenen Sportart
    //pre: x= Sport
    //post: double, die Zeit Dauer der Sportart
    public double kalkuliereZeit(Sport x){
        double sum=0;
        for(Sport s:sport)
            if(s.getClass()==x.getClass())
                sum+=s.kalkuliereZeit();
        return sum;
    }

    //Summe aller Zeit Dauer der Sporten aus der Liste geteilt durch ihre Anzahl
    //pre:sport.size() >0
    //post:double, die Summe der Zeit Dauer/die Anzahl der Sportarten, oder 0 wenn die Liste leer ist
    //Exception: keine SportArt in der Liste (Division by 0) -> gibt zuruck 0
    public double kalkuliereDurchschnittszeit(){
        if (sport.size()>0) //check ob die Liste Elemente hat
            return kalkuliereZeit()/sport.size(); //rufen die Methode die die Summe aller Sportarten berechnet und teilen durch ihre Anzahl
        else
            return 0; //wenn keine Sportart in der Liste existiert
    }

    //fugt eine Sportart zu der Lieblingssport Liste
    //pre: x= Sport
    //post: sport enthalt auch x, oder passiert nichts, wenn x schon enthalten ist
    public void addSportart(Sport newSport){
            sport.add(newSport);
    }

    //getters and setters

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
