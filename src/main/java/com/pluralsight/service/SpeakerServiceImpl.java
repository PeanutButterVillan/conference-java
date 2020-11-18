package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("In SpeakerServicedImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("In SpeakerServicedImpl repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository){
        this.repository = repository;
        System.out.println("SpeakerServiceImpl setter");
    }

}
