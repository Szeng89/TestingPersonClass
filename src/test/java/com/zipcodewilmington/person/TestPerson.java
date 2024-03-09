package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithEverything() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedHeight = 5;

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualHeight = person.getHeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "zeng";

        // When
        person.setLastName(expected);


        // Then
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasBrain() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setHasBrain(expected);


        // Then
        boolean actual = person.isHasBrain();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasPets() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setHasPet(expected);


        // Then
        boolean actual = person.isHasPet();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLeftHandedOrNot() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setLeftHanded(expected);


        // Then
        boolean actual = person.isLeftHanded();
        Assert.assertEquals(expected, actual);
    }
}
