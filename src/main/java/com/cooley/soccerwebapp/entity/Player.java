package com.cooley.soccerwebapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PLAYER")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "jersey_number")
    private Integer jerseyNumber;

    @Column(name = "soccer_position")
    private String position; //later may want to make this a list for multiple positions or another field and this be primary position
}
