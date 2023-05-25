package com.project.crudapis.mappingandjoining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.crudapis.mappingandjoining.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
