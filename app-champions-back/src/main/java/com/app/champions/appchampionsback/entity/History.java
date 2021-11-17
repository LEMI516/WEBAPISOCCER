package com.app.champions.appchampionsback.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class History {
    @Id
    private String id;
    @Column(name = "id_competition")
    private String idCompetition;
    @Column(name = "id_tournament")
    private String idTournament;
    @Column(name = "id_team1")
    private String idTeam1;
    @Column(name = "id_team2")
    private String idTeam2;
    @Column(name = "id_team3")
    private String idTeam3;
    @Column(name = "id_team4")
    private String idTeam4;
    private Integer version;
}
