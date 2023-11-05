package com.cooley.soccerwebapp.controller;

import com.cooley.soccerwebapp.entity.Team;
import com.cooley.soccerwebapp.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/homepage")
public class HomePageController {

    private final TeamRepository teamRepository;

    @GetMapping("/teams")
    public ResponseEntity<Object> fetchTeams(@RequestParam Integer userId){
        List<Team> teamsRetrieved = teamRepository.findAllByOwnerId(userId);
        return new ResponseEntity<>(teamsRetrieved, HttpStatus.OK);
    }

//    @GetMapping("/teams/{userId}")
//    public ResponseEntity<Object> fetchTeams(@PathVariable Integer userId){
//        List<Team> teamsRetrieved = teamRepository.findAllByOwnerId(userId);
//        return new ResponseEntity<>(teamsRetrieved, HttpStatus.OK);
//    }



}
