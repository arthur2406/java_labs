package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testEquals() {

        Person person1 = new Person("Ivan", "Stepanenko", 20, 150.5f);
        Person person2 = new Person("Ivan", "Stepanenko", 20, 150.5f);
        Person person3 = new Person("NotIvan", "Stepanenko", 15, 150.5f);

        Assert.assertTrue(person1.equals(person2));
        Assert.assertFalse(person1 == person2);
        Assert.assertFalse(person1.equals(person3));


    }
}