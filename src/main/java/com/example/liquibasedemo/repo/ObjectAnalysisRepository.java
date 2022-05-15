package com.example.liquibasedemo.repo;

import com.example.liquibasedemo.entity.ObjectAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectAnalysisRepository extends JpaRepository<ObjectAnalysis, Long> {
}