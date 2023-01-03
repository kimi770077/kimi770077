package com.startup.model.entity;

import com.google.gson.Gson;
import com.startup.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "birthCertificateEntity")
@Table(name = "birthcertificate")
//@NamedQueries()
public class PersonBirthCertificate extends BaseEntity {
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @Column(columnDefinition = "NVARCHAR2(100)")
    private String description;

    @Column(columnDefinition = "NVARCHAR2(50)")
    private String locationIssuing;

    @Column(columnDefinition = "VARCHAR2(10)")
    private String identityNumber;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

