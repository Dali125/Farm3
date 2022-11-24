package com.example.Farm3.dao;

import com.example.Farm3.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Users, Integer> {
}