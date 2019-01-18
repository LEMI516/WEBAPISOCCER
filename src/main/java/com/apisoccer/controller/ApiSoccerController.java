package com.apisoccer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apisoccer.domain.Team;

@RestController
public class ApiSoccerController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Prueba del Rest";
	}	
	
	@RequestMapping(value = "/teams/", method = RequestMethod.POST)
	public ResponseEntity<String> saveTeams(@RequestBody List<Team> teams ){
		System.out.println(teams.size());
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/team/",method= RequestMethod.GET)
	public ResponseEntity<List<Team>> listAllTeams(){
		
		List<Team> body = null;
		return new ResponseEntity<List<Team>>(body, HttpStatus.OK);
	}

}
