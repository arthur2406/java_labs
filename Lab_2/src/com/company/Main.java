package com.company;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ivan", "Stepanenko", 20, 180.5f);

        Gson gson = new Gson();

        String personSerialized = gson.toJson(person);

        Person personDeseriziled = gson.fromJson(personSerialized, Person.class);

        Boolean areEqual = person.equals(personDeseriziled);

        System.out.println("Are objects equal: " + person.equals(personDeseriziled));

    }
}
