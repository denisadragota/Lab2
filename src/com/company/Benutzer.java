package com.company;

import java.util.ArrayList;//collection framework
//Frage: in constructor dam o lista de cateva sporturi?
//sau: automat lista de sporturi le contine pe toate 4?
public class Benutzer {
    private String vorName;
    private String nachName;
    private ArrayList<Sport> sport;

    Benutzer(String vorName,String nachName,ArrayList<Sport> sport ){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;

    }
    public double kalkuliereZeit(){
        double sum=0;
        for (Sport x :sport) {
            sum+=x.kalkuliereZeit();
        }
        return sum;
    }

    public double kalkuliereZeit(Sport x){
        return x.kalkuliereZeit();
    }
    public double kalkuliereDurchschnittszeit(){
        return kalkuliereZeit()/sport.size();
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
