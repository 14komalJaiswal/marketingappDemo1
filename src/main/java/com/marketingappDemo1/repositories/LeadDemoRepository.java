package com.marketingappDemo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingappDemo1.entities.LeadDemo;

public interface LeadDemoRepository extends JpaRepository<LeadDemo,Long> {

}
