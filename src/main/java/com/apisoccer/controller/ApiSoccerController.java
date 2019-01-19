package com.apisoccer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apisoccer.domain.History;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;
import com.apisoccer.domain.Team;
import com.apisoccer.services.TeamService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiSoccerController {
	
	public final String URI="http://localhost:8080";
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping("/")
	public String welcome() {
		return "Prueba del Rest";
	}	
	
	@RequestMapping(value = "/teams/", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveTeams(@RequestBody List<Team> teams ){
		Message msg=teamService.saveTeams(teams);
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<Object>(msg, status);
	}
	
	@RequestMapping(value = "/historys/", method = RequestMethod.POST)
	public ResponseEntity<String> saveHistory(@RequestBody List<History> historys){
		Message msg=new Message();
		HttpStatus status=HttpStatus.OK;
		
		return new ResponseEntity(msg,status);
	}
	
	@RequestMapping(value = "/plantillas/", method = RequestMethod.POST)
	public ResponseEntity<String> savePlantillas(@RequestBody List<Plantilla> plantillas){
		Message msg=new Message();
		HttpStatus status=HttpStatus.OK;
		
		return new ResponseEntity(msg,status);
	}	
	
	@RequestMapping(value = "/allteams/",method= RequestMethod.GET)
	public ResponseEntity<List<Team>> listAllTeams(){
		
		List<Team> body = null;
		return new ResponseEntity<List<Team>>(body, HttpStatus.OK);
	}

}
