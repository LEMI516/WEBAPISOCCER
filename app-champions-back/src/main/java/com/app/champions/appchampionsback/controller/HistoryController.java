package com.app.champions.appchampionsback.controller;

import com.app.champions.appchampionsback.entity.History;
import com.app.champions.appchampionsback.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("history")
public class HistoryController {
    @Autowired
    private HistoryRepository historyRepository;

    @PostMapping("")
    public void saveAll(@RequestBody List<History> list){
        historyRepository.saveAll(list);
    }
}
