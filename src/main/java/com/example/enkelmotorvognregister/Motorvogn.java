package com.example.enkelmotorvognregister;

public class Motorvogn {
    private String personNr;
    private String kjonn;
    private String navn;
    private String adresse;
    private String bilSkilt;
    private String bilMerke;
    private String bilModel;
    private String sted;

    // Constructors
    public Motorvogn() {
        // Standard konstruktør
    }

    public Motorvogn(String personNr,String kjonn, String navn, String adresse, String bilSkilt, String bilMerke, String bilModel, String sted) {
        this.personNr = personNr;
        this.kjonn = kjonn;
        this.navn = navn;
        this.adresse = adresse;
        this.bilSkilt = bilSkilt;
        this.bilMerke = bilMerke;
        this.bilModel = bilModel;
        this.sted = sted;
    }

    // Getters
    public String getPersonNr() {
        return personNr;
    }

    public String getKjonn() {
        return kjonn;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getBilSkilt() {
        return bilSkilt;
    }

    public String getBilMerke() {
        return bilMerke;
    }

    public String getBilModel() {
        return bilModel;
    }

    public String getSted() {
        return sted;
    }

    // Setters
    public void setPersonNr(String personNr) {
        this.personNr = personNr;
    }

    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setBilSkilt(String bilSkilt) {
        this.bilSkilt = bilSkilt;
    }

    public void setBilMerke(String bilMerke) {
        this.bilMerke = bilMerke;
    }

    public void setBilModel(String bilModel) {
        this.bilModel = bilModel;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }
}