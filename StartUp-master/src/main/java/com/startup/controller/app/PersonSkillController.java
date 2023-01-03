package com.startup.controller.app;


import com.startup.model.entity.Person;
import com.startup.model.entity.PersonSkill;
import com.startup.model.entity.enumeration.SkillLevelType;
import com.startup.model.service.PersonSkillService;

import java.sql.Date;
import java.time.LocalDate;

public class PersonSkillController {
    public static PersonSkill add(Person person, String title , LocalDate certificateDate , String institute , SkillLevelType level){
        try {
            PersonSkill personSkill = new PersonSkill(person, title , Date.valueOf(certificateDate) , institute , level);
            return PersonSkillService.getPersonSkillService().save(personSkill);
        } catch (Exception e) {
            return null;
        }
    }
}
