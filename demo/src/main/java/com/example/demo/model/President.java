package com.example.demo.model;

import java.io.Serializable;

/*
    Created By Navid Salehvaziri at 9/24/2018
*/
public class President implements Serializable {

    private int number;
    private int birth_year;
    private int death_year;
    private String president;
    private String took_office;
    private String left_office;
    private String party;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getDeath_year() {
        return death_year;
    }

    public void setDeath_year(int death_year) {
        this.death_year = death_year;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getTook_office() {
        return took_office;
    }

    public void setTook_office(String took_office) {
        this.took_office = took_office;
    }

    public String getLeft_office() {
        return left_office;
    }

    public void setLeft_office(String left_office) {
        this.left_office = left_office;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}
