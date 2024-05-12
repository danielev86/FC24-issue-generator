package com.redcatdev86.fc24issuegenerator.repository;

import com.redcatdev86.fc24issuegenerator.repository.model.PlayerIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerIssue, Long> {
}
