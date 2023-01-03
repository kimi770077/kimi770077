package com.startup.controller.app;


import com.startup.model.entity.Person;
import com.startup.model.entity.PersonSocialMedia;
import com.startup.model.entity.enumeration.SocialMediaType;
import com.startup.model.service.PersonSocialMediaService;

public class PersonSocialMediaController {
    public static PersonSocialMedia add(Person person , SocialMediaType socialMedia, String mediaAddress) {
        try {
            PersonSocialMedia personSocialMedia = new PersonSocialMedia(person, socialMedia, mediaAddress);
            return PersonSocialMediaService.getSocialMediaService().save(personSocialMedia);
        } catch (Exception e) {
            return null;
        }
    }
}
