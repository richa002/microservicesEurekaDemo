package com.richa.microserviceDemo.commons;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastmame;
    private String dlnumber;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastmame() {
        return lastmame;
    }

    public void setLastmame(String lastmame) {
        this.lastmame = lastmame;
    }

    public String getDlnumber() {
        return dlnumber;
    }

    public void setDlnumber(String dlnumber) {
        this.dlnumber = dlnumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String zipcode;
}
