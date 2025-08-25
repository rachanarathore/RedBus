package org.RedBus.Common;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class TestDataGenerator {
    static Faker faker = new Faker();
    static String name = faker.name().fullName();
    static String email = faker.internet().emailAddress();
    static String address = faker.address().fullAddress();
    static  String phone = faker.phoneNumber().cellPhone();
    static int ssn = faker.hashCode();

       public static void printDataGenerated(){
           System.out.println("Name: " + name);
           System.out.println("Email: " + email);
           System.out.println("Address: " + address);
           System.out.println("Phone: " + phone);
           System.out.println("SSN:" + ssn);
       }
}
