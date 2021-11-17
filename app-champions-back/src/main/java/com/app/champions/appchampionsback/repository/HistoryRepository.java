package com.app.champions.appchampionsback.repository;

import com.app.champions.appchampionsback.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History,String> {
}
