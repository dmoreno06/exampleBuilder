package com.dmoreno06.builder.domain;

public class Address {
    private String address;
    private String city;
    private String country;
    private String cPostal;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getcPostal() {
        return cPostal;
    }

    public void setcPostal(String cPostal) {
        this.cPostal = cPostal;
    }

    public Address() {
    }

    public Address(String address, String city, String country, String cPostal) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.cPostal = cPostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", cPostal='" + cPostal + '\'' +
                '}';
    }
}
