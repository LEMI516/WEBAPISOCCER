package com.app.champions.appchampionsback.controller;

import com.app.champions.appchampionsback.entity.Team;
import com.app.champions.appchampionsback.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("team")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @PostMapping("")
    public void saveAll(@RequestBody List<Team> teamList){
        teamRepository.saveAll(teamList);
    }

    @GetMapping("")
    public List<Team> getAll(){
        return teamRepository.findAll();
    }
}
