package com.app.champions.appchampionsback.controller;

import com.app.champions.appchampionsback.entity.Competition;
import com.app.champions.appchampionsback.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("competition")
public class CompetitionController {
    @Autowired
    private CompetitionRepository competitionRepository;

    @PostMapping("")
    public void saveAll(@RequestBody List<Competition> list){
        competitionRepository.saveAll(list);
    }
}
