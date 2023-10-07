package com.cooley.soccerwebapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "team_name")
    private String teamName;

}
