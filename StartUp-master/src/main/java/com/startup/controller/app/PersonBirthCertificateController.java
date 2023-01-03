package com.startup.controller.app;

import com.startup.model.entity.Person;
import com.startup.model.entity.PersonBirthCertificate;
import com.startup.model.service.PersonBirthCertificateService;

import java.sql.Date;
import java.time.LocalDate;

public class PersonBirthCertificateController {
    public static PersonBirthCertificate save(Person person,
                                              String description,
                                              String locationIssuing,
                                              String identityNumber,
                                              LocalDate birthDate) {
        try {
            PersonBirthCertificate personBirthCertificate = new
                    PersonBirthCertificate(person,description, locationIssuing, identityNumber, Date.valueOf(birthDate));
            return PersonBirthCertificateService.getBirthCertificate().save(personBirthCertificate);
        } catch (Exception e) {
            return null;
        }
    }
}
