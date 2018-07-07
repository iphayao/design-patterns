package com.iphayao.demo;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DemoTest {
    Employee headOfEmployee = new Employee("Jonh", "DumpyDepartment", 10000);
    Employee employee1 = new Employee("Jan", "DumpyDepartment", 5000);
    Employee employee2 = new Employee("Joe", "DumpyDepartment", 5000);

    @Test
    public void testCompositeDummyDepartmentGetDummryDepartment() {
        headOfEmployee.add(employee1);
        headOfEmployee.add(employee2);
        List<Employee> employees = headOfEmployee.getSubordinates();
        assertEquals("Employee{name='Jan', dept='DumpyDepartment', salary=5000}", employees.get(0).toString());
        assertEquals("Employee{name='Joe', dept='DumpyDepartment', salary=5000}", employees.get(1).toString());
    }

}