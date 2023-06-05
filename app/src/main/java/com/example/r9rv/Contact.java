package com.example.r9rv;

public class Contact {
    String name;
    String number;
    String preference;

    public Contact() {
    }

    public Contact(String name, String number, String preference) {
        this.name = name;
        this.number = number;
        this.preference = preference;
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

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", preference='" + preference + '\'' +
                '}';
    }
}
