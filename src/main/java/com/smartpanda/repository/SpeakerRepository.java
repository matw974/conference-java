package com.smartpanda.repository;

import com.smartpanda.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
