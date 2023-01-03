package com.startup.controller.app;

import com.startup.model.entity.Person;
import com.startup.model.entity.PersonEducation;
import com.startup.model.entity.enumeration.EducationLevelType;
import com.startup.model.service.PersonEducationService;

import java.sql.Date;
import java.time.LocalDate;

public class PersonEducationController {
    public static PersonEducation save(Person person, EducationLevelType level, String field, float grade, String university, LocalDate graduationDate) {
        try {
            PersonEducation personEducation = new PersonEducation(person,level, field, grade, university, Date.valueOf(graduationDate));
            return PersonEducationService.getPersonEducationService().save(personEducation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
