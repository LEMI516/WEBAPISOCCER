package com.app.champions.appchampionsback.repository;

import com.app.champions.appchampionsback.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition,String> {
}
