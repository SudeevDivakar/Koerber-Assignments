package day3_4.question3;

import java.io.Serializable;

/*
Write a program to serialize and deserialize an object of Employee class. Employee class has the following
members.
 */

public class Address implements Serializable {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(city)
                .append(" - ")
                .append(state).toString();
    }
}
