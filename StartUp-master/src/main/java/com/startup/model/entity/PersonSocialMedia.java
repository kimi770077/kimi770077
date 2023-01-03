package com.startup.model.entity;


import com.google.gson.Gson;
import com.startup.model.entity.base.BaseEntity;
import com.startup.model.entity.enumeration.SocialMediaType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "socialMediaEntity")
@Table(name = "socialmedia")
//@NamedQueries()
public class PersonSocialMedia extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    @Enumerated(EnumType.STRING)
    private SocialMediaType media;

    @Column(columnDefinition = "VARCHAR2(50)")
    private String mediaAddress;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
