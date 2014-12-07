package com.vialent.warranty.model;

import com.google.common.base.Objects;

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
    private String SERIAL_NUMBER;
    private String GAR_KEZD;
    private String CIKKSZAM;
    private String MEGNEVEZES;
    private String CEG_KAT;
    private String TELEPITO_KOD;
    private String TELEPITO;
    private String UTOLSO_MUNKA_IDEJE;
    private String UTOLSO_MUNKA_MEGNEVEZESE;
    private String UTOLSO_MUNKAVEGZO;
    private String GAR_SORSZAM;
    private Integer TULAJ_AZON;
    private String GAR_SZOVEG;

    public Device() {
    }

    public Device(Integer TECH_KEY, String SERIAL_NUMBER, String GAR_KEZD, String CIKKSZAM, String MEGNEVEZES, String CEG_KAT, String TELEPITO_KOD, String TELEPITO, String UTOLSO_MUNKA_IDEJE, String UTOLSO_MUNKA_MEGNEVEZESE, String UTOLSO_MUNKAVEGZO, String GAR_SORSZAM, Integer TULAJ_AZON, String GAR_SZOVEG) {
        this.TECH_KEY = TECH_KEY;
        this.SERIAL_NUMBER = SERIAL_NUMBER;
        this.GAR_KEZD = GAR_KEZD;
        this.CIKKSZAM = CIKKSZAM;
        this.MEGNEVEZES = MEGNEVEZES;
        this.CEG_KAT = CEG_KAT;
        this.TELEPITO_KOD = TELEPITO_KOD;
        this.TELEPITO = TELEPITO;
        this.UTOLSO_MUNKA_IDEJE = UTOLSO_MUNKA_IDEJE;
        this.UTOLSO_MUNKA_MEGNEVEZESE = UTOLSO_MUNKA_MEGNEVEZESE;
        this.UTOLSO_MUNKAVEGZO = UTOLSO_MUNKAVEGZO;
        this.GAR_SORSZAM = GAR_SORSZAM;
        this.TULAJ_AZON = TULAJ_AZON;
        this.GAR_SZOVEG = GAR_SZOVEG;
    }

    public Integer getTECH_KEY() {
        return TECH_KEY;
    }

    public void setTECH_KEY(Integer TECH_KEY) {
        this.TECH_KEY = TECH_KEY;
    }

    public String getSERIAL_NUMBER() {
        return SERIAL_NUMBER;
    }

    public void setSERIAL_NUMBER(String SERIAL_NUMBER) {
        this.SERIAL_NUMBER = SERIAL_NUMBER;
    }

    public String getGAR_KEZD() {
        return GAR_KEZD;
    }

    public void setGAR_KEZD(String GAR_KEZD) {
        this.GAR_KEZD = GAR_KEZD;
    }

    public String getCIKKSZAM() {
        return CIKKSZAM;
    }

    public void setCIKKSZAM(String CIKKSZAM) {
        this.CIKKSZAM = CIKKSZAM;
    }

    public String getMEGNEVEZES() {
        return MEGNEVEZES;
    }

    public void setMEGNEVEZES(String MEGNEVEZES) {
        this.MEGNEVEZES = MEGNEVEZES;
    }

    public String getCEG_KAT() {
        return CEG_KAT;
    }

    public void setCEG_KAT(String CEG_KAT) {
        this.CEG_KAT = CEG_KAT;
    }

    public String getTELEPITO_KOD() {
        return TELEPITO_KOD;
    }

    public void setTELEPITO_KOD(String TELEPITO_KOD) {
        this.TELEPITO_KOD = TELEPITO_KOD;
    }

    public String getTELEPITO() {
        return TELEPITO;
    }

    public void setTELEPITO(String TELEPITO) {
        this.TELEPITO = TELEPITO;
    }

    public String getUTOLSO_MUNKA_IDEJE() {
        return UTOLSO_MUNKA_IDEJE;
    }

    public void setUTOLSO_MUNKA_IDEJE(String UTOLSO_MUNKA_IDEJE) {
        this.UTOLSO_MUNKA_IDEJE = UTOLSO_MUNKA_IDEJE;
    }

    public String getUTOLSO_MUNKA_MEGNEVEZESE() {
        return UTOLSO_MUNKA_MEGNEVEZESE;
    }

    public void setUTOLSO_MUNKA_MEGNEVEZESE(String UTOLSO_MUNKA_MEGNEVEZESE) {
        this.UTOLSO_MUNKA_MEGNEVEZESE = UTOLSO_MUNKA_MEGNEVEZESE;
    }

    public String getUTOLSO_MUNKAVEGZO() {
        return UTOLSO_MUNKAVEGZO;
    }

    public void setUTOLSO_MUNKAVEGZO(String UTOLSO_MUNKAVEGZO) {
        this.UTOLSO_MUNKAVEGZO = UTOLSO_MUNKAVEGZO;
    }

    public String getGAR_SORSZAM() {
        return GAR_SORSZAM;
    }

    public void setGAR_SORSZAM(String GAR_SORSZAM) {
        this.GAR_SORSZAM = GAR_SORSZAM;
    }

    public Integer getTULAJ_AZON() {
        return TULAJ_AZON;
    }

    public void setTULAJ_AZON(Integer TULAJ_AZON) {
        this.TULAJ_AZON = TULAJ_AZON;
    }

    public String getGAR_SZOVEG() {
        return GAR_SZOVEG;
    }

    public void setGAR_SZOVEG(String GAR_SZOVEG) {
        this.GAR_SZOVEG = GAR_SZOVEG;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).toString();
    }
}
