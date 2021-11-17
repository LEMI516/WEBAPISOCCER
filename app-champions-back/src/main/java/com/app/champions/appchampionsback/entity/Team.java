package com.app.champions.appchampionsback.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Team {
    @Id
    private String id;
    @Column(name = "type_team")
    private Integer typeTeam;
    private String confederation;
    private String country;
    private String name;
    private String image;
    private Double rating;
}
