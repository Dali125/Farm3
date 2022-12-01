package com.example.Farm3.controller;


import com.example.Farm3.model.Sections;


import com.example.Farm3.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/sections")
public class SectionsController {


    @Autowired
    SectionService sectionService;



    @CrossOrigin
    @GetMapping(path = "/getSections")
    public ResponseEntity<List<Sections>> getSections(){

        return  new ResponseEntity<>(sectionService.getSections(), HttpStatus.OK);
    }

}
