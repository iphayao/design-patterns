package com.iphayao.demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DemoTest {
    private static List<Person> persons = new ArrayList<Person>();

    @BeforeClass
    public static void setupPerson() {
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
    }

    @Test
    public void testCriteriaMaleGetAllMale() {
        Criteria criteria = new CriteriaMale();
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertEquals("Male", p.getGender());
        }
    }

    @Test
    public void testCriteriaFemaleGetAllFemale() {
        Criteria criteria = new CriteriaFemale();
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertEquals("Female", p.getGender());
        }
    }

    @Test
    public void testCriteriaSingleGetAllSingle() {
        Criteria criteria = new CriteriaSingle();
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertEquals("Single", p.getMaritalStatus());
        }
    }

    @Test
    public void testAndCriteriaWithSingleMaleGetAllSingleAndMale() {
        Criteria male = new CriteriaMale();
        Criteria single = new CriteriaSingle();
        Criteria criteria = new AndCriteria(single, male);
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertTrue(p.getGender().equalsIgnoreCase("male") && p.getMaritalStatus().equalsIgnoreCase("single"));
        }
    }

    @Test
    public void testOrCriteriaWithSingleFemaleGetAllSingleOrFemale() {
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria criteria = new OrCriteria(single, female);
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertTrue(p.getGender().equalsIgnoreCase("female") || p.getMaritalStatus().equalsIgnoreCase("single"));
        }
    }

    @Test
    public void testOrCriteriaWithMaleFemaleGetAllMaleOrFemale() {
        Criteria female = new CriteriaFemale();
        Criteria male = new CriteriaMale();
        Criteria criteria = new OrCriteria(male, female);
        List<Person> results = criteria.meetCriteria(persons);
        for(Person p : results) {
            assertTrue(p.getGender().equalsIgnoreCase("female") || p.getGender().equalsIgnoreCase("male"));
        }
    }
}