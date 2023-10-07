package com.cooley.soccerwebapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Lineup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineup_id")
    private Long lineupId;

    @Column(name = "lineup_name")
    private String lineupName;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "team_id")
    private String teamId;

    @Column(name = "formation")
    private String formation;

    @Column(name = "owner_id")
    private String ownerId;

    //private String opponentTeamid; //This could be a future iteration

}
