package com.vialent.warranty.model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "PARTNER")
@NamedQuery(name = Account.FIND_BY_EMAIL, query = "select a from Account a where a.e_mail = :email")
public class Account implements java.io.Serializable {

    public static final String FIND_BY_EMAIL = "Account.findByEmail";

    @Id
    @GeneratedValue
    private String azonosito;
    private String nev;
    private Integer tipus;
    @Column(unique = true)
    private String e_mail;

    protected Account() {

    }

    public Account(String azonosito, String nev, Integer tipus, String e_mail) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.tipus = tipus;
        this.e_mail = e_mail;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getTipus() {
        return tipus;
    }

    public void setTipus(Integer tipus) {
        this.tipus = tipus;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
