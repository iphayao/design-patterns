package com.iphayao.demo;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
