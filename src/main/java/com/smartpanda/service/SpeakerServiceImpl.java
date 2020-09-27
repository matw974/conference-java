package com.smartpanda.service;

import com.smartpanda.model.Speaker;
import com.smartpanda.repository.HibernateSpeakerRepositoryImpl;
import com.smartpanda.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
