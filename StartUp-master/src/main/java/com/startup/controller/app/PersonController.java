package com.startup.controller.app;

import com.startup.model.entity.Person;
import com.startup.model.service.PersonService;

import java.util.List;

public class PersonController {
    public static Person save(String name, String family, String nationalCode) {
        try {
            Person person = new Person(name,family,nationalCode);
            return PersonService.getPersonService().save(person);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<Person> findAll() {
        try {
            return PersonService.getPersonService().findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
