package com.dmoreno06.builder.domain;

public class Contact {
    private String name;
    private Phone phone;
    private Address address;

    public Contact() {
    }


    public Contact(String name, Address address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }

}
