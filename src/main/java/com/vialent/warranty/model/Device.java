package com.vialent.warranty.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TELEPITETT")
@NamedQuery(name = Device.FIND_BY_SERIAL, query = "select d from Device d where d.SERIAL_NUMBER = :serial")
public class Device {

    public static final String FIND_BY_SERIAL = "Device.findBySerial";

    @Id
    @GeneratedValue
    private Integer TECH_KEY;
    private Integer TULAJ_AZON;
    private String UT_MUNKA_MEGN;
    private String GAR_SORSZAM;
    private String TELEPITO_KOD;
    private String SERIAL_NUMBER;
    private String UT_MUNKA_VEGZO;
    private Date GAR_KEZD;
    private Date UT_MUNKA_IDEJE;
    private String CEG_KAT;
    private String CIKKSZAM;

    public Device() {
    }

    public Device(Integer TECH_KEY, Integer TULAJ_AZON, String UT_MUNKA_MEGN, String GAR_SORSZAM, String TELEPITO_KOD, String SERIAL_NUMBER, String UT_MUNKA_VEGZO, Date GAR_KEZD, Date UT_MUNKA_IDEJE, String CEG_KAT, String CIKKSZAM) {
        this.TECH_KEY = TECH_KEY;
        this.TULAJ_AZON = TULAJ_AZON;
        this.UT_MUNKA_MEGN = UT_MUNKA_MEGN;
        this.GAR_SORSZAM = GAR_SORSZAM;
        this.TELEPITO_KOD = TELEPITO_KOD;
        this.SERIAL_NUMBER = SERIAL_NUMBER;
        this.UT_MUNKA_VEGZO = UT_MUNKA_VEGZO;
        this.GAR_KEZD = GAR_KEZD;
        this.UT_MUNKA_IDEJE = UT_MUNKA_IDEJE;
        this.CEG_KAT = CEG_KAT;
        this.CIKKSZAM = CIKKSZAM;
    }

    public Integer getTECH_KEY() {
        return TECH_KEY;
    }

    public void setTECH_KEY(Integer TECH_KEY) {
        this.TECH_KEY = TECH_KEY;
    }

    public Integer getTULAJ_AZON() {
        return TULAJ_AZON;
    }

    public void setTULAJ_AZON(Integer TULAJ_AZON) {
        this.TULAJ_AZON = TULAJ_AZON;
    }

    public String getUT_MUNKA_MEGN() {
        return UT_MUNKA_MEGN;
    }

    public void setUT_MUNKA_MEGN(String UT_MUNKA_MEGN) {
        this.UT_MUNKA_MEGN = UT_MUNKA_MEGN;
    }

    public String getGAR_SORSZAM() {
        return GAR_SORSZAM;
    }

    public void setGAR_SORSZAM(String GAR_SORSZAM) {
        this.GAR_SORSZAM = GAR_SORSZAM;
    }

    public String getTELEPITO_KOD() {
        return TELEPITO_KOD;
    }

    public void setTELEPITO_KOD(String TELEPITO_KOD) {
        this.TELEPITO_KOD = TELEPITO_KOD;
    }

    public String getSERIAL_NUMBER() {
        return SERIAL_NUMBER;
    }

    public void setSERIAL_NUMBER(String SERIAL_NUMBER) {
        this.SERIAL_NUMBER = SERIAL_NUMBER;
    }

    public String getUT_MUNKA_VEGZO() {
        return UT_MUNKA_VEGZO;
    }

    public void setUT_MUNKA_VEGZO(String UT_MUNKA_VEGZO) {
        this.UT_MUNKA_VEGZO = UT_MUNKA_VEGZO;
    }

    public Date getGAR_KEZD() {
        return GAR_KEZD;
    }

    public void setGAR_KEZD(Date GAR_KEZD) {
        this.GAR_KEZD = GAR_KEZD;
    }

    public Date getUT_MUNKA_IDEJE() {
        return UT_MUNKA_IDEJE;
    }

    public void setUT_MUNKA_IDEJE(Date UT_MUNKA_IDEJE) {
        this.UT_MUNKA_IDEJE = UT_MUNKA_IDEJE;
    }

    public String getCEG_KAT() {
        return CEG_KAT;
    }

    public void setCEG_KAT(String CEG_KAT) {
        this.CEG_KAT = CEG_KAT;
    }

    public String getCIKKSZAM() {
        return CIKKSZAM;
    }

    public void setCIKKSZAM(String CIKKSZAM) {
        this.CIKKSZAM = CIKKSZAM;
    }

    @Override
    public String toString() {
        return "Device{" +
                "TECH_KEY=" + TECH_KEY +
                ", TULAJ_AZON=" + TULAJ_AZON +
                ", UT_MUNKA_MEGN='" + UT_MUNKA_MEGN + '\'' +
                ", GAR_SORSZAM='" + GAR_SORSZAM + '\'' +
                ", TELEPITO_KOD='" + TELEPITO_KOD + '\'' +
                ", SERIAL_NUMBER='" + SERIAL_NUMBER + '\'' +
                ", UT_MUNKA_VEGZO='" + UT_MUNKA_VEGZO + '\'' +
                ", GAR_KEZD=" + GAR_KEZD +
                ", UT_MUNKA_IDEJE=" + UT_MUNKA_IDEJE +
                ", CEG_KAT='" + CEG_KAT + '\'' +
                ", CIKKSZAM='" + CIKKSZAM + '\'' +
                '}';
    }
}
