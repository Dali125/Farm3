package com.example.Farm3.service;

import com.example.Farm3.dao.SectionRepository;
import com.example.Farm3.model.Sections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceimpl implements SectionService{

    @Autowired
    SectionRepository sectionRepository;



    @Override
    public List<Sections> getSections(){

        return sectionRepository.findAll();
    }
}
