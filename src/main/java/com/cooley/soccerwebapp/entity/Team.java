package com.cooley.soccerwebapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TEAM")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "team_name")
    private String teamName;

}
