package com.dmoreno06.builder;

import com.dmoreno06.builder.domain.Address;
import com.dmoreno06.builder.domain.Contact;
import com.dmoreno06.builder.domain.Phone;

import java.util.List;

public class Employee {
    private int age;
    private String fullName;
    private String dni;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts;

    public Employee() {
    }

    public Employee(int age, String fullName, String dni , String gender,Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.fullName = fullName;
        this.dni = dni;
        this.address = address;
        this.gender = gender;
        this.phones = phones;
        this.contacts = contacts;
    }


    public static class EmployeeBuilder implements IBuilder{
        private int age;
        private String fullName;
        private String dni;
        private String gender;
        private Address address;
        private List<Phone> phones;
        private List<Contact> contacts;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setEge(int ege){
            this.age = ege;
            return this;
        }

        public EmployeeBuilder setFullName(String fullName){
            this.fullName = fullName;
            return this;
        }

        public EmployeeBuilder setDni(String dni){
            this.dni = dni;
            return this;
        }

        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this;
        }
        public EmployeeBuilder setAddress(String address,String city,String country,String cPostal){
            this.address = new Address(address,city,country,cPostal);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone){
            this.phones.add(phone);
            return this;
        }
        public EmployeeBuilder setPhone(String phoneNumber,String ext,String phoneType){
            this.phones.add(new Phone(phoneNumber,ext,phoneType));
            return this;
        }
        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact);
            return this;
        }
        public EmployeeBuilder setContact(String name,Phone phone,Address address){
            this.contacts.add(new Contact(name,address,phone));
            return this;
        }
        @Override
        public Employee builder() {
            return new Employee(age,fullName,dni,gender,address,phones,contacts);
        }
    }
    public int getEge() {
        return age;
    }

    public void setEgg(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\negg='" + age + '\'' +
                "\n, fullName='" + fullName + '\'' +
                "\n, dni='" + dni + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                '}';
    }


}
