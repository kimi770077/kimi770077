package com.startup.model.entity;

import com.google.gson.Gson;
import com.startup.model.entity.base.BaseEntity;
import com.startup.model.entity.enumeration.SkillLevelType;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "personSkillEntiy")
@Table(name = "skill")
//@NamedQuery()
public class PersonSkill extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String title;

    @Temporal(TemporalType.DATE)
    private Date certificateDate;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String institute;


    @Enumerated(EnumType.STRING)
    private SkillLevelType skillLevel;


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
