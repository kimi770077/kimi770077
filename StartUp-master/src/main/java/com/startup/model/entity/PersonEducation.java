package com.startup.model.entity;

import com.google.gson.Gson;
import com.startup.model.entity.base.BaseEntity;
import com.startup.model.entity.enumeration.EducationLevelType;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "personEducationEntity")
@Table(name = "education")
public class PersonEducation extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    @Enumerated(EnumType.STRING)
    private EducationLevelType eduLevel;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String eduField;

    private float eduGrade;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String university;

    @Temporal(TemporalType.DATE)
    private Date graduationDate;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
