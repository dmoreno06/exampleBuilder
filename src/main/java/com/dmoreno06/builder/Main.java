package com.dmoreno06.builder;

import com.dmoreno06.builder.domain.Address;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .setEge(23)
                .setFullName("juan Perez")
                .setGender("F")
                .setDni("202928")
                .setAddress("robledo","manizales","colombia","50323")
                .builder();


        System.out.println("employee = "+employee);
    }
}