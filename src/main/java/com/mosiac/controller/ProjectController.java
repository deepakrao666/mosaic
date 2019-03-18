package com.mosiac.controller;

import com.mosiac.models.ProjectBean;
import com.mosiac.service.struct.ProjectService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping({"/project"})
public class ProjectController {

    private ProjectService projectService;

    private ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping(path = {"/"})
    public ResponseEntity<List<ProjectBean>> saveAllProjects(@RequestBody List<ProjectBean> projectBeans) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.saveAll(projectBeans), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/"})
    public ResponseEntity<List<ProjectBean>> findAllProjects() {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAll(), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/schoolNameDescription/{value}"})
    public ResponseEntity<List<ProjectBean>> findAllProjectsWithSchoolNameOrDescription(@PathVariable String value) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithSchoolNameOrDescription(value), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/phaseActualStartDate/{date}"})
    public ResponseEntity<List<ProjectBean>> findAllWithPhaseActualStartDate(@PathVariable String date) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithPhaseActualStartDate(date), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/phasePlannedEndDate/{date}"})
    public ResponseEntity<List<ProjectBean>> findAllWithPhasePlannedEndDate(@PathVariable String date) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithPhasePlannedEndDate(date), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/phaseActualEndDate/{date}"})
    public ResponseEntity<List<ProjectBean>> findAllWithPhaseActualEndDate(@PathVariable String date) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithPhaseActualEndDate(date), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/budgetAmount/{amount}"})
    public ResponseEntity<List<ProjectBean>> findAllWithBudgetAmount(@PathVariable String amount) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithBudgetAmount(amount), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/finalEstimate/{amount}"})
    public ResponseEntity<List<ProjectBean>> findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(@PathVariable long amount) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(amount), header, HttpStatus.OK);
    }

    @GetMapping(path = {"/totalPhaseActualSpendingAmount/{amount}"})
    public ResponseEntity<List<ProjectBean>> findAllWithTotalPhaseActualSpendingAmount(@PathVariable long amount) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(projectService.findAllWithTotalPhaseActualSpendingAmount(amount), header, HttpStatus.OK);
    }


}
