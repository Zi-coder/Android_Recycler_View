package com.anil.understandingadapter.Model;
/**
 * Created By Anil
 * on 17-03-2020 at 12:56
 */
public class Contact {
    private String name;
    private String number;
    private String addedOn;

    public Contact(String name, String number, String addedOn) {
        this.name = name;
        this.number = number;
        this.addedOn = addedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }
}
