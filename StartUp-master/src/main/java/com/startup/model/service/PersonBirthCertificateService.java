package com.startup.model.service;

import com.startup.model.entity.PersonBirthCertificate;
import com.startup.model.repository.CRUDRepository;
import com.startup.model.service.serviceimpl.ServiceImpl;

import java.util.List;

public class PersonBirthCertificateService extends ServiceImpl<PersonBirthCertificate, Long> {
    private static final PersonBirthCertificateService personBirthCertificateService = new PersonBirthCertificateService();

    private PersonBirthCertificateService(){
    }

    public static PersonBirthCertificateService getBirthCertificate(){return personBirthCertificateService;}

    @Override
    public PersonBirthCertificate save(PersonBirthCertificate personBirthCertificate) throws Exception {
        try (CRUDRepository<PersonBirthCertificate, Long> repository = new CRUDRepository<>()){
            return repository.insert(personBirthCertificate);
        }
    }

    @Override
    public PersonBirthCertificate edit(PersonBirthCertificate personBirthCertificate) throws Exception {
        try (CRUDRepository<PersonBirthCertificate, Long> repository = new CRUDRepository<>()){
            return repository.update(personBirthCertificate);
        }
    }

    @Override
    public PersonBirthCertificate remove(Long id) throws Exception {
        try (CRUDRepository<PersonBirthCertificate, Long> repository = new CRUDRepository<>()){
            return repository.delete(PersonBirthCertificate.class, id);
        }
    }


    @Override
    public List<PersonBirthCertificate> findAll() throws Exception {
        try (CRUDRepository<PersonBirthCertificate, Long> repository = new CRUDRepository<>()){
            return repository.selectAll(PersonBirthCertificate.class);
        }
    }

    @Override
    public PersonBirthCertificate findById(Long id) throws Exception {
        try (CRUDRepository<PersonBirthCertificate, Long> repository = new CRUDRepository<>()){
            return repository.selectById(PersonBirthCertificate.class , id);
        }
    }
}
