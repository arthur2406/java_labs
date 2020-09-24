package com.company;

public class Person {

    public String name;


    public String lastName;


    public Integer age;


    public Float height;


    Person(String name, String lastName, Integer age, Float height) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {

        // If the object is compared with iteself
        if (o == this) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person anotherPerson = (Person) o;

        return this.name.equals(anotherPerson.name)
                && this.lastName.equals(anotherPerson.lastName)
                && this.age.equals(anotherPerson.age)
                && Float.compare(this.height, anotherPerson.height) == 0;

    }

}