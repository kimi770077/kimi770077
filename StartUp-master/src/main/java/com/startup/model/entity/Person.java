package com.startup.model.entity;

import com.google.gson.Gson;

import com.startup.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "personEntity")
@Table(name = "person")
@NamedQueries({@NamedQuery(name = "findAll", query = "select oo from personEntity oo")})

public class Person extends BaseEntity {
//  Validation Annotations
    @Column(columnDefinition = "NVARCHAR2(30)",nullable = false)
    private String firstName;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String lastName;

    @Column(columnDefinition = "VARCHAR2(10)")
    private String nationalCode;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
