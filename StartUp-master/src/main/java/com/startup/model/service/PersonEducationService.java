package com.startup.model.service;

import com.startup.model.entity.PersonEducation;
import com.startup.model.repository.CRUDRepository;
import com.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class PersonEducationService extends ServiceImpl<PersonEducation, Long> {
    private static final PersonEducationService personEducationService = new PersonEducationService();

    private PersonEducationService() {

    }

    public static PersonEducationService getPersonEducationService() {
        return personEducationService;
    }

    @Override
    public PersonEducation save(PersonEducation personEducation) throws Exception {
        try (CRUDRepository<PersonEducation, Long> repository = new CRUDRepository<>()) {
            return repository.insert(personEducation);

        }
    }

    @Override
    public PersonEducation edit(PersonEducation personEducation) throws Exception {
        try (CRUDRepository<PersonEducation, Long> repository = new CRUDRepository<>()) {
            return repository.update(personEducation);
        }
    }

    @Override
    public PersonEducation remove(Long id) throws Exception {
        try (CRUDRepository<PersonEducation, Long> repository = new CRUDRepository<>()) {
            return repository.delete(PersonEducation.class, id);
        }
    }

    @Override
    public List<PersonEducation> findAll() throws Exception {
        try (CRUDRepository<PersonEducation, Long> repository = new CRUDRepository<>()) {
            return repository.selectAll(PersonEducation.class);
        }
    }

    @Override
    public PersonEducation findById(Long id) throws Exception {
        try (CRUDRepository<PersonEducation, Long> repository = new CRUDRepository<>()) {
            return repository.selectById(PersonEducation.class, id);
        }
    }
}
