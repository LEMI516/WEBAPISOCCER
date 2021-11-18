package com.app.champions.appchampionsback.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "competition")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Competition {
    @Id
    private String id;
    @Column(name = "type_team")
    private Integer typeTeam;
    private String confederation;
    private String name;
    private String image;
    private Double rating;
    private String colour;
}
