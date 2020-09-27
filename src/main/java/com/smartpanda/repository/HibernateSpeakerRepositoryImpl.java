package com.smartpanda.repository;

import com.smartpanda.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstname("Mathieu");
        speaker.setLastName("Wautier");
        speakers.add(speaker);
        return speakers;
    }

}
