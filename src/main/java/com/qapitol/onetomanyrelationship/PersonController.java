package com.qapitol.onetomanyrelationship;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonController {

    public static void main(String[] args) throws IOException {

        String fileName = System.getProperty("user.dir") + "//src//main//resources//Files//Person.json";

        Person person = new Person();
        Address address1 = new Address();
        Address address2 = new Address();

        List<Address> listOfAddress = new ArrayList<>();
        listOfAddress.add(address1);
        listOfAddress.add(address2);

        person.setName("Sourav");
        person.setAge(23);

        address1.setStreetName("BTM Layout 2nd stage");
        address2.setStreetName("Madiwala layout");

        address1.setPinCode(5678);
        address2.setPinCode(9898);

        person.setAddresses(listOfAddress);

        System.out.println(person.toString());

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), person);

    }
}
