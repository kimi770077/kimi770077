package com.startup.model.service;

import com.startup.model.entity.PersonSkill;
import com.startup.model.repository.CRUDRepository;
import com.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class PersonSkillService extends ServiceImpl<PersonSkill,Long> {

    private static final PersonSkillService personSkillService = new PersonSkillService();

    private PersonSkillService() {
    }

    public static PersonSkillService getPersonSkillService() {return personSkillService;}


    @Override
    public PersonSkill save(PersonSkill personSkill) throws Exception {
        try (CRUDRepository<PersonSkill,Long> repository=new CRUDRepository<>()) {
            return repository.insert(personSkill);
        }
    }

    @Override
    public PersonSkill edit(PersonSkill personSkill) throws Exception {
        try (CRUDRepository<PersonSkill, Long> repository = new CRUDRepository<>()) {
            return repository.update(personSkill);
        }
    }

    @Override
    public PersonSkill remove(Long id) throws Exception {
        try (CRUDRepository<PersonSkill, Long> repository = new CRUDRepository<>()) {
            return repository.delete(PersonSkill.class, id);
        }
    }

    @Override
    public List<PersonSkill> findAll() throws Exception {
        try (CRUDRepository<PersonSkill, Long> repository = new CRUDRepository<>()) {
            return repository.selectAll(PersonSkill.class);
        }
    }

    @Override
    public PersonSkill findById(Long id) throws Exception {
        try (CRUDRepository<PersonSkill, Long> repository = new CRUDRepository<>()) {
            return repository.selectById(PersonSkill.class, id);
        }
    }
}
