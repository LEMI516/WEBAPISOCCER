package com.apisoccer.controller;

import java.util.ArrayList;
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

import com.apisoccer.domain.Competencia;
import com.apisoccer.domain.CompetenciaFixture;
import com.apisoccer.domain.CompetenciaTeam;
import com.apisoccer.domain.History;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;
import com.apisoccer.domain.Team;
import com.apisoccer.services.CompetenciaEquipoServices;
import com.apisoccer.services.CompetenciaFixtureServices;
import com.apisoccer.services.CompetenciaServices;
import com.apisoccer.services.HistoryService;
import com.apisoccer.services.PlantillaServices;
import com.apisoccer.services.TeamService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiSoccerController {
	
	public final String URI="http://localhost:8080";
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	HistoryService historyService;
	
	@Autowired
	PlantillaServices plantillaServices;
	
	@Autowired
	CompetenciaServices competenciaServices;
	
	@Autowired
	CompetenciaEquipoServices competenciaEquipoServices;
	
	@Autowired
	CompetenciaFixtureServices competenciaFixtureServices;
	
	@RequestMapping("/")
	public String welcome() {
		return "Prueba del Rest";
	}	
	
	@RequestMapping(value = "/teams/", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveTeams(@RequestBody List<Team> teams ){
		Message msg=teamService.saveTeams(teams);
		return new ResponseEntity<Object>(msg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/historys/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveHistory(@RequestBody List<History> historys){
		Message msg=historyService.saveHistorys(historys);
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/plantillas/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> savePlantillas(@RequestBody List<Plantilla> plantillas){
		Message msg=plantillaServices.savePlantillas(plantillas);
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/competencias/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveCompetencias(@RequestBody List<Competencia> competencias){
		Message msg=competenciaServices.saveCompetencias(competencias);
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/competencia_teams/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveCompetenciaTeams(@RequestBody List<CompetenciaTeam> competenciaTeams){
		Message msg=competenciaEquipoServices.saveCompetenciaTeams(competenciaTeams);
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/competencia_fixtures/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,  headers = "Accept=application/json")
	public ResponseEntity<Object> saveCompetenciaFixtures(@RequestBody List<CompetenciaFixture> competenciaFixtures){
		Message msg=competenciaFixtureServices.saveCompetenciaFixtures(competenciaFixtures);
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/allteams/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllTeams(){
		Message msg=teamService.allTeams();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allhistorys/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllHistory(){
		Message msg=historyService.allHistorys();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allplantillas/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllPlantillas(){
		Message msg=plantillaServices.AllPlantillas();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allcompetencias/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllCompetencias(){
		Message msg=competenciaServices.AllCompetencias();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allcompetenciasteams/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllCompetenciasTeams(){
		Message msg=competenciaEquipoServices.AllCompetenciaTeams();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/allcompetenciasfixture/",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> listAllCompetenciasFixture(){
		Message msg=competenciaFixtureServices.AllCompetenciaFixtures();
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}	

}
