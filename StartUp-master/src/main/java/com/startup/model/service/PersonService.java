
package com.startup.model.service;


import com.startup.model.entity.Log;
import com.startup.model.entity.Person;
import com.startup.model.entity.PersonSkill;
import com.startup.model.entity.enumeration.ActionType;
import com.startup.model.entity.enumeration.DbTable;
import com.startup.model.repository.CRUDRepository;
import com.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class PersonService extends ServiceImpl<Person, Long> {
    private static PersonService personService = new PersonService();

    private PersonService() {
    }

    public static PersonService getPersonService() {
        return personService;
    }

    @Override
    public Person save(Person person) throws Exception {
        try (CRUDRepository<Person, Long> personRepository = new CRUDRepository<>()) {
            person = personRepository.insert(person);
//            LogService.getLogService().save(
//                    new Log(DbTable.Person, 1, ActionType.Persist, person.toString(), "127.0.0.1"));
            return person;
        }
    }

    @Override
    public Person edit(Person person) throws Exception {
        return null;
    }

    @Override
    public Person remove(Long aLong) throws Exception {
        return null;
    }

    @Override
    public List<Person> findAll() throws Exception {
        try (CRUDRepository<Person, Long> personRepository = new CRUDRepository<>()) {
            return personRepository.selectAll(Person.class);
        }
    }

    @Override
    public Person findById(Long aLong) throws Exception {
        return null;
    }

//    public Person addSkill(Person person, PersonSkill skill) {
//        CRUDRepository<Person, Long> personRepository = new CRUDRepository<>();
//        person = personRepository.selectById(Person.class, person.getId());
////        person.getSkills().add(skill);
//        return personRepository.update(person);
//    }
//
//    public void Test(){
//
//    }

//    public List<PersonSkill> skills(Long id) {
//        CRUDRepository<PersonSkill, Long> personRepository = new CRUDRepository<>();
//        return personRepository.executeQuery("skills");
//    }
}
