package com.cooley.soccerwebapp.repository;

import com.cooley.soccerwebapp.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer> {

    public List<Team> findAllByOwnerId(Integer ownerId);

}
